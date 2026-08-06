package com.healthclinic.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.healthclinic.db.DBConnection;
import com.healthclinic.model.Billing;
import com.healthclinic.model.Visit;

public class TransactionDAO {

    public boolean completePatientVisit(Visit visit, Billing billing) {

        Connection connection = null;

        try {

            connection = DBConnection.getConnection();

            // Start Transaction
            connection.setAutoCommit(false);

            // INSERT VISIT
            
            String visitSql = "INSERT INTO Visit (AppointmentID, VisitDate, Diagnosis, Prescription) VALUES (?, ?, ?, ?)";

            PreparedStatement visitPS = connection.prepareStatement(
                    visitSql,
                    PreparedStatement.RETURN_GENERATED_KEYS);

            visitPS.setInt(1, visit.getAppointmentId());
            visitPS.setDate(2, Date.valueOf(visit.getVisitDate()));
            visitPS.setString(3, visit.getDiagnosis());
            visitPS.setString(4, visit.getPrescription());

            int visitRows = visitPS.executeUpdate();

            if (visitRows == 0) {
                throw new SQLException("Visit insertion failed.");
            }

            // Get Generated VisitID

            ResultSet generatedKeys = visitPS.getGeneratedKeys();

            int visitId = 0;

            if (generatedKeys.next()) {
                visitId = generatedKeys.getInt(1);
            } else {
                throw new SQLException("Visit ID not generated.");
            }

            // INSERT BILL

            String billSql = "INSERT INTO Billing (VisitID, Amount, PaymentStatus) VALUES (?, ?, ?)";

            PreparedStatement billPS = connection.prepareStatement(billSql);

            billPS.setInt(1, visitId);
            billPS.setDouble(2, billing.getAmount());
            billPS.setString(3, billing.getPaymentStatus());

            int billRows = billPS.executeUpdate();

            if (billRows == 0) {
                throw new SQLException("Bill generation failed.");
            }

            // UPDATE APPOINTMENT STATUS

            String appointmentSql =
                    "UPDATE Appointment SET Status=? WHERE AppointmentID=?";

            PreparedStatement appointmentPS =
                    connection.prepareStatement(appointmentSql);

            appointmentPS.setString(1, "Completed");
            appointmentPS.setInt(2, visit.getAppointmentId());

            int appointmentRows = appointmentPS.executeUpdate();

            if (appointmentRows == 0) {
                throw new SQLException("Appointment update failed.");
            }

            // COMMIT

            connection.commit();

            System.out.println("Transaction Completed Successfully.");

            return true;

        } catch (Exception e) {

            try {

                if (connection != null) {

                    connection.rollback();

                    System.out.println("Transaction Rolled Back.");

                }

            } catch (SQLException ex) {

                ex.printStackTrace();

            }

            e.printStackTrace();

        } finally {

            try {

                if (connection != null) {

                    connection.setAutoCommit(true);

                    connection.close();

                }

            } catch (SQLException e) {

                e.printStackTrace();

            }

        }

        return false;
    }

}
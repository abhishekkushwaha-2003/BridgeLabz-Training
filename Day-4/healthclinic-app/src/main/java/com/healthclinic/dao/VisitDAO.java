package com.healthclinic.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.healthclinic.db.DBConnection;
import com.healthclinic.model.Visit;

public class VisitDAO {

    // Add Visit 

    public boolean addVisit(Visit visit) {

        String sql = "INSERT INTO Visit (AppointmentID, VisitDate, Diagnosis, Prescription) VALUES (?, ?, ?, ?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, visit.getAppointmentId());
            ps.setDate(2, Date.valueOf(visit.getVisitDate()));
            ps.setString(3, visit.getDiagnosis());
            ps.setString(4, visit.getPrescription());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // View All Visits

    public List<Visit> getAllVisits() {

        List<Visit> visits = new ArrayList<>();

        String sql = "SELECT * FROM Visit";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Visit visit = new Visit();

                visit.setVisitId(rs.getInt("VisitID"));
                visit.setAppointmentId(rs.getInt("AppointmentID"));
                visit.setVisitDate(rs.getDate("VisitDate").toLocalDate());
                visit.setDiagnosis(rs.getString("Diagnosis"));
                visit.setPrescription(rs.getString("Prescription"));

                visits.add(visit);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return visits;
    }

    // Get Visit By ID 
    // method use for billing 

    public Visit getVisitById(int visitId) {

        String sql = "SELECT * FROM Visit WHERE VisitID = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, visitId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Visit visit = new Visit();

                visit.setVisitId(rs.getInt("VisitID"));
                visit.setAppointmentId(rs.getInt("AppointmentID"));
                visit.setVisitDate(rs.getDate("VisitDate").toLocalDate());
                visit.setDiagnosis(rs.getString("Diagnosis"));
                visit.setPrescription(rs.getString("Prescription"));

                return visit;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
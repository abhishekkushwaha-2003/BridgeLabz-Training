package com.healthclinic.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.healthclinic.db.DBConnection;
import com.healthclinic.model.Patient;

public class PatientDAO {

    public boolean addPatient(Patient patient) {

        String sql = "INSERT INTO Patient (FirstName, LastName, DateOfBirth, Gender, Phone, Address) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, patient.getFirstName());
            ps.setString(2, patient.getLastName());
            ps.setDate(3, Date.valueOf(patient.getDateOfBirth()));
            ps.setString(4, patient.getGender());
            ps.setString(5, patient.getPhone());
            ps.setString(6, patient.getAddress());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public List<Patient> getAllPatients() {

        List<Patient> patients = new ArrayList<>();

        String sql = "SELECT * FROM Patient";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Patient patient = new Patient();

                patient.setPatientId(rs.getInt("PatientID"));
                patient.setFirstName(rs.getString("FirstName"));
                patient.setLastName(rs.getString("LastName"));
                patient.setDateOfBirth(rs.getDate("DateOfBirth").toLocalDate());
                patient.setGender(rs.getString("Gender"));
                patient.setPhone(rs.getString("Phone"));
                patient.setAddress(rs.getString("Address"));

                patients.add(patient);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return patients;
    }

    public Patient getPatientById(int patientId) {

        String sql = "SELECT * FROM Patient WHERE PatientID=?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, patientId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Patient patient = new Patient();

                patient.setPatientId(rs.getInt("PatientID"));
                patient.setFirstName(rs.getString("FirstName"));
                patient.setLastName(rs.getString("LastName"));
                patient.setDateOfBirth(rs.getDate("DateOfBirth").toLocalDate());
                patient.setGender(rs.getString("Gender"));
                patient.setPhone(rs.getString("Phone"));
                patient.setAddress(rs.getString("Address"));

                return patient;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public boolean updatePatient(Patient patient) {

        String sql = "UPDATE Patient SET FirstName=?, LastName=?, DateOfBirth=?, Gender=?, Phone=?, Address=? WHERE PatientID=?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, patient.getFirstName());
            ps.setString(2, patient.getLastName());
            ps.setDate(3, Date.valueOf(patient.getDateOfBirth()));
            ps.setString(4, patient.getGender());
            ps.setString(5, patient.getPhone());
            ps.setString(6, patient.getAddress());
            ps.setInt(7, patient.getPatientId());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean deletePatient(int patientId) {

        String sql = "DELETE FROM Patient WHERE PatientID=?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, patientId);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

}
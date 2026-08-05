package com.healthclinic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.healthclinic.db.DBConnection;
import com.healthclinic.model.Doctor;

public class DoctorDAO {

    // Add Doctor
    public boolean addDoctor(Doctor doctor) {

        String sql = "INSERT INTO Doctor(FirstName, LastName, Specialization, Phone, DepartmentID) VALUES(?,?,?,?,?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, doctor.getFirstName());
            ps.setString(2, doctor.getLastName());
            ps.setString(3, doctor.getSpecialization());
            ps.setString(4, doctor.getPhone());
            ps.setInt(5, doctor.getDepartmentId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // View All Doctors
    public List<Doctor> getAllDoctors() {

        List<Doctor> doctors = new ArrayList<>();

        String sql = "SELECT * FROM Doctor";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Doctor doctor = new Doctor();

                doctor.setDoctorId(rs.getInt("DoctorID"));
                doctor.setFirstName(rs.getString("FirstName"));
                doctor.setLastName(rs.getString("LastName"));
                doctor.setSpecialization(rs.getString("Specialization"));
                doctor.setPhone(rs.getString("Phone"));
                doctor.setDepartmentId(rs.getInt("DepartmentID"));

                doctors.add(doctor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return doctors;
    }

    // Search Doctor By ID
    public Doctor getDoctorById(int doctorId) {

        String sql = "SELECT * FROM Doctor WHERE DoctorID=?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, doctorId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Doctor doctor = new Doctor();

                doctor.setDoctorId(rs.getInt("DoctorID"));
                doctor.setFirstName(rs.getString("FirstName"));
                doctor.setLastName(rs.getString("LastName"));
                doctor.setSpecialization(rs.getString("Specialization"));
                doctor.setPhone(rs.getString("Phone"));
                doctor.setDepartmentId(rs.getInt("DepartmentID"));

                return doctor;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    // Update Doctor
    public boolean updateDoctor(Doctor doctor) {

        String sql = "UPDATE Doctor SET FirstName=?, LastName=?, Specialization=?, Phone=?, DepartmentID=? WHERE DoctorID=?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, doctor.getFirstName());
            ps.setString(2, doctor.getLastName());
            ps.setString(3, doctor.getSpecialization());
            ps.setString(4, doctor.getPhone());
            ps.setInt(5, doctor.getDepartmentId());
            ps.setInt(6, doctor.getDoctorId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // Delete Doctor
    public boolean deleteDoctor(int doctorId) {

        String sql = "DELETE FROM Doctor WHERE DoctorID=?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, doctorId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
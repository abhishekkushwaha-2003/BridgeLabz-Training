package com.healthclinic.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import com.healthclinic.db.DBConnection;
import com.healthclinic.model.Appointment;

public class AppointmentDAO {

    // Schedule Appointment
    public boolean scheduleAppointment(Appointment appointment) {

        String sql = "INSERT INTO Appointment (PatientID, DoctorID, AppointmentDate, TimeSlot, Status) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, appointment.getPatientId());
            ps.setInt(2, appointment.getDoctorId());
            ps.setDate(3, Date.valueOf(appointment.getAppointmentDate()));
            ps.setTime(4, Time.valueOf(appointment.getTimeSlot()));
            ps.setString(5, appointment.getStatus());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // View All Appointments
    public List<Appointment> getAllAppointments() {

        List<Appointment> appointments = new ArrayList<>();

        String sql = "SELECT * FROM Appointment";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Appointment appointment = new Appointment();

                appointment.setAppointmentId(rs.getInt("AppointmentID"));
                appointment.setPatientId(rs.getInt("PatientID"));
                appointment.setDoctorId(rs.getInt("DoctorID"));
                appointment.setAppointmentDate(rs.getDate("AppointmentDate").toLocalDate());
                appointment.setTimeSlot(rs.getTime("TimeSlot").toLocalTime());
                appointment.setStatus(rs.getString("Status"));

                appointments.add(appointment);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return appointments;
    }

    // Search Appointment
    public Appointment getAppointmentById(int appointmentId) {

        String sql = "SELECT * FROM Appointment WHERE AppointmentID=?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, appointmentId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Appointment appointment = new Appointment();

                appointment.setAppointmentId(rs.getInt("AppointmentID"));
                appointment.setPatientId(rs.getInt("PatientID"));
                appointment.setDoctorId(rs.getInt("DoctorID"));
                appointment.setAppointmentDate(rs.getDate("AppointmentDate").toLocalDate());
                appointment.setTimeSlot(rs.getTime("TimeSlot").toLocalTime());
                appointment.setStatus(rs.getString("Status"));

                return appointment;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    // Update Appointment
    public boolean updateAppointment(Appointment appointment) {

        String sql = "UPDATE Appointment SET PatientID=?, DoctorID=?, AppointmentDate=?, TimeSlot=?, Status=? WHERE AppointmentID=?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, appointment.getPatientId());
            ps.setInt(2, appointment.getDoctorId());
            ps.setDate(3, Date.valueOf(appointment.getAppointmentDate()));
            ps.setTime(4, Time.valueOf(appointment.getTimeSlot()));
            ps.setString(5, appointment.getStatus());
            ps.setInt(6, appointment.getAppointmentId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // Delete Appointment
    public boolean deleteAppointment(int appointmentId) {

        String sql = "DELETE FROM Appointment WHERE AppointmentID=?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, appointmentId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

}
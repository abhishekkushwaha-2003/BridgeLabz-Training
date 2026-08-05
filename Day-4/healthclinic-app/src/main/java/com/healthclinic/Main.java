package com.healthclinic;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

import com.healthclinic.dao.AppointmentDAO;
import com.healthclinic.dao.DoctorDAO;
import com.healthclinic.dao.PatientDAO;
import com.healthclinic.model.Appointment;
import com.healthclinic.model.Doctor;
import com.healthclinic.model.Patient;

public class Main {

	public static void main(String[] args) {

		// to create tables
		// DatabaseInitializer.createTables();

		Scanner sc = new Scanner(System.in);

		PatientDAO patientDAO = new PatientDAO();
		DoctorDAO doctorDAO = new DoctorDAO();
		AppointmentDAO appointmentDAO = new AppointmentDAO();

		int choice;

		do {

			System.out.println("\n========== HEALTH CLINIC ==========");

			System.out.println("----------- Patient -----------");
			
			System.out.println("1. Add Patient");
			System.out.println("2. View All Patients");
			System.out.println("3. Search Patient");
			System.out.println("4. Update Patient");
			System.out.println("5. Delete Patient");

			System.out.println("\n----------- Doctor ------------");
			
			System.out.println("6. Add Doctor");
			System.out.println("7. View All Doctors");
			System.out.println("8. Search Doctor");
			System.out.println("9. Update Doctor");
			System.out.println("10. Delete Doctor");

			System.out.println("\n----------- Appointment -----------");
			
			System.out.println("11. Schedule Appointment");
			System.out.println("12. View All Appointments");
			System.out.println("13. Search Appointment");
			System.out.println("14. Update Appointment");
			System.out.println("15. Delete Appointment");

			System.out.println("\n0. Exit");
			System.out.print("Enter Choice : ");

			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			// ================= PATIENT =================

			case 1:

				Patient patient = new Patient();

				System.out.print("First Name : ");
				patient.setFirstName(sc.nextLine());

				System.out.print("Last Name : ");
				patient.setLastName(sc.nextLine());

				System.out.print("Date Of Birth (yyyy-MM-dd) : ");
				patient.setDateOfBirth(LocalDate.parse(sc.nextLine()));

				System.out.print("Gender (M/F/O) : ");
				patient.setGender(sc.nextLine());

				System.out.print("Phone : ");
				patient.setPhone(sc.nextLine());

				System.out.print("Address : ");
				patient.setAddress(sc.nextLine());

				if (patientDAO.addPatient(patient)) {
					System.out.println("Patient Added Successfully.");
				} else {
					System.out.println("Failed to Add Patient.");
				}

				break;

			case 2:

				List<Patient> patients = patientDAO.getAllPatients();

				if (patients.isEmpty()) {

					System.out.println("No Patients Found.");

				} else {

					System.out.println("\n------ Patient List ------");

					for (Patient p : patients) {
						System.out.println(p);
					}
				}

				break;

			case 3:

				System.out.print("Enter Patient ID : ");

				int patientId = sc.nextInt();

				Patient p = patientDAO.getPatientById(patientId);

				if (p != null) {
					System.out.println(p);
				} else {
					System.out.println("Patient Not Found.");
				}

				break;

			case 4:

				Patient updatePatient = new Patient();

				System.out.print("Enter Patient ID : ");
				updatePatient.setPatientId(sc.nextInt());
				sc.nextLine();

				System.out.print("First Name : ");
				updatePatient.setFirstName(sc.nextLine());

				System.out.print("Last Name : ");
				updatePatient.setLastName(sc.nextLine());

				System.out.print("Date Of Birth (yyyy-MM-dd) : ");
				updatePatient.setDateOfBirth(LocalDate.parse(sc.nextLine()));

				System.out.print("Gender (M/F/O) : ");
				updatePatient.setGender(sc.nextLine());

				System.out.print("Phone : ");
				updatePatient.setPhone(sc.nextLine());

				System.out.print("Address : ");
				updatePatient.setAddress(sc.nextLine());

				if (patientDAO.updatePatient(updatePatient)) {
					System.out.println("Patient Updated Successfully.");
				} else {
					System.out.println("Patient Update Failed.");
				}

				break;

			case 5:

				System.out.print("Enter Patient ID : ");

				int deletePatientId = sc.nextInt();

				if (patientDAO.deletePatient(deletePatientId)) {
					System.out.println("Patient Deleted Successfully.");
				} else {
					System.out.println("Patient Not Found.");
				}

				break;

			// ================= DOCTOR =================

			case 6:

				Doctor doctor = new Doctor();

				System.out.print("First Name : ");
				doctor.setFirstName(sc.nextLine());

				System.out.print("Last Name : ");
				doctor.setLastName(sc.nextLine());

				System.out.print("Specialization : ");
				doctor.setSpecialization(sc.nextLine());

				System.out.print("Phone : ");
				doctor.setPhone(sc.nextLine());

				System.out.print("Department ID : ");
				doctor.setDepartmentId(sc.nextInt());
				sc.nextLine();

				if (doctorDAO.addDoctor(doctor)) {
					System.out.println("Doctor Added Successfully.");
				} else {
					System.out.println("Failed to Add Doctor.");
				}

				break;

			case 7:

				List<Doctor> doctors = doctorDAO.getAllDoctors();

				if (doctors.isEmpty()) {

					System.out.println("No Doctors Found.");

				} else {

					System.out.println("\n------ Doctor List ------");

					for (Doctor d : doctors) {
						System.out.println(d);
					}
				}

				break;

			case 8:

				System.out.print("Enter Doctor ID : ");

				int doctorId = sc.nextInt();

				Doctor doctorResult = doctorDAO.getDoctorById(doctorId);

				if (doctorResult != null) {
					System.out.println(doctorResult);
				} else {
					System.out.println("Doctor Not Found.");
				}

				break;

			case 9:

				Doctor updateDoctor = new Doctor();

				System.out.print("Enter Doctor ID : ");
				updateDoctor.setDoctorId(sc.nextInt());
				sc.nextLine();

				System.out.print("First Name : ");
				updateDoctor.setFirstName(sc.nextLine());

				System.out.print("Last Name : ");
				updateDoctor.setLastName(sc.nextLine());

				System.out.print("Specialization : ");
				updateDoctor.setSpecialization(sc.nextLine());

				System.out.print("Phone : ");
				updateDoctor.setPhone(sc.nextLine());

				System.out.print("Department ID : ");
				updateDoctor.setDepartmentId(sc.nextInt());
				sc.nextLine();

				if (doctorDAO.updateDoctor(updateDoctor)) {
					System.out.println("Doctor Updated Successfully.");
				} else {
					System.out.println("Doctor Update Failed.");
				}

				break;

			case 10:

				System.out.print("Enter Doctor ID : ");

				int deleteDoctorId = sc.nextInt();

				if (doctorDAO.deleteDoctor(deleteDoctorId)) {
					System.out.println("Doctor Deleted Successfully.");
				} else {
					System.out.println("Doctor Not Found.");
				}

				break;

			case 11:

				Appointment appointment = new Appointment();

				System.out.print("Patient ID : ");
				appointment.setPatientId(sc.nextInt());

				System.out.print("Doctor ID : ");
				appointment.setDoctorId(sc.nextInt());
				sc.nextLine();

				System.out.print("Appointment Date (yyyy-MM-dd) : ");
				appointment.setAppointmentDate(LocalDate.parse(sc.nextLine()));

				System.out.print("Time (HH:mm:ss) : ");
				appointment.setTimeSlot(LocalTime.parse(sc.nextLine()));

				System.out.print("Status : ");
				appointment.setStatus(sc.nextLine());

				Patient existingPatient = patientDAO.getPatientById(appointment.getPatientId());

				if (existingPatient == null) {
					System.out.println("Patient ID does not exist.");
					break;
				}

				Doctor existingDoctor = doctorDAO.getDoctorById(appointment.getDoctorId());

				if (existingDoctor == null) {
					System.out.println("Doctor ID does not exist.");
					break;
				}

				break;

			case 12:

				List<Appointment> appointments = appointmentDAO.getAllAppointments();

				if (appointments.isEmpty()) {

					System.out.println("No Appointments Found.");

				} else {

					System.out.println("\n------ Appointment List ------");

					for (Appointment a : appointments) {
						System.out.println(a);
					}
				}

				break;

			case 13:

				System.out.print("Enter Appointment ID : ");

				int appointmentId = sc.nextInt();

				Appointment app = appointmentDAO.getAppointmentById(appointmentId);

				if (app != null) {
					System.out.println(app);
				} else {
					System.out.println("Appointment Not Found.");
				}

				break;

			case 14:

				Appointment updateAppointment = new Appointment();

				System.out.print("Appointment ID : ");
				updateAppointment.setAppointmentId(sc.nextInt());

				System.out.print("Patient ID : ");
				updateAppointment.setPatientId(sc.nextInt());

				System.out.print("Doctor ID : ");
				updateAppointment.setDoctorId(sc.nextInt());

				sc.nextLine();

				System.out.print("Appointment Date (yyyy-MM-dd) : ");
				updateAppointment.setAppointmentDate(LocalDate.parse(sc.nextLine()));

				System.out.print("Time (HH:mm:ss) : ");
				updateAppointment.setTimeSlot(LocalTime.parse(sc.nextLine()));

				System.out.print("Status : ");
				updateAppointment.setStatus(sc.nextLine());

				if (appointmentDAO.updateAppointment(updateAppointment)) {
					System.out.println("Appointment Updated Successfully.");
				} else {
					System.out.println("Appointment Update Failed.");
				}

				break;

			case 15:

				System.out.print("Appointment ID : ");

				int deleteAppointmentId = sc.nextInt();

				if (appointmentDAO.deleteAppointment(deleteAppointmentId)) {
					System.out.println("Appointment Deleted Successfully.");
				} else {
					System.out.println("Appointment Not Found.");
				}

				break;

			// ================= EXIT =================

			case 0:

				System.out.println("Thank You!");
				break;

			default:

				System.out.println("Invalid Choice.");

			}

		} while (choice != 0);

		sc.close();
	}
}
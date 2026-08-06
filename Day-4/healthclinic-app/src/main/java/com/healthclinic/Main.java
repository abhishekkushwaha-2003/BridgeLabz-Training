package com.healthclinic;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

import com.healthclinic.dao.AppointmentDAO;
import com.healthclinic.dao.BillingDAO;
import com.healthclinic.dao.DoctorDAO;
import com.healthclinic.dao.PatientDAO;
import com.healthclinic.dao.TransactionDAO;
import com.healthclinic.dao.VisitDAO;
import com.healthclinic.db.DatabaseInitializer;
import com.healthclinic.model.Appointment;
import com.healthclinic.model.Billing;
import com.healthclinic.model.Doctor;
import com.healthclinic.model.Patient;
import com.healthclinic.model.Visit;

public class Main {

	public static void main(String[] args) {

		// to create tables
		 DatabaseInitializer.createTables();

		Scanner sc = new Scanner(System.in);

		PatientDAO patientDAO = new PatientDAO();
		DoctorDAO doctorDAO = new DoctorDAO();
		AppointmentDAO appointmentDAO = new AppointmentDAO();
		VisitDAO visitDAO = new VisitDAO();
		BillingDAO billingDAO = new BillingDAO();
		TransactionDAO transactionDAO = new TransactionDAO();

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
			
            System.out.println("\n----------- Visit -----------");
			
			System.out.println("16. Add Visit");
			System.out.println("17. View All Visits");
			
			System.out.println("\n----------- Billing -----------");
			System.out.println("18. Generate Bill");
			System.out.println("19. View All Bills");
			
			System.out.println("\n----------- Transaction -----------");
			System.out.println("20. Complete Patient Visit");
			
			System.out.println("\n----------- Procedure -----------");
			System.out.println("21. View Bills Using Procedure");
		

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

			    // Show all departments
			    doctorDAO.showDepartments();

			    System.out.print("Enter Department ID : ");
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

			    // Check Patient
			    Patient existingPatient = patientDAO.getPatientById(appointment.getPatientId());

			    if (existingPatient == null) {
			        System.out.println("Patient ID does not exist.");
			        break;
			    }

			    // Check Doctor
			    Doctor existingDoctor = doctorDAO.getDoctorById(appointment.getDoctorId());

			    if (existingDoctor == null) {
			        System.out.println("Doctor ID does not exist.");
			        break;
			    }

			    // Schedule Appointment
			    if (appointmentDAO.scheduleAppointment(appointment)) {
			        System.out.println("Appointment Scheduled Successfully.");
			    } else {
			        System.out.println("Failed to Schedule Appointment.");
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
				
			case 16:

			    Visit visit = new Visit();

			    // Show available appointments
			    List<Appointment> appointmentList = appointmentDAO.getAllAppointments();

			    System.out.println("\n------ Available Appointments ------");

			    for (Appointment a : appointmentList) {
			        System.out.println(a);
			    }

			    System.out.print("Appointment ID : ");
			    visit.setAppointmentId(sc.nextInt());
			    sc.nextLine();

			    // Validate Appointment
			    Appointment existingAppointment =
			            appointmentDAO.getAppointmentById(visit.getAppointmentId());

			    if (existingAppointment == null) {
			        System.out.println("Appointment ID does not exist.");
			        break;
			    }

			    System.out.print("Visit Date (yyyy-MM-dd) : ");
			    visit.setVisitDate(LocalDate.parse(sc.nextLine()));

			    System.out.print("Diagnosis : ");
			    visit.setDiagnosis(sc.nextLine());

			    System.out.print("Prescription : ");
			    visit.setPrescription(sc.nextLine());

			    if (visitDAO.addVisit(visit)) {
			        System.out.println("Visit Added Successfully.");
			    } else {
			        System.out.println("Failed to Add Visit.");
			    }

			    break;
			    
			    
			case 17:

			    List<Visit> visits = visitDAO.getAllVisits();

			    if (visits.isEmpty()) {

			        System.out.println("No Visits Found.");

			    } else {

			        System.out.println("\n------ Visit List ------");

			        for (Visit v : visits) {
			            System.out.println(v);
			        }
			    }

			    break;
			    
			case 18:

			    Billing billing = new Billing();

			    // Show available visits
			    List<Visit> visitList = visitDAO.getAllVisits();

			    if (visitList.isEmpty()) {
			        System.out.println("No Visits Found.");
			        break;
			    }

			    System.out.println("\n------ Available Visits ------");

			    for (Visit v : visitList) {
			        System.out.println(v);
			    }

			    System.out.print("Enter Visit ID : ");
			    billing.setVisitId(sc.nextInt());

			    Visit existingVisit = visitDAO.getVisitById(billing.getVisitId());

			    if (existingVisit == null) {
			        System.out.println("Visit ID does not exist.");
			        break;
			    }

			    System.out.print("Bill Amount : ");
			    billing.setAmount(sc.nextDouble());
			    sc.nextLine();

			    System.out.print("Payment Status (Paid/Pending) : ");
			    billing.setPaymentStatus(sc.nextLine());

			    if (billingDAO.generateBill(billing)) {
			        System.out.println("Bill Generated Successfully.");
			    } else {
			        System.out.println("Failed to Generate Bill.");
			    }

			    break;
			    
			case 19:

				 List<Billing> bills = billingDAO.getAllBills();

				    if (bills.isEmpty()) {

				        System.out.println("No Bills Found.");

				    } else {

				        System.out.println("\n------ Billing List ------");

				        for (Billing bill : bills) {
				            System.out.println(bill);
				        }
				    }

				    break;
				    
			case 20:

			    Visit transactionVisit = new Visit();
			    Billing transactionBilling = new Billing();

			    // Show Appointments
			    List<Appointment> transactionAppointmentList = appointmentDAO.getAllAppointments();

			    System.out.println("\n------ Available Appointments ------");

			    for (Appointment a : transactionAppointmentList) {
			        System.out.println(a);
			    }

			    System.out.print("Appointment ID : ");
			    transactionVisit.setAppointmentId(sc.nextInt());
			    sc.nextLine();

			    Appointment appointmentForTransaction =
			            appointmentDAO.getAppointmentById(transactionVisit.getAppointmentId());

			    if (appointmentForTransaction == null) {

			        System.out.println("Appointment ID does not exist.");
			        break;
			    }

			    System.out.print("Visit Date (yyyy-MM-dd) : ");
			    transactionVisit.setVisitDate(LocalDate.parse(sc.nextLine()));

			    System.out.print("Diagnosis : ");
			    transactionVisit.setDiagnosis(sc.nextLine());

			    System.out.print("Prescription : ");
			    transactionVisit.setPrescription(sc.nextLine());

			    System.out.print("Bill Amount : ");
			    transactionBilling.setAmount(sc.nextDouble());
			    sc.nextLine();

			    System.out.print("Payment Status (Paid/Pending) : ");
			    transactionBilling.setPaymentStatus(sc.nextLine());

			    if (transactionDAO.completePatientVisit(transactionVisit, transactionBilling)) {
			        System.out.println("Patient Visit Completed Successfully.");
			    } else {
			        System.out.println("Failed to Complete Patient Visit.");
			    }

			    break;
			    
			    
			case 21:

			    List<Billing> procedureBills = billingDAO.showBillsUsingProcedure();

			    if (procedureBills.isEmpty()) {

			        System.out.println("No Bills Found.");

			    } else {

			        System.out.println("\n------- Bills (Using Stored Procedure) ------");

			        for (Billing bill : procedureBills) {
			            System.out.println(bill);
			        }
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
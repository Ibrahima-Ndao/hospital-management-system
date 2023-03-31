package com.saraya.hospitalmanagement.dto;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import com.saraya.hospitalmanagement.model.Docter;
import com.saraya.hospitalmanagement.model.Patient;
import com.saraya.hospitalmanagement.model.Receptionnist;

public class AppointmentDTO {
	private int id;
	private String date;
	private String appointmentTime;
	private String status;
	private Patient patient;
	private Receptionnist receptionnist;
	private Docter docter;
	private String medicalIssues;
	
	public AppointmentDTO() {
		super();
	}
	
	
	public String getMedicalIssues() {
		return medicalIssues;
	}


	public void setMedicalIssues(String medicalIssues) {
		this.medicalIssues = medicalIssues;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	public Receptionnist getReceptionnist() {
		return receptionnist;
	}


	public void setReceptionnist(Receptionnist receptionnist) {
		this.receptionnist = receptionnist;
	}


	public Docter getDocter() {
		return docter;
	}


	public void setDocter(Docter docter) {
		this.docter = docter;
	}
	
}

package com.saraya.hospitalmanagement.model;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Appiontment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDate date ;
	private LocalTime appointmentTime;
	private String status;
	private String medicalIssues;
	
	@ManyToOne
	@JoinColumn(name = "patient_id")
	//@JsonIgnoreProperties(value = "appiontments", allowSetters = true)
	private Patient patient;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "receptionnist_id")
	private Receptionnist receptionnist;
	
	@ManyToOne
	@JoinColumn(name = "doctor_id")
	//@JsonIgnoreProperties(value = "appiontments", allowSetters = true)
	private	Docter docter;
	
	public Appiontment() {
	}
	
	public String getMedicalIssues() {
		return medicalIssues;
	}

	public void setMedicalIssues(String medicalIssues) {
		this.medicalIssues = medicalIssues;
	}

	public LocalTime getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(LocalTime appointmentTime) {
		this.appointmentTime = appointmentTime;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	
	
	
}

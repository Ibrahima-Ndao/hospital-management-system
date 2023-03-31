package com.saraya.hospitalmanagement.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Prescription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDate dateDescription;
	private String nameOfMedecine;
	private int dailyDose;
	private int dose;
	private String descriptionAndDetails;
	private String possibleSideEffect;
	
	@ManyToOne
	@JoinColumn(name = "doctor_id")
	//@JsonIgnoreProperties(value = "prescription", allowSetters = true)
	private Docter docter;
	
	@ManyToOne
	@JoinColumn(name = "patient_id")
	//@JsonIgnoreProperties(value = "prescription", allowSetters = true)
	private Patient patient;
	
	public Prescription() {
		super();
	}
	
	
	public Prescription(int id) {
		super();
		this.id = id;
	}

	
	public Prescription(int id, LocalDate dateDescription, String nameOfMedecine, int dailyDose, int dose,
			String descriptionAndDetails, String possibleSideEffect, Docter docter, Patient patient) {
		super();
		this.id = id;
		this.dateDescription = dateDescription;
		this.nameOfMedecine = nameOfMedecine;
		this.dailyDose = dailyDose;
		this.dose = dose;
		this.descriptionAndDetails = descriptionAndDetails;
		this.possibleSideEffect = possibleSideEffect;
		this.docter = docter;
		this.patient = patient;
	}


	public Docter getDocter() {
		return docter;
	}


	public void setDocter(Docter docter) {
		this.docter = docter;
	}


	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDateDescription() {
		return dateDescription;
	}
	public void setDateDescription(LocalDate dateDescription) {
		this.dateDescription = dateDescription;
	}
	public String getNameOfMedecine() {
		return nameOfMedecine;
	}
	public void setNameOfMedecine(String nameOfMedecine) {
		this.nameOfMedecine = nameOfMedecine;
	}
	public int getDailyDose() {
		return dailyDose;
	}
	public void setDailyDose(int dailyDose) {
		this.dailyDose = dailyDose;
	}
	public int getDose() {
		return dose;
	}
	public void setDose(int dose) {
		this.dose = dose;
	}
	public String getDescriptionAndDetails() {
		return descriptionAndDetails;
	}
	public void setDescriptionAndDetails(String descriptionAndDetails) {
		this.descriptionAndDetails = descriptionAndDetails;
	}
	public String getPossibleSideEffect() {
		return possibleSideEffect;
	}
	public void setPossibleSideEffect(String possibleSideEffect) {
		this.possibleSideEffect = possibleSideEffect;
	}
	
}

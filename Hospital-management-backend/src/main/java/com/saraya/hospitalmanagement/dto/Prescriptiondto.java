package com.saraya.hospitalmanagement.dto;

import java.time.LocalDate;

import javax.persistence.OneToOne;

import com.saraya.hospitalmanagement.model.Docter;
import com.saraya.hospitalmanagement.model.Patient;

public class Prescriptiondto {
	private int id;
	private String dateDescription;
	private String nameOfMedecine;
	private int dailyDose;
	private int dose;
	private String descriptionAndDetails;
	private String possibleSideEffect;
	private Docter docter;
	private Patient patient;
	public Prescriptiondto() {
		super();
	}
	
	public Prescriptiondto(int id, String dateDescription, String nameOfMedecine, int dailyDose, int dose,
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

	public Prescriptiondto(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDateDescription() {
		return dateDescription;
	}
	public void setDateDescription(String dateDescription) {
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
	
}

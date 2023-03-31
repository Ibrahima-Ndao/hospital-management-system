package com.saraya.hospitalmanagement.dto;

import java.util.List;

import com.saraya.hospitalmanagement.model.Appiontment;
import com.saraya.hospitalmanagement.model.Payment;
import com.saraya.hospitalmanagement.model.Prescription;

public class PatientDTO extends UserDTO{
	private String bloodGroupe;
	private List<Prescription> prescription;
	private String fullName;
	private String adress;
	private String contact;
	private String photo;
	private String gender;
	private int age;
	private List<Appiontment> appiontments;
	
	
	public PatientDTO() {
		super();
	}
	
	

	public List<Prescription> getPrescription() {
		return prescription;
	}



	public void setPrescription(List<Prescription> prescription) {
		this.prescription = prescription;
	}



	public String getBloodGroupe() {
		return bloodGroupe;
	}
	
	public List<Appiontment> getAppiontments() {
		return appiontments;
	}

	public void setAppiontments(List<Appiontment> appiontments) {
		this.appiontments = appiontments;
	}
	public void setBloodGroupe(String bloodGroupe) {
		this.bloodGroupe = bloodGroupe;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

package com.saraya.hospitalmanagement.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Patient extends User{
	private String bloodGroupe;
	private String fullName;
	private String adress;
	private String contact;
	private String photo;
	private String gender;
	private int age;
	
	@OneToMany(mappedBy = "patient")
	@JsonIgnore
	private List<Prescription> prescription;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "patient")
	@JsonIgnore
	private List<Appiontment> appiontments;
	
	@OneToMany
	private List<SendMail> sendMails;
	public Patient() {
		super();
	}
	
	public List<SendMail> getSendMails() {
		return sendMails;
	}

	public void setSendMails(List<SendMail> sendMails) {
		this.sendMails = sendMails;
	}

	public List<Prescription> getPrescription() {
		return prescription;
	}

	public void setPrescription(List<Prescription> prescription) {
		this.prescription = prescription;
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

	public List<Appiontment> getAppiontments() {
		return appiontments;
	}

	public void setAppiontments(List<Appiontment> appiontments) {
		this.appiontments = appiontments;
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

	
	public String getBloodGroupe() {
		return bloodGroupe;
	}
	public void setBloodGroupe(String bloodGroupe) {
		this.bloodGroupe = bloodGroupe;
	}
	

}

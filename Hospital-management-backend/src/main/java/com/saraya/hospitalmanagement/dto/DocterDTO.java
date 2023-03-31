package com.saraya.hospitalmanagement.dto;

import java.util.List;

import com.saraya.hospitalmanagement.model.Appiontment;
import com.saraya.hospitalmanagement.model.Prescription;
import com.saraya.hospitalmanagement.model.Schedule;
import com.saraya.hospitalmanagement.model.Specialisation;

public class DocterDTO extends UserDTO{
	private int id;
	private String gender;
	private String status;
	private String month;
	private String year;
	private int attendance;
	private String adress;
	private String contact;
	private String photo;
	private Double salary;
	private List<Prescription> prescription;
	private String age;
	private List<Appiontment> appiontments;
	private Specialisation specialisation;
	private List<Schedule> schedule;
	public DocterDTO() {
		super();
	}
	
	public List<Prescription> getPrescription() {
		return prescription;
	}

	public void setPrescription(List<Prescription> prescription) {
		this.prescription = prescription;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public List<Appiontment> getAppiontments() {
		return appiontments;
	}

	public void setAppiontments(List<Appiontment> appiontments) {
		this.appiontments = appiontments;
	}

	public List<Schedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<Schedule> schedule) {
		this.schedule = schedule;
	}

	public Specialisation getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation(Specialisation specialisation) {
		this.specialisation = specialisation;
	}
	
}

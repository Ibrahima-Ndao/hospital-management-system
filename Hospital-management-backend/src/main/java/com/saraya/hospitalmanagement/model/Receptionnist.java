package com.saraya.hospitalmanagement.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Receptionnist extends User{
	private String photo;
	@OneToMany(mappedBy = "receptionnist" ,cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	//@JsonIgnoreProperties("receptionnist")
	private List<Appiontment> appiontments;
	
	public Receptionnist() {
	}
	
	
	public List<Appiontment> getAppiontments() {
		return appiontments;
	}


	public void setAppiontments(List<Appiontment> appiontments) {
		this.appiontments = appiontments;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}

	
}

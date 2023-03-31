package com.saraya.hospitalmanagement.dto;

import java.util.List;



import com.saraya.hospitalmanagement.model.Appiontment;

public class ReceptionnistDTO extends UserDTO{
	private String photo;
	private List<Appiontment> appiontments;
	
	public ReceptionnistDTO() {
		super();
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public List<Appiontment> getAppiontments() {
		return appiontments;
	}
	public void setAppiontments(List<Appiontment> appiontments) {
		this.appiontments = appiontments;
	}
	
}

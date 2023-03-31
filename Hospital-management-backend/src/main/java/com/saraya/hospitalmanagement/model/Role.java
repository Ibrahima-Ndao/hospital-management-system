package com.saraya.hospitalmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRole;
	private String nameRole;
	
	
	public Role() {
		super();
	}
	
	



	public int getIdRole() {
		return idRole;
	}





	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}





	public String getNameRole() {
		return nameRole;
	}
	public void setNameRole(String nameRole) {
		this.nameRole = nameRole;
	}
	
	
}

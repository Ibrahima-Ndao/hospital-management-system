package com.saraya.hospitalmanagement.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.saraya.hospitalmanagement.model.Docter;

public class Scheduledto {
	private int id;
	private Docter docter;
	private	String day;
	private String startTime;
	private String endTime;
	private String month;
	public Scheduledto() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	
	public Docter getDocter() {
		return docter;
	}
	public void setDocter(Docter docter) {
		this.docter = docter;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	
}

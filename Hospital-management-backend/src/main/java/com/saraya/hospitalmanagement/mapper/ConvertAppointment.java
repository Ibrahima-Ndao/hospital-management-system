package com.saraya.hospitalmanagement.mapper;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.saraya.hospitalmanagement.dto.AppointmentDTO;
import com.saraya.hospitalmanagement.model.Appiontment;

@Component
public class ConvertAppointment {
	public Appiontment dtoToEntity(AppointmentDTO appointmentDTO) {
		Appiontment appiontment = new Appiontment();
		if (appointmentDTO.getDate() != null && !(appointmentDTO.getDate()).isEmpty()) {
			appiontment.setDate(LocalDate.parse(appointmentDTO.getDate()));
		} else {
			appiontment.setDate(LocalDate.now());
		}
		
		if(appointmentDTO.getAppointmentTime() != null && !(appointmentDTO.getAppointmentTime()).isEmpty()) {
			appiontment.setAppointmentTime(LocalTime.parse(appointmentDTO.getAppointmentTime()));
		}else {
			appiontment.setAppointmentTime(LocalTime.now());
		}
		appiontment.setDocter(appointmentDTO.getDocter());
		appiontment.setPatient(appointmentDTO.getPatient());
		appiontment.setStatus(appointmentDTO.getStatus());
		appiontment.setReceptionnist(appointmentDTO.getReceptionnist());
		appiontment.setMedicalIssues(appointmentDTO.getMedicalIssues());
		return appiontment;
	}
	
	public AppointmentDTO EntityToDto(Appiontment appiontment) {
		AppointmentDTO dto = new AppointmentDTO();
		dto.setId(appiontment.getId());
		dto.setAppointmentTime(appiontment.getAppointmentTime().toString());
		dto.setDate(appiontment.getDate().toString());
		dto.setDocter(appiontment.getDocter());
		dto.setPatient(appiontment.getPatient());
		dto.setStatus(appiontment.getStatus());
		dto.setReceptionnist(appiontment.getReceptionnist());
		dto.setMedicalIssues(appiontment.getMedicalIssues());
		return dto;
	}
}

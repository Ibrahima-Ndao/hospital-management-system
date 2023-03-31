package com.saraya.hospitalmanagement.services;

import java.util.List;

import com.saraya.hospitalmanagement.dto.AppointmentDTO;

public interface AppointmentServices {
	AppointmentDTO save(AppointmentDTO appointmentDTO);
	List<AppointmentDTO> getAll();
	List<AppointmentDTO> getNewAppointment();
	List<AppointmentDTO> getAppointmentComplete();
	List<AppointmentDTO> getAppointmentBydoctorId(int id);
	AppointmentDTO getAppoitmentById(int id);
	void delete(int id);
	AppointmentDTO update(AppointmentDTO appointmentDTO, int id);
	int numberOfNewAppointment();
	int numberOfAppointmentComplete();
	int numberOfAppointment();
	
}

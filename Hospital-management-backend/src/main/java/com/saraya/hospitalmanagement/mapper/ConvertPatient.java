package com.saraya.hospitalmanagement.mapper;

import org.springframework.stereotype.Component;

import com.saraya.hospitalmanagement.dto.PatientDTO;
import com.saraya.hospitalmanagement.model.Patient;

@Component
public class ConvertPatient {
	public Patient dtoToEntity(PatientDTO dto) {
		Patient patient = new Patient();
		patient.setAdress(dto.getAdress());
		patient.setAge(dto.getAge());
		patient.setAppiontments(dto.getAppiontments());
		patient.setBloodGroupe(dto.getBloodGroupe());
		patient.setContact(dto.getContact());
		patient.setEmail(dto.getEmail());
		patient.setFullName(dto.getFullName());
		patient.setGender(dto.getGender());
		patient.setUsername(dto.getUsername());
		patient.setPrescription(dto.getPrescription());
		return patient;
	}
	
	public PatientDTO EntityToDto(Patient patient) {
		PatientDTO dto = new PatientDTO();
		dto.setId(patient.getId());
		dto.setAdress(patient.getAdress());
		dto.setAge(patient.getAge());
		dto.setAppiontments(patient.getAppiontments());
		dto.setBloodGroupe(patient.getBloodGroupe());
		dto.setContact(patient.getContact());
		dto.setEmail(patient.getEmail());
		dto.setFullName(patient.getFullName());
		dto.setGender(patient.getGender());
		dto.setRoles(patient.getRoles());
		dto.setUsername(patient.getUsername());
		dto.setPhoto(patient.getPhoto());
		dto.setPassword(patient.getPassword());
		dto.setPrescription(patient.getPrescription());
		return dto;
	}
}

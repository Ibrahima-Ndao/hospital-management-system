package com.saraya.hospitalmanagement.mapper;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.saraya.hospitalmanagement.dto.Prescriptiondto;
import com.saraya.hospitalmanagement.model.Prescription;

@Component
public class ConvertPrescription {
	
	public Prescription dtoToEntity(Prescriptiondto dto) {
		Prescription prescription = new Prescription();
		prescription.setDailyDose(dto.getDailyDose());
		prescription.setDateDescription(LocalDate.parse(dto.getDateDescription()));
		prescription.setDescriptionAndDetails(dto.getDescriptionAndDetails());
		prescription.setDocter(dto.getDocter());
		prescription.setDose(dto.getDose());
		prescription.setNameOfMedecine(dto.getNameOfMedecine());
		prescription.setPatient(dto.getPatient());
		prescription.setPossibleSideEffect(dto.getPossibleSideEffect());
		return prescription;
	}
	
	public Prescriptiondto entityTodto(Prescription prescription) {
		Prescriptiondto dto = new Prescriptiondto();
		dto.setId(prescription.getId());
		dto.setPatient(prescription.getPatient());
		dto.setDocter(prescription.getDocter());
		dto.setNameOfMedecine(prescription.getNameOfMedecine());
		dto.setDailyDose(prescription.getDailyDose());
		dto.setDateDescription(prescription.getDateDescription().toString());
		dto.setDescriptionAndDetails(prescription.getDescriptionAndDetails());
		dto.setDose(prescription.getDose());
		dto.setPossibleSideEffect(prescription.getPossibleSideEffect());
		return dto;
	}
}

package com.saraya.hospitalmanagement.services;

import java.util.List;


import com.saraya.hospitalmanagement.dto.PatientDTO;

public interface PatientService {
	PatientDTO save(PatientDTO dto);
	List<PatientDTO> getAll();
	PatientDTO getPatientById(int id);
	void delete(int id);
	PatientDTO update(PatientDTO dto, int id);
	int numberOfPatient();
}

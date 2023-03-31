package com.saraya.hospitalmanagement.services.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saraya.hospitalmanagement.dto.PatientDTO;
import com.saraya.hospitalmanagement.mapper.ConvertPatient;
import com.saraya.hospitalmanagement.model.Patient;
import com.saraya.hospitalmanagement.repository.PatientRepository;
import com.saraya.hospitalmanagement.services.PatientService;
@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	private ConvertPatient convertPatient;
	@Autowired 
	private PatientRepository repository;
	@Override
	public PatientDTO save(PatientDTO dto) {
		Patient patient = convertPatient.dtoToEntity(dto);
		repository.save(patient);
		PatientDTO patientDTO = convertPatient.EntityToDto(patient);
		return patientDTO;
	}

	@Override
	public List<PatientDTO> getAll() {
		List<Patient> patients = repository.findAll();
		List<PatientDTO> dtos  = new ArrayList<>();
		for (Patient patient : patients) {
			PatientDTO dto = convertPatient.EntityToDto(patient);
			dtos.add(dto);
		}
		return dtos;
	}

	@Override
	public PatientDTO getPatientById(int id) {
		Optional<Patient> patient = repository.findById(id);
		PatientDTO dto = null;
		if (patient.isPresent()) {
			Patient pt = patient.get();
			dto = convertPatient.EntityToDto(pt);
		} else {
			throw new RuntimeException("verify the id that you want to show!!!!!!");
		}
		return dto;
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}

	@Override
	public PatientDTO update(PatientDTO dto, int id) {
		Optional<Patient> optional = repository.findById(id);
		PatientDTO patientDTO = null;
		if (optional.isPresent()) {
			Patient patient = optional.get();
			patient.setAdress(dto.getAdress());
			patient.setAge(dto.getAge());
			patient.setAppiontments(dto.getAppiontments());
			patient.setBloodGroupe(dto.getBloodGroupe());
			patient.setContact(dto.getContact());
			patient.setEmail(dto.getEmail());
			patient.setFullName(dto.getFullName());
			patient.setGender(dto.getGender());
			patient.setPrescription(dto.getPrescription());
			patientDTO = convertPatient.EntityToDto(patient); 
			repository.save(patient);
		}
		return patientDTO;
	}

	@Override
	public int numberOfPatient() {
		List<Patient> list = repository.findAll();
		int cpt = 0;
		for (int i = 0; i < list.size(); i++) {
			cpt++;
		}
		return cpt;
	}

}

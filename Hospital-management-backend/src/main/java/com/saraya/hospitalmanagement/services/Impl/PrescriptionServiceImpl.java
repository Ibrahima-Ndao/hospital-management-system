package com.saraya.hospitalmanagement.services.Impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saraya.hospitalmanagement.dto.Prescriptiondto;
import com.saraya.hospitalmanagement.mapper.ConvertPrescription;
import com.saraya.hospitalmanagement.model.Prescription;
import com.saraya.hospitalmanagement.repository.PrescriptionRepository;
import com.saraya.hospitalmanagement.services.PrescriptionService;
@Service
public class PrescriptionServiceImpl implements PrescriptionService{
	@Autowired
	private PrescriptionRepository prescriptionRepository;
	@Autowired 
	private ConvertPrescription convertPrescription;
	@Override
	public Prescriptiondto save(Prescriptiondto prescriptiondto) {
		prescriptionRepository.save(convertPrescription.dtoToEntity(prescriptiondto));
		return convertPrescription.entityTodto(convertPrescription.dtoToEntity(prescriptiondto));
	}

	@Override
	public List<Prescriptiondto> getAll() {
		List<Prescription> prescriptions = prescriptionRepository.findAll();
		List<Prescriptiondto> prescriptiondtos = new ArrayList<>();
		for (Prescription prescription : prescriptions) {
			Prescriptiondto prescriptiondto = convertPrescription.entityTodto(prescription);
			prescriptiondtos.add(prescriptiondto);
		}
		return prescriptiondtos;
	}

	@Override
	public Prescriptiondto getPrescription(int id) {
		Optional<Prescription> optional = prescriptionRepository.findById(id);
		Prescriptiondto prescriptiondto = null;
		if (optional.isPresent()) {
			Prescription prescription = optional.get();
			prescriptiondto = convertPrescription.entityTodto(prescription);
		} else {
			throw new RuntimeException("this id is not found !!");
		}
		return prescriptiondto;
	}

	@Override
	public Prescriptiondto update(Prescriptiondto prescriptiondto, int id) {
		Optional<Prescription> optional = prescriptionRepository.findById(id);
		Prescriptiondto dto = null;
		if (optional.isPresent()) {
			Prescription prescription = optional.get();
			prescription.setDailyDose(prescriptiondto.getDailyDose());
			prescription.setDateDescription(LocalDate.parse(prescriptiondto.getDateDescription()));
			prescription.setDescriptionAndDetails(prescriptiondto.getDescriptionAndDetails());
			prescription.setDocter(prescriptiondto.getDocter());
			prescription.setDose(prescriptiondto.getDose());
			prescription.setNameOfMedecine(prescriptiondto.getNameOfMedecine());
			prescription.setPatient(prescriptiondto.getPatient());
			prescription.setPossibleSideEffect(prescriptiondto.getPossibleSideEffect());
			prescriptionRepository.save(prescription);
			dto = convertPrescription.entityTodto(prescription);
		}		
		return dto;
	}

	@Override
	public void delete(int id) {
		prescriptionRepository.deleteById(id);
	}

}

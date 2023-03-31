package com.saraya.hospitalmanagement.services;

import java.util.List;

import com.saraya.hospitalmanagement.dto.Prescriptiondto;

public interface PrescriptionService {
	Prescriptiondto save(Prescriptiondto prescriptiondto);
	List<Prescriptiondto> getAll();
	Prescriptiondto getPrescription(int id);
	Prescriptiondto update(Prescriptiondto prescriptiondto, int id);
	void delete(int id);
}

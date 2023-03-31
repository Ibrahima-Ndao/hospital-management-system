package com.saraya.hospitalmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saraya.hospitalmanagement.dto.Prescriptiondto;
import com.saraya.hospitalmanagement.model.Prescription;
import com.saraya.hospitalmanagement.repository.PrescriptionRepository;
import com.saraya.hospitalmanagement.services.Impl.PrescriptionServiceImpl;

@RestController
@RequestMapping("/api/prescriptions")
@CrossOrigin("http://localhost:4200")
public class PrescriptionController {
	@Autowired
	private PrescriptionServiceImpl impl;
	@Autowired
	PrescriptionRepository  prescriptionRepository;
	@PostMapping("/add")
	public Prescriptiondto save(@RequestBody Prescriptiondto prescriptiondto) {
		return impl.save(prescriptiondto);
	}
	@GetMapping("/list")
	public List<Prescriptiondto> getAllPrescription() {
		return impl.getAll();
	}
	@PutMapping("/update/{id}")
	public Prescriptiondto updatePrescription(@RequestBody Prescriptiondto prescriptiondto, @PathVariable int id) {
		return impl.update(prescriptiondto, id);
	}
	@GetMapping("/{id}")
	public Prescriptiondto getPrescription(@PathVariable int id) {
		return impl.getPrescription(id);
	}
	@DeleteMapping("/{id}")
	public void deletePrescription(@PathVariable int id) {
		impl.delete(id);;
	}
	@GetMapping("/patient/pres/{id}")
	public List<Prescription> getPres(@PathVariable int id) {
		return prescriptionRepository.findPrescriptionsByPatientId(id);
	}
}

package com.saraya.hospitalmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saraya.hospitalmanagement.dto.DocterDTO;
import com.saraya.hospitalmanagement.dto.PatientDTO;
import com.saraya.hospitalmanagement.services.PatientService;

@RestController
@RequestMapping("/api/patients")
@CrossOrigin("http://localhost:4200")

public class PatientController {
	@Autowired
	private PatientService service;
	
	@PostMapping("/add")
	public PatientDTO saveDocter(@RequestBody PatientDTO dto) {
		return service.save(dto);
	}
	
	@GetMapping("/list")
	public List<PatientDTO> getAllDocter() {
		return service.getAll();
	}
	
	@GetMapping("/one/{id}")
	public PatientDTO getDocter(@PathVariable int id) {
		return service.getPatientById(id);
	}
	
	@PutMapping("/update/{id}")
	public PatientDTO updateDocter(@RequestBody PatientDTO dto, @PathVariable int id) {
		return service.update(dto, id);
	}
	
	@DeleteMapping("/dalete/{id}")
	public void deleteDocter(@PathVariable int id) {
		service.delete(id);
	}
	
	@GetMapping("/number")
	public int totalPatient() {
		return service.numberOfPatient();
	}
}

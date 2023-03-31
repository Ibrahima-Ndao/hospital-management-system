package com.saraya.hospitalmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saraya.hospitalmanagement.model.Specialisation;
import com.saraya.hospitalmanagement.repository.SpecialisationRepository;
import com.saraya.hospitalmanagement.services.Impl.SpecializatioService;

@RestController
@RequestMapping("/api/specialisation")
@CrossOrigin("http://localhost:4200")
public class SpecialisationContrller {
	@Autowired
	private SpecializatioService service;
	@GetMapping("/{id}")
	public Specialisation getSpece(@PathVariable int id) {
		return service.getSpecialization(id);
	}
	@GetMapping("/list")
	public List<Specialisation> getSpece() {
		return service.getAll();
	}
	
	public Specialisation save(@RequestBody Specialisation specialisation) {
		return service.save(specialisation);
	}
}

package com.saraya.hospitalmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import com.saraya.hospitalmanagement.model.Docter;
import com.saraya.hospitalmanagement.model.Specialisation;
import com.saraya.hospitalmanagement.repository.DocterRepository;
import com.saraya.hospitalmanagement.services.Impl.DocterServiceImpl;


@RestController
@RequestMapping("/api/docters")
@CrossOrigin("http://localhost:4200")
public class DocterController {
	@Autowired
	private DocterServiceImpl serviceImpl;
	@Autowired
	private DocterRepository docterRepository;
	@PostMapping("/add")
	public DocterDTO saveDocter(@RequestBody DocterDTO dto) {
		return serviceImpl.save(dto);
	}
	
	@GetMapping("/list")
	public List<DocterDTO> getAllDocter() {
		return serviceImpl.getAll();
	}
	
	@GetMapping("/one/{id}")
	public DocterDTO getDocter(@PathVariable int id) {
		return serviceImpl.getDocterById(id);
	}
	
	@PutMapping("/update/{id}")
	public DocterDTO updateDocter(@RequestBody DocterDTO dto, @PathVariable int id) {
		return serviceImpl.update(dto, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteDocter(@PathVariable int id) {
		serviceImpl.delete(id);
	}
	
	@GetMapping("/numberofdocter")
	public int number() {
		return serviceImpl.numberOfDoctor();
	}
	
	@GetMapping("/numberofdocterActive")
	public int numberActive() {
		return serviceImpl.numberOfActiveDoctor();
	}
	
	@GetMapping("/listDoctorsAvailable")
	public List<DocterDTO> getAvailableDocter() {
		return serviceImpl.getAvailableDoctors();
	}
	
	@GetMapping("/listDoctorsAvailable/{name}")
	public List<Docter> getAvailableDocter(@PathVariable String name) {
		return docterRepository.findBySpecialisationNameContaining(name);
	}
}

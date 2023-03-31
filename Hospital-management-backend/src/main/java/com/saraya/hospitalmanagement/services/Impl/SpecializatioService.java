package com.saraya.hospitalmanagement.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saraya.hospitalmanagement.model.Specialisation;
import com.saraya.hospitalmanagement.repository.SpecialisationRepository;

@Service
public class SpecializatioService {
	@Autowired
	private SpecialisationRepository repository;
	
	public Specialisation save(Specialisation specialisation) {
		return repository.save(specialisation);
	}
	
	public List<Specialisation> getAll(){
		return repository.findAll();
	}
	
	public Specialisation getSpecialization(int id) {
		return repository.findById(id).orElse(null);
	}
	
	
}

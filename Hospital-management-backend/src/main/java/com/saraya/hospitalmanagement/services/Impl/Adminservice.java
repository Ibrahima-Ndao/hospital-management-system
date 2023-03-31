package com.saraya.hospitalmanagement.services.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Service;

import com.saraya.hospitalmanagement.repository.AdminRepository;

@Service
public class Adminservice {
	@Autowired 
	private AdminRepository repo;
	public com.saraya.hospitalmanagement.model.Admin update(int id, com.saraya.hospitalmanagement.model.Admin admins) {
		Optional<com.saraya.hospitalmanagement.model.Admin> optional = repo.findById(id);
		com.saraya.hospitalmanagement.model.Admin admin = null;
		if (optional.isPresent()) {
			admin = optional.get();
			admin.setEmail(admins.getEmail());
			admin.setFullName(admins.getFullName());
			admin.setPassword(admins.getPassword());
			admin.setRoles(admins.getRoles());
			admin.setUsername(admins.getUsername());
			repo.save(admin);
		}
		return admin;
	}
	
}

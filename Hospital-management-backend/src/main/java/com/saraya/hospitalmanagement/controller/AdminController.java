package com.saraya.hospitalmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saraya.hospitalmanagement.model.Admin;
import com.saraya.hospitalmanagement.repository.AdminRepository;
import com.saraya.hospitalmanagement.services.Impl.Adminservice;

@RestController
@RequestMapping("/api/admins")
@CrossOrigin("http://localhost:4200")
public class AdminController {
	@Autowired
	private Adminservice adminservice;
	@Autowired
	private AdminRepository adminRepository;
	@PutMapping("/{id}")
	public Admin update(@RequestBody Admin admin, @PathVariable int id) {
		return adminservice.update(id, admin);
	}
	@GetMapping("/{id}")
	public Admin admin(@PathVariable int id) {
		Admin admin = adminRepository.findById(id).orElse(null);
		return admin;
	}
	@DeleteMapping("/{id}")
	public void deleteAdmin(@PathVariable int id) {
		adminRepository.deleteById(id);
	}
}

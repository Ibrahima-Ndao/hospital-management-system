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

import com.saraya.hospitalmanagement.model.Receptionnist;
import com.saraya.hospitalmanagement.services.Impl.ReceptionistServiceImpl;

@RestController
@RequestMapping("/api/receptionist")
@CrossOrigin("http://localhost:4200")
public class ReceptionistController {
	@Autowired
	private ReceptionistServiceImpl impl;
	
	@PostMapping("/add")
	public Receptionnist save(@RequestBody Receptionnist receptionnist) {
		return impl.save(receptionnist);
	}
	
	@GetMapping("/list")
	public List<Receptionnist> list() {
		return impl.getAll();
	}
	
	@PutMapping("/update/{id}")
	public Receptionnist save(@RequestBody Receptionnist receptionnist, @PathVariable int id) {
		return impl.update(receptionnist, id);
	}
	
	@GetMapping("/{id}")
	public Receptionnist getone(@PathVariable int id) {
		return impl.getReceptionnistById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteReceptionist(@PathVariable int id) {
		impl.delete(id);
	}
	
}

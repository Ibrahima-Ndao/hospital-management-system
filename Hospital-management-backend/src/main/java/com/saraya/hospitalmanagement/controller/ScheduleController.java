package com.saraya.hospitalmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saraya.hospitalmanagement.dto.Scheduledto;
import com.saraya.hospitalmanagement.model.Schedule;
import com.saraya.hospitalmanagement.repository.ScheduleRepository;
import com.saraya.hospitalmanagement.services.ScheduleService;

@RestController
@RequestMapping("/api/schedules")
public class ScheduleController {
	@Autowired
	private ScheduleService scheduleService;
	@Autowired
	private ScheduleRepository repository;
	@PostMapping("/add")
	public Scheduledto saveSchedule(@RequestBody Scheduledto scheduledto) {
		return scheduleService.save(scheduledto);
	}
	
	@PostMapping("/update/{id}")
	public Scheduledto updateSchedule(@RequestBody Scheduledto scheduledto, int id) {
		return scheduleService.update(scheduledto, id);
	}
	
	@GetMapping("/list")
	public List<Scheduledto> saveSchedule() {
		return scheduleService.getAll();
	}
	
	@GetMapping("/list/{id}")
	public List<Schedule> getScheduleByDoctorId(@PathVariable int id) {
		return repository.findScheduleByDocterId(id);
	}
	
	@GetMapping("/{id}")
	public Scheduledto getSchedule(@PathVariable int id) {
		return scheduleService.getScheduleById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteSchedule(@PathVariable int id) {
		scheduleService.delete(id);
	}
}

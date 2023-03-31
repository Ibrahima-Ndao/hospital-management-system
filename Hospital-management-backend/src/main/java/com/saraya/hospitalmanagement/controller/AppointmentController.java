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

import com.saraya.hospitalmanagement.dto.AppointmentDTO;
import com.saraya.hospitalmanagement.model.Appiontment;
import com.saraya.hospitalmanagement.repository.AppointmentRepository;
import com.saraya.hospitalmanagement.services.Impl.AppointmentServiveImpl;

@RestController
@RequestMapping("/api/appointments")
@CrossOrigin("http://localhost:4200")
public class AppointmentController {
	@Autowired
	private AppointmentServiveImpl serviveImpl;
	@Autowired
	private AppointmentRepository appointmentRepository;
	@PostMapping("/add")
	public AppointmentDTO save(@RequestBody AppointmentDTO appointmentDTO) {
		return serviveImpl.save(appointmentDTO);
	}
	@GetMapping("/list")
	public List<AppointmentDTO> appointmentList() {
		return serviveImpl.getAll();
	}
	
	@GetMapping("/AppointmentComplete")
	public List<AppointmentDTO> getAppointmentComplete() {
		return serviveImpl.getAppointmentComplete();
	}
	
	@GetMapping("/NewAppointment")
	public List<AppointmentDTO> getNewAppointment() {
		return serviveImpl.getNewAppointment();
	}
	
	@GetMapping("/{id}")
	public AppointmentDTO getAppointment(@PathVariable int id) {
		return serviveImpl.getAppoitmentById(id);
	}
	
	@PutMapping("/update/{id}")
	public AppointmentDTO updateAppoint(@RequestBody AppointmentDTO appointmentDTO, @PathVariable int id) {
		return serviveImpl.update(appointmentDTO, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteAppointment(@PathVariable int id) {
		serviveImpl.delete(id);
	}
	
	@GetMapping("/numberOfNewAppointment")
	public int getnumberOfNewAppointment() {
		return serviveImpl.numberOfNewAppointment();
	}
	@GetMapping("/numberOfAppointmentComplete")
	public int getnumberOfAppointmentComplete() {
		return serviveImpl.numberOfAppointmentComplete();
	}
	@GetMapping("/numberOfAppointment")
	public int getnumberOfAppointment() {
		return serviveImpl.numberOfAppointment();
	}
	
	@GetMapping("/getAppointmentAccepted/{id}")
	public List<AppointmentDTO> getAppointmentsComplete(@PathVariable int id) {
		
		return serviveImpl.getAppointmentBydoctorId(id);
	}
	
	@GetMapping("/getAppointmentPatient/{id}/{status}")
	public List<Appiontment> getAppointmentsPatient(@PathVariable int id, @PathVariable String status) {
		
		return appointmentRepository.findByPatientIdAndStatus(id, status);
	}
}

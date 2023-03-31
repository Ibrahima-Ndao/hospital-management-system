package com.saraya.hospitalmanagement.services.Impl;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saraya.hospitalmanagement.dto.AppointmentDTO;
import com.saraya.hospitalmanagement.mapper.ConvertAppointment;
import com.saraya.hospitalmanagement.model.Appiontment;
import com.saraya.hospitalmanagement.model.Patient;
import com.saraya.hospitalmanagement.repository.AppointmentRepository;
import com.saraya.hospitalmanagement.repository.PatientRepository;
import com.saraya.hospitalmanagement.services.AppointmentServices;
@Service
public class AppointmentServiveImpl implements AppointmentServices {
	@Autowired
	private AppointmentRepository repository;
	@Autowired
	private ConvertAppointment convert;
	@Autowired
	private PatientRepository patientRepository;
	
	@Override
	public AppointmentDTO save(AppointmentDTO appointmentDTO) {
		repository.save(convert.dtoToEntity(appointmentDTO));
		AppointmentDTO dto = convert.EntityToDto(convert.dtoToEntity(appointmentDTO));
		return dto;
	}

	@Override
	public List<AppointmentDTO> getAll() {
		List<Appiontment> appiontments = repository.findAll();
		List<AppointmentDTO> dtos = new ArrayList<>();
		for (Appiontment appiontment : appiontments) {
			AppointmentDTO dto = convert.EntityToDto(appiontment);
			dtos.add(dto);
		}
		return dtos;
	}

	@Override
	public AppointmentDTO getAppoitmentById(int id) {
		Optional<Appiontment> optional = repository.findById(id);
		AppointmentDTO dto = null;
		if(optional.isPresent()) {
			Appiontment appiontment = optional.get();
			dto = convert.EntityToDto(appiontment);
		}
		else {
			throw new RuntimeException("this id is not found");
		}
		return dto;
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}

	@Override
	public AppointmentDTO update(AppointmentDTO appointmentDTO, int id) {
		Optional<Appiontment> optional = repository.findById(id);
		AppointmentDTO dto = null;
		if(optional.isPresent()) {
			Appiontment appiontment = optional.get();
			appiontment.setAppointmentTime(LocalTime.parse(appointmentDTO.getAppointmentTime()));
			appiontment.setDate(LocalDate.parse(appointmentDTO.getDate()));
			appiontment.setDocter(appointmentDTO.getDocter());
			appiontment.setPatient(appointmentDTO.getPatient());
			appiontment.setStatus(appointmentDTO.getStatus());
			appiontment.setReceptionnist(appointmentDTO.getReceptionnist());
			dto = convert.EntityToDto(appiontment);
			repository.save(appiontment);
		}
		return dto;
	}

	@Override
	public int numberOfNewAppointment() {
		List<Appiontment> appiontment = repository.findAll();
		int number = 0;
		for (Appiontment appiontment2 : appiontment) {
			if (appiontment2.getStatus() == null) {
				number++;
			}
		}
		return number;
	}

	@Override
	public int numberOfAppointmentComplete() {
		List<Appiontment> appiontment = repository.findAll();
		int number = 0;
		for (Appiontment appiontment2 : appiontment) {
			if (appiontment2.getStatus() != null) {
				number++;
			}
		}
		return number;
	}

	@Override
	public List<AppointmentDTO> getNewAppointment() {
		List<Appiontment> appiontments = repository.findAll();
		List<AppointmentDTO> dtos = new ArrayList<>();
		for (Appiontment appiontment : appiontments) {
			if(appiontment.getStatus() == null) {
				AppointmentDTO dto = convert.EntityToDto(appiontment);
				dtos.add(dto);
			}
			
		}
		return dtos;
	}

	@Override
	public List<AppointmentDTO> getAppointmentComplete() {
		List<Appiontment> appiontments = repository.findAll();
		List<AppointmentDTO> dtos = new ArrayList<>();
		for (Appiontment appiontment : appiontments) {
			if(appiontment.getStatus() != null) {
				AppointmentDTO dto = convert.EntityToDto(appiontment);
				dtos.add(dto);
			}
			
		}
		return dtos;
	}

	@Override
	public int numberOfAppointment() {
		List<Appiontment> appiontment = repository.findAll();
		int number = 0;
		for (Appiontment appiontment2 : appiontment) {
				number++;
		}
		return number;
	}

	@Override
	public List<AppointmentDTO> getAppointmentBydoctorId(int id) {
		List<Appiontment> appiontments = repository.findAppiontmentByDocterId(id);
		List<AppointmentDTO> dtos = new ArrayList<>();
		for (Appiontment appiontment : appiontments) {
			if(appiontment.getStatus().equalsIgnoreCase("accepted") ) {
				AppointmentDTO dto = convert.EntityToDto(appiontment);
				dtos.add(dto);
			}
			
		}
		return dtos;
	}

}

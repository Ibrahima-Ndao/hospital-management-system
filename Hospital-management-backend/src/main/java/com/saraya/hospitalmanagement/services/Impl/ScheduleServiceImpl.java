package com.saraya.hospitalmanagement.services.Impl;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saraya.hospitalmanagement.dto.PatientDTO;
import com.saraya.hospitalmanagement.dto.Scheduledto;
import com.saraya.hospitalmanagement.mapper.ConvertSchedule;
import com.saraya.hospitalmanagement.model.Schedule;
import com.saraya.hospitalmanagement.repository.ScheduleRepository;
import com.saraya.hospitalmanagement.services.ScheduleService;
@Service
public class ScheduleServiceImpl implements ScheduleService {
	@Autowired
	private ScheduleRepository repository;
	@Autowired
	private ConvertSchedule convertSchedule;
	
	@Override
	public Scheduledto save(Scheduledto dto) {
		Schedule schedule = convertSchedule.dtoToEntity(dto);
		repository.save(schedule);
		Scheduledto scheduledto = convertSchedule.EntityToDto(schedule);
		return scheduledto;
	}

	@Override
	public List<Scheduledto> getAll() {
		List<Schedule> schedules = repository.findAll();
		List<Scheduledto> scheduledtos = new ArrayList<>();
		for (Schedule schedule : schedules) {
			Scheduledto dto = convertSchedule.EntityToDto(schedule);
			scheduledtos.add(dto);
		}
		return scheduledtos;
	}

	@Override
	public Scheduledto getScheduleById(int id) {
		Optional<Schedule> optional = repository.findById(id);
		Scheduledto scheduledto =null;
		if (optional.isPresent()) {
			Schedule schedule = optional.get();
			scheduledto = convertSchedule.EntityToDto(schedule);
		} else {
			throw new RuntimeException("this id not found!");
		}
		return scheduledto;
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}

	@Override
	public Scheduledto update(Scheduledto dto, int id) {
		Optional<Schedule> optional = repository.findById(id);
		Scheduledto scheduledto =null;
		if (optional.isPresent()) {
			Schedule schedule = optional.get();
			schedule.setDay(dto.getDay());
			schedule.setDocter(dto.getDocter());
			schedule.setEndTime(LocalTime.parse(dto.getEndTime()));
			schedule.setStartTime(LocalTime.parse(dto.getStartTime()));
			
			repository.save(schedule);
			scheduledto = convertSchedule.EntityToDto(schedule);
		}
		return scheduledto;
	}

}

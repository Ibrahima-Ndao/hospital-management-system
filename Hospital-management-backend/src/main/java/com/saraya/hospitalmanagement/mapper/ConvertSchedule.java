package com.saraya.hospitalmanagement.mapper;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Component;

import com.saraya.hospitalmanagement.dto.Scheduledto;
import com.saraya.hospitalmanagement.model.Schedule;

@Component
public class ConvertSchedule {
	
	public Schedule dtoToEntity(Scheduledto dto) {
		Schedule schedule = new Schedule();
		schedule.setDay(dto.getDay());
		schedule.setDocter(dto.getDocter());
		schedule.setEndTime(LocalTime.parse(dto.getEndTime()));
		schedule.setStartTime(LocalTime.parse(dto.getStartTime()));
		schedule.setMonth(dto.getMonth());
		return schedule;
	}
	
	public Scheduledto EntityToDto(Schedule schedule) {
		Scheduledto dto = new Scheduledto();
		dto.setId(schedule.getId());
		dto.setDay(schedule.getDay());
		dto.setDocter(schedule.getDocter());
		dto.setEndTime(schedule.getEndTime().toString());
		dto.setStartTime(schedule.getStartTime().toString());
		dto.setMonth(schedule.getMonth());
		return dto;
	}

}

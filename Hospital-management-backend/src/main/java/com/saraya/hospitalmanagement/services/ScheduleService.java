package com.saraya.hospitalmanagement.services;

import java.util.List;

import com.saraya.hospitalmanagement.dto.PatientDTO;
import com.saraya.hospitalmanagement.dto.Scheduledto;

public interface ScheduleService {
	Scheduledto save(Scheduledto dto);
	List<Scheduledto> getAll();
	Scheduledto getScheduleById(int id);
	void delete(int id);
	Scheduledto update(Scheduledto dto, int id);
	
}

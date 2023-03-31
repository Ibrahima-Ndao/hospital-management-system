package com.saraya.hospitalmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.saraya.hospitalmanagement.model.Schedule;
@Repository
@CrossOrigin("http://localhost:4200")
public interface ScheduleRepository extends JpaRepository<Schedule, Integer>{
	List<Schedule> findScheduleByDocterId(int id);
}

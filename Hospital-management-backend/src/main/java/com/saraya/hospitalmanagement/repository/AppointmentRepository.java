package com.saraya.hospitalmanagement.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.saraya.hospitalmanagement.model.Appiontment;
@Repository
@CrossOrigin("http://localhost:4200")
public interface AppointmentRepository extends JpaRepository<Appiontment, Integer> {

	List<Appiontment> findAppiontmentByStatus(String status);

	List<Appiontment> findAppiontmentByDocterId(int id);
	List<Appiontment> findByPatientIdAndStatus(int id, String status);
}

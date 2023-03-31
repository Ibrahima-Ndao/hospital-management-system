package com.saraya.hospitalmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.saraya.hospitalmanagement.model.Prescription;
@CrossOrigin("http://localhost:4200")
@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {
	List<Prescription> findPrescriptionsByPatientId(int id);
}

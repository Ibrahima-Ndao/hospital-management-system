package com.saraya.hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.saraya.hospitalmanagement.model.Patient;
@CrossOrigin("http://localhost:4200")
@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

	Patient findByEmail(String email);

}

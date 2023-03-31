package com.saraya.hospitalmanagement.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import com.saraya.hospitalmanagement.model.Specialisation;
@Repository
@CrossOrigin("http://localhost:4200")
public interface SpecialisationRepository extends JpaRepository<Specialisation, Integer> {
	
	Page<Specialisation> findByDoctersId(@PathVariable int id, Pageable pageable);
	
}

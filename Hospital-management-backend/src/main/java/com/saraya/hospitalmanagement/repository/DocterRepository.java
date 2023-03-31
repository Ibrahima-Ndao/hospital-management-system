package com.saraya.hospitalmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.saraya.hospitalmanagement.model.Admin;
import com.saraya.hospitalmanagement.model.Docter;


@Repository
public interface DocterRepository extends JpaRepository<Docter, Integer> {

	Docter findByEmail(String email);
	
	List<Docter> findBySpecialisationNameContaining(String name);

	List<Docter> findDoctersByStatus(String string);

	List<Docter> findByStatus(String string);
}


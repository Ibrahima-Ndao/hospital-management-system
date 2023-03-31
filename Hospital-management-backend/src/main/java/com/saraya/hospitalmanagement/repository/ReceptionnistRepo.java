package com.saraya.hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.saraya.hospitalmanagement.model.Receptionnist;
@CrossOrigin("http://localhost:4200")
@Repository
public interface ReceptionnistRepo extends JpaRepository<Receptionnist, Integer> {

	Receptionnist findByEmail(String email);

}

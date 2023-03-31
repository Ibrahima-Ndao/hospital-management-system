package com.saraya.hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saraya.hospitalmanagement.model.Admin;
import com.saraya.hospitalmanagement.model.Role;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

	Admin findByEmail(String email);

}

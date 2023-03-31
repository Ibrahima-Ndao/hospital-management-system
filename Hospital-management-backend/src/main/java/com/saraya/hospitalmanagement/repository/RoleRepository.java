package com.saraya.hospitalmanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.saraya.hospitalmanagement.model.Role;
@Repository
@CrossOrigin("http://localhost:4200")
public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByNameRole(String name);

	//Optional<Role> findById(String string);
	//public Role findByNameRole(String name);
}

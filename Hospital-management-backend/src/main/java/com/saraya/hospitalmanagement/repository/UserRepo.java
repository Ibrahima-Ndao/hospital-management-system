package com.saraya.hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.saraya.hospitalmanagement.model.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	public User findByEmail(String email);
	public User findByEmailAndPassword(String email, String password);
	
	@Query("SELECT u FROM User u WHERE u.username = : username")
	public User getUserByUsername(@Param("username") String username);
}

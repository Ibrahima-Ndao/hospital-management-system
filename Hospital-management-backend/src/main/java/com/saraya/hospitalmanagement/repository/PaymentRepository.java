package com.saraya.hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.saraya.hospitalmanagement.model.Receptionnist;
@Repository
public interface PaymentRepository extends JpaRepository<Receptionnist, Integer> {

}

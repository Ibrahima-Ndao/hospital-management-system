package com.saraya.hospitalmanagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saraya.hospitalmanagement.model.SendMail;

import java.util.List;

@Repository
public interface MailRepository extends JpaRepository<SendMail, Long> {

    List<SendMail> findSendMailsByPatientId(int id);

}

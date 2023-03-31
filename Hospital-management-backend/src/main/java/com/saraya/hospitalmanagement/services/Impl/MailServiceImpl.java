package com.saraya.hospitalmanagement.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.saraya.hospitalmanagement.model.SendMail;
import com.saraya.hospitalmanagement.repository.MailRepository;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.ArrayList;
import java.util.List;

@Service
public class MailServiceImpl {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private MailRepository repository;

    public SendMail sender(SendMail mail) {

        MimeMessage mimeMessage = mailSender.createMimeMessage();
        SimpleMailMessage helper = new SimpleMailMessage();
        helper.setFrom(mail.getReceptionnist().getEmail());
        helper.setTo(mail.getPatient().getEmail());
        helper.setSubject(mail.getObject());
        helper.setText(mail.getText());
        // helper.setSentDate();

        mailSender.send(mimeMessage);

        return repository.save(mail);
    }

    public List<SendMail> receiveByPatient(int id) {
        return repository.findSendMailsByPatientId(id);
    }

    public List<SendMail> receive() {
        return repository.findAll();
    }

}

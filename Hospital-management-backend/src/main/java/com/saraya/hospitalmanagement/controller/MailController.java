package com.saraya.hospitalmanagement.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.saraya.hospitalmanagement.model.SendMail;
import com.saraya.hospitalmanagement.services.Impl.MailServiceImpl;

import javax.mail.MessagingException;
import java.util.List;

@RestController
@RequestMapping("/mail")
@CrossOrigin("http://localhost:4200")
public class MailController {
    @Autowired
    private MailServiceImpl mySender;

   @PostMapping("/send")
    public SendMail sender (@RequestBody SendMail message) {
         mySender.sender(message);
        return mySender.sender(message);
    }

    @GetMapping("/receive")
    public List<SendMail> getMails(){
        return mySender.receive();
    }

    @GetMapping("/receive/{id}")
    public List<SendMail> getMailByPatient(@PathVariable int id){
       return mySender.receiveByPatient(id);
    }
}

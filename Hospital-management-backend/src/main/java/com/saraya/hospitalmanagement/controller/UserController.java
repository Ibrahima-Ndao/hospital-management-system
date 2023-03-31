package com.saraya.hospitalmanagement.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saraya.hospitalmanagement.model.Admin;
import com.saraya.hospitalmanagement.model.Docter;
import com.saraya.hospitalmanagement.model.Patient;
import com.saraya.hospitalmanagement.model.Receptionnist;
import com.saraya.hospitalmanagement.model.User;
import com.saraya.hospitalmanagement.services.Impl.UserService;

import javax.annotation.PostConstruct;

@RestController
@CrossOrigin("http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userService;

//    @PostConstruct
//    public void initRoleAndUser() {
//        userService.initRoleAndUser();
//    }

    @PostMapping({"/registerNewAdmin"})
    public User registerNewUser(@RequestBody Admin user) {
        return userService.registerNewAdmin(user);
    }
    
    @PostMapping({"/registerNewDoctor"})
    public User registerNewUser(@RequestBody Docter user) {
        return userService.registerNewDoctor(user);
    }
    
    @PostMapping({"/registerNewPatient"})
    public User registerNewUser(@RequestBody Patient user) {
        return userService.registerNewPatient(user);
    }
    
    @PostMapping({"/registerNewReceptionist"})
    public User registerNewUser(@RequestBody Receptionnist user) {
        return userService.registerNewReceptionnist(user);
    }
    
    @GetMapping({"/forAdmin"})
    @PreAuthorize("hasRole('Admin')")
    public String forAdmin(){
        return "This URL is only accessible to the admin";
    }

    @GetMapping({"/forReceptionist"})
    @PreAuthorize("hasRole('Receptionist')")
    public String forReceptionist(){
        return "This URL is only accessible to the Receptionist";
    }
    
    @GetMapping({"/forDoctor"})
    @PreAuthorize("hasRole('Doctor')")
    public String forDoctor(){
        return "This URL is only accessible to the Doctor";
    }
    
    @GetMapping({"/forPatient"})
    @PreAuthorize("hasRole('Patient')")
    public String forPatient(){
        return "This URL is only accessible to the Patent";
    }
}

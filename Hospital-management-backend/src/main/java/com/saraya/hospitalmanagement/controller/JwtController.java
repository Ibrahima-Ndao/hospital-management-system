package com.saraya.hospitalmanagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saraya.hospitalmanagement.model.JwtRequest;
import com.saraya.hospitalmanagement.model.JwtResponse;
import com.saraya.hospitalmanagement.services.Impl.JwtService;

@RestController
@CrossOrigin("http://localhost:4200")
public class JwtController {

    @Autowired
    private JwtService jwtService;

    @PostMapping({"/authenticate"})
    public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        return jwtService.createJwtToken(jwtRequest);
    }
}

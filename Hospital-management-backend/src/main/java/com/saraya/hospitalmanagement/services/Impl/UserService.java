package com.saraya.hospitalmanagement.services.Impl;

import com.saraya.hospitalmanagement.model.Admin;
import com.saraya.hospitalmanagement.model.Docter;
import com.saraya.hospitalmanagement.model.Patient;
import com.saraya.hospitalmanagement.model.Receptionnist;
import com.saraya.hospitalmanagement.model.Role;
import com.saraya.hospitalmanagement.model.User;
import com.saraya.hospitalmanagement.repository.AdminRepository;
import com.saraya.hospitalmanagement.repository.DocterRepository;
import com.saraya.hospitalmanagement.repository.PatientRepository;
import com.saraya.hospitalmanagement.repository.ReceptionnistRepo;
import com.saraya.hospitalmanagement.repository.RoleRepository;
import com.saraya.hospitalmanagement.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepo userDao;

    @Autowired
    private RoleRepository roleDao;
    @Autowired
    private DocterRepository docterRepository;
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private ReceptionnistRepo receptionnistRepo;
    
//    public void initRoleAndUser() {

//        Role adminRole = new Role();
//        adminRole.setNameRole("Admin");
//        roleDao.save(adminRole);
//
//        Role userRole = new Role();
//        userRole.setNameRole("Doctor");
//        roleDao.save(userRole);
//
//        User adminUser = new User();
//        adminUser.setUsername("admin123");
//        adminUser.setEmail("ndao@gmail.com");
//        adminUser.setPassword(getEncodedPassword("ndao10"));
//        adminUser.setFullName("Ibrahima Ndao");
//        Set<Role> adminRoles = new HashSet<>();
//        adminRoles.add(adminRole);
//        adminUser.setRoles(adminRoles);
//        userDao.save(adminUser);
//
//    	
//    	
//        User user = new User();
//        user.setUsername("raj123");
//        user.setEmail("konte@gmail.com");
//        user.setPassword(getEncodedPassword("konte"));
//        user.setFullName("Douda Konte");
//        Set<Role> userRoles = new HashSet<>();
//        userRoles.add(userRole);
//        user.setRoles(userRoles);
//        userDao.save(user);
//
    public User registerNewPatient(Patient user) {
    	Patient userEmail = patientRepository.findByEmail(user.getEmail());
    	user.setPassword(getEncodedPassword(user.getPassword()));
    	Role role = roleDao.findByNameRole("Patient");
    	Set<Role> roles = new HashSet<>();
    	roles.add(role);
    	user.setRoles(roles);
    	
    	if(userEmail != null) {
    		throw new RuntimeException("this user ready exist!");
    	}
        return userDao.save(user);
    }
    
    public User registerNewReceptionnist(Receptionnist user) {
    	Receptionnist userEmail = receptionnistRepo.findByEmail(user.getEmail());
    	user.setPassword(getEncodedPassword(user.getPassword()));
    	Role role = roleDao.findByNameRole("Receptionist");
    	Set<Role> roles = new HashSet<>();
    	roles.add(role);
    	user.setRoles(roles);
    	if(userEmail != null) {
    		throw new RuntimeException("this user ready exist!");
    	}
        return userDao.save(user);
    }
    
    public Admin registerNewAdmin(Admin user) {
    	//Admin userEmail = adminRepository.findByEmail(user.getEmail());
    	user.setPassword(getEncodedPassword(user.getPassword()));
    	//Role role = roleDao.findByNameRole("Admin");
    	Role role = new Role();
    	role.setIdRole(1);
    	role.setNameRole("Admin");
    	Set<Role> roles = new HashSet<>();
    	roles.add(role);
    	user.setRoles(roles);
//    	if(userEmail != null) {
//    		throw new RuntimeException("this user ready exist!");
//    	}
        return userDao.save(user);
    }
    
    public User registerNewDoctor(Docter user) {
    	Docter userEmail = docterRepository.findByEmail(user.getEmail());
    	Role role = roleDao.findByNameRole("Doctor");
    	Set<Role> roles = new HashSet<>();
    	roles.add(role);
    	user.setRoles(roles);
    	user.setPassword(getEncodedPassword(user.getPassword()));
    	if(userEmail != null) {
    		throw new RuntimeException("this user ready exist!");
    	}
        return userDao.save(user);
    }

    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }
}

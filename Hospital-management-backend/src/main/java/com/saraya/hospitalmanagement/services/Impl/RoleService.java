package com.saraya.hospitalmanagement.services.Impl;

import com.saraya.hospitalmanagement.model.Role;
import com.saraya.hospitalmanagement.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}

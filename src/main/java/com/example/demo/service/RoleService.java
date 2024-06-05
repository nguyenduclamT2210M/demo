package com.example.demo.service;

import com.example.demo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;
    public void saveRole(Role role) {
        roleRepository.save(role);
    }
}

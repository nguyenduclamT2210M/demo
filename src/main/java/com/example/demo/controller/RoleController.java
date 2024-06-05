package com.example.demo.controller;

import com.example.demo.repository.RoleRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.management.relation.Role;

@Controller
public class RoleController {
    private RoleRepository roleRepository;
    @PostMapping
    public String saveRole(@ModelAttribute("role") Role role) {
        roleRepository.save(role);
        return "redirect:/roles";
    }
}

package com.example.demo.controller;


import com.example.demo.model.Vehicle;

;
import com.example.demo.repository.VehicleRepository;
import com.example.demo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/result")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;


    @Autowired
    private VehicleRepository vehicleRepository;


    @GetMapping
    public String getAllVehicles(Model model) {
        model.addAttribute("vehicle", vehicleService.getAllVehicles());
        return "vehicle";
    }

    @GetMapping("/new")
    public String createBook(Model model) {
        model.addAttribute("vehicle", new Vehicle());
        return "new-vehicle";
    }
    @PostMapping
    private String addBook(@ModelAttribute Vehicle publisher) {
        vehicleService.saveVehicle(publisher);
        return "redirect:/vehicle";
    }

    @GetMapping("/edit/{id}")
    private String editBook(@PathVariable Long id, Model model) {
        Vehicle publisher = vehicleService.getVehicleById(id);
        model.addAttribute("vehicle", publisher);
        return "edit-vehicle";
    }

    @PostMapping("/{id}")
    private String updatePublisher(@PathVariable Integer id,@ModelAttribute Vehicle publisher) {
        publisher.setVehicle_id(id);
        vehicleService.saveVehicle(publisher);
        return "redirect:/vehicle";
    }

    @GetMapping("/delete/{id}")
    private String deletePublisher(@PathVariable Long id) {
        vehicleService.deleteVehicleById(id);
        return "redirect:/vehicle";
    }

    @GetMapping("/{id}")
    private String getPublisher(@PathVariable Long id, Model model) {
        Vehicle publisher = vehicleService.getVehicleById(id);
        model.addAttribute("vehicle", publisher);
        return "vehicle-details";
    }
}

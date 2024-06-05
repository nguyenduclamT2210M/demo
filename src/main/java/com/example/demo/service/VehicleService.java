package com.example.demo.service;

import com.example.demo.model.Vehicle;
import com.example.demo.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;
    public void saveVehicle(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }
    public Vehicle getVehicleById(long id) {
        return vehicleRepository.findById(id).orElse(null);
    }
    public void deleteVehicleById(long id) {
        vehicleRepository.deleteById(id);
    }
}

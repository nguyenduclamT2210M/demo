package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicle_id;
    private String vehicle_nameName;
    private String vehicle_model;
    private Integer year_of_manufacture;
    private String vehicle_color;


    public Vehicle() {

    }

    public Long getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(Long vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public Vehicle(Long vehicle_id, String vehicle_nameName, String vehicle_model, Integer year_of_manufacture, String vehicle_color) {
        this.vehicle_id = vehicle_id;
        this.vehicle_nameName = vehicle_nameName;
        this.vehicle_model = vehicle_model;
        this.year_of_manufacture = year_of_manufacture;
        this.vehicle_color = vehicle_color;
    }

    public String getVehicle_nameName() {
        return vehicle_nameName;
    }

    public void setVehicle_nameName(String vehicle_nameName) {
        this.vehicle_nameName = vehicle_nameName;
    }

    public String getVehicle_model() {
        return vehicle_model;
    }

    public void setVehicle_model(String vehicle_model) {
        this.vehicle_model = vehicle_model;
    }

    public Integer getYear_of_manufacture() {
        return year_of_manufacture;
    }

    public void setYear_of_manufacture(Integer year_of_manufacture) {
        this.year_of_manufacture = year_of_manufacture;
    }

    public String getVehicle_color() {
        return vehicle_color;
    }

    public void setVehicle_color(String vehicle_color) {
        this.vehicle_color = vehicle_color;
    }
}

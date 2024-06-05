package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_id")
    private Integer vehicle_id;

    @Column(name = "vehicle_name", nullable = false, length = 64)
    private String vehicle_nameName;

    @Column(name = "vehicle_model", nullable = false, length = 10)
    private String vehicle_model;

    @Column(name = "year_of_manufacture", nullable = false)
    private Integer year_of_manufacture;

    @Column(name = "vehicle_color", length = 16)
    private String vehicle_color;


    public Vehicle() {

    }

    public Integer getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(Integer vehicle_id) {
        this.vehicle_id = vehicle_id;
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

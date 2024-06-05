package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")

public class Role {

    @Id
    @Column(name = "user_id", length = 32)
    private String userId;

    @Id
    @Column(name = "role", length = 32)
    private String role;



    // Getters and setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}

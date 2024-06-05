package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Set;




public class Member {


    @Column(name = "user_id", length = 32)
    private String userId;

    @Column(name = "password", nullable = false, length = 68)
    private String password;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;



    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }


}

package com.agea.app.domain;

import com.agea.app.domain.enums.UserRole;

/**
 * This class represents the final user for the app.
 * There's no need for any subclasses to represent teachers, students and admins since they
 * won't have any difference aside from their role
 */
public class User {
    private String name;
    private String id; // Matrícula, NumControl, or ID for admins
    private UserRole role;

    public User(String name, String id, UserRole role) {
        this.name = name;
        this.id = id;
        this.role = role;
    }

    // <editor-fold defaultstate="collapsed" desc="Getters & Setters">

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    // </editor-fold>
}

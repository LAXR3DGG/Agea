package com.agea.app.domain.dto;

import com.agea.app.domain.dto.validations.ValidUserId;
import com.agea.app.domain.dto.validations.ValidUserPassword;

public class LoginRequestDTO {
    @ValidUserId
    private String id;
    @ValidUserPassword
    private String password; // Still plaintext

    // <editor-fold defaultstate="collapsed" desc="Getters & Setters">
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    // </editor-fold>
}

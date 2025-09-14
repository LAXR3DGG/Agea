package com.agea.app.domain.dto;

import com.agea.app.domain.dto.validations.ValidUserId;
import com.agea.app.domain.dto.validations.ValidUserName;
import com.agea.app.domain.dto.validations.ValidUserPassword;

public class UserUpdateDTO {
    @ValidUserName
    private String name;
    @ValidUserId
    private String id;
    @ValidUserPassword
    private String password; // Password is still plaintext here

    // <editor-fold defaultstate="collapsed" desc="Getters & setters">
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    // </editor-fold>
}

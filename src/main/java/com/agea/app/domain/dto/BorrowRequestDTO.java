package com.agea.app.domain.dto;

import com.agea.app.domain.dto.validations.ValidClassroom;
import com.agea.app.domain.dto.validations.ValidDeviceId;
import com.agea.app.domain.dto.validations.ValidUserId;

/**
 * DTO used when users request to borrow a device.
 * <p>
 * Identifiers are used instead of the whole object to ensure the data is valid when
 * performing the business logic
 */
public class BorrowRequestDTO {
    @ValidUserId
    private String userId;
    @ValidDeviceId
    private Long deviceId;
    @ValidClassroom
    private String classroom;

    // <editor-fold defaultstate="collapsed" desc="Getters & Setters">
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    // </editor-fold>
}

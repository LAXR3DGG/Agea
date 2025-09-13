package com.agea.app.domain.dto;

import com.agea.app.domain.dto.validations.ValidDeviceDescription;
import com.agea.app.domain.dto.validations.ValidDeviceName;
import com.agea.app.domain.enums.DeviceType;
import jakarta.validation.constraints.NotNull;

public class DeviceRegisterDTO {
    @ValidDeviceName
    private String name;

    // No need to validate anything else, let Jackson and JSR verify it is an
    // actual value from the Enum. It'll throw HttpMessageNotReadableException if not
    // so TODO: Handle this on a @RestControllerAdvice
    @NotNull
    private DeviceType type;
    @ValidDeviceDescription
    private String description;

    // <editor-fold defaultstate="collapsed" desc="Getters & Setters">

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeviceType getType() {
        return type;
    }

    public void setType(DeviceType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    // </editor-fold>
}

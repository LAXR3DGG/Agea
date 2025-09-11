package com.agea.app.domain;

import com.agea.app.domain.enums.DeviceStatus;
import com.agea.app.domain.enums.DeviceType;

/**
 * Class to store the data of devices. There is no need for subclasses as well
 * <p>
 * No business logic happens here nor in the User class
 */
public class Device {
    //TODO: Implement Spring Data to make id an auto-assigned value
    private long id;
    private String name;
    private DeviceType deviceType;
    private DeviceStatus status;
    private String description;

    public Device(String name, DeviceType deviceType, String description) {
        this.name = name;
        this.deviceType = deviceType;
        this.status = DeviceStatus.AVAILABLE; // Initial status should always be available
        this.description = description;
    }

    // <editor-fold defaultstate="collapsed" desc="Getters & Setters">

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    public DeviceStatus getStatus() {
        return status;
    }

    public void setStatus(DeviceStatus status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // </editor-fold>
}

package com.agea.app.service.interfaces;

import com.agea.app.domain.Device;
import com.agea.app.domain.dto.DeviceRegisterDTO;

import java.util.List;

/**
 * Interface to define the contract for any implementation
 * of the service
 */
public interface DeviceService {
    Device createDevice(DeviceRegisterDTO deviceRegisterDTO);
    Device getDevice(Long deviceId);
    List<Device> getAll();
    Device updateDevice(Long deviceId, DeviceRegisterDTO deviceRegisterDTO);
    void deleteDevice(Long deviceId);
}

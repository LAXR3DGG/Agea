package com.agea.app.service;

import com.agea.app.domain.Device;
import com.agea.app.domain.dto.DeviceRegisterDTO;
import com.agea.app.service.interfaces.DeviceService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This service will only contain the business logic for CRUD operations
 * related to Devices.
 * <p>
 * Anything related to borrowings should be done on its service.
 * <p>
 * Changing the device's status must be done directly on the object
 * after retrieving it.
 */
@Service
public class DeviceServiceImpl implements DeviceService {
    /*
     TODO: Add the reference to the deviceRepository so it can be injected
     and the business logic can actually be written
    */

    @Override
    public Device createDevice(DeviceRegisterDTO deviceRegisterDTO) {
        return null;
    }

    @Override
    public Device getDevice(Long deviceId) {
        return null;
    }

    @Override
    public List<Device> getAll() {
        return List.of();
    }

    @Override
    public Device updateDevice(Long deviceId, DeviceRegisterDTO deviceRegisterDTO) {
        return null;
    }

    @Override
    public void deleteDevice(Long deviceId) {

    }
}

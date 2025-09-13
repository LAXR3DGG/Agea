package com.agea.app.controller;

import com.agea.app.domain.Device;
import com.agea.app.domain.dto.DeviceRegisterDTO;
import com.agea.app.service.interfaces.DeviceService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DeviceController {
    private final DeviceService deviceService;

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @PostMapping("/devices")
    public Device createDevice(@Valid @RequestBody DeviceRegisterDTO deviceRegisterDTO) {
        return new Device(
                deviceRegisterDTO.getName(),
                deviceRegisterDTO.getType(),
                deviceRegisterDTO.getDescription()
        );
        //return deviceService.createDevice(deviceRegisterDTO);
    }

    @GetMapping("/devices/{deviceId}")
    public Device getDevice(@PathVariable Long deviceId) {
        return deviceService.getDevice(deviceId);
    }

    @GetMapping("/devices")
    public List<Device> getAllDevices() {
        return deviceService.getAll();
    }

    @PatchMapping("/devices/{deviceId}")
    public Device updateDevice(
            @PathVariable Long deviceId,
            @Valid @RequestBody DeviceRegisterDTO deviceRegisterDTO
    ) {
        return deviceService.updateDevice(deviceId, deviceRegisterDTO);
    }

    @DeleteMapping("/devices/{deviceId}")
    public void deleteDevice(@PathVariable Long deviceId) {
        deviceService.deleteDevice(deviceId);
    }
}

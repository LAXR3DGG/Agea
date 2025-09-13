package com.agea.app.service;

import com.agea.app.domain.BorrowRecord;
import com.agea.app.domain.dto.BorrowRequestDTO;
import com.agea.app.service.interfaces.BorrowService;
import com.agea.app.service.interfaces.DeviceService;
import com.agea.app.service.interfaces.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service for CRUD (except update) operations on BorrowRecords
 * <p>
 * This class contains the main business logic for the app.
 */
@Service
public class BorrowServiceImpl implements BorrowService {
    // TODO: Add a reference to the BorrowRepository & update the constructor

    private DeviceService deviceService;
    private UserService userService;

    public BorrowServiceImpl(DeviceService deviceService, UserService userService) {
        this.deviceService = deviceService;
        this.userService = userService;
    }

    @Override
    public BorrowRecord createRecord(BorrowRequestDTO borrowRequestDTO) {
        return null;
    }

    @Override
    public BorrowRecord getRecord(Long borrowRecordId) {
        return null;
    }

    @Override
    public List<BorrowRecord> getAll() {
        return List.of();
    }

    @Override
    public BorrowRecord confirmBorrow(Long borrowRecordId) {
        return null;
    }

    @Override
    public BorrowRecord confirmReturn(Long borrowRecordId) {
        return null;
    }
}

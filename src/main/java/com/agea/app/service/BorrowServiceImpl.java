package com.agea.app.service;

import com.agea.app.domain.BorrowRecord;
import com.agea.app.domain.dto.BorrowRequestDTO;
import com.agea.app.service.interfaces.BorrowService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service for CRUD (except update) operations on BorrowRecords
 * <p>
 * This class contains the main business logic for the app.
 */
@Service
public class BorrowServiceImpl implements BorrowService {

    @Override
    public BorrowRecord createRecord(BorrowRequestDTO borrowRequestDTO) {
        return null;
    }

    @Override
    public BorrowRecord getRecord(String borrowRecordId) {
        return null;
    }

    @Override
    public List<BorrowRecord> getAll() {
        return List.of();
    }

    @Override
    public BorrowRecord confirmBorrow(String borrowRecordId) {
        return null;
    }

    @Override
    public BorrowRecord confirmReturn(String borrowRecordId) {
        return null;
    }
}

package com.agea.app.service.interfaces;

import com.agea.app.domain.BorrowRecord;
import com.agea.app.domain.dto.BorrowRequestDTO;

import java.util.List;

/**
 * Contract for any implementing BorrowService
 */
public interface BorrowService {
    BorrowRecord createRecord(BorrowRequestDTO borrowRequestDTO);
    BorrowRecord getRecord(Long borrowRecordId);
    List<BorrowRecord> getAll();
    BorrowRecord confirmBorrow(Long borrowRecordId);
    BorrowRecord confirmReturn(Long borrowRecordId);
}

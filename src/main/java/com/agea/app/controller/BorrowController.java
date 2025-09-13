package com.agea.app.controller;

import com.agea.app.domain.BorrowRecord;
import com.agea.app.domain.dto.BorrowRequestDTO;
import com.agea.app.service.interfaces.BorrowService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BorrowController {
    private BorrowService borrowService;

    public BorrowController(BorrowService borrowService) {
        this.borrowService = borrowService;
    }

    @PostMapping("/borrowings")
    public BorrowRecord createBorrowRecord(@Valid BorrowRequestDTO borrowRequestDTO) {
        return borrowService.createRecord(borrowRequestDTO);
    }

    @GetMapping("/borrowings/{borrowRecordId}")
    public BorrowRecord getBorrowRecord(@PathVariable Long borrowRecordId) {
        return borrowService.getRecord(borrowRecordId);
    }

    @GetMapping("/borrowings")
    public List<BorrowRecord> getAll() {
        return borrowService.getAll();
    }

    @PatchMapping("/borrowings/{borrowRecordId}/confirm")
    public BorrowRecord confirmBorrow(@PathVariable Long borrowRecordId) {
        return borrowService.confirmBorrow(borrowRecordId);
    }

    @PatchMapping("/borrowings/{borrowRecordId}/return")
    public BorrowRecord confirmReturn(@PathVariable Long borrowRecordId) {
        return borrowService.confirmReturn(borrowRecordId);
    }
}

package com.agea.app.domain;

import java.time.LocalDateTime;

/**
 * This class represents an entry on the registry of borrowings.
 * <p>
 * Links users and devices adding extra information of the operation:
 * - Date of borrowing & returning
 * - Classroom
 * - An ID to differentiate all transactions from each other
 * <p>
 * Specifically, this class' objects are the ones to whom the main logic will
 * be applied. (Not where the actual implementation is though)
 */
public class BorrowRecord {
    // TODO: Implement the Spring Data JPA ID assignment to this object
    private long id;
    private User user;
    private Device device;
    private String classroom;
    private LocalDateTime borrowDate;
    private LocalDateTime returnDate;

    /**
     * Base constructor for records.
     * <p>
     * <b>Borrow date must be assigned on its designed confirmation by admin.
     * The same goes for the return date.</b>
     * <p>
     * ID will be automatically assigned using Spring Entities
     * @param user User who requested the borrowing
     * @param device Device requested
     * @param classroom Classroom where the user is going to be located
     */
    public BorrowRecord(User user, Device device, String classroom) {
        this.user = user;
        this.device = device;
        this.classroom = classroom;
    }

    // <editor-fold defaultstate="collapsed" desc="Getters & Setters">
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDateTime borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }
    // </editor-fold>
}
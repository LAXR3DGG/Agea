package com.agea.app.service.interfaces;

import com.agea.app.domain.User;
import com.agea.app.domain.dto.UserRegisterDTO;

/**
 * Interface to declare the contract of any UserService implementation
 */
public interface UserService {
    User createUser(UserRegisterDTO userRegisterDTO);
    User getUser(String userId);
    User updateUser(String userId, UserRegisterDTO userRegisterDTO);
    void deleteUser(String userId);
}

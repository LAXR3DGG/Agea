package com.agea.app.service;

import com.agea.app.domain.User;
import com.agea.app.domain.dto.UserRegisterDTO;
import com.agea.app.domain.dto.UserUpdateDTO;
import com.agea.app.service.interfaces.UserService;
import org.springframework.stereotype.Service;

/**
 * This service class contains all the logic for CRUD operations related to
 * User objects.
 * <p>
 * Perform anything related to borrowings on its own service
 */
@Service
public class UserServiceImpl implements UserService {
    // TODO: Add the UserRepository so this class can be written and the dependency injected

    @Override
    public User createUser(UserRegisterDTO userRegisterDTO) {
        return null;
    }

    @Override
    public User getUser(String userId) {
        return null;
    }

    @Override
    public User updateUser(String userId, UserUpdateDTO userUpdateDTO) {
        return null;
    }

    @Override
    public void deleteUser(String userId) {

    }
}

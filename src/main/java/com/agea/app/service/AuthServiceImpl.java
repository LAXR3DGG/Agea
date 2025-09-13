package com.agea.app.service;

import com.agea.app.domain.dto.LoginRequestDTO;
import com.agea.app.domain.dto.LoginResponseDTO;
import com.agea.app.service.interfaces.AuthService;
import org.springframework.stereotype.Service;

/**
 * TODO: Write the contract on AuthService, then write the whole implementation here
 */
@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public LoginResponseDTO login(LoginRequestDTO loginRequestDTO) {
        return null;
    }
}

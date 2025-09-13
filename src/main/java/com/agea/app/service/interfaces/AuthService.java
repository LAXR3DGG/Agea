package com.agea.app.service.interfaces;

import com.agea.app.domain.dto.LoginRequestDTO;
import com.agea.app.domain.dto.LoginResponseDTO;

/**
 * TODO: Write the contract once you know what is needed to implement the login logic
 */
public interface AuthService {
    LoginResponseDTO login(LoginRequestDTO loginRequestDTO);
}

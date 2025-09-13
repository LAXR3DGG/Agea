package com.agea.app.controller;

import com.agea.app.domain.User;
import com.agea.app.domain.dto.LoginRequestDTO;
import com.agea.app.domain.dto.LoginResponseDTO;
import com.agea.app.domain.dto.UserRegisterDTO;
import com.agea.app.service.interfaces.AuthService;
import com.agea.app.service.interfaces.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {
    private UserService userService;
    private AuthService authService;

    public UserController(UserService userService, AuthService authService) {
        this.userService = userService;
        this.authService = authService;
    }

    @PostMapping("/users")
    public User createUser(@Valid @RequestBody UserRegisterDTO userRegisterDTO) {
        return userService.createUser(userRegisterDTO);
    }

    @PatchMapping("/users/{userId}")
    public User updateUser(
            @PathVariable String userId,
            @Valid @RequestBody UserRegisterDTO userRegisterDTO
    ) {
        return userService.updateUser(userId, userRegisterDTO);
    }

    @DeleteMapping("/users/{userId}")
    public void deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
    }

    @PostMapping("/users/login")
    public LoginResponseDTO login(LoginRequestDTO loginRequestDTO) {
        return authService.login(loginRequestDTO);
    }
}

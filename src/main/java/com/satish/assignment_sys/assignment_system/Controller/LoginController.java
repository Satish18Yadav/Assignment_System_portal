package com.satish.assignment_sys.assignment_system.Controller;

import com.satish.assignment_sys.assignment_system.DTO.LoginRequestDTO;
import com.satish.assignment_sys.assignment_system.Service.All_the_Users;
import com.satish.assignment_sys.assignment_system.model.Users;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class LoginController {
    private All_the_Users userService;
    private LoginRequestDTO dto;

    public LoginController(All_the_Users userService,LoginRequestDTO dto) {
        this.userService = userService;
        this.dto = dto;
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody LoginRequestDTO dto1) {
        Users user = userService.getUserByName(dto1.getName());
        if (user != null && user.getPassword().equals(dto1.getPassword())) {
            return "Login Successful!";
        } else {
            return "Invalid username or password!";
        }
    }
}

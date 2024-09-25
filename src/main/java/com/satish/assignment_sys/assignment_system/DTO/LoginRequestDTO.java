package com.satish.assignment_sys.assignment_system.DTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class LoginRequestDTO {
    String name;
    String password;
}

package com.springboot.demo.service;

import com.springboot.demo.model.User;
import com.springboot.demo.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService  extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);
}

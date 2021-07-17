package com.springboot.demo.service;

import com.springboot.demo.model.User;
import com.springboot.demo.web.dto.UserRegistrationDto;

public interface UserService {

    User save(UserRegistrationDto registrationDto);
}

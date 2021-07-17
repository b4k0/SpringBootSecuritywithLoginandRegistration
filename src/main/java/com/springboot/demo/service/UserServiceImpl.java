package com.springboot.demo.service;

import com.springboot.demo.model.Role;
import com.springboot.demo.model.User;
import com.springboot.demo.repository.UserRepository;
import com.springboot.demo.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
      User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(), registrationDto.getEmail(), registrationDto.getPassword(),
              Arrays.asList(new Role("Role User")));


      return userRepository.save(user);
    }
}

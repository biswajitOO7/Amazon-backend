package com.amazon.Amazon.service;

import com.amazon.Amazon.model.User;
import com.amazon.Amazon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getAllUser(){return userRepository.findAll();}

}

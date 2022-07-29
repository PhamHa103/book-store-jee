package com.example.book_store.service;

import com.example.book_store.entity.User;
import com.example.book_store.repository.UserRepository;

public class  UserService {

    private final UserRepository userRepository = new UserRepository();

    public User login(String username, String password) {
        return userRepository.login(username, password);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User findByPhoneNumber(String phoneNumber) {
        return userRepository.findByPhoneNumber(phoneNumber);
    }

      public boolean updateUser(User user){
        return userRepository.updateUser(user);
    }
}

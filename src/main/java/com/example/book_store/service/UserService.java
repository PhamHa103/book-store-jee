package com.example.book_store.service;

import com.example.book_store.entity.User;
import com.example.book_store.repository.UserRepository;

public class  UserService {

    private final UserRepository userRepository = new UserRepository();

    public User login(String username, String password) {
        return userRepository.login(username, password);
    }

}

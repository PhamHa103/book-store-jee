package com.example.book_store.service;

import com.example.book_store.Dto.CartDto;
import com.example.book_store.entity.Cart;
import com.example.book_store.entity.User;
import com.example.book_store.repository.BookRepository;
import com.example.book_store.repository.CartRepository;
import com.example.book_store.repository.UserRepository;
import com.example.book_store.util.DataUtil;

import java.util.List;

public class CartService {
    private static final CartRepository cartRepository = new CartRepository();
    private static final UserRepository userRepository = new UserRepository();
    private static final BookRepository bookRepository = new BookRepository();

//    public static List<CartDto> getCartDtoByUser(String username) {
//        final User user = userRepository.getByUser(username);
//        if (DataUtil.isNull(user))
//            return null;
//        return null;
//    }

    public List<Cart> getAll() {
        return cartRepository.getAll();
    }
}

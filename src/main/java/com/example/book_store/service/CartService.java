package com.example.book_store.service;

import com.example.book_store.Dto.CartDto;
import com.example.book_store.entity.Book;
import com.example.book_store.entity.Cart;
import com.example.book_store.entity.User;
import com.example.book_store.repository.BookRepository;
import com.example.book_store.repository.CartRepository;
import com.example.book_store.repository.UserRepository;
import com.example.book_store.util.DataUtil;

import java.util.List;
import java.util.stream.Collectors;

public class CartService {
    private static final CartRepository cartRepository = new CartRepository();
    private static final UserRepository userRepository = new UserRepository();
    private static final BookRepository bookRepository = new BookRepository();

    public static List<CartDto> getCartDtoByUser(String username) {
        final User user = userRepository.getByUser(username);
        if (DataUtil.isNull(user))
            return null;
        List<Cart> carts = cartRepository.getCartbyUserId(user.getId());
        if (DataUtil.isNull(carts))
            return null;
        return carts.stream().map(cart -> {
            Book book = bookRepository.findById(cart.getBookId().intValue());
            return new CartDto(book, user, cart.getQuantity(), cart.getUnitPrice());
        }).collect(Collectors.toList());
    }

    public List<Cart> getAll() {
        return cartRepository.getAll();
    }
}

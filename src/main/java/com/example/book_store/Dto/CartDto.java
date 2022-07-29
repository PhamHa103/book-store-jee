package com.example.book_store.Dto;

import com.example.book_store.entity.Book;
import com.example.book_store.entity.User;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CartDto {
    Book book;
    User user;
    int quantity;
    long unitPrice;
}

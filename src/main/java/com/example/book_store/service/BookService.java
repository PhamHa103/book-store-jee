package com.example.book_store.service;

import com.example.book_store.entity.Book;
import com.example.book_store.repository.BookRepository;

import java.util.List;

public class BookService {

    private final BookRepository bookRepository = new BookRepository();

    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    public Book findById(int bookId) {
        return bookRepository.findById(bookId);
    }
}

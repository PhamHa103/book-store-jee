package com.example.book_store.controller;

import com.example.book_store.entity.Book;
import com.example.book_store.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "bookServlet", value = "/book")
public class BookServlet extends HttpServlet {

    private final BookService bookService = new BookService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> books = bookService.getAll();
        req.setAttribute("books", books);
        HttpSession session = req.getSession();
        req.getRequestDispatcher("books.jsp").forward(req, resp);
    }
}

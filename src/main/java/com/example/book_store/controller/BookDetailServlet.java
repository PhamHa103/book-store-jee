package com.example.book_store.controller;

import com.example.book_store.entity.Book;
import com.example.book_store.service.BookService;
import com.example.book_store.util.DataUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "bookDetailServlet", value = "/book_detail")
public class BookDetailServlet extends HttpServlet {

    private BookService bookService = new BookService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int bookId = Integer.valueOf(req.getParameter("id"));
        Book book = bookService.findById(bookId);
        if (DataUtil.isNull(book)) {
            req.getRequestDispatcher("404error.jsp").forward(req, resp);
        }
        req.setAttribute("bookDetail", book);
        req.getRequestDispatcher("book_detail.jsp").forward(req, resp);

    }
}

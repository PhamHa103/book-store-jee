package com.example.book_store.controller;

import com.example.book_store.entity.Cart;
import com.example.book_store.service.CartService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "cartServlet", value = "/cart")
public class CartServlet extends HttpServlet {
    private final CartService cartService = new CartService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = (String) req.getSession().getAttribute("username");
        CartService.getCartDtoByUser(username);
        List<Cart> carts = cartService.getAll();
        req.setAttribute("carts", carts);
        req.getRequestDispatcher("checkout.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

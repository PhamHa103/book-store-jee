package com.example.book_store.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "logoutServlet",value = "/logout")
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String returnUrl = req.getQueryString();
        session.removeAttribute("isLoggedIn");
        if (returnUrl== null || returnUrl.equals(""))
            resp.sendRedirect("book");
        if(returnUrl != null && !returnUrl.equals("") && returnUrl.substring(0,9).equals("returnUrl"))
            resp.sendRedirect(returnUrl.substring(10));
    }
}

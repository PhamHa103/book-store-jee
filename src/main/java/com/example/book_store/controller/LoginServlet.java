package com.example.book_store.controller;

import com.example.book_store.entity.User;
import com.example.book_store.service.UserService;
import com.example.book_store.util.DataUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "loginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    private final UserService userService = new UserService();

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String returnUrl = request.getQueryString();
        User user = userService.login(username, password);
        if (DataUtil.isNull(user)) {
            response.sendRedirect("login.jsp?message=0");
            return;
        }

        // tạo session
        HttpSession session = request.getSession();
        session.setAttribute("isLoggedIn", "1");
        if (returnUrl.substring(10) == null || returnUrl.substring(10).equals(""))
            response.sendRedirect("book");
        if(returnUrl.substring(10) != null && !returnUrl.substring(10).equals("") && returnUrl.substring(0,9).equals("returnUrl"))
            response.sendRedirect(returnUrl.substring(10));
    }

}
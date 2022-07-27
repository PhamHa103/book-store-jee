package com.example.book_store.controller;

import com.example.book_store.entity.User;
import com.example.book_store.service.UserService;
import com.example.book_store.util.DataUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "registerServlet", value = "/register")
public class RegisterServlet extends HttpServlet {

    private final UserService userService = new UserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String fullname = req.getParameter("fullname");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        String phoneNumber = req.getParameter("phone");

        if (DataUtil.isNull(username) || username.equals("")) {
            resp.sendRedirect("register.jsp?message=0");
            return;
        }
        if (username.length() > 20) {
            resp.sendRedirect("register.jsp?message=1");
            return;
        }
        if (DataUtil.isNull(password) || password.equals("")) {
            resp.sendRedirect("register.jsp?message=2");
            return;
        }
        if (password.length() > 20 || password.length() < 8) {
            resp.sendRedirect("register.jsp?message=3");
            return;
        }
        if (DataUtil.isNull(fullname) || fullname.equals("")) {
            resp.sendRedirect("register.jsp?message=4");
            return;
        }
        if (fullname.length() > 50) {
            resp.sendRedirect("register.jsp?message=5");
            return;
        }
        if (DataUtil.isNull(email) || email.equals("")) {
            resp.sendRedirect("register.jsp?message=6");
            return;
        }
        if (DataUtil.isNull(address) || address.equals("")) {
            resp.sendRedirect("register.jsp?message=7");
            return;
        }
        if (DataUtil.isNull(phoneNumber) || phoneNumber.equals("")) {
            resp.sendRedirect("register.jsp?message=8");
            return;
        }

        User userByUsername = userService.findByUsername(username);
        if (!DataUtil.isNull(userByUsername)) {
            resp.sendRedirect("register.jsp?message=9");
            return;
        }
        User userByEmail = userService.findByEmail(email);
        if (!DataUtil.isNull(userByEmail)) {
            resp.sendRedirect("register.jsp?message=10");
            return;
        }
        User userByPhoneNumber = userService.findByPhoneNumber(phoneNumber);
        if (!DataUtil.isNull(userByPhoneNumber)) {
            resp.sendRedirect("register.jsp?message=11");
            return;
        }
        long id = 0;
        User user = new User(id,username, password, fullname, email, address, phoneNumber);
        boolean IsUpdatedUser = userService.updateUser(user);
        if (!IsUpdatedUser)
            resp.sendRedirect("register.jsp?message=12");
        else
            resp.sendRedirect("login.jsp");
    }
}

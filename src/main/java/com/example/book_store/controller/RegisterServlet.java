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
        String phoneNumber = req.getParameter("phoneNumber");

        if (DataUtil.isNull(username)||username.equals("")) {
            resp.sendRedirect("login.jsp?message=Username must not empty");
            return;
        }
        if (username.length()>20) {
            resp.sendRedirect("login.jsp?message=Username no more than 20 characters");
            return;
        }
        if (DataUtil.isNull(password)||password.equals("")) {
            resp.sendRedirect("login.jsp?message=Password must not empty");
            return;
        }
        if (password.length()>20||password.length()<8) {
            resp.sendRedirect("login.jsp?message=Password must more than 8 characters and less than 16 characters");
            return;
        }
        if (DataUtil.isNull(fullname)||fullname.equals("")) {
            resp.sendRedirect("login.jsp?message=Fullname must not empty");
            return;
        }
        if (fullname.length()>50) {
            resp.sendRedirect("login.jsp?message=Fullname no more than 50 characters");
            return;
        }
        if (DataUtil.isNull(email)||email.equals("")) {
            resp.sendRedirect("login.jsp?message=Email must not empty");
            return;
        }
        if (DataUtil.isNull(address)||address.equals("")) {
            resp.sendRedirect("login.jsp?message=Address must not empty");
            return;
        }
        if (DataUtil.isNull(phoneNumber)||phoneNumber.equals("")) {
            resp.sendRedirect("login.jsp?message=Phone number must not empty");
            return;
        }

        User userByUsername = userService.findByUsername(username);
        if (!DataUtil.isNull(userByUsername)) {
            resp.sendRedirect("login.jsp?message=Username existed");
            return;
        }
        User userByEmail = userService.findByEmail(email);
        if (!DataUtil.isNull(userByEmail)) {
            resp.sendRedirect("login.jsp?message=Email existed");
            return;
        }
        User userByPhoneNumber = userService.findByPhoneNumber(phoneNumber);
        if (!DataUtil.isNull(userByPhoneNumber)) {
            resp.sendRedirect("login.jsp?message=Phone number existed");
            return;
        }
        resp.sendRedirect("login");
    }
}

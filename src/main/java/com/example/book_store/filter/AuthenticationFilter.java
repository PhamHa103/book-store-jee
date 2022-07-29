package com.example.book_store.filter;

import com.example.book_store.util.DataUtil;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AuthenticationFilter implements Filter {

    /**
     * Kiểm tra xem người dùng đã đăng nhập vào hệ thống chưa
     *
     *  ==> Check Authentication
     *
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpSession session = request.getSession();
        if (session == null|| DataUtil.isNull(session.getAttribute("isLoggedIn")) || !session.getAttribute("isLoggedIn").equals("1")) {
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            response.sendRedirect("login.jsp");
            return;
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
    }

}

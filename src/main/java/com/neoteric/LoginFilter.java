package com.neoteric;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//@WebFilter("/login")
public class LoginFilter implements Filter {


    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("Login Filter Triggered");
        HttpServletRequest req = (HttpServletRequest) request;
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        if (email != null && password != null) {
            chain.doFilter(request, response);
        } else {
            ((HttpServletResponse) response).sendRedirect("index.jsp");
        }
    }
}

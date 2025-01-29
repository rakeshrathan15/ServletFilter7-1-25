package com.neoteric;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;

public class   LogoutServlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("LogoutServlet doGet() called.");
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate(); // End the session
            System.out.println("User logged out. Session invalidated.");
        }


        response.sendRedirect("index.jsp");



    }


}

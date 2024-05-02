package com.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/AdminFeedbackViewerServlet")
public class AdminFeedbackViewerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.getWriter().println("<ul>");
        response.getWriter().println("<li>Feedback 1</li>");
        response.getWriter().println("<li>Feedback 2</li>");
        response.getWriter().println("</ul>");
    }
}


package com.servlet;

import com.dao.AdminDao;
import com.db.DbConnect;
import com.entity.Admin;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/AdminRegister")
public class AdminRegister extends HttpServlet {

    private final AdminDao adminDao;

    public AdminRegister() {
        this.adminDao = new AdminDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");

        if (!password.equals(confirmPassword)) {
            response.sendRedirect("register.jsp?passwordError=1");
            return;
        }

        Admin admin = new Admin();
        admin.setUsername(username);
        admin.setEmail(email);
        admin.setPassword(password);

        Connection connection = null;

        try {
            connection = DbConnect.getConnection();

            boolean success = adminDao.insertPatient(connection, username,email,password);

            if (success) {

                response.sendRedirect("Alogin.jsp?addSuccess=1");
            } else {

                response.sendRedirect("adminregister.jsp?addError=1");
            }
        } finally {

            PreparedStatement stmt = null;
            PreparedStatement rs = null;
            DbConnect.close(connection, stmt, (ResultSet) rs);
        }
    }
}

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
import java.sql.SQLException;

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Connection connection = null;
        try {
            connection = DbConnect.getConnection();
            AdminDao adminDao = new AdminDao();

            Admin admin = adminDao.getAdminByUsername(connection, username);

            if (admin != null && admin.getPassword().equals(password)) {
                response.sendRedirect("admin_panel.jsp");
            } else {
                response.sendRedirect("Alogin.jsp?error=1");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("Alogin.jsp?error=1");
        } finally {
            PreparedStatement stmt = null;
            Object rs = null;
            DbConnect.close(connection, stmt, (ResultSet) rs);
        }
    }
}

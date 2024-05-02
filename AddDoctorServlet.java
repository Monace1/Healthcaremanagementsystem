package com.servlet;

import com.dao.DoctorDao;
import com.db.DbConnect;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/AddDoctorServlet")
public class AddDoctorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String doctorName = request.getParameter("doctorName");
        String specialization = request.getParameter("specialization");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Connection connection = null;

        try {
            connection = DbConnect.getConnection();

            boolean success = DoctorDao.insertDoctor(connection, doctorName, specialization, username, password);

            if (success) {
                response.sendRedirect("admin_panel.jsp?addSuccess=1");
            } else {
                response.sendRedirect("admin_panel.jsp?addError=1");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("admin_panel.jsp?addError=1");
        } finally {
            PreparedStatement stmt = null;
            ResultSet rs = null;
            DbConnect.close(connection, null, null);
        }
    }
}

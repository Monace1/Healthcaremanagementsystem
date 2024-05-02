package com.servlet;

import com.dao.DoctorDao;
import com.db.DbConnect;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/RemoveDoctorServlet")
public class RemoveDoctorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        int doctorId = Integer.parseInt(request.getParameter("id"));

        Connection connection = null;

        try {
            connection = DbConnect.getConnection();

            boolean success = DoctorDao.removeDoctor(connection, doctorId);

            if (success) {
                response.sendRedirect("admin_panel.jsp?removeSuccess=1");
            } else {
                response.sendRedirect("admin_panel.jsp?removeError=1");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("admin_panel.jsp?removeError=1");
        } finally {
            PreparedStatement stmt = null;
            ResultSet rs = null;
            DbConnect.close(connection, null, null);
        }
    }
}


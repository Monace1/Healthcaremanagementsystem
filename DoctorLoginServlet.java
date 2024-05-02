package com.servlet;

import com.dao.DoctorDao;
import com.db.DbConnect;
import com.entity.Doctor;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/DoctorLoginServlet")
public class DoctorLoginServlet extends HttpServlet {

    private final DoctorDao doctorDao;

    public DoctorLoginServlet() {
        this.doctorDao = new DoctorDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Connection connection = null;

        try {
            connection = DbConnect.getConnection();

            Doctor doctor = doctorDao.getDoctorByUsername(connection, username);

            if (doctor != null && doctor.getPassword().equals(password)) {
                // Successful login
                request.getSession().setAttribute("doctor", doctor);
                response.sendRedirect("doctor_module.jsp");
            } else {
                // Failed login
                response.sendRedirect("Dlogin.jsp?loginError=1");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("doctor_module.jsp");
        } finally {
            PreparedStatement stmt = null;
            ResultSet rs = null;
            DbConnect.close(connection, null, null);
        }
    }
}

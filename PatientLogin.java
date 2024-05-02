package com.servlet;

import com.dao.PatientDao;
import com.db.DbConnect;
import com.entity.Patient;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/PatientLogin")
public class PatientLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Connection connection = null;

        try {
            connection = DbConnect.getConnection();

            PatientDao patientDao = new PatientDao();

            Patient patient = patientDao.getPatientByUsername(connection, username);

            if (patient != null && patient.getPassword().equals(password)) {

                request.getSession().setAttribute("patient", patient);
                response.sendRedirect("patient_module.jsp");
            } else {
                response.sendRedirect("Plogin.jsp?loginError=1");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("Plogin.jsp?loginError=1");
        } finally {
            PreparedStatement stmt = null;
            PreparedStatement rs = null;
            DbConnect.close(connection, stmt, (ResultSet) rs);
        }
    }
}

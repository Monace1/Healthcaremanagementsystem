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


@WebServlet("/PatientRegister")
public class PatientRegister extends HttpServlet {

    private final PatientDao patientDao;

    public PatientRegister() {
        this.patientDao = new PatientDao();
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

        Patient patient = new Patient();
        patient.setUsername(username);
        patient.setEmail(email);
        patient.setPassword(password);

        Connection connection = null;

        try {
            connection = DbConnect.getConnection();

            boolean success = PatientDao.insertPatient(connection, username,email,password);

            if (success) {
                response.sendRedirect("Plogin.jsp?addSuccess=1");
            } else {
                response.sendRedirect("register.jsp?addError=1");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("register.jsp?addError=1");
        } finally {
            PreparedStatement stmt = null;
            PreparedStatement rs = null;
            DbConnect.close(connection, stmt, (ResultSet) rs);
        }

    }
}

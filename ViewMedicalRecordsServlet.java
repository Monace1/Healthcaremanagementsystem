package com.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;



@WebServlet("/ViewMedicalRecordsServlet")
public class ViewMedicalRecordsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        HttpSession session = (HttpSession) request.getSession();
        Boolean loggedInPatient = (Boolean) session.getAttribute("loggedInPatient");
        if (loggedInPatient != null && loggedInPatient) {
            // Retrieve medical records for the patient from the database
            // Display medical records
            response.getWriter().println("Medical Records:");
            // Logic to fetch and display medical records
        } else {
            response.sendRedirect("patient_login.html");
        }
    }
}

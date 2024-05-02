package com.servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SubmitFormServlet")
public class UpdateInfoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String name = request.getParameter("name");
        String dob = request.getParameter("dob");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String bloodType = request.getParameter("blood_type");
        String medicalConditions = request.getParameter("medical_conditions");
        String allergies = request.getParameter("allergies");
        String medications = request.getParameter("medications");
        String height = request.getParameter("height");
        String weight = request.getParameter("weight");
        String emergencyContact = request.getParameter("emergency_contact");
        String insuranceProvider = request.getParameter("insurance_provider");
        String insuranceNumber = request.getParameter("insurance_number");


        request.getRequestDispatcher("submission_success.jsp").forward(request, response);
    }
}

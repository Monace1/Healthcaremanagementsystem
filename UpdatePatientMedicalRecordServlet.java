package com.servlet;

import com.dao.PatientMedicalRecordDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/UpdatePatientMedicalRecordServlet")
public class UpdatePatientMedicalRecordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get parameters from the form
        String patientId = request.getParameter("patientId");
        String updatedMedicalRecord = request.getParameter("updatedMedicalRecord");

        // Update patient medical records in the database
        boolean success = PatientMedicalRecordDao.updateMedicalRecord(patientId, updatedMedicalRecord);

        if (success) {
            // Redirect to a confirmation page or back to the doctor dashboard
            response.sendRedirect("doctor_dashboard.html?updateSuccess=1");
        } else {
            // Redirect back to the doctor dashboard with an error message
            response.sendRedirect("doctor_dashboard.html?updateError=1");
        }
    }
}

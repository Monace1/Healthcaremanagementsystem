package com.servlet;

import com.dao.FeedbackDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("/SubmitFeedbackServlet")
public class SubmitFeedbackServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String feedback = request.getParameter("feedback");
        HttpSession session = request.getSession();
        String patientId = (String) session.getAttribute("patientId");


        boolean success = FeedbackDao.saveFeedback(patientId, feedback);

        if (success) {
            response.sendRedirect("patient_module.jsp?feedbackSuccess=1");
        } else {
            response.sendRedirect("patient_feedback.jsp?feedbackError=1");
        }
    }
}

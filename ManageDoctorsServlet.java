package com.servlet;

import java.io.*;
import java.util.List;

import com.dao.DoctorDao;
import com.entity.Doctor;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/manage-doctors")
public class ManageDoctorsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Doctor> doctors = DoctorDao.getAllDoctors();
        request.setAttribute("doctors", doctors);
        request.getRequestDispatcher("/manage_doctors.jsp").forward(request, response);
    }
}

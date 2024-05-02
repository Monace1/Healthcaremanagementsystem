package com.servlet;

import com.db.DbConnect;
import com.entity.Appointment;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/PatientViewAppointmentsServlet")
public class PatientViewAppointmentsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String loggedInPatientName = request.getParameter("patientName"); // Assuming this is how you retrieve the logged-in patient's name

        List<Appointment> appointments = new ArrayList<>();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = DbConnect.getConnection();

            String sql = "SELECT * FROM appointments WHERE patient_name = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, loggedInPatientName);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Appointment appointment = new Appointment();
                appointment.setAppointmentId(rs.getInt("appointment_id"));
                appointment.setPatientName(rs.getString("patient_name"));
                appointment.setDoctorName(rs.getString("doctor_name"));
                appointment.setAppointmentTime(rs.getTimestamp("appointment_time"));
                appointments.add(appointment);
            }


            request.setAttribute("appointments", appointments);


            request.getRequestDispatcher("PatientViewAppointment.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().println("An error occurred while fetching appointments.");
        } finally {
            DbConnect.close(conn, stmt, rs);
        }
    }
}

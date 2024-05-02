package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.db.DbConnect;

@WebServlet("/BookAppointmentServlet")
public class BookAppointmentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String doctorName = request.getParameter("doctorName");
        String dateTime = request.getParameter("dateTime");

        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = DbConnect.getConnection();

            String sql = "INSERT INTO appointments (patient_name, doctor_name, appointment_time) VALUES (?, ?, ?)";
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, username);
            stmt.setString(2, doctorName);
            stmt.setString(3, dateTime);

            stmt.executeUpdate();

            response.sendRedirect("patient_module.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().println("An error occurred while booking the appointment.");
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("An unexpected error occurred.");
        } finally {

            ResultSet rs = null;
            DbConnect.close(conn, stmt, null);
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
                se2.printStackTrace();
            }
        }
    }
}

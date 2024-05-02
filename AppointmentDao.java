package com.dao;

import com.db.DbConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AppointmentDao {

    private static final String INSERT_APPOINTMENT_SQL = "INSERT INTO appointments (patient_id, doctor_name, appointment_date_time) VALUES (?, ?, ?)";

    public static boolean bookAppointment(String patientId, String doctorName, String dateTime) {
        try (Connection connection = DbConnect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_APPOINTMENT_SQL)) {
            preparedStatement.setString(1, patientId);
            preparedStatement.setString(2, doctorName);
            preparedStatement.setString(3, dateTime);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

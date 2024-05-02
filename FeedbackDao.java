package com.dao;

import com.db.DbConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FeedbackDao {

    private static final String INSERT_FEEDBACK_SQL = "INSERT INTO feedback (patient_id, feedback_text) VALUES (?, ?)";

    public static boolean saveFeedback(String patientId, String feedbackText) {
        try (Connection connection = DbConnect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_FEEDBACK_SQL)) {
            preparedStatement.setString(1, patientId);
            preparedStatement.setString(2, feedbackText);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}


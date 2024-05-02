package com.dao;

import com.entity.Patient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientDao {

    private static final String INSERT_SQL = "INSERT INTO patient (username, email, password) VALUES (?, ?, ?)";
    private static final String SELECT_BY_USERNAME_SQL = "SELECT * FROM patient WHERE username = ?";

    public static boolean insertPatient(Connection connection, String username, String email, String password) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SQL)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Patient getPatientByUsername(Connection connection, String username) throws SQLException {
        String query = SELECT_BY_USERNAME_SQL;
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    Patient patient = new Patient();
                    patient.setId(resultSet.getInt("id"));
                    patient.setUsername(resultSet.getString("username"));
                    patient.setEmail(resultSet.getString("email"));
                    patient.setPassword(resultSet.getString("password"));
                    return patient;
                }
            }
        }
        return null; // Return null if no patient found
    }
}

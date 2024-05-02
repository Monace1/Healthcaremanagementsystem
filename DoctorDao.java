package com.dao;

import com.db.DbConnect;
import com.entity.Doctor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DoctorDao {

    private static final String INSERT_SQL = "INSERT INTO doctor (doctorName, specialization, username, password) VALUES (?, ?, ?, ?)";
    private static final String DELETE_SQL = "DELETE FROM doctor WHERE id = ?";

    public static boolean insertDoctor(Connection connection,String doctorName, String specialization, String username, String password) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SQL)) {
            preparedStatement.setString(1, doctorName);
            preparedStatement.setString(2, specialization);
            preparedStatement.setString(3, username);
            preparedStatement.setString(4, password);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean removeDoctor(Connection connection, int doctorId) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(DELETE_SQL)) {
            preparedStatement.setInt(1, doctorId);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    public static String authenticate(String username, String password) {
        try (Connection connection = DbConnect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM doctor WHERE username = ? AND password = ?")) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int count = resultSet.getInt(1);
                    if (count > 0) {

                        return null;
                    } else{
                        return "Invalid username or password.";
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return "Database error occurred.";
        }
        return "Unknown error occurred.";
    }

    public static List<Doctor> getAllDoctors() {
        List<Doctor> doctors = new ArrayList<>();

        try (Connection connection = DbConnect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM doctor");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String doctorName = resultSet.getString("doctor_name");
                String specialization = resultSet.getString("specialization");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");

                Doctor doctor = new Doctor(id, doctorName, specialization, username, password);
                doctors.add(doctor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return doctors;
    }

    public Doctor getDoctorByUsername(Connection connection, String username) throws SQLException {

        String query = "SELECT * FROM doctors WHERE username = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Doctor doctor = null;

        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                doctor = new Doctor();
                doctor.setId(resultSet.getInt("id"));
                doctor.setDoctorName(resultSet.getString("doctorName"));
                doctor.setSpecialization(resultSet.getString("specialization"));
                doctor.setUsername(resultSet.getString("username"));
                doctor.setPassword(resultSet.getString("password"));
            }
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }

        return doctor;
    }
}

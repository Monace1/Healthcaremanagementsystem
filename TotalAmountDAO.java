package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TotalAmountDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/hospital";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private static final String SELECT_TOTAL_AMOUNT_SQL = "SELECT amount FROM total_amount";

    public double getTotalAmount() throws SQLException {
        double totalAmount = 0.0;

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_TOTAL_AMOUNT_SQL)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                totalAmount = resultSet.getDouble("amount");
            }
        }

        return totalAmount;
    }

    public static void main(String[] args) {
        TotalAmountDAO totalAmountDAO = new TotalAmountDAO();
        try {
            double totalAmount = totalAmountDAO.getTotalAmount();
            System.out.println("Total Amount: $" + totalAmount);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


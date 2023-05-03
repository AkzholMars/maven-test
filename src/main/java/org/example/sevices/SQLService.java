package org.example.sevices;


import org.example.model.Account;
import org.example.model.User;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQLService {
    static final String QUERY = "SELECT u.login, u.fullname, u.age, u.gender, u.email, u.created_dt, " +
            "ua.currency, ua.account_number" +
            "FROM accounts ua" +
            "JOIN users u" +
            "ON u.id = ua.id";

    public static List<User> getUser(){
        List<User> users = new ArrayList<>();

        try (Connection connection = ConnectionSQL.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                String login = rs.getString("login");
                String fullname = rs.getString("fullname");
                String email = rs.getString("email");
                BigDecimal accountNumber = rs.getBigDecimal("account_number");
                BigDecimal currency = rs.getBigDecimal("currency");

                users.add(new User(login, fullname, email, new Account(accountNumber, currency)));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }


        return users;
    }



}
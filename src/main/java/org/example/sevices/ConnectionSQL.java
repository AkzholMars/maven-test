package org.example.sevices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSQL {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASS = "123";

    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

}

package com.cleaning.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {
    private Connection conn;
    private static DbManager dbManagerInstance;

    private DbManager() throws SQLException {
        Properties connectionProps = new Properties();
        connectionProps.put("user", "icelandair_user");
        connectionProps.put("password", "icelandair");
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cleaning_app?serverTimezone=Europe/Warsaw" +
                        "&allowPublicKeyRetrieval=true&useSSL=False",
                connectionProps);
    }

    public static DbManager getInstance() throws SQLException {
        if (dbManagerInstance == null) {
            dbManagerInstance = new DbManager();
        }
        return dbManagerInstance;
    }

    public Connection getConnection() {
        return conn;

    }
}

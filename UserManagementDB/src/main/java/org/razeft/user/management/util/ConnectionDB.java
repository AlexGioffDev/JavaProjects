package org.razeft.user.management.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static String url = "jdbc:mysql://localhost:3306/UserManagementDB";
    private static String user = "root";
    private static String password = "";

    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if(connection == null){
            connection = DriverManager.getConnection(url, user, password);
        }

        return  connection;
    }
}

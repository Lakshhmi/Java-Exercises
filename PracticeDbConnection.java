package com.basic2.db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
//MySQL Connection from JAVA

public class PracticeDbConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/db_empmanagement";
        String userName = "root";
        String password = "Career4us";
        String sql = "";
        try {
            Connection conn = DriverManager.getConnection(url, userName, password);

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}

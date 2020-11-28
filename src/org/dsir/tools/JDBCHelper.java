package org.dsir.tools;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCHelper {
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/crm";
    public static final String username = "root";
    public static final String password = "root";
    public static Connection getConn() throws  Exception{
        Class.forName(DRIVER);
        Connection conn = DriverManager.getConnection(URL,username,password);
        return conn;
    }
}

package com.itheima;


import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @program: JdbcUtils
 * @description: jdbc的工具类
 * @author: Xiaofei Wang
 * @created: 2020/07/30 15:17
 */


public class JDBCUtils {
    private static final String user;
    private static final String url;
    private static final String password;
    private static final String driver;

    static {
        try {
            Properties info = new Properties();
            info.load(new FileInputStream("src/jdbc.properties"));
            user = info.getProperty("jdbc.username");
            password = info.getProperty("jdbc.password");
            url = info.getProperty("jdbc.url");
            driver = info.getProperty("jdbc.driver");

            Class.forName(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public static void close(Statement statement, Connection connection, ResultSet resultSet) {
        try {
            if (connection != null) {
                connection.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try (Connection connection = getConnection()) {
            System.out.println(connection);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

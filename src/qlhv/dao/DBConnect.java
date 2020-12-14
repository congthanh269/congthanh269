package qlhv.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
  public static Connection getConnection() {
    Connection connection = null;
    String url = "jdbc:mysql://localhost:3306/db_qlhv";
    String username = "root";
    String password = "root";
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection = DriverManager.getConnection(url, username, password);
      return connection;
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return null;
  }

}

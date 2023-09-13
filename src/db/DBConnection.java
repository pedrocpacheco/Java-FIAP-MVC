package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
  
  private static final String URL = "jdbc:oracle:thin:@oracle.fiao.com.br:1521:orcl";
  private static final String USER = Credentials.user;
  private static final String PWD = Credentials.pwd;
  
  public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(URL, USER, PWD);
  }


}

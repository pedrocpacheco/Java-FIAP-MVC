package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.User;

public class UserDAO {
  
  private Connection conn;

  private UserDAO(Connection connection){
    this.conn = connection;
  }

  public void insert(User user){
    try {
      String query = "INSERT INTO jv_table_user VALUES (?, ?)";
      PreparedStatement ps = conn.prepareStatement(query);
      ps.setString(1, user.getName());
      ps.setString(2, user.getEmail());
      ps.execute();
    } catch (Exception e) {
      throw new RuntimeException("Error inserting User");
    }
  }

  public void closeConnection(){
    try {
      if(!this.conn.isClosed()){
        this.conn.close();
        System.out.println("Conn Closed");
      } else{
        System.out.println("Conn already Closed");
      }
    } catch (Exception e) {
      System.out.println("Error Closing Connection");
    }
  }



}

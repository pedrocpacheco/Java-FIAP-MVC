package view;

import java.sql.Connection;

import db.DBConnection;

public class Program {
  public static void main(String[] args) {
    Connection conn = null;
    try {
      conn = DBConnection.getConnection();
      System.out.println("Conexão realizada com sucesso!");
    } catch (Exception e) {
      System.out.println("Erro ao obter conexão com o banco de dados!");
    }
  }
}

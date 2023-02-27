package modelo.daojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionMy8 {
private static String url, user, pwd;
private static  Connection conn;

private conexionMy8() {
 url = "jdbc:mysql://localhost:3306/banco_fp_23?serverTimezone=UTC";
 user = "root";
 pwd = "root";
try {
 conn = DriverManager.getConnection(url, user, pwd);
 System.out.println("conexion establecida");
 } catch (SQLException e) {
 System.out.println("conexion NO establecida");
 e.printStackTrace();
 }

 }

 public static Connection getConnection() {
 if (conn == null) {
 new conexionMy8();
}
return conn;

 }
 }




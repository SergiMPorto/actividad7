package testing;

import java.sql.Connection;

import modelo.daojdbc.conexionMy8;

public class TestSingleton {

	public static void main(String[] args) {
		
		Connection conn = conexionMy8.getConnection();
		
		System.out.println(conn);
		
	}

}

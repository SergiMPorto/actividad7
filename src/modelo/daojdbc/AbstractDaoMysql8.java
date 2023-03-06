package modelo.daojdbc;


	

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public abstract class AbstractDaoMysql8 {
		protected Connection conn;
		protected PreparedStatement ps;
		protected ResultSet rs;
		protected String sql;
		protected int filas;
		
		
		public AbstractDaoMysql8() {
			conn = conexionMy8.getConnection();
		}

	}

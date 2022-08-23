package cl.dojo.connection;

import java.sql.*;

public class ConnectionManager {

	protected Connection conn = null;
	protected PreparedStatement pstm = null;
	protected ResultSet rs = null;
	
	protected Connection generaConexion()  {
		String usr = "root";
		String pwd = "";
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3307/bootcamp";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,usr,pwd);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
}

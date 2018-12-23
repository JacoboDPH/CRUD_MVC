

package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private static final String url = "jdbc:mysql://localhost:3306/Instituto?verifyServerCertificate=false&useSSL=true";
	private static final String username = "root";
	private static final String password = "Jacobo.1981";
	
	private Connection con = null;
	
	
	@SuppressWarnings("static-access")
	
	public Connection getConexion() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
			con = (Connection)DriverManager.getConnection(this.url, this.username, this.password);
			
			
		} catch (SQLException e) {
		
			System.err.println(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	
}

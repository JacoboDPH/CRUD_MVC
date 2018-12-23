package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaAlumno extends Conexion {

	public boolean guardar (Alumno save) {
		
		PreparedStatement ps = null;
		Connection con = getConexion();
		
		String sql = "INSERT INTO Alumno (DNI, nombre, apellido, asignatura, calificacion) VALUES (?,?,?,?,?)";
		
		try {
			
			ps = con.prepareStatement(sql);
			ps.setString(1, save.getDNI());
			ps.setString(2, save.getNombre());
			ps.setString(3, save.getApellido());
			ps.setString(4, save.getAsignatura());
			ps.setInt(5, save.getCalificacion());
			
		
			
			ps.executeUpdate();

			return true;
			
			
		} catch (SQLException e) {

			System.err.println(e);
			return false;
		}
		finally {
			
			try {
				con.close();
			} catch (SQLException e2) {
				System.err.println(e2);
			}
		}
		
	
	}
	
	public boolean modificar (Alumno save) {
		
		PreparedStatement ps = null;
		Connection con = getConexion();
		
		String sql = "UPDATE Alumno SET DNI=?, nombre=?, apellido=?, asignatura=?, calificacion=? WHERE idAlumno=?";
		
		
		try {
			
			ps = con.prepareStatement(sql);
			ps.setString(1, save.getDNI());
			ps.setString(2, save.getNombre());
			ps.setString(3, save.getApellido());
			ps.setString(4, save.getAsignatura());
			ps.setInt(5, save.getCalificacion());
			ps.setInt(6, save.getIdAlumno());
			
		
			
			
			ps.executeUpdate();
			return true;
			
			
		} catch (SQLException e) {

			System.err.println(e);
			return false;
		}
		finally {
			
			try {
				con.close();
			} catch (SQLException e2) {
				System.err.println(e2);
			}
		}
		
	
	}
	
	public boolean eliminar (Alumno save) {

		PreparedStatement ps = null;
		Connection con = getConexion();

		String sql = "DELETE FROM Alumno WHERE idAlumno=?";

		try {

			ps = con.prepareStatement(sql);
		
			
			ps.setLong(1, save.getIdAlumno());

			ps.executeUpdate();
			return true;	

		} catch (SQLException e) {

			System.err.println(e);
			return false;
		}
		finally {

			try {
				con.close();
			} catch (SQLException e2) {
				System.err.println(e2);
			}
		}


	}

	public boolean buscar (Alumno save) {
		
		PreparedStatement ps = null;
		Connection con = getConexion();
		ResultSet rs = null;
		
		String sql = "SELECT * FROM Alumno WHERE DNI = ?";
		
		try {
			
		
			ps = con.prepareStatement(sql);
			ps.setString(1, save.getDNI());
						
			rs = ps.executeQuery();
			
			if (rs.next()) {
				
				save.setIdAlumno(Integer.parseInt(rs.getString("idAlumno")));
				save.setNombre(rs.getString("nombre"));
				save.setApellido(rs.getString("apellido"));
				save.setAsignatura(rs.getString("asignatura"));
				save.setCalificacion(Integer.parseInt(rs.getString("calificacion")));
			
				
								return true;	
			}
			return false;
			
		} catch (SQLException e) {

			System.err.println(e);
			return false;
		}
		finally {
			
			try {
				con.close();
			} catch (SQLException e2) {
				System.err.println(e2);
			}
		}
		
	
	}


}

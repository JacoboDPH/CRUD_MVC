package Modelo;

public class Alumno {

	// DECLARACION DE VARIABLES
	
	private int idAlumno;
	private String DNI;
	private String nombre;
	private String apellido;
	private String asignatura;
	private int calificacion;

	
	// MÉTODOS GETTER Y SETTER (AUTOGENERADOS POR EL IDLE)
	
	
	public int getIdAlumno() {
		return idAlumno;
	}
	
	
	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}


	public void setIdAlumno(int idAlumno) {
						
		this.idAlumno = idAlumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	
	
	
}

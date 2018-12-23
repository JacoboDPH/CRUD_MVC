package CRUD_Main;

import Controlador.ControlAlumno;
import Modelo.Alumno;
import Modelo.ConsultaAlumno;
import Vista.FormularioAlumno;

public class CrudMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno mod = new Alumno();
		ConsultaAlumno consultaAlumno = new ConsultaAlumno();
		FormularioAlumno formularioAlumno = new FormularioAlumno();
		
		ControlAlumno control = new ControlAlumno(consultaAlumno, mod, formularioAlumno);
		control.iniciar();
		formularioAlumno.setVisible(true);
		
	}

}

package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




import javax.swing.JOptionPane;

import Modelo.Alumno;
import Modelo.ConsultaAlumno;
import Vista.FormularioAlumno;

public class ControlAlumno implements ActionListener{

	private Alumno mod;
	private ConsultaAlumno consultaAlumno;
	private FormularioAlumno formularioAlumno;
	
	public ControlAlumno (ConsultaAlumno consultaAlumno, Alumno mod, FormularioAlumno formularioAlumno ) {
		
		
		this.mod = mod;
		this.consultaAlumno = consultaAlumno;
		this.formularioAlumno = formularioAlumno;
		
		this.formularioAlumno.btnBuscar.addActionListener(this);
		this.formularioAlumno.btnEliminar.addActionListener(this);
		this.formularioAlumno.btnGuardar.addActionListener(this);
		this.formularioAlumno.btnLimipiar.addActionListener(this);
		this.formularioAlumno.btnEditar.addActionListener(this);
		
		
	}

	public void iniciar() {
		
		formularioAlumno.setTitle("Alumnos");
		formularioAlumno.setLocationRelativeTo(null);
		formularioAlumno.textId.setVisible(false);
	}
	
	public void actionPerformed(ActionEvent e) {



		if (e.getSource() == formularioAlumno.btnGuardar) {

			System.out.println("Pulsado");

			mod.setDNI(formularioAlumno.textDNI.getText());
			mod.setNombre(formularioAlumno.textNombre.getText());
			mod.setApellido(formularioAlumno.textApellido.getText());
			mod.setAsignatura(formularioAlumno.textAsignatura.getText());
			mod.setCalificacion(formularioAlumno.comboBox.getSelectedIndex()-1);

			if (consultaAlumno.guardar(mod)) {

				JOptionPane.showMessageDialog(null, "Se ha guardado correctamente");
				limpiar();
			}
			else {

				JOptionPane.showMessageDialog(null, "No ha guardado");
			}
		}
		

		if (e.getSource() == formularioAlumno.btnEditar) {

		
			mod.setIdAlumno(Integer.parseInt(formularioAlumno.textId.getText()));
			mod.setDNI(formularioAlumno.textDNI.getText());
			mod.setNombre(formularioAlumno.textNombre.getText());
			mod.setApellido(formularioAlumno.textApellido.getText());
			mod.setAsignatura(formularioAlumno.textAsignatura.getText());
			mod.setCalificacion(formularioAlumno.comboBox.getSelectedIndex()-1);

			if (consultaAlumno.modificar(mod)) {

				JOptionPane.showMessageDialog(null, "Se ha editado correctamente");
				limpiar();
			}
			else {

				JOptionPane.showMessageDialog(null, "No ha editado");
			}

		}
		
		if (e.getSource() == formularioAlumno.btnEliminar) {

			System.out.println("eliminar");

			mod.setIdAlumno(Integer.parseInt(formularioAlumno.textId.getText()));


			if (consultaAlumno.eliminar(mod)) {

				JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
				limpiar();
			}
			else {

				JOptionPane.showMessageDialog(null, "No ha eliminado");
			}
		}

		if (e.getSource() == formularioAlumno.btnBuscar) {

			System.out.println("buscarr");

			mod.setDNI(formularioAlumno.textDNI.getText());



			if (consultaAlumno.buscar(mod)) {

				formularioAlumno.textId.setText(String.valueOf(mod.getIdAlumno()));

				formularioAlumno.textNombre.setText(mod.getNombre());
				formularioAlumno.textApellido.setText(mod.getApellido());
				formularioAlumno.textAsignatura.setText(mod.getAsignatura());
			
				
				formularioAlumno.comboBox.setSelectedIndex(mod.getCalificacion()+1);



			}
			else {

				JOptionPane.showMessageDialog(null, "No encontró el resultado");
			}
		}
		

		if (e.getSource() == formularioAlumno.btnLimipiar) {

			System.out.println("buscarr");
			limpiar();
		}
	

}

	private void limpiar() {
		
		formularioAlumno.textDNI.setText(null);
		formularioAlumno.textNombre.setText(null);
		formularioAlumno.textApellido.setText(null);
		formularioAlumno.textAsignatura.setText(null);
		formularioAlumno.comboBox.setSelectedIndex(0);
	}

}

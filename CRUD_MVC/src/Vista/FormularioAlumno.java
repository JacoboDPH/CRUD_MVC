package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class FormularioAlumno extends JFrame {

	private JPanel contentPane;
	public JTextField textDNI;
	public JTextField textNombre;
	public JTextField textApellido;
	public JTextField textAsignatura;
	public JTextField textId;
	
	public JButton btnEditar;

	public JComboBox comboBox;
	public JButton btnBuscar;
	public JButton btnEliminar;
	public JButton btnGuardar;
	public JButton btnLimipiar;

	/**
	 * Launch the application.
	 */
	/*
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
	
			
			public void run() {
				try {
					FormularioAlumno frame = new FormularioAlumno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
*/
	/**
	 * Create the frame.
	 */
	public FormularioAlumno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ejercicio CRUD - ACCESO A DATOS - MVC");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel.setBounds(6, 6, 534, 75);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Jacobo Diego Pita Hernandez");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(321, 450, 219, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDni = new JLabel("DNI :");
		lblDni.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDni.setBounds(16, 103, 100, 16);
		contentPane.add(lblDni);
		
		JLabel lblNombre = new JLabel("NOMBRE :");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(16, 131, 100, 16);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("APELLIDOS :");
		lblApellidos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellidos.setBounds(16, 158, 100, 16);
		contentPane.add(lblApellidos);
		
		JLabel lblAsignatura = new JLabel("ASIGNATURA :");
		lblAsignatura.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAsignatura.setBounds(16, 186, 100, 16);
		contentPane.add(lblAsignatura);
		
		JLabel lblNewLabel_2 = new JLabel("CALIFICACIÓN :");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(16, 214, 100, 16);
		contentPane.add(lblNewLabel_2);
		
		textDNI = new JTextField();
		textDNI.setBounds(133, 98, 140, 26);
		contentPane.add(textDNI);
		textDNI.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setBounds(133, 126, 245, 26);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textApellido = new JTextField();
		textApellido.setBounds(133, 153, 245, 26);
		contentPane.add(textApellido);
		textApellido.setColumns(10);
		
		textAsignatura = new JTextField();
		textAsignatura.setBounds(133, 181, 245, 26);
		contentPane.add(textAsignatura);
		textAsignatura.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setMaximumRowCount(10);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"añadir ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(133, 210, 130, 27);
		contentPane.add(comboBox);
		
		textId = new JTextField();
		textId.setEnabled(false);
		textId.setBackground(SystemColor.window);
		textId.setEditable(false);
		textId.setBounds(390, 98, 130, 26);
		contentPane.add(textId);
		textId.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
	
		btnBuscar.setIcon(new ImageIcon("/Users/jacobodiego/eclipse-workspace/CRUD_MVC/Recursos/67-512.png"));
		btnBuscar.setBounds(278, 93, 100, 34);
		contentPane.add(btnBuscar);
		
		btnGuardar = new JButton("Guardar");
		
		btnGuardar.setIcon(new ImageIcon("/Users/jacobodiego/eclipse-workspace/CRUD_MVC/Recursos/save.png"));
		btnGuardar.setBounds(15, 258, 117, 44);
		contentPane.add(btnGuardar);
		
		btnEditar = new JButton("Editar");
		btnEditar.setIcon(new ImageIcon("/Users/jacobodiego/eclipse-workspace/CRUD_MVC/Recursos/img_386644.png"));
		btnEditar.setBounds(147, 258, 117, 44);
		contentPane.add(btnEditar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon("/Users/jacobodiego/eclipse-workspace/CRUD_MVC/Recursos/filled-trash.png"));
		
		btnEliminar.setBounds(279, 258, 117, 44);
		contentPane.add(btnEliminar);
		
		btnLimipiar = new JButton("Limipiar");
		btnLimipiar.setIcon(new ImageIcon("/Users/jacobodiego/eclipse-workspace/CRUD_MVC/Recursos/Wipe-512.png"));
	
		btnLimipiar.setBounds(411, 258, 117, 44);
		contentPane.add(btnLimipiar);
	}
	
	
	public JButton getBtnEditar() {
		return btnEditar;
	}
	public JComboBox getComboBox() {
		return comboBox;
	}
	public JButton getBtnBuscar() {
		return btnBuscar;
	}
	public JButton getBtnEliminar() {
		return btnEliminar;
	}
	public JButton getBtnGuardar() {
		return btnGuardar;
	}
	public JButton getBtnLimipiar() {
		return btnLimipiar;
	}
	
	
}

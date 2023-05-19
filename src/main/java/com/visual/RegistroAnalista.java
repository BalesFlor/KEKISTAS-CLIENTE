package com.visual;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.grsc.exceptions.LetterOnlyVerifier;
import com.grsc.exceptions.NumberOnlyVerifier;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegistroAnalista extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldMail;
	private JTextField textFieldDocumento;
	private JTextField textFieldTelefono;
	private JTextField textFieldUsuario;
	private JPasswordField passwordFieldContraseña;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroAnalista frame = new RegistroAnalista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistroAnalista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 381, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistroEstudiante = new JLabel("REGISTRO ANALISTA");
		lblRegistroEstudiante.setFont(new Font("SquareFont", Font.BOLD, 16));
		lblRegistroEstudiante.setBounds(86, 8, 188, 61);
		contentPane.add(lblRegistroEstudiante);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNombre.setBounds(27, 75, 149, 17);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Arial", Font.PLAIN, 16));
		lblApellido.setBounds(27, 106, 149, 17);
		contentPane.add(lblApellido);
		
		JLabel lblNacimiento = new JLabel("Nacimiento:");
		lblNacimiento.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNacimiento.setBounds(27, 137, 149, 17);
		contentPane.add(lblNacimiento);
		
		JLabel lblMail = new JLabel("Mail:");
		lblMail.setFont(new Font("Arial", Font.PLAIN, 16));
		lblMail.setBounds(27, 168, 149, 17);
		contentPane.add(lblMail);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setFont(new Font("Arial", Font.PLAIN, 16));
		lblDocumento.setBounds(27, 199, 149, 17);
		contentPane.add(lblDocumento);
		
		JLabel lblDepartamento = new JLabel("Departamento:");
		lblDepartamento.setFont(new Font("Arial", Font.PLAIN, 16));
		lblDepartamento.setBounds(27, 230, 149, 17);
		contentPane.add(lblDepartamento);
		
		JLabel lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setFont(new Font("Arial", Font.PLAIN, 16));
		lblLocalidad.setBounds(27, 261, 149, 17);
		contentPane.add(lblLocalidad);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTelefono.setBounds(27, 292, 149, 17);
		contentPane.add(lblTelefono);
		
		JLabel lblITR = new JLabel("ITR:");
		lblITR.setFont(new Font("Arial", Font.PLAIN, 16));
		lblITR.setBounds(27, 323, 149, 17);
		contentPane.add(lblITR);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Arial", Font.PLAIN, 16));
		lblUsuario.setBounds(27, 354, 149, 17);
		contentPane.add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setFont(new Font("Arial", Font.PLAIN, 16));
		lblContraseña.setBounds(27, 385, 149, 17);
		contentPane.add(lblContraseña);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setInputVerifier(new LetterOnlyVerifier());
		textFieldNombre.setBounds(184, 75, 151, 23);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setInputVerifier(new LetterOnlyVerifier());
		textFieldApellido.setBounds(184, 106, 151, 23);
		contentPane.add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		textFieldMail = new JTextField();
		textFieldMail.setBounds(184, 168, 151, 23);
		contentPane.add(textFieldMail);
		textFieldMail.setColumns(10);
		
		textFieldDocumento = new JTextField();
		textFieldDocumento.setInputVerifier(new NumberOnlyVerifier());
		textFieldDocumento.setBounds(184, 199, 151, 23);
		contentPane.add(textFieldDocumento);
		textFieldDocumento.setColumns(10);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.setInputVerifier(new NumberOnlyVerifier());
		textFieldTelefono.setBounds(184, 291, 151, 23);
		contentPane.add(textFieldTelefono);
		textFieldTelefono.setColumns(10);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(184, 353, 151, 23);
		contentPane.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		passwordFieldContraseña = new JPasswordField();
		passwordFieldContraseña.setBounds(184, 385, 151, 23);
		contentPane.add(passwordFieldContraseña);
		
		JComboBox comboBox_Nac1 = new JComboBox();
		comboBox_Nac1.setBounds(184, 141, 40, 19);
		contentPane.add(comboBox_Nac1);
		
		JComboBox comboBox_Nac2 = new JComboBox();
		comboBox_Nac2.setBounds(232, 141, 40, 19);
		contentPane.add(comboBox_Nac2);
		
		JComboBox comboBox_Nac3 = new JComboBox();
		comboBox_Nac3.setBounds(280, 141, 40, 19);
		contentPane.add(comboBox_Nac3);
		
		JComboBox comboBoxDepartamento = new JComboBox();
		comboBoxDepartamento.setBounds(184, 230, 151, 23);
		contentPane.add(comboBoxDepartamento);
		
		JComboBox comboBoxLocalidad = new JComboBox();
		comboBoxLocalidad.setBounds(184, 261, 151, 23);
		contentPane.add(comboBoxLocalidad);
		
		JComboBox comboBoxITR = new JComboBox();
		comboBoxITR.setBounds(184, 325, 151, 23);
		contentPane.add(comboBoxITR);
		
		
		JButton btnRegistrarse = new JButton("REGISTRARSE");
		btnRegistrarse.setFont(new Font("SquareFont", Font.PLAIN, 15));
		btnRegistrarse.setBounds(77, 448, 215, 40);
		contentPane.add(btnRegistrarse);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
			
			SeleccionUsuario atras = new SeleccionUsuario();
			atras.setVisible(true);
			dispose();
			
			}
		
		
		});
		btnAtras.setBounds(290, 512, 77, 19);
		contentPane.add(btnAtras);
	
	}

}

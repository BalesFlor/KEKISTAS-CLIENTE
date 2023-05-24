//sadasd
package com.visual;
//git
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DatosPersonalesAnalista extends JFrame {

	private JPanel contentPane;
	private JTextField lblPrimerNombre;
	private JTextField textSegundoNombre;
	private JTextField textPrimerApellido;
	private JTextField textSegundoApellido;
	private JTextField textCorreo;
	private JTextField textTelefono;
	private JTextField textFechaNacimieno;
	private JTextField textGenero;
	private JTextField textDepartamento;
	private JTextField textLocalidad;
	private JTextField textDocumento;
	private JTextField textContraseña;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatosPersonalesEst frame = new DatosPersonalesEst();
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
	public DatosPersonalesAnalista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 0, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDatosPersonales = new JButton("Datos personales");
		btnDatosPersonales.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnDatosPersonales.setBounds(2, 196, 359, 106);
		contentPane.add(btnDatosPersonales);
		
		JButton btnReclamos = new JButton("Reclamos");
		btnReclamos.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnReclamos.setBounds(2, 310, 359, 106);
		contentPane.add(btnReclamos);
		
		JButton btnInasistencias = new JButton("Inasistencias");
		btnInasistencias.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnInasistencias.setBounds(2, 424, 359, 106);
		contentPane.add(btnInasistencias);
		
		JButton btnHome = new JButton("");
		btnHome.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
			
			PrincipalAnalista home = new PrincipalAnalista();
			home.setVisible(true);
			dispose();
			
			}
		});
		btnHome.setIcon(new ImageIcon(getClass().getResource("/home.png")));
		btnHome.setBounds(8, 127, 60, 60);
		contentPane.add(btnHome);
		
		JButton btnLogout = new JButton("");
		btnLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			System.exit(0);
				
			}
		});
		btnLogout.setIcon(new ImageIcon(getClass().getResource("/logout.png")));
		btnLogout.setBounds(1198, 127, 60, 60);
		contentPane.add(btnLogout);	
		
		JLabel lblDatosBasicos = new JLabel("Datos básicos");
		lblDatosBasicos.setForeground(SystemColor.activeCaption);
		lblDatosBasicos.setFont(new Font("SquareFont", Font.PLAIN, 16));
		lblDatosBasicos.setBounds(440, 228, 232, 25);
		contentPane.add(lblDatosBasicos);
		
		JLabel textPrimerNombre = new JLabel("Primer nombre");
		textPrimerNombre.setFont(new Font("SquareFont", Font.PLAIN, 14));
		textPrimerNombre.setBounds(440, 272, 135, 25);
		contentPane.add(textPrimerNombre);
		
		lblPrimerNombre = new JTextField();
		lblPrimerNombre.setBounds(580, 272, 130, 25);
		contentPane.add(lblPrimerNombre);
		lblPrimerNombre.setColumns(10);
		
		JLabel lblSegundoNombre = new JLabel("Segundo nombre");
		lblSegundoNombre.setFont(new Font("SquareFont", Font.PLAIN, 14));
		lblSegundoNombre.setBounds(798, 272, 135, 25);
		contentPane.add(lblSegundoNombre);
		
		textSegundoNombre = new JTextField();
		textSegundoNombre.setColumns(10);
		textSegundoNombre.setBounds(938, 272, 130, 25);
		contentPane.add(textSegundoNombre);
		
		JLabel lblPrimerApellido = new JLabel("Primer apellido");
		lblPrimerApellido.setFont(new Font("SquareFont", Font.PLAIN, 14));
		lblPrimerApellido.setBounds(440, 305, 135, 25);
		contentPane.add(lblPrimerApellido);
		
		textPrimerApellido = new JTextField();
		textPrimerApellido.setColumns(10);
		textPrimerApellido.setBounds(580, 305, 130, 25);
		contentPane.add(textPrimerApellido);
		
		JLabel lblSegundoApellido = new JLabel("Segundo apellido");
		lblSegundoApellido.setFont(new Font("SquareFont", Font.PLAIN, 14));
		lblSegundoApellido.setBounds(798, 305, 135, 25);
		contentPane.add(lblSegundoApellido);
		
		textSegundoApellido = new JTextField();
		textSegundoApellido.setColumns(10);
		textSegundoApellido.setBounds(938, 305, 130, 25);
		contentPane.add(textSegundoApellido);
		
		JLabel lblCorreo = new JLabel("Correo electrónico");
		lblCorreo.setFont(new Font("SquareFont", Font.PLAIN, 14));
		lblCorreo.setBounds(440, 467, 135, 25);
		contentPane.add(lblCorreo);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		textCorreo.setBounds(580, 467, 130, 25);
		contentPane.add(textCorreo);
		
		JLabel lblTelefono = new JLabel("Teléfono");
		lblTelefono.setFont(new Font("SquareFont", Font.PLAIN, 14));
		lblTelefono.setBounds(798, 467, 135, 25);
		contentPane.add(lblTelefono);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(938, 467, 130, 25);
		contentPane.add(textTelefono);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaNacimiento.setFont(new Font("SquareFont", Font.PLAIN, 14));
		lblFechaNacimiento.setBounds(440, 338, 135, 25);
		contentPane.add(lblFechaNacimiento);
		
		textFechaNacimieno = new JTextField();
		textFechaNacimieno.setColumns(10);
		textFechaNacimieno.setBounds(580, 338, 130, 25);
		contentPane.add(textFechaNacimieno);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("SquareFont", Font.PLAIN, 14));
		lblGenero.setBounds(798, 338, 135, 25);
		contentPane.add(lblGenero);
		
		textGenero = new JTextField();
		textGenero.setColumns(10);
		textGenero.setBounds(938, 338, 130, 25);
		contentPane.add(textGenero);
		
		JLabel lblDatosDeContacto = new JLabel("Datos de contacto");
		lblDatosDeContacto.setForeground(SystemColor.activeCaption);
		lblDatosDeContacto.setFont(new Font("SquareFont", Font.PLAIN, 16));
		lblDatosDeContacto.setBounds(440, 423, 232, 25);
		contentPane.add(lblDatosDeContacto);
		
		JLabel lblDepartamento = new JLabel("Departamento");
		lblDepartamento.setFont(new Font("SquareFont", Font.PLAIN, 14));
		lblDepartamento.setBounds(440, 500, 135, 25);
		contentPane.add(lblDepartamento);
		
		textDepartamento = new JTextField();
		textDepartamento.setColumns(10);
		textDepartamento.setBounds(580, 500, 130, 25);
		contentPane.add(textDepartamento);
		
		JLabel lblLocalidad = new JLabel("Localidad");
		lblLocalidad.setFont(new Font("SquareFont", Font.PLAIN, 14));
		lblLocalidad.setBounds(798, 500, 135, 25);
		contentPane.add(lblLocalidad);
		
		textLocalidad = new JTextField();
		textLocalidad.setColumns(10);
		textLocalidad.setBounds(938, 500, 130, 25);
		contentPane.add(textLocalidad);
		
		JLabel lblDocumento = new JLabel("Documento");
		lblDocumento.setFont(new Font("SquareFont", Font.PLAIN, 14));
		lblDocumento.setBounds(440, 371, 135, 25);
		contentPane.add(lblDocumento);
		
		textDocumento = new JTextField();
		textDocumento.setColumns(10);
		textDocumento.setBounds(580, 371, 130, 25);
		contentPane.add(textDocumento);
		
		JLabel lblOtrosDatos = new JLabel("Otros datos");
		lblOtrosDatos.setForeground(SystemColor.activeCaption);
		lblOtrosDatos.setFont(new Font("SquareFont", Font.PLAIN, 16));
		lblOtrosDatos.setBounds(440, 552, 232, 25);
		contentPane.add(lblOtrosDatos);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setFont(new Font("SquareFont", Font.PLAIN, 14));
		lblContrasea.setBounds(440, 596, 135, 25);
		contentPane.add(lblContrasea);
		
		textContraseña = new JTextField();
		textContraseña.setColumns(10);
		textContraseña.setBounds(580, 596, 130, 25);
		contentPane.add(textContraseña);
		
		JButton btnModificarDatos = new JButton("Modificar datos");
		btnModificarDatos.setFont(new Font("SquareFont", Font.PLAIN, 14));
		btnModificarDatos.setBounds(798, 592, 287, 32);
		contentPane.add(btnModificarDatos);
		
		JLabel lblPantallaEstudiante = new JLabel("New label");
		lblPantallaEstudiante.setIcon(new ImageIcon(getClass().getResource("/datos personales.png")));
		lblPantallaEstudiante.setBounds(0, 0, 1280, 720);
		contentPane.add(lblPantallaEstudiante);
		//github
		//sdsad
	}


}

package com.visual;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ReclamosDoc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReclamosEst frame = new ReclamosEst();
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
	public ReclamosDoc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 0, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JButton btnDatosPersonales = new JButton("Datos personales");
		btnDatosPersonales.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			DatosPersonalesDoc datosPersonales = new DatosPersonalesDoc();
			datosPersonales.setVisible(true);
			dispose();
			
			}
		});
		btnDatosPersonales.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnDatosPersonales.setBounds(2, 196, 359, 106);
		contentPane.add(btnDatosPersonales);
		
		JButton btnReclamos = new JButton("Reclamos");
		btnReclamos.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnReclamos.setBounds(2, 310, 359, 106);
		contentPane.add(btnReclamos);
		
		JButton btnInasistencias = new JButton("Inasistencias");
		btnInasistencias.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			InasistenciasDoc inasistencias = new InasistenciasDoc();
			inasistencias.setVisible(true);
			dispose();
			
			}
		});
		btnInasistencias.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnInasistencias.setBounds(2, 424, 359, 106);
		contentPane.add(btnInasistencias);
		
		JButton btnHome = new JButton("");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			PrincipalDocente home = new PrincipalDocente();
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
		
		textField = new JTextField();
		textField.setBounds(399, 400, 491, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		textField = new JTextField();
		textField.setBounds(399, 543, 823, 84);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Nuevo Reclamo:");
		lblNewLabel.setFont(new Font("SquareFont", Font.PLAIN, 24));
		lblNewLabel.setBounds(399, 196, 181, 61);
		contentPane.add(lblNewLabel);
		

		JButton btnAltaReclamo = new JButton("Enviar");
		btnAltaReclamo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAltaReclamo.setBounds(410, 635, 97, 29);
		contentPane.add(btnAltaReclamo);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancelar.setBounds(1096, 635, 97, 29);
		contentPane.add(btnCancelar);
		
		JButton btnListarReclamo = new JButton("Listar Reclamos");
		btnListarReclamo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnListarReclamo.setBounds(937, 209, 168, 36);
		contentPane.add(btnListarReclamo);
		
		JLabel lblListadoInasistencias = new JLabel("Fecha");
		lblListadoInasistencias.setForeground(SystemColor.activeCaption);
		lblListadoInasistencias.setFont(new Font("SquareFont", Font.PLAIN, 20));
		lblListadoInasistencias.setBounds(399, 250, 271, 25);
		contentPane.add(lblListadoInasistencias);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(399, 283, 50, 19);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(457, 283, 50, 19);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(515, 283, 50, 19);
		contentPane.add(comboBox_1_1);
		
			
		JLabel lblListadoInasistencias_2 = new JLabel("DOCENTE");
		lblListadoInasistencias_2.setForeground(SystemColor.activeCaption);
		lblListadoInasistencias_2.setFont(new Font("SquareFont", Font.PLAIN, 20));
		lblListadoInasistencias_2.setBounds(722, 253, 271, 25);
		contentPane.add(lblListadoInasistencias_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(722, 284, 200, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		

		
		JLabel lblListadoInasistencias_1 = new JLabel("TIPO");
		lblListadoInasistencias_1.setForeground(SystemColor.activeCaption);
		lblListadoInasistencias_1.setFont(new Font("SquareFont", Font.PLAIN, 20));
		lblListadoInasistencias_1.setBounds(399, 324, 60, 25);
		contentPane.add(lblListadoInasistencias_1);

		JLabel lblListadoInasistencias_1_1 = new JLabel("SEMESTRE");
		lblListadoInasistencias_1_1.setForeground(SystemColor.activeCaption);
		lblListadoInasistencias_1_1.setFont(new Font("SquareFont", Font.PLAIN, 20));
		lblListadoInasistencias_1_1.setBounds(579, 324, 114, 25);
		contentPane.add(lblListadoInasistencias_1_1);
		
		JLabel lblListadoInasistencias_1_2 = new JLabel("CREDITOS");
		lblListadoInasistencias_1_2.setForeground(SystemColor.activeCaption);
		lblListadoInasistencias_1_2.setFont(new Font("SquareFont", Font.PLAIN, 20));
		lblListadoInasistencias_1_2.setBounds(814, 324, 131, 25);
		contentPane.add(lblListadoInasistencias_1_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(459, 328, 50, 19);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(697, 328, 50, 19);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(917, 328, 50, 19);
		contentPane.add(comboBox_4);
		
		JLabel lblListadoInasistencias_3 = new JLabel("NOMBRE DE LA ACTIVIDAD");
		lblListadoInasistencias_3.setForeground(SystemColor.activeCaption);
		lblListadoInasistencias_3.setFont(new Font("SquareFont", Font.PLAIN, 20));
		lblListadoInasistencias_3.setBounds(399, 367, 271, 25);
		contentPane.add(lblListadoInasistencias_3);
		JLabel lblPantallaEstudiante = new JLabel("New label");
		
		JLabel lblListadoInasistencias_3_1 = new JLabel("TITULO DE RECLAMO");
		lblListadoInasistencias_3_1.setForeground(SystemColor.activeCaption);
		lblListadoInasistencias_3_1.setFont(new Font("SquareFont", Font.PLAIN, 20));
		lblListadoInasistencias_3_1.setBounds(399, 442, 271, 25);
		contentPane.add(lblListadoInasistencias_3_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(399, 475, 491, 29);
		contentPane.add(textField_2);
		
		JLabel lblListadoInasistencias_3_1_1 = new JLabel("descripción");
		lblListadoInasistencias_3_1_1.setForeground(SystemColor.activeCaption);
		lblListadoInasistencias_3_1_1.setFont(new Font("SquareFont", Font.PLAIN, 20));
		lblListadoInasistencias_3_1_1.setBounds(399, 510, 271, 25);
		contentPane.add(lblListadoInasistencias_3_1_1);
		
		
		lblPantallaEstudiante.setIcon(new ImageIcon(getClass().getResource("/Reclamo.png")));
		lblPantallaEstudiante.setBounds(0, 0, 1280, 720);
		contentPane.add(lblPantallaEstudiante);
	
	
	
	}

}

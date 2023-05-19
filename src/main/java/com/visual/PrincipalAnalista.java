package com.visual;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PrincipalAnalista extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalAnalista frame = new PrincipalAnalista();
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
	public PrincipalAnalista() {
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
			
			DatosPersonalesAnalista datosPersonales = new DatosPersonalesAnalista();
			datosPersonales.setVisible(true);
			dispose();
			
			}
		});
		btnDatosPersonales.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnDatosPersonales.setBounds(2, 196, 359, 75);
		contentPane.add(btnDatosPersonales);
		
		JButton btnReclamos = new JButton("Listar reclamos");
		btnReclamos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			ListarReclamo listarReclamo = new ListarReclamo();
			listarReclamo.setVisible(true);
			dispose();
			
			}
		});
		btnReclamos.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnReclamos.setBounds(2, 279, 359, 75);
		contentPane.add(btnReclamos);
		
		JButton btnListarUsuario = new JButton("Listar usuario\r\n");
		btnListarUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			ListarUsuario listarUsuario = new ListarUsuario();
			listarUsuario.setVisible(true);
			dispose();
			
			}
		});
		btnListarUsuario.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnListarUsuario.setBounds(2, 362, 359, 75);
		contentPane.add(btnListarUsuario);
		
		JButton btnListarITR = new JButton("Listar ITR");
		btnListarITR.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			ListarITR ITR = new ListarITR();
			ITR.setVisible(true);
			dispose();
			
			}
		});
		btnListarITR.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnListarITR.setBounds(2, 445, 359, 75);
		contentPane.add(btnListarITR);
		
		JButton btnInasistencias_1 = new JButton("?");
		btnInasistencias_1.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnInasistencias_1.setBounds(2, 528, 359, 75);
		contentPane.add(btnInasistencias_1);

		
		JButton btnHome = new JButton("");
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
		
		
		JLabel lblPantallaAnalista = new JLabel("New label");
		lblPantallaAnalista.setIcon(new ImageIcon(getClass().getResource("/Analista.png")));
		lblPantallaAnalista.setBounds(0, 0, 1280, 720);
		contentPane.add(lblPantallaAnalista);		
		

		
	
	}

}

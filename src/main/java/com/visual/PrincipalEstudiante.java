package com.visual;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PrincipalEstudiante extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalEstudiante frame = new PrincipalEstudiante();
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
	public PrincipalEstudiante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 0, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDatosPersonales = new JButton("DATOS PERSONALES");
		btnDatosPersonales.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			DatosPersonalesEst datosPersonales = new DatosPersonalesEst();
			datosPersonales.setVisible(true);
			dispose();
				
			}
		});
		btnDatosPersonales.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnDatosPersonales.setBounds(2, 196, 359, 106);
		contentPane.add(btnDatosPersonales);
		
		JButton btnReclamos = new JButton("RECLAMOS");
		btnReclamos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			ReclamosEst reclamos = new ReclamosEst();
			reclamos.setVisible(true);
			dispose();
			
			}
		});
		btnReclamos.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnReclamos.setBounds(2, 310, 359, 106);
		contentPane.add(btnReclamos);
		
		JButton btnInasistencias = new JButton("INASISTENCIAS");
		btnInasistencias.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
			
			InasistenciasEst inasistencias = new InasistenciasEst();
			inasistencias.setVisible(true);
			dispose();
			
			}
		});
		btnInasistencias.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnInasistencias.setBounds(2, 424, 359, 106);
		contentPane.add(btnInasistencias);
		
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/PrincipalEstudiante.png")));
		lblNewLabel.setBounds(0, 0, 1280, 720);
		contentPane.add(lblNewLabel);
	}

}

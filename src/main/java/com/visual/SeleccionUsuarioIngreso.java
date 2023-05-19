package com.visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SeleccionUsuarioIngreso extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeleccionUsuarioIngreso frame = new SeleccionUsuarioIngreso();
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
	public SeleccionUsuarioIngreso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDocente = new JButton("DOCENTE");
		btnDocente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			PrincipalDocente princDocente = new PrincipalDocente();
			princDocente.setVisible(true);
			dispose();
			
			}
		});
		btnDocente.setBounds(65, 212, 253, 65);
		contentPane.add(btnDocente);
		
		JButton btnEstudiante = new JButton("ESTUDIANTE");
		btnEstudiante.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			PrincipalEstudiante princEstudiante = new PrincipalEstudiante();
			princEstudiante.setVisible(true);
			dispose();
			
			}
		});
		btnEstudiante.setBounds(65, 123, 253, 65);
		contentPane.add(btnEstudiante);
		
		JButton btnAnalista = new JButton("ANALISTA");
		btnAnalista.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			PrincipalAnalista ingresoAna = new PrincipalAnalista();
			ingresoAna.setVisible(true);
			dispose();
			
			}
		});
		btnAnalista.setBounds(65, 290, 253, 65);
		contentPane.add(btnAnalista);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/TipoDeUsuario.png")));
		lblNewLabel.setBounds(0, 0, 400, 400);
		contentPane.add(lblNewLabel);
	}
}

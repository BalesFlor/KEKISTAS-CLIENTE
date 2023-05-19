package com.visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SeleccionUsuario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeleccionUsuario frame = new SeleccionUsuario();
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
	public SeleccionUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEstudiante = new JButton("ESTUDIANTE");
		btnEstudiante.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
			RegistroEstudiante registroEst = new RegistroEstudiante();
			registroEst.setVisible(true);
			dispose();
			}
		
		});
		btnEstudiante.setBounds(65, 123, 253, 65);
		contentPane.add(btnEstudiante);
		
		JButton btnDocente = new JButton("DOCENTE");
		btnDocente.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			
			RegistroDocente registroDoc = new RegistroDocente();
			registroDoc.setVisible(true);
			dispose();
			
			}
		});
		btnDocente.setBounds(65, 212, 253, 65);
		contentPane.add(btnDocente);
		
		JButton btnAnalista = new JButton("ANALISTA");
		btnAnalista.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
		
			RegistroAnalista registroAna = new RegistroAnalista();
			registroAna.setVisible(true);
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

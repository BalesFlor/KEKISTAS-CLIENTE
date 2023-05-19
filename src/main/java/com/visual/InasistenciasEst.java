package com.visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class InasistenciasEst extends JFrame {

	private JPanel contentPane;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InasistenciasEst frame = new InasistenciasEst();
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
	public InasistenciasEst() {
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
			
			DatosPersonalesEst datosPersonales = new DatosPersonalesEst();
			datosPersonales.setVisible(true);
			dispose();
			
			}
		});
		btnDatosPersonales.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnDatosPersonales.setBounds(2, 196, 359, 106);
		contentPane.add(btnDatosPersonales);
		
		JButton btnReclamos = new JButton("Reclamos");
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
		
		JButton btnInasistencias = new JButton("Inasistencias");
		btnInasistencias.setFont(new Font("SquareFont", Font.PLAIN, 20));
		btnInasistencias.setBounds(2, 424, 359, 106);
		contentPane.add(btnInasistencias);
		
		JButton btnHome = new JButton("");
		btnHome.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
			
			PrincipalEstudiante home = new PrincipalEstudiante();
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
		
		JLabel lblListadoInasistencias = new JLabel("Listado de inasistencias");
		lblListadoInasistencias.setForeground(SystemColor.activeCaption);
		lblListadoInasistencias.setFont(new Font("SquareFont", Font.PLAIN, 20));
		lblListadoInasistencias.setBounds(440, 228, 271, 25);
		contentPane.add(lblListadoInasistencias);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"dasdas", "Fecha", "Materia?", "Estado"
			}
		));
		table.setBounds(389, 271, 793, 291);
		contentPane.add(table);
		
		JLabel lblPantallaEstudiante = new JLabel("New label");
		lblPantallaEstudiante.setIcon(new ImageIcon(getClass().getResource("/Inasistencia.png")));
		lblPantallaEstudiante.setBounds(0, 0, 1280, 720);
		contentPane.add(lblPantallaEstudiante);	
		
		JList list = new JList();
		list.setBounds(389, 272, 732, 350);
		contentPane.add(list);
	}

}

package com.visual;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 0, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		textField = new JTextField();
		textField.setBounds(551, 141, 181, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(823, 141, 180, 31);
		contentPane.add(passwordField);
		
		JButton btnIngresar = new JButton(">");
		btnIngresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			SeleccionUsuarioIngreso ingresar = new SeleccionUsuarioIngreso();	
			ingresar.setVisible(true);
			dispose();
				
			}
		});
		btnIngresar.setForeground(new Color(0, 0, 0));
		btnIngresar.setBackground(new Color(51, 204, 255));
		btnIngresar.setBounds(1011, 141, 48, 31);
		contentPane.add(btnIngresar);
		
		JButton btnRegistrarse = new JButton("¿No tienes una cuenta? Regístrate");
		btnRegistrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			SeleccionUsuario seleccionarUsuario = new SeleccionUsuario();
			seleccionarUsuario.setVisible(true);
			dispose(); 
			
			}
		});
		btnRegistrarse.setBounds(1011, 657, 241, 18);
		contentPane.add(btnRegistrarse);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/login.png")));
		lblNewLabel.setBounds(0, 0, 1280, 720);
		contentPane.add(lblNewLabel);
		
		
		
		
		
		
	}
}

package VISTA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;

public class Leihoa1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the frame.
	 */
	public Leihoa1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAurrera = new JButton("AURRERA");
		btnAurrera.setBounds(345, 238, 89, 23);
		contentPane.add(btnAurrera);
		
		textField = new JTextField();
		textField.setBounds(164, 46, 215, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setBounds(22, 46, 100, 34);
		contentPane.add(lblUsuario);
		
		JLabel lblPasahitza = new JLabel("PASAHITZA");
		lblPasahitza.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasahitza.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPasahitza.setBounds(22, 122, 100, 34);
		contentPane.add(lblPasahitza);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(164, 124, 215, 34);
		contentPane.add(passwordField);
	}
}

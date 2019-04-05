package VISTA;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import APP.MetodoakVista;

public class Leihoa1 extends JFrame {

	private ActionListener al;
	private JPanel contentPane;
	private JTextField textField = new JTextField();
	private JPasswordField passwordField = new JPasswordField();;
	private JButton btnAurrera = new JButton("AURRERA");
	private JLabel lblUsuario = new JLabel("USUARIO");

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
		
		btnAurrera.setFont(new Font("Tahoma", Font.BOLD, 15));
		al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MetodoakVista.bigarrenera();
				dispose();
			}
		};
		btnAurrera.addActionListener(al);
		btnAurrera.setBounds(345, 238, 89, 23);
		contentPane.add(btnAurrera);
		
		textField.setBounds(164, 46, 215, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setBounds(22, 46, 100, 34);
		contentPane.add(lblUsuario);
		
		JLabel lblPasahitza = new JLabel("PASAHITZA");
		lblPasahitza.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasahitza.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPasahitza.setBounds(22, 122, 100, 34);
		contentPane.add(lblPasahitza);
		
		passwordField.setBounds(164, 124, 215, 34);
		contentPane.add(passwordField);
	}
}

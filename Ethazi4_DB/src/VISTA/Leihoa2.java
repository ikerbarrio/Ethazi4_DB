package VISTA;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Leihoa2 extends JFrame {

	private JPanel contentPane;
	private JTextField textHiria = new JTextField();
	private JTextField textDatua = new JTextField();
	private JLabel lblHiria = new JLabel("HIRIA");
	private JLabel lblHotela = new JLabel("HOTELA");
	private JComboBox comboDatuMota = new JComboBox();
	private ArrayList <String> aukDatuMota = new ArrayList();
	/**
	 * Create the frame.
	 */
	public Leihoa2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblHiria.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHiria.setHorizontalAlignment(SwingConstants.CENTER);
		lblHiria.setBounds(42, 56, 114, 31);
		contentPane.add(lblHiria);
		
		textHiria.setBounds(151, 56, 181, 31);
		contentPane.add(textHiria);
		textHiria.setColumns(10);
		
		lblHotela.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHotela.setHorizontalAlignment(SwingConstants.CENTER);
		lblHotela.setBounds(42, 98, 114, 31);
		contentPane.add(lblHotela);
		
		comboDatuMota.setBounds(42, 136, 118, 31);
		contentPane.add(comboDatuMota);
		for (int n = 0; n < aukDatuMota.size(); n++) {
			comboDatuMota.addItem(aukDatuMota.get(n));
		}
		
		textDatua.setBounds(170, 136, 162, 31);
		contentPane.add(textDatua);
		textDatua.setColumns(10);
	}
}

package se.mah.KD405A.JJ;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 548);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut");
		mnArkiv.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnMedlemmar = new JMenu("Medlemmar");
		menuBar.add(mnMedlemmar);
		
		JMenuItem mntmBliMedlem = new JMenuItem("Bli medlem");
		mnMedlemmar.add(mntmBliMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mnMedlemmar.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hj\u00E4lp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mnHjlp.add(mntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 124, 376);
		contentPane.add(scrollPane);
		
		JTextArea txtrSibbeMatsterFler = new JTextArea();
		txtrSibbeMatsterFler.setText("Sibbe matster\r\nfler namn\r\nKalas kul\r\ngh\r\nujidsad\r\nsd\r\nasdsa\r\ndsa\r\ndsad\r\nas\r\ndas\r\nd\r\nas\r\nd\r\nsa\r\ndas\r\nd\r\nas\r\nd\r\nsa\r\nda\r\nsda\r\n\r\ndas\r\ndas\r\ndas\r\nda\r\nsdas\r\nda\r\nsda\r\nsd\r\n");
		scrollPane.setViewportView(txtrSibbeMatsterFler);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Johannes\\Desktop\\Zachy.jpg"));
		lblNewLabel.setBounds(148, 0, 256, 295);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(417, 86, 56, 16);
		contentPane.add(lblName);
		
		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setBounds(417, 115, 56, 16);
		contentPane.add(lblAdress);
		
		JLabel lblOrt = new JLabel("Personnr:");
		lblOrt.setBounds(417, 144, 56, 16);
		contentPane.add(lblOrt);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(417, 173, 56, 16);
		contentPane.add(lblEmail);
		
		JLabel lblTelefon = new JLabel("Telefon:");
		lblTelefon.setBounds(417, 206, 56, 16);
		contentPane.add(lblTelefon);
		
		textField = new JTextField();
		textField.setBounds(485, 87, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(485, 112, 116, 22);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(485, 141, 116, 22);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(485, 170, 116, 22);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(485, 203, 116, 22);
		contentPane.add(textField_4);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.setBounds(417, 244, 97, 25);
		contentPane.add(btnSpara);
		
		JButton btnLggTillBild = new JButton("L\u00E4gg till bild");
		btnLggTillBild.setBounds(224, 297, 116, 25);
		contentPane.add(btnLggTillBild);
		
		JLabel label = new JLabel("");
		label.setBounds(417, 362, 200, 100);
		contentPane.add(label);
		label.setIcon(new ImageIcon("C:\\Users\\Johannes\\Desktop\\my-fitness-shuffle.png"));
	}
}

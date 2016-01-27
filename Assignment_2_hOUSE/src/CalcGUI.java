import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class CalcGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcGUI frame = new CalcGUI();
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
	public CalcGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Calculator berta = new Calculator();
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(39, 39, 340, 130);
		contentPane.add(textArea);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				berta.numberButtonPressed(1);
				textArea.append("1");
			}
		});
		button.setBounds(39, 202, 97, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("4");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				berta.numberButtonPressed(4);
				textArea.append("4");
			}
		});
		button_1.setBounds(39, 256, 97, 25);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("7");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				berta.numberButtonPressed(7);
				textArea.append("7");
			}
		});
		button_2.setBounds(39, 313, 97, 25);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				berta.numberButtonPressed(3);
				textArea.append("3");
			}
		});
		button_3.setBounds(282, 202, 97, 25);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				berta.numberButtonPressed(6);
				textArea.append("6");
			}
		});
		button_4.setBounds(282, 256, 97, 25);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("9");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				berta.numberButtonPressed(9);
				textArea.append("9");
			}
		});
		button_5.setBounds(282, 313, 97, 25);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("2");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				berta.numberButtonPressed(2);
				textArea.append("2");
			}
		});
		button_6.setBounds(161, 202, 97, 25);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("5");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				berta.numberButtonPressed(5);
				textArea.append("5");
			}
		});
		button_7.setBounds(161, 256, 97, 25);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				berta.numberButtonPressed(8);
				textArea.append("8");
			}
		});
		button_8.setBounds(161, 313, 97, 25);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("+");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				berta.plus();
				textArea.append(" " + "+" + " ");
			}
		});
		button_9.setBounds(39, 371, 97, 25);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				berta.minus();
				textArea.append(" " + "-" + " ");
			}
		});
		button_10.setBounds(161, 371, 97, 25);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("*");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				berta.mult();
				textArea.append(" " + "*" + " ");
			}
		});
		button_11.setBounds(282, 371, 97, 25);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("=");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				berta.equals();
				int i = berta.getResult();
				textArea.setText(String.valueOf(i));
			}
		});
		button_12.setBounds(161, 426, 97, 25);
		contentPane.add(button_12);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				berta.clear();
				textArea.setText("");
			}
		});
		btnClear.setBounds(39, 426, 97, 25);
		contentPane.add(btnClear);
		
	}
}

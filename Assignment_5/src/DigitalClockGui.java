import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class DigitalClockGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel;
	private ClockLogic logic;
	private int hour;
	private int minute;
	private JLabel lblNewLabel_1;
	private JLabel lblAlarm;
	private boolean alarmy;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGui frame = new DigitalClockGui();
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
	public DigitalClockGui() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Johannes\\Documents\\GitHub\\KD405A_Johannes_J\\Assignment_5\\src\\my-fitness-shuffle.png"));
		
		logic = new ClockLogic(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 812, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tekton Pro Cond", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(268, 55, 200, 73);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(12, 255, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 307, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblHour = new JLabel("Hour");
		lblHour.setBounds(140, 258, 56, 16);
		contentPane.add(lblHour);
		
		JLabel lblMin = new JLabel("Min");
		lblMin.setBounds(140, 310, 56, 16);
		contentPane.add(lblMin);
		
		JButton btnSetAlarm = new JButton("Set Alarm");
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hour = Integer.parseInt(textField.getText());
				minute = Integer.parseInt(textField_1.getText());
				if(hour<13 &&minute<61){
				logic.setAlarm(hour, minute);
				lblNewLabel_1.setText(hour + ":" + minute);
				}else{
				 JOptionPane.showMessageDialog(null, "YOU*RE WRONG MoTHERFUCKER");
				}
			}
		});
		btnSetAlarm.setBounds(208, 254, 97, 25);
		contentPane.add(btnSetAlarm);
		
		JButton btnClearAlarm = new JButton("Clear Alarm");
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logic.clearAlarm();
				textField.setText("");
				textField_1.setText("");
				lblNewLabel_1.setText("");
			}
		});
		btnClearAlarm.setBounds(208, 306, 97, 25);
		contentPane.add(btnClearAlarm);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(79, 374, 226, 16);
		contentPane.add(lblNewLabel_1);
		
		lblAlarm = new JLabel("Alarm:");
		lblAlarm.setBounds(11, 374, 56, 16);
		contentPane.add(lblAlarm);
	
	}
	public void setTimeOnLabel(String text){
		lblNewLabel.setText(text);
	}
	public void activateAlarm(boolean alarm){
		alarmy = alarm;
		if(alarmy){
			JOptionPane.showMessageDialog(null, "PArtyyTIME");
		}
	}}

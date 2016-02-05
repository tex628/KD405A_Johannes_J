import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;



public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private int curPrice = 0;
	private int curSize = 0;
	private String curColor = "lol";
	private boolean colorCheck = false;
	public ArrayList<Bike> bikeList = new ArrayList<Bike>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(62, 56, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(62, 106, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(62, 157, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(250, 56, 337, 342);
		contentPane.add(textArea);
		
		JLabel lblSize = new JLabel("Price");
		lblSize.setBounds(12, 59, 56, 16);
		contentPane.add(lblSize);
		
		JLabel lblPrice = new JLabel("Size");
		lblPrice.setBounds(12, 109, 56, 16);
		contentPane.add(lblPrice);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(12, 160, 56, 16);
		contentPane.add(lblColor);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(" ");
				checkDisColor();
				
				if(checkColor(curColor) == true){
				checkDisPrice();
				checkDisSize();
				
				curSize = checkSize(curSize);
				curPrice = checkPrice(curPrice);
				
				bikeList.add(new Bike(curColor,curSize,curPrice));
				
				for(int i = 0 ; i<bikeList.size();i++){
					textArea.append(bikeList.get(i).getColor() + " " + bikeList.get(i).getSize() + " " + bikeList.get(i).getPrice() + "\n");
				}
			}else{
				textArea.setText("Wrong Color" + curColor);
			}
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		
		btnNewButton.setBounds(62, 215, 97, 25);
		contentPane.add(btnNewButton);
	}
	
	/**Kollar om inparametern är en av de accepterade färgerna*/
	public boolean checkColor(String Color){
		 for(int i = 0; i<Constants.colors.length; i++){
			 if(Constants.colors[i].equals(Color)){
			colorCheck = true;
			return colorCheck;
			 }else{
				 colorCheck = false;
			 }
		 }
		 return colorCheck;
		}
	
	/**Kollar om priset är för stort eller litet, ändrar det till ett bättre värde*/
	public int checkPrice(int exPrice){
		if(exPrice<Constants.minPrice){
			exPrice = Constants.minPrice;
			return exPrice;
		}else if(exPrice>Constants.maxPrice){
			exPrice = Constants.maxPrice;
			return exPrice;
		}else{
			return exPrice;
		}
	}
	
	/**Kollar om storleken är för stor eller liten, ändrar den till ett bättre värde*/
	public int checkSize(int exSize){
		if(exSize<Constants.minSize){
			exSize = Constants.minSize;
			return exSize;
		}else if(exSize>Constants.maxSize){
			exSize = Constants.maxSize;
			return exSize;
		}else{
			return exSize;
		}
	}
	
	/**Hämtar texten i field 1*/
	private void checkDisPrice(){
		String text = textField.getText();
		curPrice = Integer.parseInt(text);
	}
	
	/**Hämtar texten i field 2*/
	private void checkDisSize(){
		String text = textField_1.getText();
		curSize = Integer.parseInt(text);
	}
	
	/**Hämtar texten i field 3*/
	private void checkDisColor(){
		curColor = textField_2.getText();
	}	
	}


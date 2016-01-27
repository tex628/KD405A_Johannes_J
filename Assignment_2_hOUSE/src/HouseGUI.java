import java.awt.BorderLayout;
import java.util.Random;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class HouseGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		House House1 = new House(1990,120);
		House House2 = new House(1980,120);
		House House3 = new House(1995,140);
		
		House[] houseArmy = new House[10];
		houseArmy[0] = new House (1901,111);
		houseArmy[1] = new House (1902,112);
		houseArmy[2] = new House (1903,113);
		houseArmy[3] = new House (1904,114);
		houseArmy[4] = new House (1905,115);
		houseArmy[5] = new House (1906,116);
		houseArmy[6] = new House (1907,117);
		houseArmy[7] = new House (1908,118);
		houseArmy[8] = new House (1909,119);
		houseArmy[9] = new House (1910,120);
		
		ArrayList<House> bigArmy;
		bigArmy = new ArrayList<House>();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(75, 36, 246, 159);
		contentPane.add(scrollPane);
		
		
		Random r = new Random();
		int low1 = 10;
		int high1 = 1000;
		int low2 = 1800;
		int high2 = 2015;
		
		JTextArea txtrTestText = new JTextArea();
		scrollPane.setViewportView(txtrTestText);
		txtrTestText.setEditable(false);
		txtrTestText.setText("Upg1.2" + "\n");
		
		txtrTestText.append(String.valueOf(House1.getSize()) + " " + String.valueOf(House1.getYearBuilt()) + "\n");
		txtrTestText.append(String.valueOf(House2.getSize()) + " " + String.valueOf(House2.getYearBuilt()) + "\n");
		txtrTestText.append(String.valueOf(House3.getSize()) + " " + String.valueOf(House3.getYearBuilt()) + "\n");
		
		txtrTestText.append("Upg1.3" + "\n");
		
		for(int i = 0; i<houseArmy.length; i++){
			txtrTestText.append(String.valueOf(houseArmy[i].getSize()) + " " + String.valueOf(houseArmy[i].getYearBuilt()) + "\n");
		};
		
		for(int j = 0; j < 99; j++){
			bigArmy.add(new House(r.nextInt(high2 - low2) + low2, r.nextInt(high1-low1) + low1));
		}
		txtrTestText.append("Upg1.4" + "\n");
		for(int c = 0; c<bigArmy.size(); c++){
			txtrTestText.append(bigArmy.get(c).getSize() + " " + bigArmy.get(c).getYearBuilt() + "\n");
		}
	}
}

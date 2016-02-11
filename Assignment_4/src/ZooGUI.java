import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class ZooGUI extends JFrame {

	private JPanel contentPane;
	Snake snake1;
	Dogs dog1;
	Cats cat1;
	
	public ArrayList<Animal> animalList = new ArrayList<Animal>(); {{
		animalList.add(new Cats("Snax", 1, 1));
		animalList.add(new Snake("SNAKKUS BIGGUS", true));
		animalList.add(new Dogs("Voffi barkus", 1, true));
		animalList.add(new Snake("SLytherin", false));
		animalList.add(new Dogs("DOGE", 63, true));
		animalList.add(new Cats("kissimissi", 19, 12));
		animalList.add(new Cats("mjao", 11, 21));
		animalList.add(new Dogs("Brush", 45, true));
		animalList.add(new Dogs("LABMATE", 34, false));
		animalList.add(new Snake("BIteY", true));
		animalList.add(new Cats("MISSE", 11, 22));
		animalList.add(new Snake("VENOM", false));
		animalList.add(new Cats("SMULAN", 21, 10));
		
	}};
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZooGUI frame = new ZooGUI();
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
	public ZooGUI() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 38, 420, 366);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		for(int i = 0; i<animalList.size();i++){
			textArea.append(animalList.get(i).getInfo() + "\n");
		}
	}

}

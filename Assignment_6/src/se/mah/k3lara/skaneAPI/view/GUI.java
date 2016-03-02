package se.mah.k3lara.skaneAPI.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	JTextArea textArea = new JTextArea();

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
	ArrayList<Station> searchStations = new ArrayList<Station>();
	private JTextField textField_1;
	private JTextField textField_2;
	/**
	 * Create the frame.
	 */
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(96, 199, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSk = new JButton("S\u00F6k");
		btnSk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				textArea.setText("Searching");
				new thread().start();
			}
		});
		btnSk.setBounds(242, 198, 97, 25);
		contentPane.add(btnSk);
		
		textField_1 = new JTextField();
		textField_1.setBounds(427, 199, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(597, 199, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSkResa = new JButton("S\u00F6k resa");
		btnSkResa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Searching");
				new thread1().start();
			}
		});
		btnSkResa.setBounds(597, 256, 97, 25);
		contentPane.add(btnSkResa);
		
		JLabel lblSkStation = new JLabel("S\u00F6k station");
		lblSkStation.setBounds(98, 159, 114, 16);
		contentPane.add(lblSkStation);
		
		JLabel lblFrn = new JLabel("Fr\u00E5n");
		lblFrn.setBounds(427, 159, 56, 16);
		contentPane.add(lblFrn);
		
		JLabel lblTill = new JLabel("Till");
		lblTill.setBounds(597, 159, 56, 16);
		contentPane.add(lblTill);
		textArea.setBounds(96, 256, 459, 159);
		contentPane.add(textArea);
	}
	
	private class thread extends Thread{
		public void run(){
			searchStations.addAll(Parser.getStationsFromURL(textField.getText()));
			textArea.setText("");
			for (Station s: searchStations){
				if(s.getStationName().contains(textField.getText())){
					textArea.append(s.getStationName() + " " + s.getLatitude() +" " + s.getLongitude() + " " + s.getStationNbr() + "\n");
				}
			}
		}
	}
	private class thread1 extends Thread{
		public void run(){
			String searchURL = Constants.getURL(textField_1.getText(),textField_2.getText(),1);
			
			Journeys journeys = Parser.getJourneys(searchURL);
			textArea.setText("");
			for (Journey journey : journeys.getJourneys()) {
				textArea.append(journey.getStartStation()+" - ");
				textArea.append(journey.getEndStation().getStationName());
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.getDepDateTime().get(Calendar.MINUTE);
				textArea.append(" Departs " + time +" that is in "+journey.getTimeToDeparture()+ " minutes. And it is "+journey.getDepTimeDeviation()+" min late");
			} 
		}
	}
	
}

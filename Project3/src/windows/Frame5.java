package windows;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Dimension;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;


public class Frame5 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	double distance;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame5 frame = new Frame5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 * Create the frame.
	 */
	public Frame5(Customer c, RideBookerApp instance) {
		setBackground(SystemColor.controlDkShadow);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		
		class distMap{
			String source;
			String dest;
			double dist;
			//int count = 0;
			
			distMap(String s, String d, double dst){
				source = s;
				dest = d;
				dist = dst;
			}

		}
		
		List <distMap> distM = new ArrayList<distMap>();
		distM.add(new distMap("HUBLI","DHARWAD",70.0));
		distM.add(new distMap("HUBLI","GADAG",200));
		distM.add(new distMap("BIJAPUR","HUBLI",1000));
		distM.add(new distMap("DHARWAD","GADAG",55.0));
		distM.add(new distMap("DHARWAD","BIJAPUR",70.0));
		distM.add(new distMap("GADAG","BIJAPUR",120.0));
		
		
		
		setTitle("BOOK RIDE ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 984, 639);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlDkShadow);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(1400, 14000) );
		pack();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("Account Details ");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_4.setBounds(643, 592, 149, 42);
		btnNewButton_4.setForeground(SystemColor.textHighlightText);
		btnNewButton_4.setBackground(new Color(204, 51, 153));
		contentPane.add(btnNewButton_4);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(356, 137, 722, 413);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.scrollbar);
		tabbedPane.addTab("BOOK RIDE", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Ride Details ");
		lblNewLabel_1.setForeground(SystemColor.textText);
		lblNewLabel_1.setBounds(310, 10, 104, 13);
		panel_1.add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"HUBLI", "DHARWAD", "BIJAPUR", "GADAG"}));
		comboBox_1.setBounds(226, 64, 82, 21);
		panel_1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"HUBLI", "DHARWAD", "BIJAPUR", "GADAG"}));
		comboBox_2.setBounds(368, 64, 74, 21);
		panel_1.add(comboBox_2);
		
		JLabel lblNewLabel_7 = new JLabel("SOURCE ");
		lblNewLabel_7.setForeground(SystemColor.textText);
		lblNewLabel_7.setBounds(241, 46, 45, 13);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("DESTINATION ");
		lblNewLabel_8.setForeground(SystemColor.textText);
		lblNewLabel_8.setBounds(368, 46, 74, 13);
		panel_1.add(lblNewLabel_8);
		
		
		textField = new JTextField();
		textField.setBackground(SystemColor.control);
		textField.setBounds(38, 222, 96, 29);
		panel_1.add(textField);
		textField.setColumns(10);
		
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Mini", "SUV", "Sedan"}));
		comboBox_1_1.setBounds(270, 117, 82, 21);
		panel_1.add(comboBox_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("DISTANCE");
		lblNewLabel_2.setForeground(SystemColor.textText);
		lblNewLabel_2.setBounds(55, 198, 68, 13);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Select ");
		lblNewLabel_3.setForeground(SystemColor.textText);
		lblNewLabel_3.setBounds(199, 121, 45, 13);
		panel_1.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.control);
		textField_1.setBounds(175, 222, 132, 29);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("DRIVER ALLOTED ");
		lblNewLabel_4.setForeground(SystemColor.textText);
		lblNewLabel_4.setBounds(198, 196, 109, 13);
		panel_1.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.control);
		textField_2.setBounds(356, 224, 125, 24);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.control);
		textField_3.setBounds(527, 224, 132, 24);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("VEHICLE ID ");
		lblNewLabel_5.setForeground(SystemColor.textText);
		lblNewLabel_5.setBounds(385, 196, 96, 13);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("ESTIMATED FARE ");
		lblNewLabel_6.setForeground(SystemColor.textText);
		lblNewLabel_6.setBounds(533, 196, 98, 13);
		panel_1.add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("CONFIRM BOOKING ");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
				String s1 = comboBox_1.getSelectedItem().toString();
				String s2 = comboBox_2.getSelectedItem().toString();
				String s3 = comboBox_1_1.getSelectedItem().toString();
				
				if(c.status == true) {
					throw new CException(1,"Already Have a ride booked");
				}
				
				int type;
				int flag = 0;
				if(s3.equals("Mini"))
					type = 1;
				else if(s3.equals("SUV"))
					type = 2;
				else
					type = 3;
				
				
				
				if(s1==s2) {
					throw new CException(3,"Cannot ride to same destination ");
				}
				else {
					for(distMap dm: distM) {
						if(dm.source.equals(s2) && dm.dest.equals(s1) || dm.source.equals(s1) && dm.dest.equals(s2)) {
							int dIdx = instance.freeDrv(type);
							if(dIdx==-1) {
								throw new CException(2,"No driver available");
							}
							
							distance = dm.dist;
							flag = 1;
							
							Driver dr = instance.driveList.get(dIdx);
							double fare  = dr.getCost()*distance;
							
							double fare2;
							if(fare>=5000) {
								JOptionPane.showMessageDialog(null, "Discount Availed");
								fare2 = fare - fare*0.1;
								textField_6.setText(Double.toString(fare2));
							}
							else {
								textField_6.setText("Not Eligible");
								fare2 = fare; 
							}
							
							if(c.getM()<fare) {
								throw new CException(5,"Low Balance");
							}
							
							textField.setText(Double.toString(distance));
							textField_3.setText(Double.toString(fare));
							textField_1.setText(dr.getName());
							textField_2.setText(dr.getVhId());
							instance.confirmRide(c, dr, s1, s2, fare2, distance);
							JOptionPane.showMessageDialog(null, "Succesfully booked Ride"+String.valueOf(dr.getDId()));
							}
						}
					}
				
				
				if(flag==0) {
					throw new CException(4,"System Error Couldn't Book");	
				}
				else {
					//JOptionPane.showMessageDialog(null, "Succesfully booked Ride"+String.valueOf(dr.getDId()));
				}
			}
			catch(CException c) {
				JOptionPane.showMessageDialog(null, "Error No: "+String.valueOf(c.err) + " "+c.error);
			}
		}
			
		});
		btnNewButton_1.setBackground(new Color(153, 51, 153));
		btnNewButton_1.setForeground(SystemColor.textHighlightText);
		btnNewButton_1.setBounds(261, 307, 163, 21);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ESTIMATE");
		btnNewButton_2.setBackground(new Color(255, 51, 153));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = comboBox_1.getSelectedItem().toString();
				String s2 = comboBox_2.getSelectedItem().toString();
				String s3 = comboBox_1_1.getSelectedItem().toString();
				
				int type;
				
				int flag = 0;
				if(s3.equals("Mini"))
					type = 1;
				else if(s3.equals("SUV"))
					type = 2;
				else
					type = 3;
				
				
				if(s1==s2) {
					JOptionPane.showMessageDialog(null, "Cannot ride to same destination ");
				}
				else {
					for(distMap dm: distM) {
						if(dm.source.equals(s2) && dm.dest.equals(s1) || dm.source.equals(s1) && dm.dest.equals(s2)) {
							distance = dm.dist;
							int dIdx = instance.freeDrv(type);
							flag = 1;
							
							if(dIdx==-1) {
								JOptionPane.showMessageDialog(null, "No driver available");
							}
							else {
								Driver dr = instance.driveList.get(dIdx);
								double fare  = dr.getCost()*distance;
								double fare2;
								if(fare>=5000) {
									JOptionPane.showMessageDialog(null, "Discount Available");
									fare2 = fare - fare*0.1;
									textField_6.setText(Double.toString(fare2));
								}
								else {
									textField_6.setText("Not Eligible");
								}
								
								textField.setText(Double.toString(distance));
								textField_3.setText(Double.toString(fare));
								textField_1.setText(dr.getName());
								textField_2.setText(dr.getVhId());
								
							}
						}
					}
				}
				
				if(flag==0) {
					JOptionPane.showMessageDialog(null, "Couldn't Book");
				}
			}
		});
		btnNewButton_2.setForeground(SystemColor.textHighlightText);
		btnNewButton_2.setBounds(261, 162, 163, 21);
		panel_1.add(btnNewButton_2);
		
		textField_6 = new JTextField();
		textField_6.setBackground(SystemColor.control);
		textField_6.setBounds(527, 280, 132, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_6_1 = new JLabel("DISCOUNTED FARE ");
		lblNewLabel_6_1.setForeground(Color.BLACK);
		lblNewLabel_6_1.setBounds(527, 259, 98, 13);
		panel_1.add(lblNewLabel_6_1);


		
		JPanel panel = new JPanel();
		tabbedPane.addTab("PREVIOUS RIDE ", null, panel, null);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(65, 96, 537, 204);
		panel.add(textArea);
		
		JLabel lblNewLabel = new JLabel("Details of Ride ");
		lblNewLabel.setBounds(65, 75, 143, 13);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_5 = new JButton("Display Details");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int rId = Integer.parseInt(textField_4.getText());
				int idx = c.rideFinder(rId);
				
				System.out.println("Rid: "+rId+"\tIndex: "+idx);
				
				if(idx==-1) {
					JOptionPane.showMessageDialog(null, "Ride Not Found");
				}
				
				else {
					RideLog r = c.logList.get(rId);
					textArea.setText(r.toString());
					textArea.setLineWrap(true);

				}
			}
		});
		btnNewButton_5.setBounds(295, 42, 123, 23);
		panel.add(btnNewButton_5);
		
		JLabel lblNewLabel_9 = new JLabel("Enter Ride ID");
		lblNewLabel_9.setBounds(65, 42, 79, 14);
		panel.add(lblNewLabel_9);
		
		textField_4 = new JTextField();
		textField_4.setBounds(171, 39, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("CANCEL RIDE", null, panel_2, null);
		panel_2.setLayout(null);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(90, 76, 522, 197);
		try{
			if(c.current()==0) {
				textArea_1.setText(c.currentS());
				textArea_1.setLineWrap(true);
			}
			else {
				textArea_1.setText("No Active Rides Found");
				textArea_1.setLineWrap(true);
			}
		}
		catch(Exception E) {
			textArea_1.setText("No Active Rides Found");
			textArea_1.setLineWrap(true);
		}
		panel_2.add(textArea_1);
		
		JButton btnNewButton_6 = new JButton("Cancel Ride");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				RideLog last = c.currentLog();
				int dId = last.driverId;
				
				int idx = instance.findDrv(dId);
				Driver drv = instance.driveList.get(idx);
				
				instance.rideStatus(-1, last.uniId, c, drv);
				JOptionPane.showMessageDialog(null,"Ride Cancelled");
				}
				catch(Exception err) {
					JOptionPane.showMessageDialog(null,"No Current Ride");
				}
			}
		});
		btnNewButton_6.setBounds(288, 284, 100, 23);
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_6_1 = new JButton("Complete Ride");
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				RideLog last = c.currentLog();
				int dId = last.driverId;
				
				int idx = instance.findDrv(dId);
				Driver drv = instance.driveList.get(idx);
				
				instance.rideStatus(1, last.uniId, c, drv);
				JOptionPane.showMessageDialog(null,"Ride Completed");
				}
				catch(Exception err) {
					JOptionPane.showMessageDialog(null,"No Current Ride");
				}
			}
		});
		btnNewButton_6_1.setBounds(484, 284, 128, 23);
		panel_2.add(btnNewButton_6_1);
		
		JLabel lblNewLabel_10 = new JLabel("Current Ride");
		lblNewLabel_10.setBounds(90, 50, 89, 14);
		panel_2.add(lblNewLabel_10);
		
		JButton btnNewButton_7 = new JButton("Refresh");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if(c.current()==0) {
						textArea_1.setText(c.currentS());
						textArea_1.setLineWrap(true);
					}
					else {
						textArea_1.setText("No Active Rides Found");
						textArea_1.setLineWrap(true);
					}
				}
				catch(Exception E) {
					textArea_1.setText("No Active Rides Found");
					textArea_1.setLineWrap(true);
				}
			}
		});
		btnNewButton_7.setBounds(90, 284, 89, 23);
		panel_2.add(btnNewButton_7);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("ADD MONEY", null, panel_3, null);
		panel_3.setLayout(null);
		
		textField_5 = new JTextField();
		textField_5.setBounds(172, 43, 86, 20);
		panel_3.add(textField_5);
		textField_5.setColumns(10);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(76, 91, 504, 258);
		panel_3.add(textArea_2);
		
		JButton btnNewButton_3 = new JButton("Add Money");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double mn = Double.parseDouble(textField_5.getText());
				if(mn<=0) {
					JOptionPane.showMessageDialog(null, "Invalid Input Money");
				}
				c.addM(mn);
				JOptionPane.showMessageDialog(null, "Succesfully Added");
				textArea_2.setText("Updated Details:\n"+c.toString());
				textArea_2.setLineWrap(true);
			}
		});
		btnNewButton_3.setBounds(302, 42, 105, 23);
		panel_3.add(btnNewButton_3);
		
		JLabel lblNewLabel_11 = new JLabel("Enter Money");
		lblNewLabel_11.setBounds(76, 46, 86, 14);
		panel_3.add(lblNewLabel_11);
		

		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(970, 46, 85, 21);
		btnNewButton.setForeground(SystemColor.textHighlightText);
		btnNewButton.setBackground(new Color(204, 51, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnNewButton);
		
		ButtonGroup group = new ButtonGroup();
		

	}
}

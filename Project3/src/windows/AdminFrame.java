package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Frame;

public class AdminFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminFrame frame = new AdminFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 * Create the frame.
	 */
	public AdminFrame(RideBookerApp instance) {
		class distMap2{
			String source;
			String dest;
			double dist;
			int count = 0;
			
			distMap2(String s, String d, double dst){
				source = s;
				dest = d;
				dist = dst;
			}
			
			public String toString() {
				return "\nSource: "+ source+ "\nDestination: "+dest+"\nDistance: "+dist+"\nVisted Num: "+ String.valueOf(count);
			}
			

		}
		
		
		
		
		
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setBackground(SystemColor.controlDkShadow);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1400, 1400, 1400, 1400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlDkShadow);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(258, 59, 966, 705);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		tabbedPane.addTab("Customers", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Customer ID");
		lblNewLabel.setBounds(53, 42, 94, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.control);
		textField.setBounds(167, 39, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.menu);
		textArea.setBounds(53, 142, 852, 503);
		panel.add(textArea);
		
		JButton btnNewButton = new JButton("Display Details");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(204, 51, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cId = Integer.parseInt(textField.getText());
				int flag = 0;
				for(Customer c: instance.custList) {
					if(c.getCId()==cId) {
						textArea.append(c.toString());
						textArea.setLineWrap(true);
						flag = 1;
						JOptionPane.showMessageDialog(null, "Account Found");
					}
				}
				
				if(flag==0)
					JOptionPane.showMessageDialog(null, "Account not Found");
			}
		});
		btnNewButton.setBounds(53, 92, 133, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Display All Customers");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(204, 51, 153));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Customer c: instance.custList) {
						textArea.append(c.toString());
						textArea.setLineWrap(true);
						
					}
				}
		});
		btnNewButton_2.setBounds(261, 92, 175, 23);
		panel.add(btnNewButton_2);

		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Drivers", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblEnterDriverId = new JLabel("Enter Driver ID");
		lblEnterDriverId.setBounds(53, 45, 94, 14);
		panel_1.add(lblEnterDriverId);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(167, 42, 86, 20);
		panel_1.add(textField_1);
		
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(53, 145, 852, 503);
		panel_1.add(textArea_1);
		
		JButton btnNewButton_3 = new JButton("Display Details");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dId = Integer.parseInt(textField_1.getText());
				int flag = 0;
				for(Driver dr: instance.driveList) {
					if(dr.getDId()==dId) {
						textArea_1.setText(dr.toString());
						textArea_1.setLineWrap(true);
						flag = 1;
						JOptionPane.showMessageDialog(null, "Account Found");
					}
				}
				
				if(flag==0)
					JOptionPane.showMessageDialog(null, "Account not Found");
			}
		});
		btnNewButton_3.setBounds(53, 95, 133, 23);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_2_1 = new JButton("Display All Drivers");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Driver c: instance.driveList) {
					textArea_1.append(c.toString());
					textArea_1.setLineWrap(true);
					
				}
			}
		});
		btnNewButton_2_1.setBounds(264, 95, 154, 23);
		panel_1.add(btnNewButton_2_1);

		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("RideLog", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblEnterRideId = new JLabel("Enter Ride ID");
		lblEnterRideId.setBounds(51, 63, 94, 14);
		panel_2.add(lblEnterRideId);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(165, 60, 86, 20);
		panel_2.add(textField_2);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setBounds(51, 163, 852, 503);
		panel_2.add(textArea_1_1);
		
		JButton btnNewButton_3_1 = new JButton("Display Details");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rId = Integer.parseInt(textField_2.getText());
				int idx = instance.rideFinder(rId);
				
				
				if(idx==-1) {
					JOptionPane.showMessageDialog(null, "Ride Not Found");
				}
				
				else {
					RideLog r = instance.logList.get(rId);
					textArea_1_1.setText(r.toString());
					textArea_1_1.setLineWrap(true);

				}
			}
		});
		btnNewButton_3_1.setBackground(new Color(204, 51, 153));
		btnNewButton_3_1.setForeground(SystemColor.textHighlightText);
		btnNewButton_3_1.setBounds(51, 113, 133, 23);
		panel_2.add(btnNewButton_3_1);
		
		JButton btnNewButton_4 = new JButton("Display Most Visited");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List <distMap2> distM = new ArrayList<distMap2>();
				distM.add(new distMap2("HUBLI","DHARWAD",70.0));
				distM.add(new distMap2("HUBLI","GADAG",200));
				distM.add(new distMap2("HUBLI","BIJAPUR",1000));
				distM.add(new distMap2("DHARWAD","GADAG",55.0));
				distM.add(new distMap2("DHARWAD","BIJAPUR",70.0));
				distM.add(new distMap2("GADAG","BIJAPUR",120.0));
				
				for(RideLog L: instance.logList) {
					for(distMap2 d: distM) {
						if(L.source.equals(d.source) && L.destn.equals(d.dest) || L.source.equals(d.dest) && L.destn.equals(d.source)) {
							d.count+=1;
						}
					}
				}
				
				int max =0;
				distMap2 most = distM.get(0);
				for(distMap2 d: distM ) {
					if(d.count>max) {
						most = d;
						max = d.count;
					}
				}
				
				textArea_1_1.setText("Most visited Source and Destination are: \n");
				textArea_1_1.append(most.toString());
				
				
			}
		});
		btnNewButton_4.setBackground(new Color(204, 51, 153));
		btnNewButton_4.setForeground(SystemColor.textHighlightText);
		btnNewButton_4.setBounds(269, 113, 162, 23);
		panel_2.add(btnNewButton_4);
		

		
		JButton btnNewButton_1 = new JButton("Return");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(1114, 47, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
	}
}

package windows;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Dimension;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import guipack.user;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;



public class Frame4 extends JFrame {

	Driver[] drivers = new Driver[50];
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	static int count=0;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame4 frame = new Frame4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 * Create the frame.
	 */
	public Frame4(RideBookerApp instance) {
		setTitle("DRIVER SIGNUP");
		setBackground(SystemColor.controlDkShadow);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 935, 671);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlDkShadow);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(1400, 1400) );
		pack();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(517, 158, 190, 30);
		textField.setBackground(SystemColor.control);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(517, 198, 190, 30);
		textField_1.setBackground(SystemColor.control);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(517, 238, 190, 30);
		textField_2.setBackground(SystemColor.control);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(517, 288, 190, 30);
		textField_3.setBackground(SystemColor.control);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(616, 339, 76, 24);
		textField_4.setBackground(SystemColor.control);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(517, 405, 190, 19);
		textField_5.setBackground(SystemColor.control);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(517, 442, 190, 19);
		textField_6.setBackground(SystemColor.control);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(828, 158, 392, 303);
		textArea.setBackground(SystemColor.control);
		contentPane.add(textArea);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(517, 373, 65, 21);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mini", "SUV", "Sedan"}));
		contentPane.add(comboBox);
		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(517, 341, 41, 21);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"KA", "MH", "GA", "TN", "AD"}));
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(565, 341, 41, 21);
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
		contentPane.add(comboBox_1_1);
		
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setBounds(521, 510, 85, 21);
		btnNewButton.setForeground(SystemColor.textHighlightText);
		btnNewButton.setBackground(new Color(204, 51, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String str1 = textField.getText();
				String str2 = textField_1.getText();
				String str3 = textField_2.getText();
				String str4 = textField_3.getText();
				String str5 = textField_4.getText();
				String str6 = comboBox.getSelectedItem().toString();
				String str7 = textField_5.getText();
				String str8 = textField_6.getText();

				boolean result=str1.matches("[a-zA-Z]*$");
				if(result==false) {
					//JOptionPane.showMessageDialog(null, "please enter the valid name ");
					throw new CException(1,"please enter the valid name ");
				}
				
				boolean result1=str4.matches("\\d{10}");
				if(result1==false) {
					
					throw new CException(2,"please enter the valid number");
				}
				boolean result2= str2.isEmpty();{
					if(result2==true) {
						throw new CException(3,"please enter the user name ");
						
					}
				}
				boolean result3= str3.isEmpty();{
					if(result3==true) {
						throw new CException(4,"please enter the email address");
						
					}
				}
				
				
				boolean result10=str5.matches("\\d{4}");
				if(result10==false) {
					
					throw new CException(5,"Enter Valid Vehicle Id Length: 4");
				}
				
				boolean result5= str7.isEmpty();{
					if(result5==true) {
						throw new CException(6,"please enter your passward!!");
						
					}
				}
				boolean result6= str8.isEmpty();{
					if(result6==true) {
						throw new CException(6,"please enter your confirm passward!!");
						
					}
				}
				
				

				
				if(!str7.equals(str8)) {
					throw new CException(7,"Wrong Password");
				}
				
				else {
					String vid = comboBox_1.getSelectedItem().toString() + comboBox_1_1.getSelectedItem().toString() + str5;
					int type;
					
					if(str6=="Mini")
						type = 1;
					else if(str6=="SUV")
						type = 2;
					else
						type = 3;
					
					boolean out = instance.driveRegister(str1, str2, str3, str4, vid,type, str7);
					
					if(out==false) {
						throw new CException(4,"Username Exists");
					}
					
					else {
						JOptionPane.showMessageDialog(null, "Account created" + ":" + str1);
						Driver d = instance.lastDriver();
						textArea.append(d.toString());
						textArea.setLineWrap(true);
				}
				}}
				catch(CException c) {
					JOptionPane.showMessageDialog(null, "Error No: "+String.valueOf(c.err) + " "+c.error);
				}
				
				
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("ENTER FULLNAME ");
		lblNewLabel.setBounds(391, 166, 124, 13);
		lblNewLabel.setForeground(SystemColor.textHighlightText);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER USERNAME ");
		lblNewLabel_1.setBounds(391, 206, 124, 13);
		lblNewLabel_1.setForeground(SystemColor.textHighlightText);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER EMAIL ");
		lblNewLabel_2.setBounds(391, 241, 124, 22);
		lblNewLabel_2.setForeground(SystemColor.textHighlightText);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ENTER PH NUMBER ");
		lblNewLabel_3.setBounds(391, 296, 124, 13);
		lblNewLabel_3.setForeground(SystemColor.textHighlightText);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("VEHICLE ID");
		lblNewLabel_4.setBounds(391, 345, 124, 13);
		lblNewLabel_4.setForeground(SystemColor.textHighlightText);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("VEHICLE TYPE ");
		lblNewLabel_5.setBounds(391, 378, 124, 13);
		lblNewLabel_5.setForeground(SystemColor.textHighlightText);
		contentPane.add(lblNewLabel_5);
		

		
		JLabel lblNewLabel_6 = new JLabel("Enter Password ");
		lblNewLabel_6.setBounds(391, 408, 124, 13);
		lblNewLabel_6.setForeground(SystemColor.textHighlightText);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Confirm Password");
		lblNewLabel_7.setBounds(391, 445, 124, 13);
		lblNewLabel_7.setForeground(SystemColor.textHighlightText);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(831, 510, 85, 21);
		btnNewButton_1.setForeground(SystemColor.textHighlightText);
		btnNewButton_1.setBackground(new Color(204, 51, 153));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_8 = new JLabel("Driver Sign-Up");
		lblNewLabel_8.setForeground(SystemColor.control);
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(677, 68, 226, 52);
		contentPane.add(lblNewLabel_8);


	}
}

package windows;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//import guipack.user;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Font;


public class Frame3 extends JFrame {

	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	static int count = 0;
	private JButton btnNewButton_1;

	
	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3 frame = new Frame3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 * Create the frame.
	 */
	public Frame3(RideBookerApp instance) {
		setBackground(SystemColor.controlDkShadow);
		setTitle("CUSTOMER SIGNUP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1015, 639);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.textHighlightText);
		contentPane.setBackground(SystemColor.controlDkShadow);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(1400, 1400) );
		pack();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.control);
		textField.setBounds(451, 118, 249, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter FullName ");
		lblNewLabel.setForeground(SystemColor.textHighlightText);
		lblNewLabel.setBackground(SystemColor.control);
		lblNewLabel.setBounds(329, 121, 112, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter UserName ");
		lblNewLabel_1.setForeground(SystemColor.textHighlightText);
		lblNewLabel_1.setBounds(329, 178, 112, 13);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.control);
		textField_1.setBounds(451, 172, 249, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.control);
		textField_2.setBounds(451, 222, 249, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Email ");
		lblNewLabel_2.setForeground(SystemColor.textHighlightText);
		lblNewLabel_2.setBounds(329, 228, 112, 13);
		contentPane.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.control);
		textField_3.setBounds(451, 300, 249, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Ph Number  ");
		lblNewLabel_3.setForeground(SystemColor.textHighlightText);
		lblNewLabel_3.setBounds(329, 305, 114, 16);
		contentPane.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setBackground(SystemColor.control);
		textField_4.setBounds(451, 373, 249, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Enter Password ");
		lblNewLabel_4.setForeground(SystemColor.textHighlightText);
		lblNewLabel_4.setBounds(329, 383, 112, 13);
		contentPane.add(lblNewLabel_4);
		
		textField_5 = new JTextField();
		textField_5.setBackground(SystemColor.control);
		textField_5.setBounds(449, 423, 249, 26);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Confirm Password ");
		lblNewLabel_5.setForeground(SystemColor.textHighlightText);
		lblNewLabel_5.setBounds(329, 436, 112, 13);
		contentPane.add(lblNewLabel_5);
		final JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.control);
		textArea.setBounds(779, 137, 425, 297);
		contentPane.add(textArea);
		
		
		JButton btnNewButton = new JButton("Sign-Up");
		btnNewButton.setForeground(SystemColor.textHighlightText);
		btnNewButton.setBackground(new Color(204, 51, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				String str = textField.getText();
				String str2 = textField_1.getText();
				String str3 = textField_2.getText();
				String str4 = textField_3.getText();
				String str5 = textField_4.getText();
				String str6 = textField_5.getText();
				
				
				boolean result=str.matches("[a-zA-Z]*$");
				if(result==false) {
					//JOptionPane.showMessageDialog(null, "please enter the valid name ");
					throw new CException(1,"please enter the valid name ");
				}
				
				boolean result2= str2.isEmpty();{
					if(result2==true) {
						throw new CException(2,"please enter the user name ");
						
					}
				}
				
				boolean result4= str3.isEmpty();{
					if(result4==true) {
						throw new CException(3,"please enter the emailId ");
						
					}
				}
				
				boolean result7= str5.isEmpty();{
					if(result7==true) {
						throw new CException(4,"please enter the passward ");
						
					}
				}
				
				boolean result9= str6.isEmpty();{
					if(result9==true) {
						throw new CException(5,"please enter the confirm passward ");
						
					}
				}
				
				
				
				
				
				
				boolean result1=str4.matches("\\d{10}");
				if(result1==false) {
					
					throw new CException(6,"please enter the valid number");
				}
				
				if(!str5.equals(str6)) {
					throw new CException(7,"Wrong Password");
					//JOptionPane.showMessageDialog(null, "Account not Created" + ":" + str);
				}
				
				else {
					boolean out = instance.custRegister(str, str2, str3, str4, str5);
					
					if(out==false) {
						throw new CException(8,"Username Exists");
					}
					
					else {
						JOptionPane.showMessageDialog(null, "Account created" + ":" + str);
						Customer c = instance.lastCust();
						textArea.append(c.toString());
						textArea.setLineWrap(true);
				}
			}}
				catch(CException c) {
					JOptionPane.showMessageDialog(null, "Error No: "+String.valueOf(c.err) + " "+c.error);
				}
				

			}
		});
		btnNewButton.setBounds(599, 498, 85, 21);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setForeground(SystemColor.textHighlightText);
		btnNewButton_1.setBackground(new Color(204, 51, 153));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(443, 498, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("Customer Sign-Up");
		lblNewLabel_6.setForeground(SystemColor.control);
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(614, 70, 238, 38);
		contentPane.add(lblNewLabel_6);
		
		

	}

}

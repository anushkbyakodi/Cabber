package windows;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.*;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Frame2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 frame = new Frame2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 * Create the frame.
	 */
	public Frame2(RideBookerApp instance, int type) {
		setBackground(SystemColor.controlDkShadow);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 981, 715);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		contentPane.setForeground(UIManager.getColor("Button.light"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(800,600) );
		pack();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENTER LOGIN DETAILS ");
		lblNewLabel.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel.setBounds(341, 78, 143, 23);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setCaretColor(new Color(102, 255, 204));
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(364, 127, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER USERNAME ");
		lblNewLabel_1.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_1.setBounds(203, 130, 122, 13);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setBounds(364, 176, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER PASSWORD ");
		lblNewLabel_2.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_2.setBounds(203, 182, 104, 13);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("LOGIN ");
		btnNewButton.setForeground(SystemColor.textHighlightText);
		btnNewButton.setBackground(new Color(204, 51, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String pass = textField_1.getText();
				int flag = 0;
				if(type == 1) {
					for(Customer c: instance.custList) {
						if(c.getUN().equals(name) && c.getPS().equals(pass)) {
							JOptionPane.showMessageDialog(null, "Logged In Succesfully" + ": " + name);
							flag = 1;
							Frame6 obj = new Frame6(c,instance);
							obj.setVisible(true);
						}
					}
					if(flag==0) {
						JOptionPane.showMessageDialog(null, "Account Not found");
					}}
				else {
					for(Driver d: instance.driveList) {
						if(d.getUN().equals(name) && d.getPS().equals(pass)) {
							JOptionPane.showMessageDialog(null, "Logged In Succesfully" + ": " + name);
							flag = 1;
							Frame7 obj = new Frame7(d,instance);
							obj.setVisible(true);
						}
					}
					if(flag==0) {
						JOptionPane.showMessageDialog(null, "Account Not found");
					}
				}
			}
		});
		btnNewButton.setBounds(364, 239, 96, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Not yet signed-Up ?");
		lblNewLabel_3.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_3.setBounds(425, 406, 116, 23);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Sign Up");
		btnNewButton_1.setForeground(SystemColor.textHighlightText);
		btnNewButton_1.setBackground(new Color(204, 51, 153));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(568, 407, 85, 21);
		contentPane.add(btnNewButton_1);;
	}
}

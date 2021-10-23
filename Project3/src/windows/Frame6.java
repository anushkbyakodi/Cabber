package windows;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Frame;

public class Frame6 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame6 frame = new Frame6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 * Create the frame.
	 */
	public Frame6(Customer c, RideBookerApp instance) {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setBackground(SystemColor.controlDkShadow);
		setTitle("c_ACCOUNT DETAILS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 536);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlDkShadow);
		contentPane.setPreferredSize(new Dimension(1400, 1400) );
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(440, 84, 382, 192);
		contentPane.add(textArea);
		textArea.append(c.toString());
		textArea.setLineWrap(true);
		
		JButton btnNewButton = new JButton("BOOK RIDE");
		btnNewButton.setForeground(SystemColor.textHighlightText);
		btnNewButton.setBackground(new Color(204, 51, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame5 obj = new Frame5(c,instance);
				obj.setVisible(true);
			}
		});
		btnNewButton.setBounds(565, 300, 112, 21);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("User Details");
		lblNewLabel.setForeground(SystemColor.control);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(302, 56, 148, 14);
		contentPane.add(lblNewLabel);
		
		btnNewButton_1 = new JButton("LOG OUT");
		btnNewButton_1.setForeground(SystemColor.textHighlightText);
		btnNewButton_1.setBackground(new Color(204, 51, 153));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(733, 299, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("REFRESH");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(c.toString());
				textArea.setLineWrap(true);
			}
		});
		btnNewButton_2.setForeground(SystemColor.textHighlightText);
		btnNewButton_2.setBackground(new Color(204, 51, 153));
		btnNewButton_2.setBounds(436, 299, 89, 23);
		contentPane.add(btnNewButton_2);
		

	}
}

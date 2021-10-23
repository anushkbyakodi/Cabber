package windows;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Font;

public class Frame1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame = new Frame1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 * Create the frame.
	 */
	public Frame1(RideBookerApp instance) {
		setBackground(SystemColor.controlDkShadow);
		setTitle("CABBER ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 454);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(800,600) );
		pack();
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		JButton btnNewButton = new JButton("Customer ");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(204, 51, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame2 obj = new Frame2(instance,1);
				obj.setVisible(true);
			}
		});
		btnNewButton.setBounds(385, 199, 138, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Driver ");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(204, 51, 153));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame2 obj = new Frame2(instance,0);
				obj.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(385, 231, 138, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Select Login Type ");
		lblNewLabel.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel.setBackground(UIManager.getColor("Button.foreground"));
		lblNewLabel.setBounds(405, 163, 109, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sign Up");
		lblNewLabel_1.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_1.setBounds(436, 356, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("Customer ");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(204, 51, 153));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame3 obj = new Frame3(instance);
				obj.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(385, 380, 138, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Driver ");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(new Color(204, 51, 153));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame4 obj = new Frame4(instance);
				obj.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(385, 423, 138, 21);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Admin Mode");
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(new Color(204, 51, 153));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminFrame obj = new AdminFrame(instance);
				obj.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(711, 645, 115, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\anush\\OneDrive\\Desktop\\smart-taxi-online-service-isometric-landing-page_107791-1025 (1).jpg"));
		lblNewLabel_2.setBounds(599, 151, 537, 348);
		contentPane.add(lblNewLabel_2);
		
	}
}




package windows;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame7 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame7 frame = new Frame7();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 * Create the frame.
	 */
	public Frame7(Driver d, RideBookerApp instance) {
		setBackground(SystemColor.controlDkShadow);
		setTitle("DRIVER DETIALS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(1400, 1400) );
		pack();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(SystemColor.controlDkShadow);
		tabbedPane.setBounds(228, 64, 721, 482);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.control);
		tabbedPane.addTab("DRIVER DETAILS", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("DRIVER DETAILS: ");
		lblNewLabel_2.setBounds(10, 25, 178, 29);
		panel_1.add(lblNewLabel_2);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(37, 65, 636, 265);
		textArea_1.setText(d.toString());
		panel_1.add(textArea_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.control);
		tabbedPane.addTab("Previous RIDE", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Ride ID");
		lblNewLabel.setForeground(SystemColor.infoText);
		lblNewLabel.setBounds(32, 37, 124, 27);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(108, 34, 216, 33);
		panel.add(textField);
		textField.setColumns(10);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(52, 144, 601, 239);
		panel.add(textArea);
		
		JButton btnNewButton = new JButton("Display Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rId = Integer.parseInt(textField.getText());
				int idx = d.rideFinder(rId);
				
				if(idx==-1) {
					JOptionPane.showMessageDialog(null, "Ride Not Found");
				}
				
				else {
					RideLog r = d.logList.get(idx);
					textArea.setText(r.toString());
					textArea.setLineWrap(true);

				}
			}
		});
		btnNewButton.setBackground(new Color(204, 51, 153));
		btnNewButton.setForeground(SystemColor.textHighlightText);
		btnNewButton.setBounds(418, 40, 152, 24);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Details of the Ride");
		lblNewLabel_1.setForeground(SystemColor.infoText);
		lblNewLabel_1.setBounds(32, 109, 124, 13);
		panel.add(lblNewLabel_1);

		
		JButton btnNewButton_1 = new JButton("LOGOUT");
		btnNewButton_1.setBounds(551, 557, 85, 21);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

	}
}

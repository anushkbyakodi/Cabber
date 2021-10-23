//package Assesment;
//
//import java.awt.BorderLayout;
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//import javax.swing.JButton;
//import javax.swing.JRadioButton;
//import javax.swing.*;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//
//class CreditCard{
//	int cardNo;
//	String cardType;
//	double creditLimit;
//	double cashLimit;
//	double creditAmt;
//	
//	CreditCard(){
//		cardNo = 0;
//		cardType = "Elite";
//		cashLimit = 500;
//		creditLimit = 1000;
//		creditAmt = 0;
//			
//	}
//	
//	CreditCard(int cNo, String cT, double cAmt){
//		cardNo = cNo;
//		cardType = cT;
//		
//		if(cT == "Elite") {
//			cashLimit = 500;
//			creditLimit = 1000;
//		}
//		else {
//			cashLimit = 1000;
//			creditLimit = 2000;
//		}
//
//		creditAmt = cAmt;
//	}
//	
//	public String toString() {
//		return "Num: "+cardNo + " Type:" + cardType+ " CrdLmt: " + creditLimit+ " CashLmt: " +cashLimit+ " Amount: " + creditAmt;
//	}
//	
//	public int card() {
//		return cardNo;
//	}
//	public void clear() {
//		creditAmt = 0;
//	}
//	
//	boolean payBill(double amt, String tType) {
//		
//		if(tType == "Cash") {
//			if(creditAmt+amt<=cashLimit) {
//				creditAmt +=amt;
//				return true;
//			}
//		}
//		
//		else if(tType == "Credit") {
//			if(creditAmt+amt<=creditLimit) {
//				creditAmt +=amt;
//				return true;
//			}
//		}
//		
//		else {
//			return false;
//		}
//		return false;	
//		
//	}
//}
//
//
//class Customer{
//	String custName;
//	String shopName;
//	double billAmount;
//	int cardNo;
//	
//	
//	Customer(){
//		custName = "";
//		shopName = "";
//		billAmount = 0;
//	}
//	
//	Customer(String cName, String sName, double cAmt, int cNo){
//		custName = cName;
//		shopName = sName;
//		billAmount = cAmt;
//		cardNo = cNo;
//	}
//	
//	public String toString() {
//		return "Name : "+custName + " : Shop : " + shopName+ " : Bill : " +billAmount+ " : CardNum: " +cardNo;
//	}
//	public int card() {
//		return cardNo;
//	}
//
//	
//}
//
//
//public class Demo1 extends JFrame {
//
//	private JPanel contentPane;
//	private JTextField textField;
//	private JTextField textField_2;
//	private JTextField textField_3;
//	private JTextField textField_5;
//	private JTextField textField_4;
//	private JTextField textField_1;
//	private JTextField textField_6;
//	private JTextField textField_7;
//	CreditCard cd[] = new CreditCard[5];
//	public static int cCredit = 0;
//	Customer c[] = new Customer[5];
//	public static int cCust = 0;
//	private JTextField textField_8;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Demo1 frame = new Demo1();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
//	public Demo1() {
//		setTitle("CreditCardOperations");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 809, 600);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		
//		JLabel lblCreditCardNumber = new JLabel("Credit Card Number");
//		lblCreditCardNumber.setBounds(40, 62, 113, 14);
//		contentPane.add(lblCreditCardNumber);
//		
//		JLabel lblCardType = new JLabel("Card Type");
//		lblCardType.setBounds(40, 99, 88, 14);
//		contentPane.add(lblCardType);
//		
//		JLabel lblAmount = new JLabel("Amount");
//		lblAmount.setBounds(40, 135, 63, 14);
//		contentPane.add(lblAmount);
//		
//		textField = new JTextField();
//		textField.setBounds(176, 59, 86, 20);
//		contentPane.add(textField);
//		textField.setColumns(10);
//		
//		textField_2 = new JTextField();
//		textField_2.setColumns(10);
//		textField_2.setBounds(176, 132, 86, 20);
//		contentPane.add(textField_2);
//		
//
//		
//		JLabel lblNewLabel = new JLabel("Customer Name");
//		lblNewLabel.setBounds(40, 296, 88, 14);
//		contentPane.add(lblNewLabel);
//		
//		JLabel lblShopname = new JLabel("Shop Name");
//		lblShopname.setBounds(40, 321, 88, 14);
//		contentPane.add(lblShopname);
//		
//		JLabel lblAmount_1 = new JLabel("Amount");
//		lblAmount_1.setBounds(40, 346, 46, 14);
//		contentPane.add(lblAmount_1);
//		
//		JLabel lblPayType = new JLabel("Pay Type");
//		lblPayType.setBounds(40, 373, 73, 14);
//		contentPane.add(lblPayType);
//		
//		textField_3 = new JTextField();
//		textField_3.setBounds(196, 293, 86, 20);
//		contentPane.add(textField_3);
//		textField_3.setColumns(10);
//		
//		textField_5 = new JTextField();
//		textField_5.setColumns(10);
//		textField_5.setBounds(196, 343, 86, 20);
//		contentPane.add(textField_5);
//		
//		textField_4 = new JTextField();
//		textField_4.setColumns(10);
//		textField_4.setBounds(196, 318, 86, 20);
//		contentPane.add(textField_4);
//		
//
//		JLabel lblCardNum = new JLabel("Card Num");
//		lblCardNum.setBounds(40, 398, 88, 14);
//		contentPane.add(lblCardNum);
//		
//		textField_1 = new JTextField();
//		textField_1.setBounds(196, 399, 86, 20);
//		contentPane.add(textField_1);
//		textField_1.setColumns(10);
//		
//		textField_6 = new JTextField();
//		textField_6.setBounds(317, 11, 450, 123);
//		contentPane.add(textField_6);
//		textField_6.setColumns(10);
//		
//		ButtonGroup gp = new ButtonGroup();
//		
//		ButtonGroup gp2 = new ButtonGroup();
//		
//		JLabel lblNewLabel_1 = new JLabel("Card Number");
//		lblNewLabel_1.setBounds(431, 306, 74, 14);
//		contentPane.add(lblNewLabel_1);
//		
//		textField_7 = new JTextField();
//		textField_7.setBounds(515, 303, 86, 20);
//		contentPane.add(textField_7);
//		textField_7.setColumns(10);
//		
//
//
//
//		
//		JComboBox comboBox = new JComboBox();
//		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Gold", "Elite"}));
//		comboBox.setBounds(176, 95, 70, 22);
//		contentPane.add(comboBox);
//		
//		JComboBox comboBox_1 = new JComboBox();
//		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Cash", "Credit"}));
//		comboBox_1.setBounds(192, 369, 70, 22);
//		contentPane.add(comboBox_1);
//		
//		JButton btnNewButton = new JButton("Submit");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int cNum = Integer.parseInt(textField.getText());
//				double amt = Double.parseDouble(textField_2.getText());
//				String s = comboBox.getSelectedItem().toString();
//				int n  = cCredit;
//				if(n>5) {
//					dispose();
//				}
//				cd[n] = new CreditCard(cNum, s, amt);
//				cCredit+=1;
//				textField_6.setText("Card: "+ cd[n]);
//				JOptionPane.showMessageDialog(null,"Created");
//			}
//		});
//		btnNewButton.setBounds(100, 180, 89, 23);
//		contentPane.add(btnNewButton);
//		
//		JButton btnNewButton_1 = new JButton("Pay");
//		btnNewButton_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String cName = textField_3.getText();
//				String sName = textField_4.getText();
//				String s = comboBox.getSelectedItem().toString();
//				double amt = Double.parseDouble(textField_5.getText());
//				int cNum = Integer.parseInt(textField_1.getText());
//				String pType = comboBox_1.getSelectedItem().toString();
//				
//				if(cCust==5) {
//					dispose();
//				}
//
//				int flag = 0;
//				for(int i = 0; i< cCredit;i++) {
//					int n = cd[i].card();
//					if(cNum == n) {
//						flag = 1;
//						boolean f =cd[i].payBill(amt,pType);
//						if(f==false) {
//							textField_6.setText("Not Possible Amount error");
//						}
//						else {
//							c[cCust] = new Customer(cName,sName,amt,cNum);
//							JOptionPane.showMessageDialog(null,"Created");
//							int n2 = cCust;
//							textField_6.setText("User: "+ c[n2]);
//							textField_8.setText("Card Details: "+ cd[i]);
//							cCust+=1;
//						}
//					}
//				}
//				
//				if(flag==0) {
//					textField_6.setText("Card not Found");
//				}
//				
//
//				
//			}
//		});
//		btnNewButton_1.setBounds(116, 440, 89, 23);
//		contentPane.add(btnNewButton_1);
//		
//		JButton btnNewButton_2 = new JButton("Clear Bill");
//		btnNewButton_2.addActionListener(new ActionListener() {
//			
//			
//			public void actionPerformed(ActionEvent e) {
//				
//				int cNum = Integer.parseInt(textField_7.getText());
//				
//				int flag1 = 0;
//				int flag2 = 0;
//				for(int i = 0; i< cCredit;i++) {
//					if(cd[i].card() == cNum) {
//						cd[i].clear();
//						flag1 = 1;
//						for(int j = 0; j< cCust; j++) {
//							if(c[j].card()==cNum) {
//								//textField_6.textLineWrap(true);
//								textField_6.setText("Card Used by: "+ c[j]);
//								textField_8.setText("Card Details: "+ cd[i]);
//								flag2 = 1;
//							}
//						}
//						
//					}
//				}
//				
//			}
//			
//		});
//		btnNewButton_2.setBounds(463, 342, 89, 23);
//		contentPane.add(btnNewButton_2);
//		
//		textField_8 = new JTextField();
//		textField_8.setColumns(10);
//		textField_8.setBounds(317, 145, 450, 123);
//		contentPane.add(textField_8);
//
//		
//		
//
//	}
//}

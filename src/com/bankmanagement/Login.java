package com.bankmanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
	
		JLabel label1, label2,label3;
		JTextField textfield2;
		JPasswordField passwardfield3;
		JButton button1,button2,button3;
	
		Login() {
			
			super("Bank Management System");
			
			ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
			Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
			ImageIcon i3=new ImageIcon(i2);
			JLabel image=new JLabel(i3);
			image.setBounds(350,10, 100, 100);
			add(image);
			
			ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
			Image ii2=ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
			ImageIcon ii3=new ImageIcon(ii2);
			JLabel iimage=new JLabel(ii3);
			iimage.setBounds(630,350, 100, 100);
			add(iimage);
			
			label1=new JLabel("Welcome to ATM");
			
			label1.setForeground(Color.white);
			label1.setFont(new Font("Times of Roman", Font.BOLD, 38));
			label1.setBounds(250, 125, 450, 40);
			add(label1);
			
			
			label2=new JLabel("Card number:");
			label2.setFont(new Font("Ralway", Font.BOLD, 28));
			label2.setForeground(Color.WHITE);
			label2.setBounds(150,190,375,30);
			add(label2);
			
			textfield2=new JTextField(15);
			textfield2.setBounds(325,190,230,30);
			textfield2.setFont(new Font("Arial",Font.BOLD,16));
			add(textfield2);
			
			passwardfield3=new JPasswordField(15);
			passwardfield3.setBounds(325,250,230,30);
			passwardfield3.setFont(new Font("Arial",Font.BOLD,14));
			add(passwardfield3);
			
			button1 =new JButton("SIGN IN");
			button1.setFont(new Font("Arial", Font.BOLD, 14));
			button1.setForeground(Color.DARK_GRAY);
			button1.setBackground(Color.green);
			button1.setBounds(330, 300, 100, 30);
			button1.addActionListener(this);
			add(button1);
			
			button2 =new JButton("ClEAR");
			button2.setFont(new Font("Arial", Font.BOLD, 14));
			button2.setForeground(Color.DARK_GRAY);
			button2.setBackground(Color.red);
			button2.setBounds(450, 300, 100, 30);
			button2.addActionListener(this);
			add(button2);
			
			button3 =new JButton("SIGN UP");
			button3.setFont(new Font("Arial", Font.BOLD, 14));
			button3.setForeground(Color.DARK_GRAY);
			button3.setBackground(Color.cyan);
			button3.setBounds(330, 350, 230, 30);
			button3.addActionListener(this);
			add(button3);
			
			
			label3=new JLabel("PIN: ");
			label3.setFont(new Font("Ralway", Font.BOLD, 28));
			label3.setForeground(Color.WHITE);
			label3.setBounds(150,260,375,30);
			add(label3);
			
			
			
			
			ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
			Image iii2=iii1.getImage().getScaledInstance(850, 450, Image.SCALE_DEFAULT);
			ImageIcon iii3=new ImageIcon(iii2);
			JLabel iiimage=new JLabel(iii3);
			iiimage.setBounds(0,0,850, 450);
			add(iiimage);
			
			setLayout(null);
			setSize(850, 480);
			setLocation(350, 150);
			//setUndecorated(true);
			setVisible(true);
			
			
			
		
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			
			try {
				if(e.getSource()==button1) {
					Conaction c=new Conaction();
					String cardno=textfield2.getText();
					String pin=passwardfield3.getText();
					
					String q="select * from login where Card_number='"+cardno+"'and PIN='"+pin+"'";
					ResultSet rs=c.stmt.executeQuery(q);
					
					if(rs.next()) {
						setVisible(false);
						new Transction(pin);
					}
					else if(cardno.equals("")||pin.equals("")) {
							JOptionPane.showMessageDialog(null, "enter a card number and pin");
						}
			else {
					JOptionPane.showMessageDialog(null, "incorrect cardnumber and pin");
				}
					
				}else if(e.getSource()==button2) {
					textfield2.setText("");
					passwardfield3.setText("");
				
					
				}else if(e.getSource()==button3) {
					
					new SignUp();
					setVisible(false);
				}
				
			}
			catch(Exception E) {
				E.printStackTrace();
			}
			
		}
		
		public static void main(String[] args) {
			new Login();
		}


		
}

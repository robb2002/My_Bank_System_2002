package com.bankmanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Singup3 extends JFrame implements ActionListener{
	
		JRadioButton r1,r2,r3,r4;
		JCheckBox c1,c2,c3,c4,c5,c6;
		JButton s1,c;
		String formno;
	
	 Singup3(String formno){
		 
		 	this.formno=formno;
		 
		 	ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
			Image i2=i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
			ImageIcon i3=new ImageIcon(i2);
			JLabel image=new JLabel(i3);
			image.setBounds(30,10, 100, 100);
			add(image);
			
			JLabel l1=new JLabel("Page 3:");
			l1.setBounds(200, 40, 400, 40);
			l1.setFont(new Font("Raleway", Font.BOLD, 22));
			add(l1);
			
			JLabel l2=new JLabel("Account Datails");
			l2.setBounds(200, 70, 400, 40);
			l2.setFont(new Font("Raleway", Font.BOLD, 24));
			add(l2);
			
			JLabel l3=new JLabel("Account Type :");
			l3.setBounds(100, 140, 200, 40);
			l3.setFont(new Font("Raleway", Font.BOLD, 20));
			add(l3);
		 
			r1=new JRadioButton("Saving Account");
			r1.setBounds(100, 180, 200, 30);
			r1.setFont(new Font("Raleway", Font.BOLD, 16));
			r1.setBackground(new Color(222,225,228));
			add(r1);
			
			r2=new JRadioButton("Current Account");
			r2.setBounds(100, 220, 200, 30);
			r2.setFont(new Font("Raleway", Font.BOLD, 16));
			r2.setBackground(new Color(222,225,228));
			add(r2);
			
			r3=new JRadioButton("Fixed Deposite Account");
			r3.setBounds(350, 180, 300, 30);
			r3.setFont(new Font("Raleway", Font.BOLD, 16));
			r3.setBackground(new Color(222,225,228));
			add(r3);
			
			r4=new JRadioButton("Recurring Deposite Account");
			r4.setBounds(350, 220, 300, 30);
			r4.setFont(new Font("Raleway", Font.BOLD, 16));
			r4.setBackground(new Color(222,225,228));
			add(r4);
			
			ButtonGroup groupbuttone1=new ButtonGroup();
			 groupbuttone1.add(r1);
			 groupbuttone1.add(r2);
			 groupbuttone1.add(r3);
			 groupbuttone1.add(r4);
			 
			JLabel l4=new JLabel("Card Number :");
			l4.setBounds(100, 270, 200, 40);
			l4.setFont(new Font("Raleway", Font.BOLD, 20));
			add(l4);
			
			JLabel l5=new JLabel("(Your 16-digit Card Number)");
			l5.setBounds(100, 310, 200, 20);
			l5.setFont(new Font("Raleway", Font.BOLD, 14));
			add(l5);
			
			JLabel l6=new JLabel("XXXX-XXXX-XXXX-2002");
			l6.setBounds(360, 270, 350, 40);
			l6.setFont(new Font("Raleway", Font.BOLD, 20));
			add(l6);
			
			JLabel l7=new JLabel("(It would appear on ATM card/Change Book and Statement)");
			l7.setBounds(360, 310, 500, 20);
			l7.setFont(new Font("Raleway", Font.BOLD,14));
			add(l7);
			
			JLabel l8=new JLabel("PIN");
			l8.setBounds(100, 350, 200, 40);
			l8.setFont(new Font("Raleway", Font.BOLD, 20));
			add(l8);
			
			JLabel l9=new JLabel("XXXX");
			l9.setBounds(360, 350, 200, 40);
			l9.setFont(new Font("Raleway", Font.BOLD, 20));
			add(l9);
			
			JLabel l10=new JLabel("(4-digit Password)");
			l10.setBounds(100, 380, 200, 20);
			l10.setFont(new Font("Raleway", Font.BOLD, 14));
			add(l10);
			
			JLabel l11=new JLabel("Services Required :");
			l11.setBounds(100, 420, 200, 30);
			l11.setFont(new Font("Raleway", Font.BOLD, 20));
			add(l11);
			
			c1=new JCheckBox("ATM CARD");
			c1.setBounds(100,470, 200, 30);
			c1.setBackground(new Color(222,225,228));
			c1.setFont(new Font("Raleway",Font.BOLD, 16));
			add(c1);
		 
			c2=new JCheckBox("Internet Banking");
			c2.setBounds(350,470, 200, 30);
			c2.setBackground(new Color(222,225,228));
			c2.setFont(new Font("Raleway",Font.BOLD, 16));
			add(c2);
			
			c3=new JCheckBox("Mobile Banking");
			c3.setBounds(100,520, 200, 30);
			c3.setBackground(new Color(222,225,228));
			c3.setFont(new Font("Raleway",Font.BOLD, 16));
			add(c3);
			
			c4=new JCheckBox("Email Alerts");
			c4.setBounds(350,520, 200, 30);
			c4.setBackground(new Color(222,225,228));
			c4.setFont(new Font("Raleway",Font.BOLD, 16));
			add(c4);
			
			c5=new JCheckBox("Check Book");
			c5.setBounds(100,570, 200, 30);
			c5.setBackground(new Color(222,225,228));
			c5.setFont(new Font("Raleway",Font.BOLD, 16));
			add(c5);
			
			c6=new JCheckBox("E-Statement");
			c6.setBounds(350,570, 200, 30);
			c6.setBackground(new Color(222,225,228));
			c6.setFont(new Font("Raleway",Font.BOLD, 16));
			add(c6);
			
			JCheckBox c7=new JCheckBox("I here by declared that the above enterd details correct to the best of my knowledge..",true);
			c7.setBounds(100,620, 700, 30);
			c7.setBackground(new Color(222,225,228));
			c7.setFont(new Font("Raleway",Font.BOLD, 14));
			add(c7);
			
			JLabel l12=new JLabel("Form Number:");
			l12.setFont(new Font("Raleway", Font.BOLD, 18));
			l12.setBounds(600, 10,130, 30);
			add(l12);
			
			JLabel l13=new JLabel(formno);
			l13.setFont(new Font("Raleway", Font.BOLD, 18));
			l13.setBounds(750, 10,60, 30);
			add(l13);
			
			s1=new JButton("Submit");
			s1.setBackground(Color.BLACK);
			s1.setForeground(Color.WHITE);
			s1.setFont(new Font("Raleway",Font.BOLD,14));
			s1.setBounds(320, 680, 100, 30);
			s1.addActionListener(this);
			add(s1);
			
			c=new JButton("Cancel");
			c.setBackground(Color.BLACK);
			c.setForeground(Color.WHITE);
			c.setFont(new Font("Raleway",Font.BOLD,14));
			c.addActionListener(this);
			c.setBounds(450, 680, 100, 30);
		
			add(c);
			
			setSize(850,800);
			setLayout(null);
			setLocation(330, 10);
			setVisible(true);
			
			getContentPane().setBackground(new Color(222,225,228));		
	}
	 @Override
		public void actionPerformed(ActionEvent e) {
			String atype=null;
			if(r1.isSelected()) {
				atype="Saving Account";
			}
			else if(r2.isSelected()) {
				atype="Current Account";
			}
			else if(r3.isSelected()) {
				atype="Fixed Deposite Account";
			}
			else if(r4.isSelected()) {
				atype="Recurring Deposite Account";
			}
			
			Random  rand=new Random();
			
			long first7=(rand.nextLong()%90000000L)+1409963000000000L;
			String cardno=""+Math.abs(first7);
			
			long first3=(rand.nextLong()%9000L)+1000L;
			String pin=""+Math.abs(first3);
			
			String serv=null;
			if(c1.isSelected()) {
				serv+="ATM CARD";
			}
			else if(c2.isSelected()) {
				serv+="Internet Banking";
			}
			else if(c3.isSelected()) {
				serv+="Mobile Banking";
			}
			else if(c4.isSelected()) {
				serv+="Email Alerts";
			}
			else if(c5.isSelected()) {
				serv+="Check Book";
			}
			else if(c6.isSelected()) {
				serv+="E-Statement";
			}
			
			try {
				if(e.getSource()==s1) {
					if(atype.equals("")) {
						JOptionPane.showMessageDialog(null,"Fill all the field");
						
					}
					else {
						Conaction con=new Conaction();
						String q1="insert into Singup3 values('"+formno+"','"+atype+"','"+cardno+"','"
								+pin+"','"+serv+"')";
						String q2="insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
						con.stmt.executeUpdate(q1);
						con.stmt.executeUpdate(q2);
						JOptionPane.showMessageDialog(null, "Card Number:"+cardno+"\n pin :"+pin);
						new Deposit(pin);
						setVisible(false);
					}
				}
				else if(e.getSource()==c){
					System.exit(0);
				}
				
			}
			catch(Exception e2) {
				e2.printStackTrace();
			}
			
		}

	public static void main(String[] args) {
	
		new Singup3("");
	}


	

}

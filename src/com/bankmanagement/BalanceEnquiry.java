package com.bankmanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BalanceEnquiry extends JFrame implements ActionListener{
	JLabel l2;
	JButton b1;
	String pin;
	
	public BalanceEnquiry(String pin){
		super();
		this.pin=pin;
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
		Image i2=i1.getImage().getScaledInstance(1550, 830,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l3=new JLabel(i3);
		l3.setBounds(0, 0, 1550, 830);
		add(l3);
		
		JLabel l1=new JLabel("YOUR CURRENT BALANCE IS");
		l1.setFont(new Font("System", Font.BOLD, 16));
		l1.setBounds(380,180, 400, 35);
		l1.setForeground(Color.WHITE);
		l3.add(l1);
		
		l2=new JLabel();
		l2.setFont(new Font("System", Font.BOLD, 16));
		l2.setBounds(380,210, 400, 35);
		l2.setForeground(Color.WHITE);
		l3.add(l2);
		
		b1=new JButton("Back");
		b1.setFont(new Font("Raleway", Font.BOLD, 18));
		b1.setBounds(580, 375, 150, 35);
		b1.setForeground(Color.WHITE);
		b1.setBackground(new Color(65,125,128));
		b1.addActionListener(this);
		l3.add(b1);
		
		int balance=0;
		try {
			Conaction con=new Conaction();
			ResultSet rs=con.stmt.executeQuery("select * from bank where pin='"+pin+"'");
			
			while(rs.next()) {
				if(rs.getString("type").equals("Deposit")) {
					balance+=Integer.parseInt(rs.getString("amount"));
				}
				else {
					balance-=Integer.parseInt(rs.getString("amount"));
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		
		l2.setText(""+balance);
		
		setSize(1550, 1000);
		setLocation(0, 0);
		setVisible(true);
		setLayout(null);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new Transction(pin);
		
	}

	public static void main(String[] args) {
		new BalanceEnquiry("");

	}
	
}

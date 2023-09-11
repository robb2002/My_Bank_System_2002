package com.bankmanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mini extends JFrame implements ActionListener{
	String pin;
	JButton b1;
	public Mini(String pin) {
		
		this.pin=pin;
		
		setSize(400, 600);
		setLocation(200, 20);
		setVisible(true);
		setLayout(null);
		getContentPane().setBackground(new Color(255,204,204));
		
		JLabel l1=new JLabel();
		l1.setBounds(20, 180, 400, 250);
		//l1.setFont(new Font("System", Font.BOLD, 16));
		add(l1);
		
		JLabel l3=new JLabel("MY BANK");
		l3.setFont(new Font("System", Font.BOLD, 20));
		l3.setBounds(150,20, 100, 20);
		add(l3);
		
		
		JLabel l2=new JLabel();
		l2.setBounds(20, 80,300, 20);
		l2.setFont(new Font("System", Font.BOLD, 14));
		add(l2);
		
		JLabel l4=new JLabel();
		l4.setBounds(20, 450, 300, 20);
		l4.setFont(new Font("System", Font.BOLD, 16));
		add(l4);
		
		b1=new JButton("Exit");
		b1.setBounds(20, 500, 100, 25);
		b1.addActionListener(this);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		add(b1);

		
		try {
			Conaction con=new Conaction();
			ResultSet rs=con.stmt.executeQuery("select * from login where pin='"+pin+"'");
			
			while(rs.next()) {
				l2.setText("Card number:"+rs.getString("Card_number").substring(0, 4)+"xxxxxxxx"+
			      rs.getString("Card_number").substring(12));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			int balance=0;
			Conaction con=new Conaction();
			ResultSet rs=con.stmt.executeQuery("select * from bank where pin='"+pin+"'");
			
			
			while(rs.next()) {
				
				l1.setText(l1.getText()+"<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
						+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+
						"<br><br><html>");


				if(rs.getString("type").equals("Deposit")) {
					balance += Integer.parseInt(rs.getString("amount"));
				}else {
					balance -= Integer.parseInt(rs.getString("amount"));
				}
			
			}
			
			l4.setText("Your Total Balance  is Rs. "+balance);
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new Transction(pin);
		
		
	}
	
	public static void main(String[] args) {
		new Mini("");

	}


}

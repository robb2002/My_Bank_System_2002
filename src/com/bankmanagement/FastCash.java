package com.bankmanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FastCash extends JFrame implements ActionListener{
	
	JButton b1,b2,b3,b4,b5,b6,b7;
	String pin;

	public FastCash(String pin) {
		super();
		
		this.pin=pin;
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
		Image i2=i1.getImage().getScaledInstance(1550, 830,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l3=new JLabel(i3);
		l3.setBounds(0, 0, 1550,830);
		add(l3);
		
		JLabel l1=new JLabel("SELECT WITHDRAWL AMOUNT");
		l1.setBounds(380, 170, 350, 35);
		l1.setFont(new Font("Raleway", Font.BOLD, 22));
		l1.setForeground(Color.WHITE);
		l3.add(l1);
		
		b1=new JButton("Rs.100");
		b1.setBounds(320, 230, 190, 35);
		b1.setFont(new Font("Raleway", Font.BOLD, 16));
		b1.setBackground(new Color(65,125,128));
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		l3.add(b1);
		
		b2=new JButton("Rs.2000 ");
		b2.setBounds(570, 230, 190, 35);
		b2.setFont(new Font("Raleway", Font.BOLD, 16));
		b2.setBackground(new Color(65,125,128));
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		l3.add(b2);
		
		b3=new JButton("Rs.500");
		b3.setBounds(320, 275, 190, 35);
		b3.setFont(new Font("Raleway", Font.BOLD, 16));
		b3.setBackground(new Color(65,125,128));
		b3.setForeground(Color.WHITE);
		b3.addActionListener(this);
		l3.add(b3);
		
		b4=new JButton("Rs.5000");
		b4.setBounds(570, 275, 190, 35);
		b4.setFont(new Font("Raleway", Font.BOLD, 16));
		b4.setBackground(new Color(65,125,128));
		b4.setForeground(Color.WHITE);
		b4.addActionListener(this);
		l3.add(b4);
		
		b5=new JButton("Rs.1000 ");
		b5.setBounds(320, 320, 190, 35);
		b5.setFont(new Font("Raleway", Font.BOLD, 16));
		b5.setBackground(new Color(65,125,128));
		b5.setForeground(Color.WHITE);
		b5.addActionListener(this);
		l3.add(b5);
		
		b6=new JButton("Rs.10000");
		b6.setBounds(570, 320, 190, 35);
		b6.setFont(new Font("Raleway", Font.BOLD, 16));
		b6.setBackground(new Color(65,125,128));
		b6.setForeground(Color.WHITE);
		b6.addActionListener(this);
		l3.add(b6);
		
		b7=new JButton("Back ");
		b7.setBounds(450, 375, 190, 35);
		b7.setFont(new Font("Raleway", Font.BOLD, 16));
		b7.setBackground(new Color(65,125,128));
		b7.setForeground(Color.WHITE);
		b7.addActionListener(this);
		l3.add(b7);
		
		
		setSize(1550, 1000);
		setLocation(0, 0);
		setVisible(true);
		setLayout(null);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b7) {
			setVisible(false);
			new Transction(pin);
		}
		
		
		try {
			String amount=((JButton)e.getSource()).getText().substring(3);
			Date date=new Date();
			
			Conaction con=new Conaction();
			ResultSet rs=con.stmt.executeQuery("select * from bank where pin='"+pin+"'");
			int balance=0;
			
			while(rs.next()) {
				if(rs.getString("type").equals("Deposit")) {
					balance += Integer.parseInt(rs.getString("amount"));
				}else {
					balance -= Integer.parseInt(rs.getString("amount"));
				}
			}
			String num="17";
			
			if(e.getSource() != b7 && balance < Integer.parseInt(amount)) {
				JOptionPane.showMessageDialog(null, "Insufficient Balance");
				return;
			}
			
			con.stmt.executeUpdate("insert into bank values('"+pin+"','"+date+"','withdrawl',"
					+ "'"+amount+"')");
			
			JOptionPane.showMessageDialog(null, "Rs. "+amount+"Debited Successfully");
			
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		setVisible(false);
		new Transction(pin);
	}	

	public static void main(String[] args) {
		new FastCash("");

	}

	
}

package com.bankmanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Pin extends JFrame implements ActionListener {
	JButton b1,b2;
	JPasswordField p1,p2;
	String pin;

	public Pin(String pin) {
		super();
		this.pin=pin;
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
		Image i2=i1.getImage().getScaledInstance(1550, 830,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l3=new JLabel(i3);
		l3.setBounds(0, 0, 1550, 830);
		add(l3);
		
		JLabel l1=new JLabel("CHANGE YOUR PIN");
		l1.setFont(new Font("System", Font.BOLD, 16));
		l1.setBounds(470,135, 400, 35);
		l1.setForeground(Color.WHITE);
		l3.add(l1);
		
		JLabel l2=new JLabel("NEW PIN:");
		l2.setFont(new Font("System", Font.BOLD, 16));
		l2.setBounds(350,185, 100, 35);
		l2.setForeground(Color.WHITE);
		l3.add(l2);
		
		p1=new JPasswordField();
		p1.setBounds(495,190,200, 25);
		p1.setFont(new Font("Raleway", Font.BOLD, 16));
		p1.setForeground(Color.WHITE);
		p1.setBackground(new Color(65,125,128));
		l3.add(p1);
		
		JLabel l4=new JLabel("Re-Enter New PIN:");
		l4.setFont(new Font("System", Font.BOLD, 16));
		l4.setBounds(350,230, 200, 35);
		l4.setForeground(Color.WHITE);
		l3.add(l4);
		
		p2=new JPasswordField();
		p2.setBounds(495,235,200, 25);
		p2.setFont(new Font("Raleway", Font.BOLD, 16));
		p2.setForeground(Color.WHITE);
		p2.setBackground(new Color(65,125,128));
		l3.add(p2);
		
		b1=new JButton("CONFIRM");
		b1.setFont(new Font("Raleway", Font.BOLD, 16));
		b1.setBounds(610,320, 150, 30);
		b1.setForeground(Color.WHITE);
		b1.setBackground(new Color(65,125,128));
		b1.addActionListener(this);
		l3.add(b1);
		
		b2=new JButton("BACK");
		b2.setFont(new Font("Raleway", Font.BOLD, 16));
		b2.setBounds(610, 372, 150, 30);
		b2.setForeground(Color.WHITE);
		b2.setBackground(new Color(65,125,128));
		b2.addActionListener(this);
		l3.add(b2);
		
		setSize(1550, 1000);
		setLocation(0, 0);
		setVisible(true);
		setLayout(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			String pin1=p1.getText();
			String pin2=p2.getText();
			
			if(!pin1.equals(pin2)) {
				JOptionPane.showMessageDialog(null, "Entered PIN does not match");
				return;
			}
			if(e.getSource()==b1) {
				if(pin1.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter new PIN");
					return;
				}
				if(pin2.equals("")) {
					JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
					return;
				}
				
				Conaction con=new Conaction();
				String q1="update bank set pin='"+pin1+"' where pin='"+pin+"'";
				String q2="update login set pin='"+pin1+"' where pin='"+pin+"'";
				String q3="update Singup3 set pin='"+pin1+"' where pin='"+pin+"'";
				
				con.stmt.executeUpdate(q1);
				con.stmt.executeUpdate(q2);
				con.stmt.executeUpdate(q3);
				
				JOptionPane.showMessageDialog(null, "PIN changed Succesfully");
				setVisible(false);
				new Transction(pin);
				
				
			}
			else if(e.getSource()==b2) {
				setVisible(false);
				new Transction(pin);
			}
			
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	
	}

	public static void main(String[] args) {
		new Pin("");

	}
}

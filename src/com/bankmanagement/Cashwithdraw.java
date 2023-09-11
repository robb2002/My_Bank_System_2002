package com.bankmanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Cashwithdraw extends JFrame implements ActionListener{
	String pin;
	JTextField textfield;
	JButton b1,b2;
	
		
	public Cashwithdraw(String pin){
		super();
		
		this.pin=pin;
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
		Image i2=i1.getImage().getScaledInstance(1550, 830,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l3=new JLabel(i3);
		l3.setBounds(0, 0, 1550, 830);
		add(l3);
		
		JLabel l1=new JLabel("MAXIMUN WITHDRAWAL IS RS.10,000");
		l1.setFont(new Font("System", Font.BOLD, 16));
		l1.setBounds(380,150, 400, 35);
		l1.setForeground(Color.WHITE);
		l3.add(l1);
		
		JLabel l2=new JLabel("PLEASE ENTER YOUR AMOUNT");
		l2.setFont(new Font("System", Font.BOLD, 16));
		l2.setBounds(380,180, 400, 35);
		l2.setForeground(Color.WHITE);
		l3.add(l2);
		
		textfield=new JTextField();
		textfield.setBounds(380,235, 320, 25);
		textfield.setFont(new Font("Raleway", Font.BOLD, 16));
		textfield.setForeground(Color.WHITE);
		textfield.setBackground(new Color(65,125,128));
		l3.add(textfield);
		
		b1=new JButton("WITHDRAW");
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
			if(e.getSource()==b1) {
			try {
				String amount=textfield.getText();
				Date date=new Date();
				if(textfield.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter the Amount you want to withdraw");
				}
				else {
					Conaction con=new Conaction();
					ResultSet rs=con.stmt.executeQuery("select * from Bank where pin='"+pin+"'");
					int balance=0;
					while(rs.next()) {
						if(rs.getString("type").equals("Deposit")) {
							balance+=Integer.parseInt(rs.getString("amount"));
						}
						else if(Integer.parseInt(amount)<100)  
							{
								JOptionPane.showMessageDialog(null, "Enter a amount in multiply of 100");
								return;
							}
						else {
							balance-=Integer.parseInt(rs.getString("amount"));
							}
						
					}
					if(balance<Integer.parseInt(amount)) {
						JOptionPane.showMessageDialog(null, "Insuffient Balance");
						return;
					}
					con.stmt.executeUpdate("insert into bank value('"+this.pin+"','"+date+"','withdraw','"
							+amount+"')");
					JOptionPane.showMessageDialog(null, "Rs. "+amount+"withdraw succesfully");
					setVisible(false);
					new Transction(pin);
				}
			}
			catch(Exception E) {
				E.printStackTrace();
			}
		}else if(e.getSource()==b2) {
			setVisible(false);
			new  Transction(pin);
		}
			
	}
		
		public static void main(String[] args) {
		new Cashwithdraw("");
	}

}

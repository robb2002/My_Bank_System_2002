package com.bankmanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class SignUp extends JFrame implements ActionListener{
	
		JRadioButton r1,r2,m1,m2,m3;
		
		JButton next;
		
		JTextField name,fname,dob,email,Address,city,Pin,State;
		JDateChooser datechoose;
		
		Random ran=new Random();
		
		long n=(ran.nextLong()%9000L)+1000L;
		
		String num=" "+Math.abs(n);
		
		SignUp()
		{
			super("Application Form");
			
			ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
			Image i2=i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
			ImageIcon i3=new ImageIcon(i2);
			JLabel image=new JLabel(i3);
			image.setBounds(20,10, 100, 100);
			add(image);
			
			JLabel label1= new JLabel("APPLICATION FORM NUMBER:"+num);
			label1.setBounds(160, 20, 600, 40);
			label1.setFont(new Font("Raleway", Font.BOLD, 28));
			label1.setForeground(Color.blue);
			add(label1);
			
			JLabel label2=new JLabel("page1");
			label2.setFont(new Font("Raleway", Font.BOLD, 22));
			label2.setBounds(370, 70, 600, 30);
			add(label2);
			
			JLabel label3=new JLabel("Personal Details");
			label3.setFont(new Font("Raleway",Font.BOLD, 22));
			label3.setBounds(330, 95, 600, 30);
			add(label3);
			
			JLabel labelname=new JLabel("Name :");
			labelname.setFont(new Font("Raleway",Font.BOLD, 22));
			labelname.setBounds(100, 190, 100, 30);
			add(labelname);
			
			name=new JTextField();
			name.setBounds(300, 190, 400, 30);
			name.setFont(new Font("Raleway",Font.BOLD, 14));
			add(name);
			
			JLabel labelfname=new JLabel("Father's Name :");
			labelfname.setFont(new Font("Raleway",Font.BOLD, 22));
			labelfname.setBounds(100, 240, 200, 30);
			add(labelfname);
			
			fname=new JTextField();
			fname.setBounds(300, 240, 400, 30);
			fname.setFont(new Font("Raleway",Font.BOLD, 14));
			add(fname);
			
			JLabel labelDob=new JLabel("Date of Birth :");
			labelDob.setFont(new Font("Raleway",Font.BOLD, 22));
			labelDob.setBounds(100, 340, 200, 30);
			add(labelDob);
			
			datechoose=new JDateChooser();
			datechoose.setForeground(new Color(100,110,115));
			datechoose.setBounds(300, 340, 400, 30);
			add(datechoose);
			
			JLabel labelG=new JLabel("Gender :");
			labelG.setFont(new Font("Raleway",Font.BOLD, 20));
			labelG.setBounds(100, 290, 200, 30);
			add(labelG);
			
			r1=new JRadioButton("Male");
			r1.setFont(new Font("Raleway",Font.BOLD, 14));
			r1.setBackground(new Color(222,225,228));
			r1.setBounds(300, 290,60, 30);
			add(r1);
			
			r2=new JRadioButton("Female");
			r2.setFont(new Font("Raleway",Font.BOLD, 14));
			r2.setBackground(new Color(222,225,228));
			r2.setBounds(450, 290,90, 30);
			add(r2);
			
			
			
			ButtonGroup buttongrup=new ButtonGroup();
			buttongrup.add(r1);
			buttongrup.add(r2);
			
			JLabel labelemail=new JLabel("Email address :");
			labelemail.setFont(new Font("Raleway",Font.BOLD, 20));
			labelemail.setBounds(100, 390, 200, 30);
			add(labelemail);
			
			email=new JTextField();
			email.setBounds(300, 390, 400, 30);
			email.setFont(new Font("Raleway",Font.BOLD, 14));
			add(email);
			
			JLabel labelms=new JLabel("Marital Status :");
			labelms.setFont(new Font("Raleway",Font.BOLD, 20));
			labelms.setBounds(100,440, 200, 30);
			add(labelms);
			
			m1=new JRadioButton("Married");
			m1.setBounds(300,440, 100, 30);
			m1.setFont(new Font("Raleway",Font.BOLD, 14));
			m1.setBackground(new Color(222,225,228));
			add(m1);
			
			m2=new JRadioButton("UnMarried");
			m2.setBounds(450,440, 100, 30);
			m2.setFont(new Font("Raleway",Font.BOLD, 14));
			m2.setBackground(new Color(222,225,228));
			add(m2);
			
			m3=new JRadioButton("Other");
			m3.setBounds(600,440, 100, 30);
			m3.setFont(new Font("Raleway",Font.BOLD, 14));
			m3.setBackground(new Color(222,225,228));
			add(m3);
			
			ButtonGroup ButtonGroup1=new ButtonGroup();
			ButtonGroup1.add(m1);
			ButtonGroup1.add(m2);
			ButtonGroup1.add(m3);
			
			JLabel labeladd=new JLabel("Address :");
			labeladd.setFont(new Font("Raleway",Font.BOLD, 20));
			labeladd.setBounds(100,490, 200, 30);
			add(labeladd);
			
			Address=new JTextField();
			Address.setBounds(300, 490, 400, 30);
			Address.setFont(new Font("Raleway",Font.BOLD, 14));
			add(Address);
			
			JLabel labelcity=new JLabel("City :");
			labelcity.setFont(new Font("Raleway",Font.BOLD, 20));
			labelcity.setBounds(100,540, 200, 30);
			add(labelcity);
			
			city=new JTextField();
			city.setBounds(300, 540, 400, 30);
			city.setFont(new Font("Raleway",Font.BOLD, 14));
			add(city);
			
			JLabel labelpin=new JLabel("PIN:");
			labelpin.setFont(new Font("Raleway",Font.BOLD, 20));
			labelpin.setBounds(100,590, 200, 30);
			add(labelpin);
			
			Pin=new JTextField();
			Pin.setBounds(300, 590, 400, 30);
			Pin.setFont(new Font("Raleway",Font.BOLD, 14));
			add(Pin);
			
			JLabel labelstate=new JLabel("State:");
			labelstate.setFont(new Font("Raleway",Font.BOLD, 20));
			labelstate.setBounds(100,640, 200, 30);
			add(labelstate);
			
			State=new JTextField();
			State.setBounds(300, 640, 400, 30);
			State.setFont(new Font("Raleway",Font.BOLD, 14));
			add(State);
			
			next=new JButton("Next");
			next.setBounds(620, 680,80, 30);
			next.setFont(new Font("Raleway", Font.BOLD, 14));
			next.setBackground(Color.BLACK);
			next.setForeground(Color.WHITE);
			next.addActionListener(this);
			add(next);
			
			
			
			getContentPane().setBackground(new Color(222,225,228));
			setLayout(null);
			setVisible(true);
			setSize(850, 800);
			setLocation(330, 10);
			
			
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String formno=num;
			String name1=name.getText();
			String Fname=fname.getText();
			String DOB=((JTextField)datechoose.getDateEditor().getUiComponent()).getText();		
			String gender=null;
				if(r1.isSelected()) {
				gender="Male";
				}else if(r2.isSelected()){
				gender="Female";
				}
			String Email=email.getText();
			String Marital=null;
				if(m1.isSelected()) {
				Marital="Married";
				}
				else if(m2.isSelected()) {
				Marital="UnMarried";
				}
				else if(m3.isSelected()) {
				Marital="Other";
				}
			String address=Address.getText();
			String City=city.getText();
			String pin=Pin.getText();
			String state=State.getText();
			
			try {
				if(name.getText().equals("")||Fname.equals("")||DOB.equals("")||
						address.equals("")||pin.equals("")) {
					JOptionPane.showMessageDialog(null, "fill all the field");
				}
				else {
					Conaction con1=new Conaction();
					String q="insert into Singup(form_no,name,father_name,dob,gender,email,marital_status,address,city,pin,state) values('"+formno+"','"+name1+"','"+Fname+"','"+DOB+"','"+gender+"','"+Email+"','"+Marital+"','"+address+"','"+City+"','"+pin+"','"+state+"')";
					con1.stmt.executeUpdate(q);
					new Singup2(num);
					setVisible(false);
					
				}
			}
			catch(Exception E) {
			 E.printStackTrace();
			}
}
		public static void main(String[] args) {
			new SignUp();
		
	}
	
}
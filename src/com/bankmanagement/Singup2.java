package com.bankmanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout.Group;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Singup2 extends JFrame implements ActionListener{
		String formno;
		JComboBox combobox,combobox1,combobox3,combobox4,combobox5;
		JTextField textpan,textadhaar;
		JRadioButton r1,r2,r3,r4;
		JButton next,back;
		
		
		Singup2(String formno){
			 super("Application Form");

			ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
			Image i2=i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
			ImageIcon i3=new ImageIcon(i2);
			JLabel image=new JLabel(i3);
			image.setBounds(150,5, 100, 100);
			add(image);
			
			this.formno=formno;
			
			JLabel l1=new JLabel("Page :2");
			l1.setBounds(300, 30,600, 40);
			l1.setFont(new Font("Raleway", Font.BOLD,22));
			add(l1);
			
			JLabel l2=new JLabel("Additional Details");
			l2.setBounds(300, 60,600, 40);
			l2.setFont(new Font("Raleway", Font.BOLD,22));
			add(l2);
						
			JLabel l3=new JLabel("Riligion :");
			l3.setFont(new Font("Raleway", Font.BOLD, 18));
			l3.setBounds(100, 150,100, 40);
			add(l3);
			
			
			
			String religion[]= {"Hindu","Muslim","Sikh","Christian","Other"};
			
			combobox =new JComboBox(religion);
			combobox.setBounds(300, 150, 320, 30);
			combobox.setBackground(new Color(222,225,228));
			combobox.setFont(new Font("Raleway", Font.BOLD, 14));
			add(combobox);
			
			JLabel l4=new JLabel("Category :");
			l4.setFont(new Font("Raleway", Font.BOLD, 18));
			l4.setBounds(100, 200,100, 40);
			add(l4);
			
			
			
			String Category[]= {"General","OBC","SC","St","other"};
			
			combobox1 =new JComboBox(Category);
			combobox1.setBounds(300, 200, 320, 30);
			combobox1.setBackground(new Color(222,225,228));
			combobox1.setFont(new Font("Raleway", Font.BOLD, 14));
			add(combobox1);
			
			JLabel l5=new JLabel("Income :");
			l5.setFont(new Font("Raleway", Font.BOLD, 18));
			l5.setBounds(100, 250,100, 40);
			add(l5);
			
			
			
			String Income[]= {"Null","<1,50,000","<2,50,000","<5,50,000","Upto 10,50,000","Above 10,50,000"};
			
			combobox3 =new JComboBox(Income);
			combobox3.setBounds(300, 250, 320, 30);
			combobox3.setBackground(new Color(222,225,228));
			combobox3.setFont(new Font("Raleway", Font.BOLD, 14));
			add(combobox3);
			
			JLabel l6=new JLabel("Education :");
			l6.setFont(new Font("Raleway", Font.BOLD, 18));
			l6.setBounds(100, 300,150, 40);
			add(l6);
			
			
			
			String education[]= {"Gradute","non-Gradute","Post-Gradute","Doctarate","Other"};
			
			combobox4=new JComboBox(education);
			combobox4.setBounds(300, 300, 320, 30);
			combobox4.setBackground(new Color(222,225,228));
			combobox4.setFont(new Font("Raleway", Font.BOLD, 14));
			add(combobox4);
			
			JLabel l7=new JLabel("Occupation :");
			l7.setFont(new Font("Raleway", Font.BOLD, 18));
			l7.setBounds(100, 350,150, 40);
			add(l7);
			
			
			
			String Occupation[]= {"Salaried","Self-Employee","Business","Student","Retierd","Other"};
			
			combobox5=new JComboBox(Occupation);
			combobox5.setBounds(300, 350, 320, 30);
			combobox5.setBackground(new Color(222,225,228));
			combobox5.setFont(new Font("Raleway", Font.BOLD, 14));
			add(combobox5);
			
			JLabel l8=new JLabel("PAN Number:");
			l8.setFont(new Font("Raleway", Font.BOLD, 18));
			l8.setBounds(100, 400,150, 40);
			add(l8);
			
			textpan =new JTextField();
			textpan.setFont(new Font("Raleway", Font.BOLD, 18));
			textpan.setBounds(300, 400,320, 30);
			add(textpan);
			
			JLabel l9=new JLabel("Aadhaar Number:");
			l9.setFont(new Font("Raleway", Font.BOLD, 18));
			l9.setBounds(100, 450,180, 40);
			add(l9);
			
			textadhaar =new JTextField();
			textadhaar.setFont(new Font("Raleway", Font.BOLD, 18));
			textadhaar.setBounds(300, 450,320, 30);
			add(textadhaar);
			
			JLabel l10=new JLabel("Senior Citizen:");
			l10.setFont(new Font("Raleway", Font.BOLD, 18));
			l10.setBounds(100, 500,180, 40);
			add(l10);
			
			
			r1=new JRadioButton("yes");
			r1.setFont(new Font("Raleway", Font.BOLD, 14));
			r1.setBounds(300, 500,80, 40);
			r1.setBackground(new Color(222,225,228));
			add(r1);
			

			r2=new JRadioButton("No");
			r2.setFont(new Font("Raleway", Font.BOLD, 14));
			r2.setBounds(380, 500,150, 40);
			r2.setBackground(new Color(222,225,228));
			add(r2);
			
			ButtonGroup ButtonGroup1=new ButtonGroup();
			ButtonGroup1.add(r1);
			ButtonGroup1.add(r2);
			
			JLabel l11=new JLabel("Existing Account:");
			l11.setFont(new Font("Raleway", Font.BOLD, 18));
			l11.setBounds(100, 550,180, 40);
			add(l11);
			
			
			r3=new JRadioButton("yes");
			r3.setFont(new Font("Raleway", Font.BOLD, 14));
			r3.setBounds(300, 550,80, 40);
			r3.setBackground(new Color(222,225,228));
			add(r3);
			

			r4=new JRadioButton("No");
			r4.setFont(new Font("Raleway", Font.BOLD, 14));
			r4.setBounds(380, 550,150, 40);
			r4.setBackground(new Color(222,225,228));
			add(r4);
			
			ButtonGroup ButtonGroup2=new ButtonGroup();
			ButtonGroup2.add(r3);
			ButtonGroup2.add(r4);
			
			
			JLabel l12=new JLabel("Form Number:");
			l12.setFont(new Font("Raleway", Font.BOLD, 18));
			l12.setBounds(600, 10,130, 30);
			add(l12);
			
			JLabel l13=new JLabel(formno);
			l13.setFont(new Font("Raleway", Font.BOLD, 18));
			l13.setBounds(750, 10,60, 30);
			add(l13);
			
			back=new JButton("Back");
			back.setFont(new Font("Raleway", Font.BOLD, 14));
			back.setBounds(460, 640,100, 30);
			back.setBackground(Color.BLACK);
			back.setForeground(Color.WHITE);
			back.addActionListener(this);
			add(back);
			
			next=new JButton("Next");
			next.setFont(new Font("Raleway", Font.BOLD, 14));
			next.setBounds(570, 640,100, 30);
			next.setBackground(Color.BLACK);
			next.setForeground(Color.WHITE);
			next.addActionListener(this);
			add(next);
			
			
			JLabel l0=new JLabel("Riligion");
			l0.setFont(new Font("Raleway", Font.BOLD, 18));
			l0.setBounds(100, 700,100, 40);
			add(l0);
			
			setVisible(true);
			setLayout(null);
			setSize(850, 750);
			setLocation(330, 20);
		
			getContentPane().setBackground(new Color(222,225,228));
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String rel=(String) combobox.getSelectedItem();
			String cat=(String) combobox1.getSelectedItem();
			String inc=(String) combobox3.getSelectedItem();
			String edu=(String) combobox4.getSelectedItem();
			String occu=(String) combobox5.getSelectedItem();
			
			String pan=textpan.getText();
			String aadhaar=textadhaar.getText();
			
			String scitizen=null;
			if(r1.isSelected()) {
				scitizen="yes";
			}else if(r2.isSelected()) {
				scitizen="No";
			}
			
			String eaccoount=null;
			if(r3.isSelected()) {
				eaccoount="yes";
			}else if(r4.isSelected()) {
				eaccoount="No";
			}
			
			try {
				if(e.getSource()==back) {
					new SignUp();
					setVisible(false);
				}
				else if(textpan.getText().equals("")||textadhaar.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Fill all the fields ");
				}
				else {
					 Conaction c1=new  Conaction();
					 String q="insert into Singup2 values('"+formno+"','"+rel+"','"+cat+"','"+inc+"','"+edu+"','"+occu+"','"
					 +pan+"','"+aadhaar+"','"+scitizen+"','"+eaccoount+"' )";
					 c1.stmt.executeUpdate(q);
					 new Singup3(formno);
					 setVisible(false);
				}
				
			}
			
			catch(Exception e1){
				e1.printStackTrace();
				
			}
		}
	
		public static void main(String[] args) {
				new Singup2("");
		}


	

}



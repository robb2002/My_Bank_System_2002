package com.bankmanagement;

import java.sql.*;

public class Conaction {
	
	Connection con;
	Statement stmt;
			
	public Conaction(){
		
		try {
			
			
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","Robin@2002!");
			stmt=con.createStatement();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		 catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
		
		
	}

	public static void main(String[] args) {
			

	}

}

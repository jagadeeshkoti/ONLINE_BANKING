package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class NonSelectQueryTest {

	public static void main(String[] args) throws Throwable {
		Connection con=null;
		int res=0;
		try
		{
			Driver driver=new Driver();
			
			DriverManager.registerDriver(driver);
			
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user2","root","root");
			 
			 Statement state = con.createStatement();
		     String query="insert into TY_03 values('API','SACHIN','BANGLORE',3),('MANUAL','ASHIS','BANGLORE',4);";
		     
		      res = state.executeUpdate(query);
		}
		catch(Exception e)
		     {
		    	 
		     }
		finally
		{
			if(res==2)
			{
				System.out.println("data is created ");
			}
			else
			{
				System.out.println("data is not created");
			}
			con.close();
		}

	}

}

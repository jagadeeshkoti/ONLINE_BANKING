package com.practice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQueryTest2 {

	public static void main(String[] args) throws Throwable {
		Connection con=null;
		try
		{
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user2","root","root");
		     Statement state = con.createStatement();
		     String query="select * from TY_03;";
		     ResultSet res = state.executeQuery(query);
		     while(res.next())
		     {
		    	 System.out.println(res.getString(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getString(4));
		     }
		
		
		}
catch(Exception e)
		{
	
		}
	finally {
		con.close();
	}
	
	}

}

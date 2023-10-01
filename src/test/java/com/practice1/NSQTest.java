package com.practice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class NSQTest {

	public static void main(String[] args) throws Throwable {
		Connection con=null;
		int res=0;
		try
		{
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user2","root","root");
		Statement state = con.createStatement();
		String query="insert into TY_03 values('SQL','MURALI','BANGLORE',1);";
		res = state.executeUpdate(query);
		
		}
		catch(Exception e)
		{
			System.out.println("HANDLED");
		}
finally {
	if(res==1)
	{
		System.out.println("CREATED");
	}
	else
	{
		System.out.println("NOT CREATED");
	}
con.close();
}
	}

}

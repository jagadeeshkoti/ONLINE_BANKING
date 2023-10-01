package com.practice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class NQueryTest {

	public static void main(String[] args) throws Throwable {
		Connection con=null;
		int res=0;
		try
		{
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user3","root","root");
			Statement state = con.createStatement();
			String query="insert into TY_04 values('INTERNET BANKING','JAGADEESH','BANGLORE',2),('APPLY DEBIT CARD','SWETHA','BANGLORE',2);";
		    res = state.executeUpdate(query);
		}
		catch(Exception e)
		{
			
		}
finally
{
	if(res==2)
	{
		System.out.println("DATA IS CREATED");
	}
	else
	{
		System.out.println("DATA IS NOT CREATED");
	}
	con.close();

}
	}

}

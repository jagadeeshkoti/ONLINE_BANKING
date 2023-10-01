package com.practice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SQueryTest {

	public static void main(String[] args) throws Throwable {
		Connection con=null;
try {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
	    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user3","root","root");
		Statement state = con.createStatement();
		String query="select * from TY_04;";
		ResultSet res = state.executeQuery(query);
		while(res.next())
		{
			System.out.println(res.getString(3));
		}

	}
catch(Exception e)
{
	System.out.println("HANDLED");
}
finally
{
	con.close();
}
}
}
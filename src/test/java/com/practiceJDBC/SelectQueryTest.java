package com.practiceJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class SelectQueryTest {

	public static void main(String[] args) throws SQLException {
	Connection con=null;
	Driver driver = new Driver();
	DriverManager.registerDriver(driver);
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra", "root", "root");
	Statement statement = con.createStatement();
	String query="select * from sample;";
	ResultSet res = statement.executeQuery(query);
	while(res.next())
{
		System.out.println(res.getString(1)+" "+res.getString(2)+" "+res.getString(3));
	}

	}

}

package com.practiceJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class NonSelectQueryTest {

	public static void main(String[] args) throws SQLException {
		Connection con=null;
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
	    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra","root", "root");
       Statement state = con.createStatement();
       String query="insert into sample values('Api','J','Banglore',2),('Sql','S','Hydrabad',3);";
       int res = state.executeUpdate(query);
       
	}

}

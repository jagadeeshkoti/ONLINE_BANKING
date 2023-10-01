package com.banking.genericUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DatabaseUtility {
	Connection con=null;
	/**
	 * This method is used to connect to DataBase
	 * @throws SQLException 
	 * @throws Throwable
	 */
	public void connectToDB() throws SQLException
	{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection(path.dbURL,path.dbUsername,path.dbPassword);
	}
	/**
	 * This method is used to execute query and get the data
	 * @param query
	 * @param columnNo
	 * @param ExpData
	 * @return
	 * @throws SQLException
	 */
	public String executeQueryAndGetData(String query,int columnNo,String ExpData) throws SQLException
	{
		ResultSet result = con.createStatement().executeQuery(query);
		boolean flag=false;
		while(result.next())
		{
			String data = result.getString(columnNo);
			if(data.equalsIgnoreCase(ExpData))
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("data is verified");
		  return ExpData;
		}
		else
		{
			System.out.println("data is not present");
			return "";
		}
	}
	/**
	 * This method is used close Database Connection
	 * @throws SQLException
	 */
	public void closeDB() throws Throwable
	{
		con.close();
	}
}

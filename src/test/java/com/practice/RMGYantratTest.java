package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

public class RMGYantratTest {

	public static void main(String[] args)  {
		String expdata="OBS_04";
		Connection con=null;
		
           WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("http://rmgtestingserver:8084/");
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           driver.findElement(By.xpath("//input[@id='usernmae']")).sendKeys("rmgyantra");
           driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("rmgy@9999");
           driver.findElement(By.xpath("//button[text()='Sign in']")).click();
           
           driver.findElement(By.xpath("//a[text()='Projects']")).click();
           driver.findElement(By.xpath("//span[text()='Create Project']")).click();
           
           driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys(expdata);
           driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("Deepak Sir");
           WebElement ele = driver.findElement(By.xpath("//select[@name='status']"));
           Select sel=new Select(ele);
           sel.selectByVisibleText("Created");
           
           driver.findElement(By.xpath("//input[@value='Add Project']")).click();
           boolean flag=false;
           try {
           //step1:register the database
           Driver driver1=new Driver();
           DriverManager.registerDriver(driver1);
            
            con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
           
           Statement state = con.createStatement();
           String query = "select * from project;";
           ResultSet res = state.executeQuery(query);
           flag=false;
           while(res.next())
           {
        	   String actual = res.getString(4);
        	   if(actual.equalsIgnoreCase(expdata))
        	   {
        		   flag=true;
        		   break;
        	   }
           }
           }
           catch (Exception e) {
			// TODO: handle exception
		}
           if(flag==true)
           {
        	   System.out.println("Project is created");
           }
           else
           {
        	   System.out.println("project is not created");
           }
           
           
           
           
           
           
	}

}

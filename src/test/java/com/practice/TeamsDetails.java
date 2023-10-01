package com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TeamsDetails {

	public static void main(String[] args) {
		String teamName = "Dabang Delhi K.C.";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.prokabaddi.com/standings");
		List<WebElement> teamNames = driver.findElements(By.xpath("//div[@class='row-head']//div[@class='team-name']"));
		for (WebElement team : teamNames) {
			if(team.getText().equalsIgnoreCase(teamName)) {
			 String position = driver.findElement(By.xpath("//div[@class='team-name']//p[.='"+teamName+"']/ancestor::div[@class='row-head']/div[@class='table-data position']/p[@class='position']")).getText();
			 System.out.println("Position of "+teamName+" is "+position);
			String  points = driver.findElement(By.xpath("//div[@class='team-name']/p[text()='"+teamName+"']/ancestor::div[@class='row-head']/descendant::div[@class='table-data matches-play']")).getText();
			 System.out.println("Points of "+teamName+" is "+points);
			 String won = driver.findElement(By.xpath("//div[@class='team-name']/p[text()='"+teamName+"']/ancestor::div[@class='row-head']/descendant::div[@class='table-data matches-won']")).getText();
			 System.out.println("Points of "+teamName+" is "+won);
			 break;
		}
//		System.out.println(driver.findElement(By.xpath("//p[.='Bengaluru Bulls']/ancestor::div[@class='row-head']")).getText());
	}
}
}

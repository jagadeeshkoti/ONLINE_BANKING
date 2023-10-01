package com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IccRankingTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//h4[.='T20I Team Rankings']/../../following-sibling::div/a[.='View Full Table']")).click();
List<WebElement> li = driver.findElements(By.xpath("//table/tbody/tr[*]/td[*]"));
for (WebElement single : li) {
	String text = single.getText();
	if(text.contains("Scotland"))
	{
		System.out.println("pass");
	}
}
	}

}

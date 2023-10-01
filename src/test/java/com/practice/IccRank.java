package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IccRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/womens/team-rankings/odi");
		List<WebElement> all = driver.findElements(By.xpath("//table/tbody/tr/td[3][text()<'15']/../td[2]/span[@class='u-hide-phablet']"));
     for (WebElement we : all) {
		String t = we.getText();
		System.out.println(t);
	}
	}

}

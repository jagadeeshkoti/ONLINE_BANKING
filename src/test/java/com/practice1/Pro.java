package com.practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pro {
  public static void main(String[] args) {
	  WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.prokabaddi.com/standings");
		List<WebElement> all = driver.findElements(By.xpath("//div[@class='table-body']/descendant::div[@class='table-data matches-won']/p[text()<'10']/../preceding-sibling::div[2]"));
		for (WebElement we : all) {
			String t = we.getText();
			System.out.println(t);
		}
		
}
}

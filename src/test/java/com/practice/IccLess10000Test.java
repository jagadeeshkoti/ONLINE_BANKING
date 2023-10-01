package com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IccLess10000Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul[@class='linked-list js-dynamic-list']/li[3]/button[@class='linked-list__dropdown-label js-dropdown-btn']")).click();
		driver.findElement(By.xpath("//div[@class='main-navigation__header u-hide-desktop']/descendant::a[@href='/rankings/mens/team-rankings']")).click();
		List<WebElement> allprice = driver.findElements(By.xpath("//tbody/tr/td[4][text()<'10000']/preceding-sibling::td[@class='table-body__cell rankings-table__team']/span[@class='u-hide-phablet']"));
	     for (WebElement single: allprice) {
			String p = single.getText();
			System.out.println(p);
		}
	
	
	}

}

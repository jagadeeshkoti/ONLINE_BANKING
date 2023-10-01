package com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Olymplic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String teamName="Belgium";
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		List<WebElement> Allteamname = driver.findElements(By.xpath("//div[@class='Tablestyles__Wrapper-sc-xjyvs9-0 imdvdL']/descendant::span[@class='styles__CountryName-sc-fehzzg-6 jYXabZ']"));
		for (WebElement we : Allteamname) {
			if(we.getText().equalsIgnoreCase(teamName))
			{
				String gold = driver.findElement(By.xpath("//div[@class='Tablestyles__Wrapper-sc-xjyvs9-0 imdvdL']/descendant::span[text()='"+teamName+"']/../following-sibling::div[1]")).getText();
			   System.out.println("The team which is having a gold medals" +gold);
			}
		}

	}

}

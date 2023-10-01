package com.practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cricbuzz.com/live-cricket-scores/73490/rsaw-vs-pakw-3rd-odi-icc-championship-match-south-africa-women-tour-of-pakistan-2023");
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-mini-col cb-bg-white cb-min-lv ng-scope']/div[2]/div[2]/div[3]/div"));
		for (WebElement single : ele) {
			String text = single.getText();
			System.out.print(text);
		}

	}

}

package com.practice1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.functors.AllPredicate;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones"+Keys.ENTER);
	//	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(10000);
		String checkedItem = driver.findElement(By.xpath("//input[@type='checkbox' and @checked]/ancestor::a[@class='a-link-normal s-navigation-item']/descendant::span[@class='a-size-base a-color-base a-text-bold']")).getText();
		System.out.println("*******Your selected phone is"+checkedItem+"**********");
		List<WebElement> allPrices = driver.findElements(By.xpath("//span[@class='a-price-whole'][number(translate(text(),',',''))<15000]"));
		List<WebElement> allPhones = driver.findElements(By.xpath("//span[@class='a-price-whole'][number(translate(text(),',',''))<15000]/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[@class='a-size-medium a-color-base a-text-normal']"));
		for(int i=0;i<allPhones.size();i++) {
			System.out.println(allPhones.get(i).getText());
			System.out.println(allPrices.get(i).getText());
			
		}
		driver.quit();
	}

}

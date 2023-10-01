package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Abhisek {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.xpath("//div[@class='grid grid-flow-col place-content-start gap-x-6 lg:py-1 xl:pb-2 xl:pt-3']/div[1]")).click();
		Thread.sleep(5000);

     WebElement kitchen = driver.findElement(By.xpath("//div[@id='headlessui-menu-items-:R176alm:']/nav/ul[1]/descendant::a[text()='Kitchen, Garden & Pets']/.."));
     Actions a=new Actions(driver);
       a.moveToElement(kitchen).perform();
   //   driver.findElement(By.xpath("//div[@id='headlessui-menu-items-:R176alm:']/nav/ul[2]/descendant::a[text()='Gardening']")).click();

	
	
	
	}
	
	

}

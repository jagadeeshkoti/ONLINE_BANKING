package mock1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart1 {
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
	Actions act=new Actions(driver);
	act.moveToElement(electronics).perform();
	WebElement lapacce = driver.findElement(By.xpath("//a[text()='Laptop Accessories']"));
	act.moveToElement(lapacce).perform();
	driver.findElement(By.xpath("//a[text()='Laptop Keyboards']")).click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

//	act.scrollByAmount(0, 3000).perform();
	
	Thread.sleep(5000);
    WebElement keyboard = driver.findElement(By.xpath("//a[text()='Razer Tartarus Pro - Analog Optical Mercury Wired USB G...']"));
//	wait.until(ExpectedConditions.elementToBeClickable(keyboard));
 	act.moveToElement(keyboard).perform();
	System.out.println(keyboard.getText());
	
   driver.quit();
}
}

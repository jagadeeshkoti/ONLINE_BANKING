package mock1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartTest {

	public static void main(String[] args) throws InterruptedException {
	//   int amount=0;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		WebElement lapacce = driver.findElement(By.xpath("//a[text()='Laptop Accessories']"));
		act.moveToElement(lapacce).perform();
		driver.findElement(By.xpath("//a[text()='Laptop Keyboards']")).click();
		   
		/*  WebElement scroll = driver.findElement(By.xpath("//a[text()='Portronics Key5 Combo, POR 1407 Wireless Laptop Keyboar...']"));
		    	 JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].scrollIntoview",scroll);
		   */  
	//	 WebElement scroll = driver.findElement(By.xpath("//a[text()='Portronics Key5 Combo, POR 1407 Wireless Laptop Keyboar...']"));
	//	 JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		act.scrollByAmount(0, 4000).perform();
		Thread.sleep(5000);
	      WebElement phonename = driver.findElement(By.xpath("//a[text()='Portronics Key5 Combo, POR 1407 Wireless Laptop Keyboar...']"));
	      String pname = phonename.getText();
	      System.out.println(pname);
		 WebElement price = driver.findElement(By.xpath("//a[text()='Portronics Key5 Combo, POR 1407 Wireless Laptop Keyboar...']/../descendant::div[@class='_30jeq3']"));
		 String price1 = price.getText();
		 System.out.println(price1);
       WebElement rating = driver.findElement(By.xpath("//a[text()='Portronics Key5 Combo, POR 1407 Wireless Laptop Keyboar...']/../descendant::div[@class='_3LWZlK']"));
       String r = rating.getText();
       System.out.println(r);
       driver.quit();
       
	
	}
		
		

	}



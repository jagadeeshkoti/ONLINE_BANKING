package finalmock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class mock {
	@Test
	public void amazon()
	{
		WebDriver d=new FirefoxDriver();
		d.get("https://www.amazon.in/");
		d.get("https://www.flipkart.com/");
	}

}

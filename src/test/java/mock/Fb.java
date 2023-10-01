package mock;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {

	public static void main(String[] args) {
		String month="December ";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.prokabaddi.com/standings");
		List<WebElement> all = driver.findElements(By.xpath("//div[@class='table standings-table']/descendant::p[text()='Jaipur Pink Panthers']/../../../following-sibling::div"));

		for(int i=0;i<all.size();i++)
		{
			String text = all.get(i).getText();
			System.out.println(text);
		}
		
		}
		
	}



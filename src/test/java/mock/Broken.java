package mock;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
       List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
       ArrayList<String> arr = new ArrayList<String>();
       for(int i=0;i<alllinks.size();i++)
       {
    	   WebElement we = alllinks.get(i);
    	   String att = we.getAttribute("href");
    	   try {
    		   URL url = new URL(att);
    	HttpURLConnection h = (HttpURLConnection)	url.openConnection();   
    	int statuscode = h.getResponseCode();
    	if(statuscode>=400)
    	{
    		arr.add(att+" "+statuscode);
    		System.out.println(att+" "+statuscode);
    	}
			
		} catch (Exception e) {
		arr.add(att);
		}
       }
	
	
	}

}

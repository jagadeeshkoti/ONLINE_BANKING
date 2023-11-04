package Grooming;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.cricbuzz.com/live-cricket-scores/80411/aus-vs-pak-10th-warm-up-game-icc-cricket-world-cup-warm-up-matches-2023");
		WebElement score = driver.findElement(By.xpath("//h2[@class='cb-font-20 text-bold inline-block ng-binding']/../../../../descendant::div[@class='cb-col-67 cb-col']/div[1]/div[2]/div[2]"));
		String text = score.getText();
		System.out.println(text);
	       
	}

}

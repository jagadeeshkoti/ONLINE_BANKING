package com.banking.genericUtils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebdriverUtility {

	/**
	 * This method is used maximize the browser
	 * @param driver
	 */
	public void maximizeTheBrowser(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * This method is used minimize the browser
	 * @param driver
	 */
	public void minimizeTheBrowser(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	/**
	 * This method will wait until elements in the page gets load
	 * @param driver
	 * @param duration
	 */
	public void implicitwait(WebDriver driver,int duration)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
	}
	/**
	 * This method will wait until the url of the page gets load
	 * @param driver
	 * @param duration
	 * @param expectedurl
	 */
	public void waitUntilUrlLoads(WebDriver driver,int duration,String expectedurl)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.urlContains(expectedurl));
	}
	/**
	 * This method will wait until the title of the page gets load
	 * @param driver
	 * @param duration
	 * @param expectedTitle
	 */
public void waituntilTitleLoads(WebDriver driver,int duration,String expectedTitle)
{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(duration));
	wait.until((ExpectedConditions.titleContains(expectedTitle)));
	
}
/**
 * This method will wait until the element in the page gets load
 * @param driver
 * @param duration
 * @param element
 */
     public void waituntilElementToBeClickable(WebDriver driver,int duration,WebElement element)
     
     {
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(duration));
    wait.until((ExpectedConditions.elementToBeClickable(element)));
     }
   /**
    * This method will ignore the NoSuchElementException and continues the execution
    * @param driver
    * @param duration
    */
     public void ignoreNoSuchElementException(WebDriver driver,int duration)
     {
    	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(duration));
    	 wait.ignoring(NoSuchElementException.class);
     }
     /**
      * This method will wait until the element to be visible in the page
      * @param element
      * @throws InterruptedException
      */
     public void customWait(WebElement element) throws InterruptedException
     {
    	 int count=0;
    	 while(count<20)
    	 {
    		 try {
    			 element.click();
    		 }catch(Exception e)
    		 {
    			 Thread.sleep(1000);
    			 count++;
    		 }
    	 }
     }
     /**
      * This method will select the dropdown element based on index
      * @param element
      * @param index
      */
    public void selectDropDown(WebElement element,int index)
    {
    	Select sel = new Select(element);
    	sel.selectByIndex(index);
    }
    /**
     * This method will select the dropdown element based on value 
     * @param element
     * @param value
     */
    public void selectDropDown(WebElement element,String value)
    {
    	Select sel = new Select(element);
    	sel.selectByValue(value);
    }
    /**
     * This method will select the dropdown element based on visible text
     * @param text
     * @param element
     */
   public void selectDropDown(String visibletext,WebElement element)
   {
	   Select sel = new Select(element);
	   sel.selectByVisibleText(visibletext);
   }
   /**
    * This method will used to mouseOver on an element
    * @param driver
    * @param element
    */
   public void mouseOverOnElement(WebDriver driver,WebElement element)
   {
	   Actions action = new Actions(driver);
	   action.moveToElement(element).perform();
   }
   /**
    * This method is used to rightclick on the element
    * @param driver
    * @param element
    */
    public void rightClick(WebDriver driver,WebElement element)
    {
	Actions action = new Actions(driver);
	action.contextClick().perform();
     }
    /**
     * This method is used to dragAnddrop on the element
     * @param driver
     * @param src
     * @param dst
     */
public void dragAnddrop(WebDriver driver,WebElement src,WebElement dst)
{
	Actions act = new Actions(driver);
	act.dragAndDrop(src, dst);
}
/**
 * This method is used to double click on the webpage
 * @param driver
 * @param element
 */
   public void doubleClickAction(WebDriver driver,WebElement element)
   {
	   Actions act = new Actions(driver);
	   act.doubleClick(element).perform();
   }
   /**
    * This method is used to click on enter button
    * @param driver
    */
     public void clickOnEnterKey(WebDriver driver)
     {
    	 Actions action = new Actions(driver);
    	 action.sendKeys(Keys.ENTER).perform();
     }
     /**
      * This method is used to press enter key
      * @param driver
      * @throws AWTException
      */
     public void enterKey(WebDriver driver) throws AWTException
     {
    	 Robot rb = new Robot();
    	 rb.keyPress(KeyEvent.VK_ENTER);
     }
     /**
      * This method is used to Release the key
      * @param driver
      * @throws AWTException
      */
     public void enterRelease(WebDriver driver) throws AWTException
     {
    	 Robot rb = new Robot();
    	 rb.keyRelease(KeyEvent.VK_ENTER);
     }
     /**
      * This method is used to switch from one frame to another using index
      * @param driver
      * @param index
      */
     public void switchFrame(WebDriver driver,int index)
     {
    	 driver.switchTo().frame(index);
     }
     /**
      * This method is used to switch from one frame to another using id
      * @param driver
      * @param id
      */
     public void switchFrame(WebDriver driver,String id)
     {
    	 driver.switchTo().frame(id);
     }
     /**
      * This method is used to switch from one frame to another using webelement
      * @param driver
      * @param element
      */
     public void switchFrame(WebDriver driver,WebElement element)
     {
    	 driver.switchTo().frame(element);
     }
     /**
      * This method is used to switch to main frame
      * @param driver
      */
     public void switchToMainFrame(WebDriver driver)
     {
    	 driver.switchTo().defaultContent();
     }
     /**
      * This method is used to accept alert popup
      * @param driver
      * @param expectedMsg
      */
     public void acceptAlertPopup(WebDriver driver)
     {
    	 Alert alt = driver.switchTo().alert();
    	
    	 alt.accept();
     }
     /**
      * This method is used to dismiss the alert popup
      * @param driver
      * @param expectedMsg
      */
     public void dismissAlertPopup(WebDriver driver,String expectedMsg)
     {
    	 Alert alt = driver.switchTo().alert();
    	 if(alt.getText().equalsIgnoreCase(expectedMsg))
    	 {
    		 System.out.println("alert ms is verified");
    	 }else {
    		 System.out.println("alert msg is not verified");
    	 }
     alt.dismiss();
     }
     /**
      * This method is used to switch from one window to another based on title
      * @param driver
      * @param expectedTitle
      */
     public void switchWindowBasedOnTitle(WebDriver driver,String expectedTitle)
     {
    	 Set<String> set = driver.getWindowHandles();
    	 for (String str : set) {
			driver.switchTo().window(str);
			String title = driver.getTitle();
			if(title.contains(expectedTitle))
			{
				break;
			}
		}
     }
     /**
      * This method is used to switch from one window to another based on URL
      * @param driver
      * @param expectedURL
      */
     public void switchWindowBasedOnUrl(WebDriver driver,String expectedURL)
     {
    	 Set<String> set = driver.getWindowHandles();
    	Iterator<String> it = set.iterator();
    	while(it.hasNext())
    	{
    		String wid = it.next();
    		driver.switchTo().window(wid);
    		String url = driver.getCurrentUrl();
    		if(url.contains(expectedURL))
    		{
    			break;
    		}
    		}
     }
     /**
      * This method is used to take screenshot whenever the testscripts getting failed
      * @param driver
      * @param screenShotName
      * @return
      */
     public String takeScreenshot(WebDriver driver,String screenShotName)
     {
    	 TakesScreenshot ts = (TakesScreenshot)driver;
    	 File src = ts.getScreenshotAs(OutputType.FILE);
    	 File dst = new File("./screenShots/"+screenShotName+".png");
    	 try {
    		 Files.copy(src, dst);
    	 }catch(IOException e){
         e.printStackTrace();
    	 }
    	 return screenShotName;
     }
     /**
     * This method is used to scrollTo perticular element
      * @param driver
      * @param element
      */
     public void scrollToPerticularElement(WebDriver driver,WebElement element)
     {
    	 JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollIntoview",element);
     }
    
     
     
     
}

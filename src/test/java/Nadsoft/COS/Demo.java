package Nadsoft.COS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo 
{
	
	public static WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException
	{
		 //To run scripts on chrome browser
		
		 System.setProperty("webdriver.chrome.driver", "/home/nadsoft1/Desktop/chromedriver");
		 driver = new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get("https://www.jet2.com/");
		 
		 
	}
	@Test
	public void testScript() throws InterruptedException, AWTException
	{
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("html/body/div[1]/div[1]")).click();
		driver.switchTo().defaultContent();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)", "");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=jet2]/div[5]/div[4]/div/div[3]/div/div[2]/form/div/div[2]/div/div[2]/div/label")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='jet2']/div[3]/div[4]/div/div[3]/div/div[2]/form/div/div[3]/div[1]/div/div/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=jet2]/div[5]/div[4]/div/div[3]/div/div[2]/div[1]/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=jet2]/div[5]/div[4]/div/div[3]/div/div[2]/div[1]/div[2]/div/div[2]/ul[1]/li[2]/a")).click();
		/*Thread.sleep(2000);*/
		driver.findElement(By.name("arrival_name")).sendKeys("Lee");
		/*Thread.sleep(500);*/
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		/*Thread.sleep(1000);*/
		
		driver.findElement(By.name("depart_date")).click();
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.className("ui-state-default ui-state-active"));
		action.moveToElement(ele);
		action.click().build().perform();

		
		
	}

}

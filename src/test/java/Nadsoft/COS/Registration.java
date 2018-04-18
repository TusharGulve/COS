package Nadsoft.COS;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Registration 
{
	public static WebDriver driver;
	
	@Test
	public void testScript() throws InterruptedException, AWTException
	{
		//testMode();
		registration();
		
	}
	
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException
	{
		 //To run scripts on chrome browser
		 System.setProperty("webdriver.chrome.driver", "/home/nadsoft1/Desktop/chromedriver");
		 driver = new ChromeDriver();  
		 
		// To Maximize the browser
		driver.manage().window().setPosition(new Point(0, 0));
		org.openqa.selenium.Dimension d = new org.openqa.selenium.Dimension(1900, 1900);
		//org.openqa.selenium.Dimension d = new org.openqa.selenium.Dimension(1366, 768);
		driver.manage().window().setSize(d);
		 
		driver.get("https://www.contractoros.net");
		Thread.sleep(8000);
		
	}
	
	public void testMode() throws InterruptedException
	{
		
		driver.get("https://www.contractoros.net/wp-login.php");
		Thread.sleep(5000);
		
		//Enter Username
		driver.findElement(By.id("user_login")).sendKeys("contractoros");
		Thread.sleep(200);
		
		//Enter Password
		driver.findElement(By.id("user_pass")).sendKeys("G/s7m8D^3jgb+_Uy@u!%2nf");
		Thread.sleep(200);
		
		//Click on Log In
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(1000);
		
		//Focus on Memberpress Menu
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.cssSelector("#toplevel_page_memberpress > a > div.wp-menu-name"));
		action.moveToElement(we).build().perform();
		Thread.sleep(2000);
				
		//Click on Options menu
		driver.findElement(By.cssSelector("#toplevel_page_memberpress > ul > li:nth-child(11) > a")).click();
		Thread.sleep(5000);
		
		//Click on Payments Tab
		driver.findElement(By.id("integration")).click();
		Thread.sleep(5000);
		
		//Click on Test Mode Checkbox
		driver.findElement(By.name("mepr-integrations[o1czkg-6xv][test_mode]")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(1000);
		
		//Click on Update Options button
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		
		System.out.println("Payment mode Changed Successfully");
		
		//Focus on Log Out Section
		Actions action1 = new Actions(driver);
		WebElement we1 = driver.findElement(By.cssSelector("#wp-admin-bar-my-account > a"));
		action1.moveToElement(we1).build().perform();
		Thread.sleep(2000);
						
		//Click on Log Out
		driver.findElement(By.cssSelector("#wp-admin-bar-logout > a")).click();
		Thread.sleep(5000);
	}
	
	public void registration() throws InterruptedException
	{
		testMode();  // Call Test Mode Method
		
		//Click on Start My Trial
		driver.findElement(By.linkText("Start My Trial")).click();
		Thread.sleep(8000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		
		// Enter Full Name
		driver.findElement(By.name("form_full_name")).sendKeys("NadTest QAUser");
		Thread.sleep(2000);
		
//*		// Enter Company Name
		driver.findElement(By.name("form_company_name")).sendKeys("NadQaTestComp05thMar");
		Thread.sleep(2000);
		
//*		// Enter Email Address
		driver.findElement(By.name("form_email")).sendKeys("nadsoft.test02@gmail.com");
		Thread.sleep(2000);
		
		// Enter Password
		driver.findElement(By.name("form_password")).sendKeys("nadsoft123");
		Thread.sleep(2000);
		
		// Click on Submit and Continue to Step 2 Button
		driver.findElement(By.cssSelector("#step1 > div > div.column-2.w-col.w-col-7 > div > button")).click();
		Thread.sleep(5000);
		
		/*JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,-300)", "");
		Thread.sleep(2000);*/
		
		driver.findElement(By.cssSelector("#email-form-2 > div")).click();  // Click on Dropdown
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Building Contractor")).click();  // Select Template Category
		Thread.sleep(8000);
		
		/*driver.findElement(By.cssSelector("#registerForm > div.templlate-selector-roofer > div.row.w-row.template-pagination-row > div.submit-button.w-button.nextPage")).click();  // Click on Next Button
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#registerForm > div.templlate-selector-roofer > div.row.w-row.template-pagination-row > div.submit-button.w-button.nextPage")).click();  // Click on Next Button
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#registerForm > div.templlate-selector-roofer > div.row.w-row.template-pagination-row > div.submit-button.w-button.prevPage")).click();  // Click on Previous Button
		Thread.sleep(8000);*/
		
		driver.findElement(By.id("template_1")).click();  // Select Template
		Thread.sleep(5000);
		
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		
		/*WebElement ele = driver.findElement(By.id("buy_domain"));  // Select Purchase Domain Option
		ele.click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("form_domain")).sendKeys("nadqatest"); //Enter domain name
		Thread.sleep(8000);
		
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		
		WebElement ele2 = driver.findElement(By.id("own_domain"));  //Select Transfer Domain Option
		ele2.click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("form_domain_existing")).sendKeys("tushar.us"); //Enter domain name
		Thread.sleep(3000);
		
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("window.scrollBy(0,-300)", "");
		Thread.sleep(1000);
		
		WebElement ele3 = driver.findElement(By.id("default_free_domain"));  // Select Free Domain Option
		ele3.click();
		Thread.sleep(5000);
		
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(1000);*/

		// Click on Next Step Button
		driver.findElement(By.cssSelector("#step3 > div > button")).click();
		Thread.sleep(8000);
		
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(1000);
		
		driver.findElement(By.id("mepr-address-one")).sendKeys("J.M. Road"); //Enter Address 1
		Thread.sleep(1000);
		
		driver.findElement(By.id("mepr-address-two")).sendKeys("Deccan"); //Enter Address 2
		Thread.sleep(1000);
		
		driver.findElement(By.id("mepr-address-city")).sendKeys("Pune"); //Enter City
		Thread.sleep(1000);
		
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(1000);
		
		// Select Country from dropdown
		WebElement country_dropdown = driver.findElement(By.id("mepr-address-country"));
	  	Select country_dd = new Select(country_dropdown);
	  	
	  	//It will select India
	  	country_dd.selectByValue("IN");
	  	Thread.sleep(2000);
		
	  	
	    // Select State from dropdown
	  	WebElement state_dropdown = driver.findElement(By.id("mepr-address-state-dropdown"));
	  	Select state_dd = new Select(state_dropdown);
	  	
	  	
	  	//It will select Maharashtra
	  	state_dd.selectByValue("MH");
	  	Thread.sleep(2000);
	  	
	  	JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(1000);
		
		driver.findElement(By.id("mepr-address-zip")).sendKeys("411004"); //Enter Zip
		Thread.sleep(1000);
		
		driver.findElement(By.id("mepr_referral")).sendKeys("From Friends"); //Enter Reference
		Thread.sleep(1000);
		
		driver.findElement(By.id("mepr_phone_number")).sendKeys("09766648949"); //Enter Mobile Number
		Thread.sleep(1000);
//**		
		driver.findElement(By.id("user_login")).sendKeys("NadQaTestComp05thMar"); //Enter UserName ***
		Thread.sleep(1000);
		
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(1000);
		
		//Select Terms Checkbox
		if ( !driver.findElement(By.id("mepr_agree_to_tos")).isSelected() )
		{
		     driver.findElement(By.id("mepr_agree_to_tos")).click();
		     Thread.sleep(2000);
		}
		
		//Select Email Checkbox
		if ( !driver.findElement(By.id("meprgetresponse_opt_in")).isSelected() )
		{
			driver.findElement(By.id("meprgetresponse_opt_in")).click();
		}
		
		// Click on Submit and Continue
		driver.findElement(By.cssSelector("#step4 > div:nth-child(2) > div > div > form > input.mepr-submit.submit-button.w-button")).click();
		Thread.sleep(10000);
		
		//Verify Total Amount
		String acttotalamt = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div/article/div/div[1]/table/tfoot/tr/th[2]")).getText();
		String exptotalamt = "$1.00";
		Assert.assertEquals(acttotalamt, exptotalamt);
		Thread.sleep(1000);
		
		//Enter Credit card details
		driver.switchTo().frame("__privateStripeFrame3");
		driver.findElement(By.cssSelector("#root > form > div > div.CardField-input-wrapper.is-ready-to-slide > span.CardField-number.CardField-child > span:nth-child(2) > label > input")).sendKeys("4242424242424242");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#root > form > div > div.CardField-input-wrapper.is-ready-to-slide > span.CardField-expiry.CardField-child > span > label > input")).sendKeys("0521");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#root > form > div > div.CardField-input-wrapper.is-ready-to-slide > span.CardField-cvc.CardField-child > span > label > input")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#root > form > div > div.CardField-input-wrapper.is-ready-to-slide > span.CardField-postalCode.CardField-child > span > label > input")).sendKeys("411004");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		//Click on Submit
		driver.findElement(By.cssSelector("#mepr-stripe-payment-form > input.mepr-submit")).click();
		Thread.sleep(8000);
		
		
		System.out.println("Registration Successfull.");
		
		//testMode();  // Call Test Mode Method again to put it in live mode
	
	}

}

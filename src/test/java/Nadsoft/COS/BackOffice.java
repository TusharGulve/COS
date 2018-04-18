package Nadsoft.COS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BackOffice 
{
	public static WebDriver driver;
	
	@Test
	public void testScript() throws InterruptedException, AWTException
	{
		//testMode();
		registration();
		//userLogin();
		//beforeSync();
		//afterSyncFromBackoffice();
		//afterSyncFromAdminPanel();
		//quickSync();
		//wpAdmin();
		//domainOperation();
		//otherOperation();
		//resetWebsite();
		//cancelSubscription();
		//deleteAccount();
		
		
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
		driver.findElement(By.name("form_company_name")).sendKeys("NadQATestCompany");
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
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.id("buy_domain"));  // Select Purchase Domain Option
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
		Thread.sleep(1000);

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
		driver.findElement(By.id("user_login")).sendKeys("nadqatestcompany"); //Enter UserName ***
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
	
	public void userLogin() throws InterruptedException
	{
		//Click on Login
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(8000);
		
//*		//Enter Username
		driver.findElement(By.id("user_login")).sendKeys("nadqatestcompany");
		Thread.sleep(2000);
		
		//Enter Password
		driver.findElement(By.id("user_pass")).sendKeys("nadsoft123");
		Thread.sleep(2000);
		
		//Click on Log In
		driver.findElement(By.id("wp-submit")).click();
	  	
		WebDriverWait wait = new WebDriverWait(driver, 10);
	  	
	  	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#fl-post-1974 > div > div.fl-builder-content.fl-builder-content-1974.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-full-width.fl-row-bg-color.fl-node-58c458e57c166 > div > div > div > div > div > div > div > h1 > span")));
	  	
	  	boolean status = element.isDisplayed();
	  	
	  	if(status)
	  	{
	  		System.out.println("User Logged In Successfully.");
	  	}
	  	else
	  	{
	  		System.out.println("User is not Logged In.");
	  	}
	  	
	}
	
	public void beforeSync() throws InterruptedException, AWTException
	{
	  	
	   //	======================= Dashboard Operation Started =========================================
	  	
	    // open the second tab - Website URL
	  	String ParentWindowHandle = driver.getWindowHandle();
	  	String childTab1 = ParentWindowHandle;
	  	String childTab2 = childTab1;
	  	//System.out.println("ParentWindowHandle" + ParentWindowHandle);
	  	
	  	// Click on Website URL
	  	driver.findElement(By.cssSelector("#fl-post-1974 > div > div.fl-builder-content.fl-builder-content-1974.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-58f6314bde0d7 > div > div > div.fl-col-group.fl-node-58f6314be9dd5.fl-col-group-equal-height.fl-col-group-align-top > div.fl-col.fl-node-58f6314bea154.fl-col-small > div > div.fl-module.fl-module-rich-text.fl-node-58f68b1b93c88 > div > div > p:nth-child(2) > a")).click();
	  	Thread.sleep(5000);
	  	
	  	System.out.println(driver.getTitle());  // Print Parent window Title
	  	
	  	 for (String Handle : driver.getWindowHandles())
	     {
	         if (!childTab1.equals(Handle))
	         {
	        	 childTab1 = Handle;
	             driver.switchTo().window(childTab1);
	             Thread.sleep(5000);
	         }

	     }
	  	
	  	Thread.sleep(5000);
	  	
	  	System.out.println(driver.getTitle());  // Print Child window Title
	  	
	    // Phone Number Verification
	  	String actPhone = driver.findElement(By.cssSelector("#top > div > div > div > div > div > div > div.fl-col.fl-node-5876a92c3b714.fl-col-small > div > div > div > h5 > span > a")).getText();
	  	String expPhone = "(976) 664-8949";
	  	Assert.assertEquals(actPhone, expPhone);
	  	Thread.sleep(5000);
	  	
        /*WebDriverWait wait1 = new WebDriverWait(driver, 20);
	  	
	  	WebElement element1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#fl-post-3 > div > div.fl-builder-content.fl-builder-content-3.fl-builder-content-primary > div.fl-row.fl-row-full-width.fl-row-bg-color.fl-node-58764310e9e34 > div > div > div > div > div > div > div.fl-col.fl-node-5876434ade936.fl-col-small > div > div > div > div > h2 > span")));
	  	
	  	boolean status1 = element1.isDisplayed();
	  	
	  	if(status1)
	  	{
	  		System.out.println("Company Name Visible");
	  	}
	  	else
	  	{
	  		System.out.println("Company Name Not Visible");
	  	}*/
	  	
//*	     // Company Name Verification
	  	String actcomp = driver.findElement(By.cssSelector("#fl-post-3 > div > div.fl-builder-content.fl-builder-content-3.fl-builder-content-primary > div.fl-row.fl-row-full-width.fl-row-bg-color.fl-node-58764310e9e34 > div > div > div > div > div > div > div.fl-col.fl-node-5876434ade936.fl-col-small > div > div > div > div > h2 > span")).getText();
	  	String expcomp = "NADQATESTCOMPANY";
	  	Assert.assertEquals(actcomp, expcomp);
	  	
	  	JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(1000);
	  	
	    /*// Address Verification on Content
	  	String actadd = driver.findElement(By.cssSelector("#company > div > div > div.fl-col-group.fl-node-58756fb62b4aa > div > div > div > div > div > p:nth-child(1) > strong:nth-child(2)")).getText();
	  	String expadd = "Pune MH";
	  	Assert.assertEquals(actadd, expadd);*/
	  	
	  	JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,-600)", "");
		Thread.sleep(1000);
		
		// Click on SCHEDULE YOUR FREE IN HOME ESTIMATE TODAY
		driver.findElement(By.cssSelector("#fl-post-3 > div > div.fl-builder-content.fl-builder-content-3.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-full-width.fl-row-bg-photo.fl-node-586ee10ab1ae5 > div > div > div.fl-col-group.fl-node-586ef6090f41b > div > div > div > div > div > a > span")).click();
		Thread.sleep(3000);
		
		//Scroll the page to top
		WebElement ele = driver.findElement(By.cssSelector("#fl-post-3 > div > div.fl-builder-content.fl-builder-content-3.fl-builder-content-primary > div.fl-row.fl-row-full-width.fl-row-bg-color.fl-node-58764310e9e34 > div > div > div > div > div > div > div.fl-col.fl-node-5876434ade936.fl-col-small > div > div > div > div > h2 > span"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView();", ele);
		Thread.sleep(2000);
		
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(1000);
		
		// Click on Contact Us
		driver.findElement(By.cssSelector("#fl-post-3 > div > div.fl-builder-content.fl-builder-content-3.fl-builder-content-primary > div.fl-row.fl-row-full-width.fl-row-bg-color.fl-node-586ef95235bc5 > div > div.fl-row-content.fl-row-fixed-width.fl-node-content > div > div > div > div > div.fl-col.fl-node-586ef9a2503ab.fl-col-small > div > div > div > div > a")).click();
		Thread.sleep(3000);                
		
//*		// Verify Company Name on Map
		String actComponMap = driver.findElement(By.cssSelector("#firstHeading")).getText();
		String expComponMap = "NADQATESTCOMPANY";
		Assert.assertEquals(actComponMap, expComponMap);
		Thread.sleep(1000);
		
		// Verify Address on Map
		String actAddonMap = driver.findElement(By.cssSelector("#bodyContent")).getText();
		String expAddonMap = "J.M. Road Deccan Pune, MH IN 411004";
		Assert.assertEquals(actAddonMap, expAddonMap);
		Thread.sleep(1000);
		
				
		//Scroll the page to top
		WebElement ele2 = driver.findElement(By.cssSelector("#fl-post-3 > div > div.fl-builder-content.fl-builder-content-3.fl-builder-content-primary > div.fl-row.fl-row-full-width.fl-row-bg-color.fl-node-58764310e9e34 > div > div > div > div > div > div > div.fl-col.fl-node-5876434ade936.fl-col-small > div > div > div > div > h2 > span"));
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].scrollIntoView();", ele2);
		Thread.sleep(2000);
		
	  	driver.findElement(By.linkText("FREE ESTIMATE")).click();
	  	Thread.sleep(2000);
	  	
	  	JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(3000);
		
		// Fill Free Estimate Form
		driver.findElement(By.name("csbfname")).sendKeys("Test"); // First Name
		Thread.sleep(1000);
		
		driver.findElement(By.name("csblname")).sendKeys("User"); // Last Name
		Thread.sleep(1000);
		
		driver.findElement(By.name("csbemail")).sendKeys("tushar@nadsoftdev.com"); // Email Address
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("#estimate_form > div:nth-child(6) > div > span > span.selection > span")).click(); // Country Code Dropdown
		Thread.sleep(500);
		
		driver.findElement(By.cssSelector("body > span > span > span.select2-search.select2-search--dropdown > input")).sendKeys("+91");
		Thread.sleep(500);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		driver.findElement(By.id("phone")).sendKeys("8390600540");
		Thread.sleep(1000);
		
		// Best time to call is
		WebElement time_dropdown = driver.findElement(By.id("csbtime"));
	  	Select time_dd = new Select(time_dropdown);
	  	
	  	//It will select In the morning
	  	time_dd.selectByIndex(1);
	  	Thread.sleep(2000);
	  	
	  	driver.findElement(By.name("csbaddress")).sendKeys("FC Road"); // Street Address
		Thread.sleep(1000);
		
		driver.findElement(By.name("csbcity")).sendKeys("Pune"); // City
		Thread.sleep(1000);
		
		// It will Select State
		WebElement state_dropdown = driver.findElement(By.id("csbstate"));
		Select state_dd = new Select(state_dropdown);
			  	
		//It will select California
		state_dd.selectByVisibleText("California");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("csbzip")).sendKeys("411004"); // Zip
		Thread.sleep(1000);
		
		WebElement apt_dropdown = driver.findElement(By.name("csbstart"));
	  	Select apt_dd = new Select(apt_dropdown);
	  	
	  	//It will select Within two weeks
	  	apt_dd.selectByIndex(2);
	  	Thread.sleep(2000);
	  	
	  	driver.findElement(By.name("csbappointment")).clear();
	  	driver.findElement(By.name("csbappointment")).sendKeys("11/27/2017 11:30 PM");
	  	Thread.sleep(1000);
	  	
	  	driver.findElement(By.name("csbinfo")).sendKeys("Test additional project info");
	  	Thread.sleep(1000);
	  	
	  	WebElement style_dropdown = driver.findElement(By.name("csbstyle"));
	  	Select style_dd = new Select(style_dropdown);
	  	
	  	//It will select Cape
	  	style_dd.selectByIndex(2);
	  	Thread.sleep(2000);
	  	
	  	WebElement house_dropdown = driver.findElement(By.name("csbhouseage"));
	  	Select house_dd = new Select(house_dropdown);
	  	
	  	//It will select 11-20 Years Old
	  	house_dd.selectByIndex(3);
	  	Thread.sleep(2000);
	  	
	  	JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(3000);
	  	
	  	WebElement houselived_dropdown = driver.findElement(By.name("csblived"));
	  	Select houselived_dd = new Select(houselived_dropdown);
	  	
	  	//It will select 3-8 Years
	  	houselived_dd.selectByIndex(3);
	  	Thread.sleep(2000);
	  	
	  	WebElement age_dropdown = driver.findElement(By.name("csbage"));
	  	Select age_dd = new Select(age_dropdown);
	  	
	  	//It will select 46-55
	  	age_dd.selectByIndex(4);
	  	Thread.sleep(2000);
	  	
	  	WebElement website_dropdown = driver.findElement(By.name("csbwebsite"));
	  	Select website_dd = new Select(website_dropdown);
	  	
	  	//It will select NewsPaper
	  	website_dd.selectByIndex(8);
	  	Thread.sleep(2000);
	  	
	  	driver.findElement(By.name("csbcomments")).sendKeys("Test additional comments");
	  	Thread.sleep(7000);
	  	
	  	// Click on submit
	  	driver.findElement(By.cssSelector("#estimate_form > input[type=submit]:nth-child(29)")).click();
	  	Thread.sleep(8000);
	  	
	  	/*driver.findElement(By.linkText("FREE ESTIMATE")).click();
	  	Thread.sleep(2000);
	  	
	  	JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(1000);*/
		
		String actFreeEstMsg = driver.findElement(By.cssSelector("#services > div > div > div > div.fl-col.fl-node-5876b3e6c7f37 > div > div.fl-module.fl-module-rich-text.fl-node-58758ba66801a.fl-animation.fl-slide-left.fl-animated > div > div > p > span")).getText();
		String expFreeEstMsg = "Your estimate was submitted successfully!";
		Assert.assertEquals(actFreeEstMsg, expFreeEstMsg);
		System.out.println("Free Estimate submitted successfully.");
		
		// Click on Seal Image
		driver.findElement(By.cssSelector("#fl-post-3 > div > div.fl-builder-content.fl-builder-content-3.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-full-width.fl-row-bg-color.fl-node-587692a74f3c1 > div > div > div > div > div > div > div > div > div > a > img")).click();
		Thread.sleep(5000);                              
		
		for (String Handle : driver.getWindowHandles())
	     {
	         if (!childTab2.equals(Handle))
	         {
	        	 childTab2 = Handle;
	             driver.switchTo().window(childTab2);
	             Thread.sleep(5000);
	         }

	     }
	  	Thread.sleep(7000);
	  	
	  	System.out.println(driver.getTitle());  // Print Grand Child window Title
	  	
//*	  	// Verify Company Name
	  	String actComp = driver.findElement(By.xpath("html/body/div[1]/main/section/div/article/div/section/div/div/div/h1")).getText();
	  	String expComp = "NadQATestCompany";                           
	  	Assert.assertEquals(actComp, expComp);
	  	
	    // Verify User Name
	  	String actuser = driver.findElement(By.xpath("html/body/div[1]/main/section/div/article/div/section/div/div/div/h5")).getText();
	  	String expuser = "NadTest QAUser"; 
	  	Assert.assertEquals(actuser, expuser); 
	  	
	  	/*// Verify phone Number
	  	String actPhones = driver.findElement(By.cssSelector("#post-99626 > div > section > div > div > div > h6 > a")).getText();
	  	String expPhones = "(976) 664-8949"; 
	  	Assert.assertEquals(actPhones, expPhones);*/
	  	
	  	System.out.println("toprated site details verified successfully.");
	  	
	  	driver.close();  // Close Grand Child window
	  	Thread.sleep(3000);
	  	driver.switchTo().window(childTab1);
	  	
	  	driver.close();  // Close Child window
	  	Thread.sleep(3000);
	  	driver.switchTo().window(ParentWindowHandle);		
	}
	
public void afterSyncFromBackoffice() throws InterruptedException, AWTException
	
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(1000);
		
		// Click on Edit My Website Section
		driver.findElement(By.id("my_website_section-0")).click();  //Edit My website section
		Thread.sleep(1000);
		
		// Click on Basic Website editor
		driver.findElement(By.cssSelector("#my_website_section-0 > div.uabb-adv-accordion-content.uabb-adv-accordion-content58f6833b40efd.fl-clearfix > div.fl-builder-content.fl-builder-content-2072.fl-builder-template.fl-builder-layout-template.fl-builder-global-templates-locked > div > div > div > div > div > div > div.fl-module.fl-module-button.fl-node-58f67b92acac9.website-popup > div > div > a > span")).click();
		Thread.sleep(2000);
		
		//Close Basic Website editor by clicking close button
		driver.findElement(By.cssSelector("#setupWebsiteForm > div.modal-body > div > div > div > div > div.setup-website-btn-pane > div.setup-website-btn.setup-website-close-pane > button")).click();
		Thread.sleep(2000);
		
		// Again Click on Basic Website editor
		driver.findElement(By.cssSelector("#my_website_section-0 > div.uabb-adv-accordion-content.uabb-adv-accordion-content58f6833b40efd.fl-clearfix > div.fl-builder-content.fl-builder-content-2072.fl-builder-template.fl-builder-layout-template.fl-builder-global-templates-locked > div > div > div > div > div > div > div.fl-module.fl-module-button.fl-node-58f67b92acac9.website-popup > div > div > a > span")).click();
		Thread.sleep(2000);
		
		// ======================== Basic Website Editor ==========================================
		
		driver.findElement(By.id("fullname")).sendKeys("A"); // Update Full Name
		Thread.sleep(500);
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("nadqatestA@test.com"); // Update Email
		Thread.sleep(500);
		
		driver.findElement(By.id("contact_phone")).clear();
		driver.findElement(By.id("contact_phone")).sendKeys("(987) 654-3211"); // Update Phone
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("#general > div:nth-child(5) > label > i")).click(); // Click on seal image tooltip
		Thread.sleep(7000);
		
		//Click on Company Details Tab
		driver.findElement(By.cssSelector("#setupWebsiteForm > div.modal-body > div > div > div > div > ul > li:nth-child(2) > a")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("company_name")).sendKeys("A"); // Update Company Name
		Thread.sleep(500);
		
		driver.findElement(By.id("company_tag_line")).clear();
		driver.findElement(By.id("company_tag_line")).sendKeys("We Make it Simple."); // Update Tag Line
		Thread.sleep(500);
		
		driver.findElement(By.id("comp_email")).clear();
		driver.findElement(By.id("comp_email")).sendKeys("nadqatestB@test.com"); // Update Email
		Thread.sleep(500);
		
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("Borivali"); // Update Address
		Thread.sleep(500);
		
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;  
		jse1.executeScript("window.scrollBy(0,300)", "");
		
		driver.findElement(By.id("address2")).clear();
		driver.findElement(By.id("address2")).sendKeys("West"); // Update Address 2
		Thread.sleep(500);
		
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("Mumbai"); // Update City
		Thread.sleep(500);
		
		driver.findElement(By.id("state")).clear();
		driver.findElement(By.id("state")).sendKeys("Maharashtra"); // Update State
		Thread.sleep(500);
		
		driver.findElement(By.id("country")).clear();
		driver.findElement(By.id("country")).sendKeys("India"); // Update Country
		Thread.sleep(500);
		
		driver.findElement(By.id("zip")).clear();
		driver.findElement(By.id("zip")).sendKeys("400092"); // Update Zip
		Thread.sleep(500);
		
		driver.findElement(By.id("comp_phone")).clear();
		driver.findElement(By.id("comp_phone")).sendKeys("(987) 654-3212"); // Update Phone
		Thread.sleep(5000);
		
		WebElement DIVelement = driver.findElement(By.cssSelector("#company > div:nth-child(12) > label:nth-child(1)"));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", DIVelement);
		Thread.sleep(5000);
		
		/*// click on company Logo option
		WebElement compLogo_radio_button = driver.findElement(By.cssSelector("#company > div:nth-child(12) > label:nth-child(4)"));
		compLogo_radio_button.click();
		Thread.sleep(3000);
		
		// Click on Browse button
		driver.findElement(By.id("company_logo")).click();
		Thread.sleep(5000);
		
		// Specify the file location with extension
		StringSelection sel = new StringSelection("C:\\Users\\Admin\\Desktop\\images\\download (1).jpg");

		// Copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		System.out.println("selection" +sel);
				
		// Create object of Robot class
		Robot robot = new Robot();
		Thread.sleep(1000);
						
		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);

		// Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);
						
		// Press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		// Release CTRL+V
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);

		//Press Enter 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);	*/
		
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;  
		jse3.executeScript("window.scrollBy(0,200)", "");
		
		driver.findElement(By.id("site_description")).clear();
		driver.findElement(By.id("site_description")).sendKeys("NadsoftTest QA Description.");
		Thread.sleep(5000);
		
		//Scroll the page to top
		WebElement ele = driver.findElement(By.cssSelector("#setupWebsiteForm > div.modal-header > h2"));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView();", ele);
	    Thread.sleep(5000);
	    
	    //Click on Social Details Tab
	    driver.findElement(By.cssSelector("#setupWebsiteForm > div.modal-body > div > div > div > div > ul > li:nth-child(3) > a")).click();
	    Thread.sleep(5000);
	    
	    //Enter Facebook URL
	    driver.findElement(By.id("facebook")).clear();
	    driver.findElement(By.id("facebook")).sendKeys("https://www.facebook.com/Nadsoft"); 
	    Thread.sleep(5000);
	    
	    //Click on Site Content Tab
	    driver.findElement(By.cssSelector("#setupWebsiteForm > div.modal-body > div > div > div > div > ul > li:nth-child(4) > a")).click();
	    Thread.sleep(5000);
	    
	    JavascriptExecutor jse4 = (JavascriptExecutor) driver;  
		jse4.executeScript("window.scrollBy(0,200)", "");
		
		
		//Add Text in Editor
		driver.findElement(By.cssSelector("#service_container > div.note-editor > div.note-editable")).sendKeys("Test Content One");
		Thread.sleep(5000);
		
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;  
		jse5.executeScript("window.scrollBy(0,500)", "");
		
		//Add Text in Editor
		driver.findElement(By.cssSelector("#roofing_services_container > div.note-editor > div.note-editable")).sendKeys("Test Content two");
		Thread.sleep(5000);
		
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;  
		jse6.executeScript("window.scrollBy(0,600)", "");
		
		// Click on Save
		driver.findElement(By.cssSelector("#setupWebsiteForm > div.modal-body > div > div > div > div > div.setup-website-btn-pane > div.setup-website-btn.save_site_info > button")).click();
		Thread.sleep(5000);
		
		System.out.println("Website information saved successfully");
		Thread.sleep(2000);
		
		JavascriptExecutor jsnew = (JavascriptExecutor) driver;  
		jsnew.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(2000);
		
		
		
		//================= Now started to verify that Synchronization happen or not =========================
		
		String ParentWindowHandle = driver.getWindowHandle();
		String childTab1 = ParentWindowHandle;
		String childTab2 = childTab1;
		String childTab3 = ParentWindowHandle;
		

		// Click on Preview Website button
		driver.findElement(By.cssSelector("#setupWebsiteForm > div.modal-body > div > div > div > div > div.setup-website-btn-pane > div.setup-website-btn.preview_website_pane > button")).click();
		Thread.sleep(5000);

		for (String Handle : driver.getWindowHandles())
			     {
			         if (!childTab1.equals(Handle))
			         {
			        	 childTab1 = Handle;
			             driver.switchTo().window(childTab1);
			             Thread.sleep(5000);
			         }

			     }
			  	
		Thread.sleep(5000);

		// Phone Number Verification
		String actPhone = driver.findElement(By.cssSelector("#top > div > div > div > div > div > div > div.fl-col.fl-node-5876a92c3b714.fl-col-small > div > div > div > h5 > span > a")).getText();
		String expPhone = "(987) 654-3212";
		Assert.assertEquals(actPhone, expPhone);
		Thread.sleep(5000);
			  	
		/*WebDriverWait wait1 = new WebDriverWait(driver, 20);
			  	
		WebElement element1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#fl-post-3 > div > div.fl-builder-content.fl-builder-content-3.fl-builder-content-primary > div.fl-row.fl-row-full-width.fl-row-bg-color.fl-node-58764310e9e34 > div > div > div > div > div > div > div.fl-col.fl-node-5876434ade936.fl-col-small > div > div > div > div > h2 > span")));
			  	
	    boolean status1 = element1.isDisplayed();
			  	
			  	if(status1)
			  	{
			  		System.out.println("Company Name Visible");
			  	}
			  	else
			  	{
			  		System.out.println("Company Name Not Visible");
			  	}*/
			  	
		// Company Name Verification
		String actcomp = driver.findElement(By.cssSelector("#fl-post-3 > div > div.fl-builder-content.fl-builder-content-3.fl-builder-content-primary > div.fl-row.fl-row-full-width.fl-row-bg-color.fl-node-58764310e9e34 > div > div > div > div > div > div > div.fl-col.fl-node-5876434ade936.fl-col-small > div > div > div > div > h2 > span")).getText();
        String expcomp = "NADQATESTCOMPANYA";              
		Assert.assertEquals(actcomp, expcomp);
			  	
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(1000);
			  	
		/*// Address Verification on Content
		String actadd = driver.findElement(By.cssSelector("#company > div > div > div.fl-col-group.fl-node-58756fb62b4aa > div > div > div > div > div > p:nth-child(1) > strong:nth-child(2)")).getText();
		String expadd = "Mumbai Maharashtra";
	    Assert.assertEquals(actadd, expadd);*/
				
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("window.scrollBy(0,-600)", "");
		Thread.sleep(1000);


		// Click on Contact Us
		driver.findElement(By.cssSelector("#fl-post-3 > div > div.fl-builder-content.fl-builder-content-3.fl-builder-content-primary > div.fl-row.fl-row-full-width.fl-row-bg-color.fl-node-586ef95235bc5 > div > div.fl-row-content.fl-row-fixed-width.fl-node-content > div > div > div > div > div.fl-col.fl-node-586ef9a2503ab.fl-col-small > div > div > div > div > a")).click();
		Thread.sleep(3000);                
				
		// Verify Company Name on Map
		String actComponMap = driver.findElement(By.cssSelector("#firstHeading")).getText();
		String expComponMap = "NADQATESTCOMPANYA";
		Assert.assertEquals(actComponMap, expComponMap);
		Thread.sleep(1000);
				
		// Verify Address on Map
        String actAddonMap = driver.findElement(By.cssSelector("#bodyContent")).getText();
		String expAddonMap = "Borivali West Mumbai, Maharashtra India 400092";
		Assert.assertEquals(actAddonMap, expAddonMap);
		Thread.sleep(1000);
				
		// Click on Seal Image
		driver.findElement(By.cssSelector("#fl-post-3 > div > div.fl-builder-content.fl-builder-content-3.fl-builder-content-primary > div.fl-row.fl-row-full-width.fl-row-bg-color.fl-node-587692a74f3c1 > div > div > div > div > div > div > div > div > div > a > img")).click();
		Thread.sleep(5000);                
				
				for (String Handle : driver.getWindowHandles())
			     {
			         if (!childTab2.equals(Handle))
			         {
			        	 childTab2 = Handle;
			             driver.switchTo().window(childTab2);
			             Thread.sleep(5000);
			         }

			     }
		Thread.sleep(7000);


		// Verify Company Name
		String actComp = driver.findElement(By.xpath("html/body/div[1]/main/section/div/article/div/section/div/div/div/h1")).getText();
		String expComp = "NadQATestCompanyA";
		Assert.assertEquals(actComp, expComp);
			  	
		// Verify User Name
		String actuser = driver.findElement(By.xpath("html/body/div[1]/main/section/div/article/div/section/div/div/div/h5")).getText();
	    String expuser = "NadTest QAUserA";
		Assert.assertEquals(actuser, expuser); 
				
	    // Verify Tagline
	    String actTagline = driver.findElement(By.xpath("html/body/div[1]/main/section/div/article/div/section/div/div/div/p")).getText();
		String expTagline = "We Make it Simple.";
		Assert.assertEquals(actTagline, expTagline);
			  	
		/*// Verify phone Number
		String actPhones = driver.findElement(By.cssSelector("#post-99792 > div > section > div > div > div > h6 > a")).getText();
		String expPhones = "(987) 654-3212";
		Assert.assertEquals(actPhones, expPhones);*/	
		
		JavascriptExecutor jseNew = (JavascriptExecutor) driver;
		jseNew.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(1000);
				
		// Verify Description
		String actDesc = driver.findElement(By.xpath("html/body/div[1]/main/section/div/article/div/div[2]/div/div/div/div[1]/div/div[1]/p")).getText();
		String expDesc = "NadsoftTest QA Description.";
		Assert.assertEquals(actDesc, expDesc);
				
		// Verify Email ID
		String actEmail = driver.findElement(By.xpath("html/body/div[1]/main/section/div/article/div/div[2]/div/div/div/div[2]/div[1]/div/p[1]/a")).getText();
		String expEmail = "nadqatestB@test.com";
        Assert.assertEquals(actEmail, expEmail);
			  	
		System.out.println("toprated site details verified successfully.");
			  	
	    driver.close();  // Close Grand Child window
		Thread.sleep(3000);
        driver.switchTo().window(childTab1);
			  	
	    driver.close();  // Close Child window
		Thread.sleep(3000);
		driver.switchTo().window(ParentWindowHandle);
		
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("window.scrollBy(0,-1000)", "");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("#setupWebsiteForm > div.modal-header > button")).click(); // Close Editor
		Thread.sleep(5000);
		
		// =========== Now started to verify that data sync on admin panel or not ======================
		
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(1000);
		
		// Click on Access wordpress admin
		driver.findElement(By.cssSelector("#my_website_section-1 > div.uabb-adv-accordion-button.uabb-adv-accordion-button58f6833b40efd.uabb-adv-after-text")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(1000);
		
		// Click on Click Here to Login
		driver.findElement(By.cssSelector("#my_website_section-1 > div.uabb-adv-accordion-content.uabb-adv-accordion-content58f6833b40efd.fl-clearfix > div.fl-builder-content.fl-builder-content-2073.fl-builder-template.fl-builder-layout-template.fl-builder-global-templates-locked > div > div > div > div > div > div > div.fl-module.fl-module-rich-text.fl-node-58f67f00bdca5 > div > div > button")).click();
		Thread.sleep(10000);
		
		for (String Handle : driver.getWindowHandles())
	     {
	         if (!childTab3.equals(Handle))
	         {
	        	 childTab3 = Handle;
	             driver.switchTo().window(childTab3);
	             Thread.sleep(5000);
	         }

	     }
	  	
   Thread.sleep(1000);
		
		//Click on manage website Menu
		driver.findElement(By.cssSelector("#toplevel_page_manage-website > a > div.wp-menu-name")).click();
		Thread.sleep(7000);
		
		String actFullName = driver.findElement(By.id("fullname")).getAttribute("value");
		String expFullName = "NadTest QAUserA";
		Assert.assertEquals(actFullName, expFullName);
		Thread.sleep(200);
		
		String actEmail1 = driver.findElement(By.id("email")).getAttribute("value");
		String expEmail1 = "nadqatestA@test.com";
		Assert.assertEquals(actEmail1, expEmail1);
		Thread.sleep(200);
		
		String actContPhone = driver.findElement(By.id("contact_phone")).getAttribute("value");
		String expContPhone = "(987) 654-3211";
		Assert.assertEquals(actContPhone, expContPhone);
		Thread.sleep(5000);
		
		//Click on Company Details Tab
		driver.findElement(By.cssSelector("#setupWebsiteForm > ul > li:nth-child(2) > a")).click();
		Thread.sleep(3000);
		
		String actCompName = driver.findElement(By.id("company_name")).getAttribute("value");
		String expCompName = "NadQATestCompanyA";
		Assert.assertEquals(actCompName, expCompName);
		Thread.sleep(200);
		
		String actTagline1 = driver.findElement(By.id("company_tag_line")).getAttribute("value");
		String expTagline1 = "We Make it Simple.";
		Assert.assertEquals(actTagline1, expTagline1);
		Thread.sleep(200);
		
		String actAdd1 = driver.findElement(By.id("address")).getAttribute("value");
		String expAdd1 = "Borivali";
		Assert.assertEquals(actAdd1, expAdd1);
		Thread.sleep(200);
		
		String actAdd2 = driver.findElement(By.id("address2")).getAttribute("value");
		String expAdd2 = "West";
		Assert.assertEquals(actAdd2, expAdd2);
		Thread.sleep(200);
		
		String actCity = driver.findElement(By.id("city")).getAttribute("value");
		String expCity = "Mumbai";
		Assert.assertEquals(actCity, expCity);
		Thread.sleep(200);
		
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse12.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(1000);
		
		String actState = driver.findElement(By.id("state")).getAttribute("value");
		String expState = "Maharashtra";
		Assert.assertEquals(actState, expState);
		Thread.sleep(200);
		
		String actCountry = driver.findElement(By.id("country")).getAttribute("value");
		String expCountry = "India";
		Assert.assertEquals(actCountry, expCountry);
		Thread.sleep(200);
		
		String actZip = driver.findElement(By.id("zip")).getAttribute("value");
		String expZip = "400092";
		Assert.assertEquals(actZip, expZip);
		Thread.sleep(200);
		
		String actCompPhone = driver.findElement(By.id("comp_phone")).getAttribute("value");
		String expCompPhone = "(987) 654-3212";
		Assert.assertEquals(actCompPhone, expCompPhone);
		Thread.sleep(200);
		
		String actDesc1 = driver.findElement(By.id("site_description")).getAttribute("value");
		String expDesc1 = "NadsoftTest QA Description.";
		Assert.assertEquals(actDesc1, expDesc1);
		Thread.sleep(1000);
		
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse13.executeScript("window.scrollBy(0,-700)", "");
		Thread.sleep(2000);
		
		//Click on Social Details Tab
		driver.findElement(By.cssSelector("#setupWebsiteForm > ul > li:nth-child(3) > a")).click();
		Thread.sleep(3000);
		
		String actFBLink = driver.findElement(By.id("facebook")).getAttribute("value");
		String expFBLink = "https://www.facebook.com/Nadsoft";
		Assert.assertEquals(actFBLink, expFBLink);
		Thread.sleep(2000);
		
		//Click on Site Content Tab
		driver.findElement(By.cssSelector("#setupWebsiteForm > ul > li:nth-child(4) > a")).click();
		Thread.sleep(5000);
		
		driver.close();
		driver.switchTo().window(ParentWindowHandle);
		Thread.sleep(5000);
		
		/*JavascriptExecutor jse14 = (JavascriptExecutor) driver;
		jse14.executeScript("window.scrollBy(0,-700)", "");
		Thread.sleep(1000);*/
             
		System.out.println("---> Data Sync successfully from backoffice...! ");
		
	}

public void afterSyncFromAdminPanel() throws InterruptedException
{
	
	String ParentWindowHandle = driver.getWindowHandle();
	String childTab1 = ParentWindowHandle;
	String childTab2 = ParentWindowHandle;
	String childTab3 = childTab2;
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,1000)", "");
	Thread.sleep(1000);
	
	// Click on Access wordpress admin
	driver.findElement(By.cssSelector("#my_website_section-1 > div.uabb-adv-accordion-button.uabb-adv-accordion-button58f6833b40efd.uabb-adv-after-text")).click();
	Thread.sleep(5000);
	
	JavascriptExecutor js11 = (JavascriptExecutor) driver;
	js11.executeScript("window.scrollBy(0,200)", "");
	Thread.sleep(1000);
	
	// Click on Click Here to Login
	driver.findElement(By.cssSelector("#my_website_section-1 > div.uabb-adv-accordion-content.uabb-adv-accordion-content58f6833b40efd.fl-clearfix > div.fl-builder-content.fl-builder-content-2073.fl-builder-template.fl-builder-layout-template.fl-builder-global-templates-locked > div > div > div > div > div > div > div.fl-module.fl-module-rich-text.fl-node-58f67f00bdca5 > div > div > button")).click();
	Thread.sleep(10000);
	
	for (String Handle : driver.getWindowHandles())
     {
         if (!childTab1.equals(Handle))
         {
        	 childTab1 = Handle;
             driver.switchTo().window(childTab1);
             Thread.sleep(5000);
         }

     }
  	
  Thread.sleep(5000);
	
	//Click on manage website Menu
	driver.findElement(By.cssSelector("#toplevel_page_manage-website > a > div.wp-menu-name")).click();
	Thread.sleep(7000);
	
	driver.findElement(By.id("fullname")).sendKeys("B"); // Update Full Name
	Thread.sleep(500);
	
	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("email")).sendKeys("nadqatest04thNovC@test.com"); // Update Email
	Thread.sleep(500);
	
	driver.findElement(By.id("contact_phone")).clear();
	driver.findElement(By.id("contact_phone")).sendKeys("(987) 654-3215"); // Update Phone
	Thread.sleep(1000);
	
	driver.findElement(By.cssSelector("#general > div:nth-child(5) > label > i")).click(); // Click on seal image tooltip
	Thread.sleep(7000);
	
	//Click on Company Details Tab
	driver.findElement(By.cssSelector("#setupWebsiteForm > ul > li:nth-child(2) > a")).click();
	Thread.sleep(5000); 
	
	driver.findElement(By.id("company_name")).sendKeys("B"); // Update Company Name
	Thread.sleep(500);
	
	driver.findElement(By.id("company_tag_line")).clear();
	driver.findElement(By.id("company_tag_line")).sendKeys("We Made it Simple."); // Update Tag Line
	Thread.sleep(500);
	
	driver.findElement(By.id("comp_email")).clear();
	driver.findElement(By.id("comp_email")).sendKeys("nadqatest04thNovD@test.com"); // Update Email
	Thread.sleep(500);
	
	driver.findElement(By.id("address")).clear();
	driver.findElement(By.id("address")).sendKeys("J.M.Road"); // Update Address
	Thread.sleep(500);
	
	JavascriptExecutor jse1 = (JavascriptExecutor) driver;  
	jse1.executeScript("window.scrollBy(0,300)", "");
	
	driver.findElement(By.id("address2")).clear();
	driver.findElement(By.id("address2")).sendKeys("Deccan"); // Update Address 2
	Thread.sleep(500);
	
	driver.findElement(By.id("city")).clear();
	driver.findElement(By.id("city")).sendKeys("Pune"); // Update City
	Thread.sleep(500);
	
	driver.findElement(By.id("state")).clear();
	driver.findElement(By.id("state")).sendKeys("Maharashtra"); // Update State
	Thread.sleep(500);
	
	driver.findElement(By.id("country")).clear();
	driver.findElement(By.id("country")).sendKeys("India"); // Update Country
	Thread.sleep(500);
	
	driver.findElement(By.id("zip")).clear();
	driver.findElement(By.id("zip")).sendKeys("411004"); // Update Zip
	Thread.sleep(500);
	
	driver.findElement(By.id("comp_phone")).clear();
	driver.findElement(By.id("comp_phone")).sendKeys("(987) 654-3216"); // Update Phone
	Thread.sleep(5000);
	
	WebElement DIVelement = driver.findElement(By.cssSelector("#company > div:nth-child(12) > label:nth-child(1)"));

	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", DIVelement);
	Thread.sleep(5000);
	
	JavascriptExecutor jse3 = (JavascriptExecutor) driver;  
	jse3.executeScript("window.scrollBy(0,200)", "");
	
	driver.findElement(By.id("site_description")).clear();
	driver.findElement(By.id("site_description")).sendKeys("NadsoftTest QA Description updated from admin side.");
	Thread.sleep(5000);
	
	//Scroll the page to top
	WebElement ele = driver.findElement(By.cssSelector("#wpbody-content > h3"));
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	js1.executeScript("arguments[0].scrollIntoView();", ele);
    Thread.sleep(5000);
    
    //Click on Social Details Tab
    driver.findElement(By.cssSelector("#setupWebsiteForm > ul > li:nth-child(3) > a")).click();
    Thread.sleep(5000);
    
    //Enter Facebook URL
    driver.findElement(By.id("facebook")).clear();
    driver.findElement(By.id("facebook")).sendKeys("https://www.facebook.com/Nadsoftfromadmin"); 
    Thread.sleep(5000);
    
    //Enter Twitter URL
    driver.findElement(By.id("twitter")).clear();
    driver.findElement(By.id("twitter")).sendKeys("https://www.twitter.com/Nadsoft"); 
    Thread.sleep(5000);
    
    //Click on Site Content Tab
    driver.findElement(By.cssSelector("#setupWebsiteForm > ul > li:nth-child(4) > a")).click();
    Thread.sleep(5000);
    
    JavascriptExecutor jse4 = (JavascriptExecutor) driver;  
	jse4.executeScript("window.scrollBy(0,200)", "");
	
	
	//Add Text in Editor
	driver.findElement(By.cssSelector("#service_container > div.note-editor > div.note-editable")).sendKeys("Test Content One");
	Thread.sleep(5000);
	
	JavascriptExecutor jse5 = (JavascriptExecutor) driver;  
	jse5.executeScript("window.scrollBy(0,500)", "");
	
	//Add Text in Editor
	driver.findElement(By.cssSelector("#roofing_services_container > div.note-editor > div.note-editable")).sendKeys("Test Content two");
	Thread.sleep(5000);
	
	JavascriptExecutor jse6 = (JavascriptExecutor) driver;  
	jse6.executeScript("window.scrollBy(0,600)", "");
	
	// Click on Save
	driver.findElement(By.cssSelector("#setupWebsiteForm > button")).click();
	Thread.sleep(5000);
	
	System.out.println("Website information saved successfully");
	Thread.sleep(5000);
	
	driver.close();
	driver.switchTo().window(ParentWindowHandle);
	Thread.sleep(5000);
	
	JavascriptExecutor jsnew = (JavascriptExecutor) driver;  
	jsnew.executeScript("window.scrollBy(0,-600)", "");
	Thread.sleep(5000);
	
	
	
	//================= Now started to verify that Synchronization happen or not =========================
	
	/*JavascriptExecutor jsnew = (JavascriptExecutor) driver;  
	jsnew.executeScript("window.scrollBy(0,200)", "");
	Thread.sleep(2000);*/
	
	// Click on Website URL
	driver.findElement(By.cssSelector("#fl-post-1974 > div > div.fl-builder-content.fl-builder-content-1974.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-58f6314bde0d7 > div > div > div.fl-col-group.fl-node-58f6314be9dd5.fl-col-group-equal-height.fl-col-group-align-top > div.fl-col.fl-node-58f6314bea154.fl-col-small > div > div.fl-module.fl-module-rich-text.fl-node-58f68b1b93c88 > div > div > p:nth-child(2) > a")).click();
	Thread.sleep(5000);

	for (String Handle : driver.getWindowHandles())
		     {
		         if (!childTab2.equals(Handle))
		         {
		        	 childTab2 = Handle;
		             driver.switchTo().window(childTab2);
		             Thread.sleep(5000);
		         }

		     }
		  	
	Thread.sleep(5000);

	// Phone Number Verification
	String actPhone = driver.findElement(By.cssSelector("#top > div > div > div > div > div > div > div.fl-col.fl-node-5876a92c3b714.fl-col-small > div > div > div > h5 > span > a")).getText();
	String expPhone = "(987) 654-3216";
	Assert.assertEquals(actPhone, expPhone);
	Thread.sleep(5000);
		  	
	/*WebDriverWait wait1 = new WebDriverWait(driver, 10);
		  	
	WebElement element1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#fl-post-3 > div > div.fl-builder-content.fl-builder-content-3.fl-builder-content-primary > div.fl-row.fl-row-full-width.fl-row-bg-color.fl-node-58764310e9e34 > div > div > div > div > div > div > div.fl-col.fl-node-5876434ade936.fl-col-small > div > div > div > div > h2 > span")));
	                                                                                                                                                                                        
    boolean status1 = element1.isDisplayed();
		  	
		  	if(status1)
		  	{
		  		System.out.println("Company Name Visible");
		  	}
		  	else
		  	{
		  		System.out.println("Company Name Not Visible");
		  	}*/
		  	
	// Company Name Verification                        
	String actcomp = driver.findElement(By.cssSelector("#fl-post-3 > div > div.fl-builder-content.fl-builder-content-3.fl-builder-content-primary > div.fl-row.fl-row-full-width.fl-row-bg-color.fl-node-58764310e9e34 > div > div > div > div > div > div > div.fl-col.fl-node-5876434ade936.fl-col-small > div > div > div > div > h2 > span")).getText();
    String expcomp = "NADQATESTCOMPANYAB";
	Assert.assertEquals(actcomp, expcomp);
		  	
	JavascriptExecutor jse7 = (JavascriptExecutor) driver;
	jse7.executeScript("window.scrollBy(0,1000)", "");
	Thread.sleep(1000);
		  	
	/*// Address Verification on Content
	String actadd = driver.findElement(By.cssSelector("#company > div > div > div.fl-col-group.fl-node-58756fb62b4aa > div > div > div > div > div > p:nth-child(1) > strong:nth-child(2)")).getText();
	String expadd = "Pune Maharashtra";
    Assert.assertEquals(actadd, expadd);*/
			
	JavascriptExecutor jse8 = (JavascriptExecutor) driver;
	jse8.executeScript("window.scrollBy(0,-600)", "");
	Thread.sleep(1000);


	// Click on Contact Us
	driver.findElement(By.cssSelector("#fl-post-3 > div > div.fl-builder-content.fl-builder-content-3.fl-builder-content-primary > div.fl-row.fl-row-full-width.fl-row-bg-color.fl-node-586ef95235bc5 > div > div.fl-row-content.fl-row-fixed-width.fl-node-content > div > div > div > div > div.fl-col.fl-node-586ef9a2503ab.fl-col-small > div > div > div > div > a")).click();
	Thread.sleep(3000);                
			
	// Verify Company Name on Map
	String actComponMap = driver.findElement(By.cssSelector("#firstHeading")).getText();
	String expComponMap = "NADQATESTCOMPANYAB";
	Assert.assertEquals(actComponMap, expComponMap);
	Thread.sleep(1000);
			
	// Verify Address on Map
    String actAddonMap = driver.findElement(By.cssSelector("#bodyContent")).getText();
	String expAddonMap = "J.M.Road Deccan Pune, Maharashtra India 411004";
	Assert.assertEquals(actAddonMap, expAddonMap);
	Thread.sleep(1000);
			
	// Click on Seal Image
	driver.findElement(By.cssSelector("#fl-post-3 > div > div.fl-builder-content.fl-builder-content-3.fl-builder-content-primary > div.fl-row.fl-row-full-width.fl-row-bg-color.fl-node-587692a74f3c1 > div > div > div > div > div > div > div > div > div > a > img")).click();
	Thread.sleep(5000);                
			
			for (String Handle : driver.getWindowHandles())
		     {
		         if (!childTab3.equals(Handle))
		         {
		        	 childTab3 = Handle;
		             driver.switchTo().window(childTab3);
		             Thread.sleep(5000);
		         }

		     }
	Thread.sleep(7000);


	// Verify Company Name
	String actComp = driver.findElement(By.xpath("html/body/div[1]/main/section/div/article/div/section/div/div/div/h1")).getText();
	String expComp = "NadQATestCompanyAB";
	Assert.assertEquals(actComp, expComp);
		  	
	// Verify User Name
	String actuser = driver.findElement(By.xpath("html/body/div[1]/main/section/div/article/div/section/div/div/div/h5")).getText();
    String expuser = "NadTest QAUserAB";
	Assert.assertEquals(actuser, expuser); 
			
    // Verify Tagline
    String actTagline = driver.findElement(By.xpath("html/body/div[1]/main/section/div/article/div/section/div/div/div/p")).getText();
	String expTagline = "We Made it Simple.";
	Assert.assertEquals(actTagline, expTagline);
		  	
	/*// Verify phone Number
	String actPhones = driver.findElement(By.cssSelector("#post-99626 > div > section > div > div > div > h6 > a")).getText();
	String expPhones = "(987) 654-3216";
	Assert.assertEquals(actPhones, expPhones);*/
	
	JavascriptExecutor jsnew2 = (JavascriptExecutor) driver;
	jsnew2.executeScript("window.scrollBy(0,300)", "");
	Thread.sleep(1000);
			
	// Verify Description
	String actDesc = driver.findElement(By.xpath("html/body/div[1]/main/section/div/article/div/div[2]/div/div/div/div[1]/div/div[1]/p")).getText();
	String expDesc = "NadsoftTest QA Description updated from admin side.";
	Assert.assertEquals(actDesc, expDesc);
			
	// Verify Email ID
	String actEmail = driver.findElement(By.xpath("html/body/div[1]/main/section/div/article/div/div[2]/div/div/div/div[2]/div[1]/div/p[1]/a")).getText();
	String expEmail = "nadqatest04thNovD@test.com";
    Assert.assertEquals(actEmail, expEmail);
		  	
	System.out.println("toprated site details verified successfully.");
		  	
    driver.close();  // Close Grand Child window
	Thread.sleep(3000);
    driver.switchTo().window(childTab2);
		  	
    driver.close();  // Close Child window
	Thread.sleep(3000);
	
	/*driver.switchTo().window(childTab1);
	
	driver.close();  // Close Child window
	Thread.sleep(3000);*/
	
	driver.switchTo().window(ParentWindowHandle);
	
	driver.get("https://www.contractoros.net/new-dashboard");  
	driver.navigate().refresh();
	
	
	JavascriptExecutor jse9 = (JavascriptExecutor) driver;
	jse9.executeScript("window.scrollBy(0,700)", "");
	Thread.sleep(1000);
	
	// Click on Edit My Website Section
	driver.findElement(By.id("my_website_section-0")).click();  //Edit My website section
	Thread.sleep(1000);
			
	// Click on Basic Website editor
	driver.findElement(By.cssSelector("#my_website_section-0 > div.uabb-adv-accordion-content.uabb-adv-accordion-content58f6833b40efd.fl-clearfix > div.fl-builder-content.fl-builder-content-2072.fl-builder-template.fl-builder-layout-template.fl-builder-global-templates-locked > div > div > div > div > div > div > div.fl-module.fl-module-button.fl-node-58f67b92acac9.website-popup > div > div > a > span")).click();
	Thread.sleep(2000);	               
	
	// =========== Now started to verify that data sync on Basic Website editor or not ================
			
			String actFullName = driver.findElement(By.id("fullname")).getAttribute("value");
			String expFullName = "NadTest QAUserAB";
			Assert.assertEquals(actFullName, expFullName);
			Thread.sleep(200);
			
			String actEmail1 = driver.findElement(By.id("email")).getAttribute("value");
			String expEmail1 = "nadqatest04thNovC@test.com";
			Assert.assertEquals(actEmail1, expEmail1);
			Thread.sleep(200);
			
			String actContPhone = driver.findElement(By.id("contact_phone")).getAttribute("value");
			String expContPhone = "(987) 654-3215";
			Assert.assertEquals(actContPhone, expContPhone);
			Thread.sleep(5000);
			
			//Click on Company Details Tab
			driver.findElement(By.cssSelector("#setupWebsiteForm > div.modal-body > div > div > div > div > ul > li:nth-child(2) > a")).click();
			Thread.sleep(3000);
			
			String actCompName = driver.findElement(By.id("company_name")).getAttribute("value");
			String expCompName = "NadQATestCompanyAB";
			Assert.assertEquals(actCompName, expCompName);
			Thread.sleep(200);
			
			String actTagline1 = driver.findElement(By.id("company_tag_line")).getAttribute("value");
			String expTagline1 = "We Made it Simple.";
			Assert.assertEquals(actTagline1, expTagline1);
			Thread.sleep(200);
			
			String actAdd1 = driver.findElement(By.id("address")).getAttribute("value");
			String expAdd1 = "J.M.Road";
			Assert.assertEquals(actAdd1, expAdd1);
			Thread.sleep(200);
			
			String actAdd2 = driver.findElement(By.id("address2")).getAttribute("value");
			String expAdd2 = "Deccan";
			Assert.assertEquals(actAdd2, expAdd2);
			Thread.sleep(200);
			
			String actCity = driver.findElement(By.id("city")).getAttribute("value");
			String expCity = "Pune";
			Assert.assertEquals(actCity, expCity);
			Thread.sleep(200);
			
			JavascriptExecutor jse12 = (JavascriptExecutor) driver;
			jse12.executeScript("window.scrollBy(0,500)", "");
			Thread.sleep(1000);
			
			String actState = driver.findElement(By.id("state")).getAttribute("value");
			String expState = "Maharashtra";
			Assert.assertEquals(actState, expState);
			Thread.sleep(200);
			
			String actCountry = driver.findElement(By.id("country")).getAttribute("value");
			String expCountry = "India";
			Assert.assertEquals(actCountry, expCountry);
			Thread.sleep(200);
			
			String actZip = driver.findElement(By.id("zip")).getAttribute("value");
			String expZip = "411004";
			Assert.assertEquals(actZip, expZip);
			Thread.sleep(200);
			
			String actCompPhone = driver.findElement(By.id("comp_phone")).getAttribute("value");
			String expCompPhone = "(987) 654-3216";
			Assert.assertEquals(actCompPhone, expCompPhone);
			Thread.sleep(200);
			
			String actDesc1 = driver.findElement(By.id("site_description")).getAttribute("value");
			String expDesc1 = "NadsoftTest QA Description updated from admin side.";
			Assert.assertEquals(actDesc1, expDesc1);
			Thread.sleep(1000);
			
			JavascriptExecutor jse13 = (JavascriptExecutor) driver;
			jse13.executeScript("window.scrollBy(0,-700)", "");
			Thread.sleep(2000);
			
			//Click on Social Details Tab
			driver.findElement(By.cssSelector("#setupWebsiteForm > div.modal-body > div > div > div > div > ul > li:nth-child(3) > a")).click();
			Thread.sleep(3000);
			
			String actFBLink = driver.findElement(By.id("facebook")).getAttribute("value");
			String expFBLink = "https://www.facebook.com/Nadsoftfromadmin";
			Assert.assertEquals(actFBLink, expFBLink);
			Thread.sleep(2000);
			
			String actTwitterLink = driver.findElement(By.id("twitter")).getAttribute("value");
			String expTwitterLink = "https://www.twitter.com/Nadsoft";
			Assert.assertEquals(actTwitterLink, expTwitterLink);
			Thread.sleep(2000);
			
			//Click on Site Content Tab
			driver.findElement(By.cssSelector("#setupWebsiteForm > div.modal-body > div > div > div > div > ul > li:nth-child(4) > a")).click();
			Thread.sleep(5000);
			
			//Close Basic Website editor by clicking close button
			driver.findElement(By.cssSelector("#setupWebsiteForm > div.modal-body > div > div > div > div > div.setup-website-btn-pane > div.setup-website-btn.setup-website-close-pane > button")).click();
			Thread.sleep(2000);
	
	System.out.println("---> Data Sync successfully from Admin Area... ");

}

public void quickSync() throws InterruptedException, AWTException
{
	JavascriptExecutor jse1 = (JavascriptExecutor) driver;
	jse1.executeScript("window.scrollBy(0,700)", "");
	Thread.sleep(2000);
	
	// Click on Edit My Website Section
	driver.findElement(By.id("my_website_section-0")).click();  //Edit My website section
	Thread.sleep(1000);
					
	// Click on Basic Website editor
	driver.findElement(By.cssSelector("#my_website_section-0 > div.uabb-adv-accordion-content.uabb-adv-accordion-content58f6833b40efd.fl-clearfix > div.fl-builder-content.fl-builder-content-2072.fl-builder-template.fl-builder-layout-template.fl-builder-global-templates-locked > div > div > div > div > div > div > div.fl-module.fl-module-button.fl-node-58f67b92acac9.website-popup > div > div > a > span")).click();
	Thread.sleep(2000);

	driver.findElement(By.id("fullname")).clear();
	driver.findElement(By.id("fullname")).sendKeys("NadTest QAUserNew"); // Update Full Name
	Thread.sleep(500);
			
	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("email")).sendKeys("nadqatest16thNovA@test.com"); // Update Email**
	Thread.sleep(500);
			
	driver.findElement(By.id("contact_phone")).clear();
	driver.findElement(By.id("contact_phone")).sendKeys("(987) 654-3216"); // Update Phone
	Thread.sleep(1000);
			
    // Off Seal Image
	driver.findElement(By.cssSelector("#general > div:nth-child(5) > div > div > div > span.bootstrap-switch-handle-off.bootstrap-switch-default")).click();
	Thread.sleep(7000);
			
	//Click on Company Details Tab
	driver.findElement(By.cssSelector("#setupWebsiteForm > div.modal-body > div > div > div > div > ul > li:nth-child(2) > a")).click();
	Thread.sleep(5000);
			
	driver.findElement(By.id("company_name")).clear();
	driver.findElement(By.id("company_name")).sendKeys("NadQATest 13thNovNew"); // Update Company Name
	Thread.sleep(500);
			
	driver.findElement(By.id("address")).clear();
	driver.findElement(By.id("address")).sendKeys("Nal Stop"); // Update Address
	Thread.sleep(500);
			
	JavascriptExecutor jse2 = (JavascriptExecutor) driver;  
	jse2.executeScript("window.scrollBy(0,300)", "");
	Thread.sleep(2000);
			
	driver.findElement(By.id("address2")).clear();
	driver.findElement(By.id("address2")).sendKeys("Prabhat Road"); // Update Address 2
	Thread.sleep(500);
			
	driver.findElement(By.id("city")).clear();
	driver.findElement(By.id("city")).sendKeys("Pune"); // Update City
	Thread.sleep(500);
			
	driver.findElement(By.id("state")).clear();
	driver.findElement(By.id("state")).sendKeys("Maharashtra"); // Update State
	Thread.sleep(500);
			
	driver.findElement(By.id("country")).clear();
	driver.findElement(By.id("country")).sendKeys("India"); // Update Country
	Thread.sleep(500);
			
	driver.findElement(By.id("zip")).clear();
	driver.findElement(By.id("zip")).sendKeys("411004"); // Update Zip
	Thread.sleep(500);
			
	driver.findElement(By.id("comp_phone")).clear();
	driver.findElement(By.id("comp_phone")).sendKeys("(987) 654-3217"); // Update Phone
	Thread.sleep(5000);
			
	WebElement DIVelement = driver.findElement(By.cssSelector("#company > div:nth-child(12) > label:nth-child(1)"));

	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", DIVelement);
	Thread.sleep(5000);
	
	// click on company Logo option
	WebElement compLogo_radio_button = driver.findElement(By.cssSelector("#company > div:nth-child(12) > label:nth-child(4)"));
	compLogo_radio_button.click();
	Thread.sleep(3000);
	
	JavascriptExecutor jse3 = (JavascriptExecutor) driver;
	jse3.executeScript("window.scrollBy(0,-700)", "");
	Thread.sleep(2000);
	
	//Click on Social Details Tab
	driver.findElement(By.cssSelector("#setupWebsiteForm > div.modal-body > div > div > div > div > ul > li:nth-child(3) > a")).click();
	Thread.sleep(5000);
	
	/*JavascriptExecutor jsnew = (JavascriptExecutor) driver;
		jsnew.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(3000);*/
	
	WebElement DIVelement1 = driver.findElement(By.cssSelector("#social > div:nth-child(9) > label"));

	JavascriptExecutor jse12 = (JavascriptExecutor)driver;
	jse12.executeScript("arguments[0].scrollIntoView(true)", DIVelement1);
	Thread.sleep(5000);
		
	   // Off BBB Logo
	   driver.findElement(By.cssSelector("#social > div:nth-child(9) > div > div > div > span.bootstrap-switch-handle-off.bootstrap-switch-default")).click();
	   Thread.sleep(7000); 
	   
	    JavascriptExecutor jsnew1 = (JavascriptExecutor) driver;
	jsnew1.executeScript("window.scrollBy(0,-800)", "");
	Thread.sleep(3000);
	
	//Click on Site Contents Tab
	driver.findElement(By.cssSelector("#setupWebsiteForm > div.modal-body > div > div > div > div > ul > li:nth-child(4) > a")).click();
	Thread.sleep(5000);
	
	JavascriptExecutor jse4 = (JavascriptExecutor) driver;
	jse4.executeScript("window.scrollBy(0,1200)", "");
	Thread.sleep(2000);
	
	//Click on Save
	driver.findElement(By.cssSelector("#setupWebsiteForm > div.modal-body > div > div > div > div > div.setup-website-btn-pane > div.setup-website-btn.save_site_info > button")).click();
	Thread.sleep(8000);
	
	JavascriptExecutor jse5 = (JavascriptExecutor) driver;
	jse5.executeScript("window.scrollBy(0,1200)", "");
	Thread.sleep(2000);
	
	//Click on Free Estimate Link
	driver.findElement(By.cssSelector("#contents > div.free-estimatelink > p:nth-child(1) > a")).click();
	Thread.sleep(7000);
	
	String ParentWindowHandle = driver.getWindowHandle();
	String childTab1 = ParentWindowHandle;
	String childTab2 = ParentWindowHandle;
	String childTab3 = ParentWindowHandle;
	String childTab4 = ParentWindowHandle;
	String childTab5 = ParentWindowHandle;
	
	for (String Handle : driver.getWindowHandles())
     {
         if (!childTab1.equals(Handle))
         {
        	 childTab1 = Handle;
             driver.switchTo().window(childTab1);
             Thread.sleep(5000);
         }

     }
  	
   Thread.sleep(7000);
   
    // Company Name Verification
  	String actcomp = driver.findElement(By.cssSelector("#fl-post-13 > div > div.fl-builder-content.fl-builder-content-13.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-59d332dfc3af5 > div > div > div > div > div > div.fl-col-group.fl-node-59cce62af0847.fl-col-group-nested > div.fl-col.fl-node-59cce62af0954 > div > div.fl-module.fl-module-heading.fl-node-59cce62af09c0")).getText();
  	String expcomp = "NADQATEST 13THNOVNEW";            
  	Assert.assertEquals(actcomp, expcomp);
  	Thread.sleep(1000);
  	
    // Address Verification                            
  	String actAdd = driver.findElement(By.cssSelector("#fl-post-13 > div > div.fl-builder-content.fl-builder-content-13.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-59d332dfc3af5 > div > div > div > div > div > div.fl-col-group.fl-node-59cce62af0847.fl-col-group-nested > div.fl-col.fl-node-59cce62af0954 > div > div.fl-module.fl-module-heading.fl-node-59cce62af09f6")).getText();
  	String expAdd = "NAL STOP PRABHAT ROAD PUNE, MAHARASHTRA INDIA 411004";
  	Assert.assertEquals(actAdd, expAdd);
  	Thread.sleep(1000);
  	
    // Phone Number Verification
  	String actPhone = driver.findElement(By.cssSelector("#fl-post-13 > div > div.fl-builder-content.fl-builder-content-13.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-59d332dfc3af5 > div > div > div > div > div > div.fl-col-group.fl-node-59cce62af0847.fl-col-group-nested > div.fl-col.fl-node-59cce62af0954 > div > div.fl-module.fl-module-heading.fl-node-59cce62af0a2c")).getText();
  	String expPhone = "PHONE: (987) 654-3217";                       
  	Assert.assertEquals(actPhone, expPhone);
  	Thread.sleep(1000);
  	
    /*// Company Name Verification
  	String actcomp1 = driver.findElement(By.cssSelector("#fl-post-13 > div > div.fl-builder-content.fl-builder-content-13.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-59d254a266a89 > div > div > div > div > div > div.fl-col-group.fl-node-59cce62af087d.fl-col-group-nested > div.fl-col.fl-node-59cce62af0a63 > div > div > div > div > p:nth-child(1) > strong")).getText();
  	String expcomp1 = "NadQATest 13thNovNew";
  	Assert.assertEquals(actcomp1, expcomp1);
  	Thread.sleep(1000);
  	
    // Verify User Name
  	String actuser = driver.findElement(By.cssSelector("#fl-post-13 > div > div.fl-builder-content.fl-builder-content-13.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-59d254a266a89 > div > div > div > div > div > div.fl-col-group.fl-node-59cce62af087d.fl-col-group-nested > div.fl-col.fl-node-59cce62af0a63 > div > div > div > div > p:nth-child(2) > strong:nth-child(1)")).getText();
  	String expuser = "NadTest QAUserNew, Owner";
  	Assert.assertEquals(actuser, expuser);
  	
    // Company Name Verification
  	String actcomp2 = driver.findElement(By.cssSelector("#fl-post-13 > div > div.fl-builder-content.fl-builder-content-13.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-59d254a266a89 > div > div > div > div > div > div.fl-col-group.fl-node-59cce62af087d.fl-col-group-nested > div.fl-col.fl-node-59cce62af0a63 > div > div > div > div > p:nth-child(1) > strong")).getText();
  	String expcomp2 = "NadQATest 13thNovNew";
  	Assert.assertEquals(actcomp2, expcomp2);
  	Thread.sleep(3000);*/
  	
      //To Check whether Logo visible or not
      if( driver.findElement(By.cssSelector("#fl-post-13 > div > div.fl-builder-content.fl-builder-content-13.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-59d332dfc3af5 > div > div > div > div > div > div.fl-col-group.fl-node-59cce62af0847.fl-col-group-nested > div.fl-col.fl-node-59cce62af091f.fl-col-small > div > div")).isDisplayed())
      {
         System.out.println("Condition Success : Because Company Logo is Visible");
      }
      else
      {
    	  System.out.println("Condition Failed : Because Company Logo is not Visible");
      }
      
      Thread.sleep(5000);
      
      //To Check whether BBB Logo visible or not
      if( driver.findElement(By.cssSelector("#fl-post-13 > div > div.fl-builder-content.fl-builder-content-13.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-59d332dfc3af5 > div > div > div > div > div > div.fl-col-group.fl-node-59cce62af087d.fl-col-group-nested > div.fl-col.fl-node-59cce62af0a99.fl-col-small > div > div")).isDisplayed())
      {
         System.out.println("Condition Failed : Because BBB Logo is Visible");
      }
      else
      {
    	  System.out.println("Condition Success : Because BBB Logo is not Visible");
      }
      
      Thread.sleep(5000);
  	
  	JavascriptExecutor jse6 = (JavascriptExecutor) driver;
	jse6.executeScript("window.scrollBy(0,600)", "");
	Thread.sleep(2000);
  	
        // Fill Free Estimate Form
 		driver.findElement(By.name("csbfname")).sendKeys("NadTest"); // First Name
 		Thread.sleep(1000);
 		
 		driver.findElement(By.name("csblname")).sendKeys("UserA"); // Last Name
 		Thread.sleep(1000);
 		
 		driver.findElement(By.name("csbemail")).sendKeys("tushar@nadsoftdev.com"); // Email Address
 		Thread.sleep(1000);
 		
 		driver.findElement(By.cssSelector("#estimate_form > div:nth-child(6) > div > span > span.selection > span")).click(); // Country Code Dropdown
 		Thread.sleep(500);                 
 		
 		driver.findElement(By.cssSelector("body > span > span > span.select2-search.select2-search--dropdown > input")).sendKeys("+91");
 		Thread.sleep(500);                 
 		
 		Robot robot = new Robot();
 		robot.keyPress(KeyEvent.VK_ENTER);
 		robot.keyRelease(KeyEvent.VK_ENTER);
 		Thread.sleep(1000);
 		
 		driver.findElement(By.id("phone")).sendKeys("8390600540");
 		Thread.sleep(1000);
 		
 		// Best time to call is
 		WebElement time_dropdown = driver.findElement(By.id("csbtime"));
 	  	Select time_dd = new Select(time_dropdown);
 	  	
 	  	//It will select In the morning
 	  	time_dd.selectByIndex(1);
 	  	Thread.sleep(2000);
 	  	
 	  	driver.findElement(By.name("csbaddress")).sendKeys("FC Road"); // Street Address
 		Thread.sleep(1000);
 		
 		driver.findElement(By.name("csbcity")).sendKeys("Pune"); // City
 		Thread.sleep(1000);
 		
 		// It will Select State
 		WebElement state_dropdown = driver.findElement(By.id("csbstate"));
 		Select state_dd = new Select(state_dropdown);
 			  	
 		//It will select California
 		state_dd.selectByVisibleText("California");
 	    Thread.sleep(2000);
 	    
 	    driver.findElement(By.name("csbzip")).sendKeys("411004"); // Zip
 		Thread.sleep(1000);
 		
 		WebElement apt_dropdown = driver.findElement(By.name("csbstart"));
 	  	Select apt_dd = new Select(apt_dropdown);
 	  	
 	  	//It will select Witin two weeks
 	  	apt_dd.selectByIndex(2);
 	  	Thread.sleep(2000);
//*	 	  	
        driver.findElement(By.name("csbappointment")).clear();
 	  	driver.findElement(By.name("csbappointment")).sendKeys("11/27/2017 11:30 PM");
 	  	Thread.sleep(1000);
 	  	
 	  	driver.findElement(By.name("csbinfo")).sendKeys("Test additional project info");
 	  	Thread.sleep(1000);
 	  	
 	  	WebElement style_dropdown = driver.findElement(By.name("csbstyle"));
 	  	Select style_dd = new Select(style_dropdown);
 	  	
 	  	//It will select Cape
 	  	style_dd.selectByIndex(2);
 	  	Thread.sleep(2000);
 	  	
 	  	WebElement house_dropdown = driver.findElement(By.name("csbhouseage"));
 	  	Select house_dd = new Select(house_dropdown);
 	  	
 	  	//It will select 11-20 Years Old
 	  	house_dd.selectByIndex(3);
 	  	Thread.sleep(2000);
 	  	
 	  	JavascriptExecutor jse7 = (JavascriptExecutor) driver;
 		jse7.executeScript("window.scrollBy(0,300)", "");
 		Thread.sleep(3000);
 	  	
 	  	WebElement houselived_dropdown = driver.findElement(By.name("csblived"));
 	  	Select houselived_dd = new Select(houselived_dropdown);
 	  	
 	  	//It will select 3-8 Years
 	  	houselived_dd.selectByIndex(3);
 	  	Thread.sleep(2000);
 	  	
 	  	WebElement age_dropdown = driver.findElement(By.name("csbage"));
 	  	Select age_dd = new Select(age_dropdown);
 	  	
 	  	//It will select 46-55
 	  	age_dd.selectByIndex(4);
 	  	Thread.sleep(2000);
 	  	
 	  	WebElement website_dropdown = driver.findElement(By.name("csbwebsite"));
 	  	Select website_dd = new Select(website_dropdown);
 	  	
//*	 	  	//It will select NewsPaper
 	  	website_dd.selectByIndex(8);
 	  	Thread.sleep(2000);
 	  	
 	  	driver.findElement(By.name("csbcomments")).sendKeys("Test additional comments");
 	  	Thread.sleep(7000);
 	  	
 	  	// Click on submit
 	  	driver.findElement(By.cssSelector("#estimate_form > input[type=submit]:nth-child(29)")).click();
 	  	Thread.sleep(8000);
 	  	
 	  	JavascriptExecutor jsenew5 = (JavascriptExecutor) driver;
 		jsenew5.executeScript("window.scrollBy(0,500)", "");
 		Thread.sleep(3000);
 	  	
 	  	String actFreeEstMsg = driver.findElement(By.cssSelector("#fl-post-13 > div > div.fl-builder-content.fl-builder-content-13.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-59d332dfc3af5 > div > div > div > div > div > div.fl-col-group.fl-node-59cce62af08b3.fl-col-group-nested > div > div > div")).getText();
		String expFreeEstMsg = "Your estimate was submitted successfully!";
		Assert.assertEquals(actFreeEstMsg, expFreeEstMsg);
		System.out.println("Free Estimate submitted successfully.");
  	
  	    driver.close();
  	    driver.switchTo().window(ParentWindowHandle);
  	   Thread.sleep(3000);
  	    
  		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
 		jse8.executeScript("window.scrollBy(0,300)", "");
 		Thread.sleep(3000);
  	
	//Close Basic Website editor by clicking close button
	driver.findElement(By.cssSelector("#setupWebsiteForm > div.modal-body > div > div > div > div > div.setup-website-btn-pane > div.setup-website-btn.setup-website-close-pane > button")).click();
	Thread.sleep(5000);
	
	JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(3000);
		
	    // Click on Website URL
	    driver.findElement(By.cssSelector("#fl-post-1974 > div > div.fl-builder-content.fl-builder-content-1974.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-58f6314bde0d7 > div > div > div.fl-col-group.fl-node-58f6314be9dd5.fl-col-group-equal-height.fl-col-group-align-top > div.fl-col.fl-node-58f6314bea154.fl-col-small > div > div.fl-module.fl-module-rich-text.fl-node-58f68b1b93c88 > div > div > p:nth-child(2) > a")).click();
	    Thread.sleep(5000);
		
		
		for (String Handle : driver.getWindowHandles())
     {
         if (!childTab2.equals(Handle))
         {
        	 childTab2 = Handle;
             driver.switchTo().window(childTab2);
             Thread.sleep(5000);
         }

     }
  	
  Thread.sleep(5000);
  
  // Click on Contact us
  driver.findElement(By.cssSelector("#home > div > div > ul > li:nth-child(5) > h5 > a")).click();
  Thread.sleep(2000);
  
  JavascriptExecutor jsnew6 = (JavascriptExecutor) driver;
  jsnew6.executeScript("window.scrollBy(0,300)", "");
  Thread.sleep(3000);
  
  //To Check whether seal image visible or not
  if( driver.findElement(By.cssSelector("#fl-post-3 > div > div.fl-builder-content.fl-builder-content-3.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-full-width.fl-row-bg-color.fl-node-587692a74f3c1 > div > div > div > div > div > div > div > div > div > a > img")).isDisplayed())
  {
     System.out.println("Condition Failed : Because Seal Image is Visible");
  }
  else
  {
	  System.out.println("Condition Success : Because Seal Image is not Visible");
  }
  
  Thread.sleep(2000);
  
  //To Check whether BBB Logo visible or not
  if( driver.findElement(By.cssSelector("#fl-post-3 > div > div.fl-builder-content.fl-builder-content-3.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-full-width.fl-row-bg-photo.fl-node-58b2ec89de800.fl-row-bg-overlay > div > div > div > div > div > div.fl-module.fl-module-photo.fl-node-5922b34657acc.bbb_logo")).isDisplayed())
  {
     System.out.println("Condition Failed : Because BBB Logo is Visible");
  }
  else
  {
	  System.out.println("Condition Success : Because BBB Logo is not Visible");
  }
  
  Thread.sleep(2000);
  
  driver.close();
  driver.switchTo().window(ParentWindowHandle);
  Thread.sleep(2000);
  
    JavascriptExecutor jse11 = (JavascriptExecutor) driver;
	jse11.executeScript("window.scrollBy(0,1000)", "");
	Thread.sleep(1000);
	
	// Click on Access wordpress admin
	driver.findElement(By.cssSelector("#my_website_section-1 > div.uabb-adv-accordion-button.uabb-adv-accordion-button58f6833b40efd.uabb-adv-after-text")).click();
	Thread.sleep(5000);
	
	JavascriptExecutor js11 = (JavascriptExecutor) driver;
	js11.executeScript("window.scrollBy(0,200)", "");
	Thread.sleep(1000);
	
	// Click on Click Here to Login
	driver.findElement(By.cssSelector("#my_website_section-1 > div.uabb-adv-accordion-content.uabb-adv-accordion-content58f6833b40efd.fl-clearfix > div.fl-builder-content.fl-builder-content-2073.fl-builder-template.fl-builder-layout-template.fl-builder-global-templates-locked > div > div > div > div > div > div > div.fl-module.fl-module-rich-text.fl-node-58f67f00bdca5 > div > div > button")).click();
	Thread.sleep(10000);
	
	for (String Handle : driver.getWindowHandles())
     {
         if (!childTab3.equals(Handle))
         {
        	 childTab3 = Handle;
             driver.switchTo().window(childTab3);
             Thread.sleep(5000);
         }

     }
  	
    Thread.sleep(5000);
	
	//Click on manage website Menu
	driver.findElement(By.cssSelector("#toplevel_page_manage-website > a > div.wp-menu-name")).click();
	Thread.sleep(7000);
  
	
	driver.findElement(By.id("fullname")).clear();
	driver.findElement(By.id("fullname")).sendKeys("NadTest QAUserNewA"); // Update Full Name
	Thread.sleep(500);
			
	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("email")).sendKeys("nadqatest04thNovB@test.com"); // Update Email
	Thread.sleep(500);
			
	driver.findElement(By.id("contact_phone")).clear();
	driver.findElement(By.id("contact_phone")).sendKeys("(987) 654-3218"); // Update Phone
	Thread.sleep(1000);
	
	// ON Seal Image
    driver.findElement(By.cssSelector("#general > div:nth-child(5) > div > div > div > span.bootstrap-switch-handle-on.bootstrap-switch-primary")).click();
    Thread.sleep(5000);                 
			
	//Click on Company Details Tab
	driver.findElement(By.cssSelector("#setupWebsiteForm > ul > li:nth-child(2) > a")).click();
	Thread.sleep(5000);                
			
	driver.findElement(By.id("company_name")).clear();
	driver.findElement(By.id("company_name")).sendKeys("NadQATest 13thNovNewA"); // Update Company Name
	Thread.sleep(500);
			
	driver.findElement(By.id("address")).clear();
	driver.findElement(By.id("address")).sendKeys("Pulachi Wadi"); // Update Address
	Thread.sleep(500);
			
	JavascriptExecutor jsnew3 = (JavascriptExecutor) driver;  
	jsnew3.executeScript("window.scrollBy(0,300)", "");
	Thread.sleep(2000);
			
	driver.findElement(By.id("address2")).clear();
	driver.findElement(By.id("address2")).sendKeys("Deccan"); // Update Address 2
	Thread.sleep(500);
			
	driver.findElement(By.id("city")).clear();
	driver.findElement(By.id("city")).sendKeys("Pune"); // Update City
	Thread.sleep(500);
			
	driver.findElement(By.id("state")).clear();
	driver.findElement(By.id("state")).sendKeys("MH"); // Update State
	Thread.sleep(500);
			
	driver.findElement(By.id("country")).clear();
	driver.findElement(By.id("country")).sendKeys("IN"); // Update Country
	Thread.sleep(500);
			
	driver.findElement(By.id("zip")).clear();
	driver.findElement(By.id("zip")).sendKeys("411001"); // Update Zip
	Thread.sleep(500);
			
	driver.findElement(By.id("comp_phone")).clear();
	driver.findElement(By.id("comp_phone")).sendKeys("(987) 654-3219"); // Update Phone
	Thread.sleep(5000);
			
	WebElement DIVelement2 = driver.findElement(By.cssSelector("#company > div:nth-child(12) > label:nth-child(1)"));

	JavascriptExecutor jse12New = (JavascriptExecutor)driver;
	jse12New.executeScript("arguments[0].scrollIntoView(true)", DIVelement2);
	Thread.sleep(5000);
	
	// click on company Logo option
	WebElement compLogo_radio_button1 = driver.findElement(By.cssSelector("#company > div:nth-child(12) > label:nth-child(3)"));
	compLogo_radio_button1.click();                                                                       
	Thread.sleep(3000);
	
	JavascriptExecutor jse13 = (JavascriptExecutor) driver;
	jse13.executeScript("window.scrollBy(0,-900)", "");
	Thread.sleep(2000);
	
	//Click on Social Details Tab
	driver.findElement(By.cssSelector("#setupWebsiteForm > ul > li:nth-child(3) > a")).click();
	Thread.sleep(5000);
	
	JavascriptExecutor jse14 = (JavascriptExecutor) driver;
		jse14.executeScript("window.scrollBy(0,900)", "");
		Thread.sleep(3000);
		
	   // ON BBB Logo
	   driver.findElement(By.cssSelector("#social > div:nth-child(9) > div > div > div > span.bootstrap-switch-handle-on.bootstrap-switch-primary")).click();
	   Thread.sleep(5000);                
	   
	  //Click on Save
	  driver.findElement(By.cssSelector("#setupWebsiteForm > button")).click();
	  Thread.sleep(5000);                
	  
	   driver.close();
  driver.switchTo().window(ParentWindowHandle);
  
    JavascriptExecutor jse15 = (JavascriptExecutor) driver;
	jse15.executeScript("window.scrollBy(0,-300)", "");
	Thread.sleep(2000);
	
	// Click on Edit My Website Section
	driver.findElement(By.id("my_website_section-0")).click();  //Edit My website section
	Thread.sleep(1000);
					
	// Click on Basic Website editor
	driver.findElement(By.cssSelector("#my_website_section-0 > div.uabb-adv-accordion-content.uabb-adv-accordion-content58f6833b40efd.fl-clearfix > div.fl-builder-content.fl-builder-content-2072.fl-builder-template.fl-builder-layout-template.fl-builder-global-templates-locked > div > div > div > div > div > div > div.fl-module.fl-module-button.fl-node-58f67b92acac9.website-popup > div > div > a > span")).click();
	Thread.sleep(2000);
	
	/*//Click on Site Contents Tab
	driver.findElement(By.cssSelector("#setupWebsiteForm > div.modal-body > div > div > div > div > ul > li:nth-child(4) > a")).click();
	Thread.sleep(5000);*/
	
	JavascriptExecutor jse16 = (JavascriptExecutor) driver;
	jse16.executeScript("window.scrollBy(0,1200)", "");
	Thread.sleep(2000);
	
	//Click on Free Estimate Link
	driver.findElement(By.cssSelector("#contents > div.free-estimatelink > p:nth-child(1) > a")).click();
	Thread.sleep(5000);
	
	for (String Handle : driver.getWindowHandles())
     {
         if (!childTab4.equals(Handle))
         {
        	 childTab4 = Handle;
             driver.switchTo().window(childTab4);
             Thread.sleep(5000);
         }

     }
  	
 Thread.sleep(5000);
   
   
    // Company Name Verification
  	String actcomp3 = driver.findElement(By.cssSelector("#fl-post-13 > div > div.fl-builder-content.fl-builder-content-13.fl-builder-content-primary > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-59d332dfc3af5 > div > div > div > div > div > div.fl-col-group.fl-node-59cce62af0847.fl-col-group-nested > div.fl-col.fl-node-59cce62af0954 > div > div.fl-module.fl-module-heading.fl-node-59cce62af09c0 > div > h3 > span")).getText();
  	String expcomp3 = "NADQATEST 13THNOVNEWA";
  	Assert.assertEquals(actcomp3, expcomp3);
  	Thread.sleep(1000);
  	
    // Address Verification
  	String actAdd3 = driver.findElement(By.cssSelector("#fl-post-13 > div > div.fl-builder-content.fl-builder-content-13.fl-builder-content-primary > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-59d332dfc3af5 > div > div > div > div > div > div.fl-col-group.fl-node-59cce62af0847.fl-col-group-nested > div.fl-col.fl-node-59cce62af0954 > div > div.fl-module.fl-module-heading.fl-node-59cce62af09f6 > div > h4 > span")).getText();
  	String expAdd3 = "PULACHI WADI DECCAN PUNE, MH IN 411001";
  	Assert.assertEquals(actAdd3, expAdd3);
  	Thread.sleep(1000);
  	
    // Phone Number Verification
  	String actPhone1 = driver.findElement(By.cssSelector("#fl-post-13 > div > div.fl-builder-content.fl-builder-content-13.fl-builder-content-primary > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-59d332dfc3af5 > div > div > div > div > div > div.fl-col-group.fl-node-59cce62af0847.fl-col-group-nested > div.fl-col.fl-node-59cce62af0954 > div > div.fl-module.fl-module-heading.fl-node-59cce62af0a2c > div > h4 > span > a")).getText();
  	String expPhone1 = "(987) 654-3219";
  	Assert.assertEquals(actPhone1, expPhone1);
  	Thread.sleep(1000);
  	
    /*// Verify User Name
  	String actuser1 = driver.findElement(By.cssSelector("#fl-post-13 > div > div.fl-builder-content.fl-builder-content-13.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-59d254a266a89 > div > div > div > div > div > div.fl-col-group.fl-node-59cce62af087d.fl-col-group-nested > div.fl-col.fl-node-59cce62af0a63 > div > div > div > div > p:nth-child(2) > strong:nth-child(1)")).getText();
  	String expuser1 = "NadTest QAUserNewA, Owner";
  	Assert.assertEquals(actuser1, expuser1);*/
  	
      /*//To Check whether Logo visible or not
      if( driver.findElement(By.cssSelector("#fl-post-13 > div > div.fl-builder-content.fl-builder-content-13.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-59d332dfc3af5 > div > div > div > div > div > div.fl-col-group.fl-node-59cce62af0847.fl-col-group-nested > div.fl-col.fl-node-59cce62af091f.fl-col-small > div > div")).isDisplayed())
      {
         System.out.println("Condition Failed : Because Company Logo is Visible");
      }
      else
      {
    	  System.out.println("Condition Success : Because Company Logo is not Visible");
      }
      
      Thread.sleep(5000);
      
      //To Check whether BBB Logo visible or not
      if( driver.findElement(By.cssSelector("#fl-post-13 > div > div.fl-builder-content.fl-builder-content-13.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-59d332dfc3af5 > div > div > div > div > div > div.fl-col-group.fl-node-59cce62af087d.fl-col-group-nested > div.fl-col.fl-node-59cce62af0a99.fl-col-small > div > div")).isDisplayed())
      {
         System.out.println("Condition Success : Because BBB Logo is Visible");
      }
      else
      {
    	  System.out.println("Condition Failed : Because BBB Logo is not Visible");
      }
      
      Thread.sleep(5000);*/
      
      driver.close();
	  driver.switchTo().window(ParentWindowHandle);
	  
	  //Click on close button of basic website editor
	  driver.findElement(By.cssSelector("#setupWebsiteForm > div.modal-body > div > div > div > div > div.setup-website-btn-pane > div.setup-website-btn.setup-website-close-pane > button")).click();
	  Thread.sleep(3000);
	  
	    JavascriptExecutor jse17 = (JavascriptExecutor) driver;
 		jse17.executeScript("window.scrollBy(0,-500)", "");
 		Thread.sleep(3000);
 		
 	    // Click on Website URL
 	    driver.findElement(By.cssSelector("#fl-post-1974 > div > div.fl-builder-content.fl-builder-content-1974.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-58f6314bde0d7 > div > div > div.fl-col-group.fl-node-58f6314be9dd5.fl-col-group-equal-height.fl-col-group-align-top > div.fl-col.fl-node-58f6314bea154.fl-col-small > div > div.fl-module.fl-module-rich-text.fl-node-58f68b1b93c88 > div > div > p:nth-child(2) > a")).click();
 	    Thread.sleep(5000);
 		
 		
 		for (String Handle : driver.getWindowHandles())
	     {
	         if (!childTab5.equals(Handle))
	         {
	        	 childTab5 = Handle;
	             driver.switchTo().window(childTab5);
	             Thread.sleep(5000);
	         }

	     }
	  	
      Thread.sleep(5000);
      
      // Click on Contact us
      driver.findElement(By.cssSelector("#home > div > div > ul > li:nth-child(5) > h5 > a")).click();
      Thread.sleep(2000);
      
      JavascriptExecutor jsnew7 = (JavascriptExecutor) driver;
	  jsnew7.executeScript("window.scrollBy(0,300)", "");
	  Thread.sleep(3000);
      
     /* //To Check whether seal image visible or not
      if( driver.findElement(By.cssSelector("#fl-post-3 > div > div.fl-builder-content.fl-builder-content-3.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-full-width.fl-row-bg-color.fl-node-587692a74f3c1 > div > div > div > div > div > div > div > div > div > a > img")).isDisplayed())
      {
         System.out.println("Condition Success : Because Seal Image is Visible");
      }
      else
      {
    	  System.out.println("Condition Failed : Because Seal Image is not Visible");
      }
      
      Thread.sleep(5000);
      
      //To Check whether BBB Logo visible or not
      if( driver.findElement(By.cssSelector("#fl-post-3 > div > div.fl-builder-content.fl-builder-content-3.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-full-width.fl-row-bg-photo.fl-node-58b2ec89de800.fl-row-bg-overlay > div > div > div > div > div > div.fl-module.fl-module-photo.fl-node-5922b34657acc.bbb_logo")).isDisplayed())
      {
         System.out.println("Condition Success : Because BBB Logo is Visible");
      }
      else
      {
    	  System.out.println("Condition Failed : Because BBB Logo is not Visible");
      }
      
      Thread.sleep(5000);*/
      
      driver.close();
	  driver.switchTo().window(ParentWindowHandle);
  
System.out.println("Everything works fine with quick Sync");
	
}

public void wpAdmin() throws InterruptedException
{
	System.out.println("Admin Actions started");
	
	String ParentWindowHandle = driver.getWindowHandle();
	String childTab1 = ParentWindowHandle;
	String childTab2 = childTab1;
	
	JavascriptExecutor jse1 = (JavascriptExecutor) driver;
	jse1.executeScript("window.scrollBy(0,1000)", "");
	Thread.sleep(1000);
	
	// Click on Access wordpress admin
	driver.findElement(By.cssSelector("#my_website_section-1 > div.uabb-adv-accordion-button.uabb-adv-accordion-button58f6833b40efd.uabb-adv-after-text")).click();
	Thread.sleep(5000);
	
	JavascriptExecutor jse11 = (JavascriptExecutor) driver;
	jse11.executeScript("window.scrollBy(0,500)", "");
	Thread.sleep(1000);
	
	// Click on Click Here to Login
	driver.findElement(By.cssSelector("#my_website_section-1 > div.uabb-adv-accordion-content.uabb-adv-accordion-content58f6833b40efd.fl-clearfix > div.fl-builder-content.fl-builder-content-2073.fl-builder-template.fl-builder-layout-template.fl-builder-global-templates-locked > div > div > div > div > div > div > div.fl-module.fl-module-rich-text.fl-node-58f67f00bdca5 > div > div > button")).click();
	Thread.sleep(10000);
	
	for (String Handle : driver.getWindowHandles())
     {
         if (!childTab1.equals(Handle))
         {
        	 childTab1 = Handle;
             driver.switchTo().window(childTab1);
             Thread.sleep(5000);
         }

     }
  	
    Thread.sleep(1000);
	
	/*//Click on CEP Estimate Pro Menu
	driver.findElement(By.cssSelector("#toplevel_page_cepFunction > a > div.wp-menu-name")).click();
	Thread.sleep(7000);
	
	//** Verify Subdomain name
	String actdomain = driver.findElement(By.name("cep-domain")).getAttribute("value");
	String expdomain = "nadqatestcompany";
	Assert.assertEquals(actdomain, expdomain);
	
	//Verify Username
	String actUsername = driver.findElement(By.name("cep-username")).getAttribute("value");
	String expUsername = "nadqatestcompany";
	Assert.assertEquals(actUsername, expUsername);
	
	//Click on save setting
	driver.findElement(By.cssSelector("#wpbody-content > div.wrap > form:nth-child(3) > div > div.sett-10 > table > tbody > tr:nth-child(4) > th > input.button.button-primary")).click();
	Thread.sleep(7000);
	
	String actMsg = driver.findElement(By.cssSelector("#wpbody-content > div.wrap > div.updated.cep-msg-success")).getText();
	String expMsg = "General Option Setting-> Saved!";
	Assert.assertEquals(actMsg, expMsg);
	
	JavascriptExecutor jse2 = (JavascriptExecutor) driver;
	jse2.executeScript("window.scrollBy(0,500)", "");
	Thread.sleep(1000);
	
	//Verify Email
	String actEmail = driver.findElement(By.name("cep-email")).getAttribute("value");
	String expEmail = "nadsoft.test02@gmail.com";
	Assert.assertEquals(actEmail, expEmail);
	
	//Click on save setting
	driver.findElement(By.cssSelector("#wpbody-content > div.wrap > form:nth-child(5) > div > div.sett-10 > table > tbody > tr:nth-child(2) > th > input.button.button-primary")).click();
	Thread.sleep(7000);                
			
	String actMsg1 = driver.findElement(By.cssSelector("#wpbody-content > div.wrap > div.updated.cep-msg-success")).getText();
	String expMsg1 = "Mail Option Setting-> Saved!";
	Assert.assertEquals(actMsg1, expMsg1);
	
	JavascriptExecutor jse3 = (JavascriptExecutor) driver;
	jse3.executeScript("window.scrollBy(0,1000)", "");
	Thread.sleep(1000);
	
	//Click on Test My Connection
	driver.findElement(By.cssSelector("#wpbody-content > div.wrap > div.estiproplugin > a")).click();
	Thread.sleep(7000);   
	
	JavascriptExecutor jse4 = (JavascriptExecutor) driver;
	jse4.executeScript("window.scrollBy(0,1000)", "");
	Thread.sleep(1000);
			
	String actMsg2 = driver.findElement(By.cssSelector("#wpbody-content > div.wrap > div.estiproplugin > span")).getText();
	String expMsg2 = "Success! Connection is successfully setup!";
	Assert.assertEquals(actMsg2, expMsg2);
	
	JavascriptExecutor jse5 = (JavascriptExecutor) driver;
	jse5.executeScript("window.scrollBy(0,-1000)", "");
	Thread.sleep(1000);
	
	//CLick on Form Setting
	driver.findElement(By.cssSelector("#wpbody-content > div.wrap > div.nav-tab-wrapper > a:nth-child(2)")).click();
	Thread.sleep(5000);
	
	//Scroll the page to bottom towards SMS Integration
	WebElement ele = driver.findElement(By.cssSelector("#wpbody-content > div.wrap > div.estiproplugin-setting > div > h3"));
	JavascriptExecutor js = (JavascriptExecutor)driver; 
	js.executeScript("arguments[0].scrollIntoView();", ele);
	Thread.sleep(2000);
	
	String actCountryCode = driver.findElement(By.cssSelector("#calling_code > optgroup > option:nth-child(94)")).getText();
	String expCountryCode = "+91,India";
	Assert.assertEquals(actCountryCode, expCountryCode);
	
	String actPhone = driver.findElement(By.cssSelector("#phone")).getAttribute("value");
	String expPhone = "(976) 664-8949";
	Assert.assertEquals(actPhone, expPhone);
	Thread.sleep(2000);
	
	//Scroll the page to top towards Additional Plugin Options
	WebElement ele1 = driver.findElement(By.cssSelector("#wpbody-content > div.wrap > form:nth-child(3) > div > div.setting-header > h3"));
	JavascriptExecutor js1 = (JavascriptExecutor)driver; 
	js1.executeScript("arguments[0].scrollIntoView();", ele1);
	Thread.sleep(2000);
	
	JavascriptExecutor jse6 = (JavascriptExecutor) driver;
	jse6.executeScript("window.scrollBy(0,-200)", "");
	Thread.sleep(1000);
	
	//CLick on Reports Tab
	driver.findElement(By.cssSelector("#wpbody-content > div.wrap > div.nav-tab-wrapper > a:nth-child(4)")).click();
	Thread.sleep(5000);
	
	//Click on Download to csv button
	driver.findElement(By.cssSelector("#estimate-table_wrapper > div.dt-buttons > a")).click();
	Thread.sleep(5000);
	
	//Click on plus button to check free estimate report
	driver.findElement(By.cssSelector("#plus_1")).click();
	Thread.sleep(5000);
	
	System.out.println("CEP Estimate Pro Setting Saved Successfully...!");*/
	
	//Click on Website Templates
	driver.findElement(By.cssSelector("#toplevel_page_website-templates > a > div.wp-menu-name")).click();
	Thread.sleep(5000);
	
	//Verify Current selected template
	String actTemp = driver.findElement(By.cssSelector("#wpbody-content > div.wrap > div.row.selected-block > div > div > div > div.bottom-section > h2")).getText();
	String expTemp = "Building Contractor";
	Assert.assertEquals(actTemp, expTemp);
	Thread.sleep(5000);
	
	JavascriptExecutor jse7 = (JavascriptExecutor) driver;
	jse7.executeScript("window.scrollBy(0,1000)", "");
	Thread.sleep(1000);
	
	//Hover mouse on image and Click on Remodeling Contractor
	Actions action = new Actions(driver);
	WebElement we = driver.findElement(By.cssSelector("#templates > div:nth-child(2) > div.template-screenshot > img"));
	action.moveToElement(we).build().perform();
	Thread.sleep(500);
	driver.findElement(By.cssSelector("#templates > div:nth-child(2) > a")).click();
	Thread.sleep(7000);                
	
	for (String Handle : driver.getWindowHandles())
     {
         if (!childTab2.equals(Handle))
         {
        	 childTab2 = Handle;
             driver.switchTo().window(childTab2);
             Thread.sleep(5000);
         }

     }
  	
   Thread.sleep(8000);
   
   driver.close();
   driver.switchTo().window(childTab1);
   Thread.sleep(5000);
   
   //Click on Remodeling contractor Template - Select Template button
   driver.findElement(By.cssSelector("#templates > div:nth-child(2) > div.bottom-section > div > a")).click();
   Thread.sleep(1000);
   
   driver.switchTo().activeElement();
   driver.findElement(By.name("template-confirm-text")).sendKeys("confirm");
   Thread.sleep(1000);
   
   //Click on Confirm
   driver.findElement(By.cssSelector("#websiteTemplateModal > div > div > div.modal-footer.custom-text-center > button.template-change-confirm.btn.btn-primary")).click();
   Thread.sleep(20000);
   
   WebDriverWait wait = new WebDriverWait(driver, 20);
   WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#wpbody-content > div.wrap > h1")));
   System.out.println(element);
   
   //Verify Current selected template
   String actTemp2 = driver.findElement(By.cssSelector("#wpbody-content > div.wrap > div.row.selected-block > div > div > div > div.bottom-section > h2")).getText();
   String expTemp2 = "Remodeling Contractor 1";
   Assert.assertEquals(actTemp2, expTemp2);
   Thread.sleep(5000);
   
   System.out.println("Add Website Template Functionality Works properly...!");
   
   driver.close();
   driver.switchTo().window(ParentWindowHandle);
   Thread.sleep(5000);
   
    driver.get("https://www.contractoros.net/new-dashboard");  
	driver.navigate().refresh();
	Thread.sleep(5000);
	
	JavascriptExecutor jse8 = (JavascriptExecutor) driver;
	jse8.executeScript("window.scrollBy(0,700)", "");
	Thread.sleep(1000);
	
	System.out.println("Admin operation completed successfully");

}

public void domainOperation() throws InterruptedException, AWTException
{
	
	JavascriptExecutor jse1 = (JavascriptExecutor) driver;
	jse1.executeScript("window.scrollBy(0,1000)", "");
	Thread.sleep(1000);
	
	// Click on Purchase New Domain Section
	driver.findElement(By.cssSelector("#fl-post-1974 > div > div.fl-builder-content.fl-builder-content-1974.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-58f6314bde0d7 > div > div > div.fl-col-group.fl-node-58f6314be9dd5.fl-col-group-equal-height.fl-col-group-align-top > div.fl-col.fl-node-58f6314bea2b6.fl-col-small > div > div.fl-module.fl-module-advanced-accordion.fl-node-58f6671b732e8 > div > div > div:nth-child(1) > div.uabb-adv-accordion-button.uabb-adv-accordion-button58f6671b732e8.uabb-adv-after-text")).click();
	Thread.sleep(5000);                
	
	JavascriptExecutor jse2 = (JavascriptExecutor) driver;
	jse2.executeScript("window.scrollBy(0,500)", "");
	Thread.sleep(1000);
	
	// Click on Purchase New Domain Button
	driver.findElement(By.cssSelector("#fl-post-1974 > div > div.fl-builder-content.fl-builder-content-1974.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-58f6314bde0d7 > div > div > div.fl-col-group.fl-node-58f6314be9dd5.fl-col-group-equal-height.fl-col-group-align-top > div.fl-col.fl-node-58f6314bea2b6.fl-col-small > div > div.fl-module.fl-module-advanced-accordion.fl-node-58f6671b732e8 > div > div > div.uabb-adv-accordion-item.uabb-adv-accordion-item-active > div.uabb-adv-accordion-content.uabb-adv-accordion-content58f6671b732e8.fl-clearfix > div.fl-builder-content.fl-builder-content-2081.fl-builder-template.fl-builder-layout-template.fl-builder-global-templates-locked > div > div > div > div > div > div > div.fl-module.fl-module-button.fl-node-58f6ae4d61292 > div > div > a")).click();
	Thread.sleep(10000);
    
    //Click on Purchase
    driver.findElement(By.id("btnPurchase")).click();
    Thread.sleep(3000);
    
    String actMsg = driver.findElement(By.cssSelector("#form_domain-error")).getText();
    String expMsg = "This field is required.";
    Assert.assertEquals(actMsg, expMsg);
    
    //Enter domain name
    driver.findElement(By.id("form_domain")).sendKeys("nadqatest");
    Thread.sleep(7000);
    
    Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	
	//Back to previous page
	driver.navigate().back();
	Thread.sleep(5000);
	
	// Click on Transfer Existing Domain Section
	driver.findElement(By.cssSelector("#fl-post-1974 > div > div.fl-builder-content.fl-builder-content-1974.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-58f6314bde0d7 > div > div > div.fl-col-group.fl-node-58f6314be9dd5.fl-col-group-equal-height.fl-col-group-align-top > div.fl-col.fl-node-58f6314bea2b6.fl-col-small > div > div.fl-module.fl-module-advanced-accordion.fl-node-58f6671b732e8 > div > div > div:nth-child(2) > div.uabb-adv-accordion-button.uabb-adv-accordion-button58f6671b732e8.uabb-adv-after-text")).click();
	Thread.sleep(5000);                
	
	JavascriptExecutor jse4 = (JavascriptExecutor) driver;
	jse4.executeScript("window.scrollBy(0,500)", "");
	Thread.sleep(1000);
	
	// Click on Transfer my Domain Button
	driver.findElement(By.cssSelector("#fl-post-1974 > div > div.fl-builder-content.fl-builder-content-1974.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-58f6314bde0d7 > div > div > div.fl-col-group.fl-node-58f6314be9dd5.fl-col-group-equal-height.fl-col-group-align-top > div.fl-col.fl-node-58f6314bea2b6.fl-col-small > div > div.fl-module.fl-module-advanced-accordion.fl-node-58f6671b732e8 > div > div > div.uabb-adv-accordion-item.uabb-adv-accordion-item-active > div.uabb-adv-accordion-content.uabb-adv-accordion-content58f6671b732e8.fl-clearfix > div.fl-builder-content.fl-builder-content-2082.fl-builder-template.fl-builder-layout-template.fl-builder-global-templates-locked > div > div > div > div > div > div > div.fl-module.fl-module-button.fl-node-58f6b346773b6 > div > div > a")).click();
	Thread.sleep(10000);
    
    JavascriptExecutor jse3 = (JavascriptExecutor) driver;
	jse3.executeScript("window.scrollBy(0,1000)", "");
	Thread.sleep(1000);
	
	String actIP = driver.findElement(By.cssSelector("#fl-post-2056 > div > div.fl-builder-content.fl-builder-content-2056.fl-builder-content-primary.fl-builder-global-templates-locked > div.fl-row.fl-row-fixed-width.fl-row-bg-none.fl-node-58f474fb664ef > div > div > div > div > div > div > div > div > ul > li:nth-child(3) > strong:nth-child(2)")).getText();
    String expIP = "34.236.84.194";
    Assert.assertEquals(actIP, expIP);
	
	 //Click on Transfer Your Domain Name Now Button
    driver.findElement(By.id("domain-trasfer-btn")).click();
    Thread.sleep(3000);
    
    driver.switchTo().activeElement();
    Thread.sleep(1000);
    
    //Click on Transfer Now Button
    driver.findElement(By.cssSelector("#transfer_domain > div.modal-footer > button.transfer-btn")).click();
    Thread.sleep(1000);
    
    String actMsg1 = driver.findElement(By.cssSelector("#domain_name-error")).getText();
    String expMsg1 = "This field is required.";
    Assert.assertEquals(actMsg1, expMsg1);
    
    //Click on close button
    driver.findElement(By.cssSelector("#transfer_domain > div.modal-footer > button.btn-default")).click();
    Thread.sleep(1000);
    
    //Click on Transfer Your Domain Name Now Button
    driver.findElement(By.id("domain-trasfer-btn")).click();
    Thread.sleep(3000);
    
    driver.switchTo().activeElement();
    Thread.sleep(1000);
    
    //Enter Domain Name
    driver.findElement(By.name("domain_name")).sendKeys("tushargulve.info");
    Thread.sleep(3000);
    
    //Click on Transfer Now Button
    driver.findElement(By.cssSelector("#transfer_domain > div.modal-footer > button.transfer-btn")).click();
    Thread.sleep(10000);
    
    System.out.println("Domain Transfer Successfully");
	
}

public void otherOperation() throws InterruptedException, AWTException
{
	testMode();
	userLogin();
	
	//Focus on My Account Menu
	Actions action = new Actions(driver);
	WebElement we = driver.findElement(By.cssSelector("#menu-item-1982"));
	action.moveToElement(we).build().perform();
	
	//Click on Update Credit Card menu
	driver.findElement(By.cssSelector("#menu-item-1988 > a")).click();
	Thread.sleep(5000);
	
    //Enter Credit card details
	driver.switchTo().frame("__privateStripeFrame3");
	driver.findElement(By.cssSelector("#root > form > div > div.CardField-input-wrapper.is-ready-to-slide > span.CardField-number.CardField-child > span:nth-child(2) > label > input")).sendKeys("4242424242424242");
	Thread.sleep(2000);                
	driver.findElement(By.cssSelector("#root > form > div > div.CardField-input-wrapper.is-ready-to-slide > span.CardField-expiry.CardField-child > span > label > input")).sendKeys("0424");
	Thread.sleep(2000);                
	driver.findElement(By.cssSelector("#root > form > div > div.CardField-input-wrapper.is-ready-to-slide > span.CardField-cvc.CardField-child > span > label > input")).sendKeys("123");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("#root > form > div > div.CardField-input-wrapper.is-ready-to-slide > span.CardField-postalCode.CardField-child > span > label > input")).sendKeys("411005");
	Thread.sleep(2000);
	
	driver.switchTo().defaultContent();
	Thread.sleep(1000);
	
	//Click on Submit
	driver.findElement(By.cssSelector("#mepr-stripe-payment-form > div > input")).click();
	Thread.sleep(5000);                
	
	System.out.println("Credit Card Updated Successfully");
	
    //Focus on My Account Menu
	Actions action1 = new Actions(driver);
	WebElement we1 = driver.findElement(By.cssSelector("#menu-item-1982"));
	action1.moveToElement(we1).build().perform();
	
	//Click on Upgrade Subscription
	driver.findElement(By.cssSelector("#menu-item-2198 > a")).click();
	Thread.sleep(5000);
	
	//Click on Upgrade to Annual Link
	driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/article/div/div[1]/div[4]/div/div/div/div/div/div/div/div/div[1]/div[2]/table/tbody/tr/td[7]/div/a")).click();
	Thread.sleep(2000);                
	
	//Enter Confirm on PopUp
	driver.findElement(By.cssSelector("#confirm-upgradetext")).sendKeys("confirm");
	Thread.sleep(5000);
	
	//Click on Continue
	driver.findElement(By.cssSelector("#upgradeModal > div.modal-dialog > div > div.modal-footer > button.btn.btn-primary.upgrade_subscription")).click();
	Thread.sleep(10000);
	
	System.out.println("Annual Subscription Updated Successfully.");
	
	 //Focus on Resources
	Actions action2 = new Actions(driver);
	WebElement we2 = driver.findElement(By.cssSelector("#menu-item-2237"));
	action2.moveToElement(we2).build().perform();
	
	//Click on Get Customer Reviews
	driver.findElement(By.cssSelector("#menu-item-2238 > a")).click();
	Thread.sleep(5000);
	
	//Click on Request Review
	driver.findElement(By.cssSelector("#topButton > button")).click();
	Thread.sleep(1000);
	
	//Click on Select Customer Drop-Down
	driver.findElement(By.id("customer")).click();
	Thread.sleep(1000);
	
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	
	//Click on Request Review
	driver.findElement(By.cssSelector("#topButton > button")).click();
	Thread.sleep(5000);
	
	//Click on edit template
	driver.findElement(By.id("editTemplate")).click();
	Thread.sleep(5000);
	
	JavascriptExecutor jse1 = (JavascriptExecutor) driver;
	jse1.executeScript("window.scrollBy(0,1000)", "");
	Thread.sleep(1000);
	
	//Click on cancel Button
	driver.findElement(By.cssSelector("#cancelButton")).click();
	Thread.sleep(1000);
	
	JavascriptExecutor jse2 = (JavascriptExecutor) driver;
	jse2.executeScript("window.scrollBy(0,-1000)", "");
	Thread.sleep(1000);
	
	//Click on edit template
	driver.findElement(By.id("editTemplate")).click();
	Thread.sleep(5000);
	
	JavascriptExecutor jse3 = (JavascriptExecutor) driver;
	jse3.executeScript("window.scrollBy(0,800)", "");
	Thread.sleep(1000);
	
	//Click on Request Review
	driver.findElement(By.cssSelector("#bottomButton > div.col-md-7.m-t-25 > button")).click();
	Thread.sleep(5000);
	
	//Click on View Template
	driver.findElement(By.cssSelector("#email-log-table > tbody > tr:nth-child(1) > td:nth-child(5) > button")).click();
	Thread.sleep(1000);                
	
	//Click on Close View PopUp
	driver.findElement(By.cssSelector("#email_popup > div.modal-dialog.modal-lg > div > div.modal-header > button")).click();
	Thread.sleep(1000);
	
	System.out.println("Request Review Functionality Works Successfully");

}

public void resetWebsite() throws InterruptedException
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
	
	//Click on Reset Website menu
	driver.findElement(By.cssSelector("#toplevel_page_reset-website > a > div.wp-menu-name")).click();
	Thread.sleep(5000); 
	
	driver.findElement(By.cssSelector("#reset_site_table_filter > label > input[type=search]")).sendKeys("nadsoft.test02@gmail.com");
	Thread.sleep(2000); 
	
	//Click on Reset Website
	driver.findElement(By.id("reset_site_btn")).click();
	Thread.sleep(2000);
	
	//Enter Confirm
	driver.findElement(By.id("confirm-text")).sendKeys("confirm");
	Thread.sleep(2000);
	
	//Click on Reset Website button on pop up
	driver.findElement(By.cssSelector("#reserWebsiteModal > div > div > div.modal-footer.custom-text-center > button.reset-website-confirm.btn.btn-primary")).click();
	Thread.sleep(7000);
	
	System.out.println("Website Reset Successfully");

}

public void cancelSubscription() throws InterruptedException
{
	userLogin(); //Call User Login Method
	
	//Focus on My Account Menu
	Actions action = new Actions(driver);
	WebElement we = driver.findElement(By.cssSelector("#menu-item-1982"));
	action.moveToElement(we).build().perform();
	
	//Click on Cancel My Account menu
	driver.findElement(By.cssSelector("#menu-item-2067 > a")).click();
	Thread.sleep(5000);
	
	//Click on cancel link(Annual Subscription)
	driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/article/div/div[1]/div[4]/div/div/div/div/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[7]/div/a[2]")).click();
	Thread.sleep(2000);
	
	//Enter Confirm
	driver.findElement(By.id("confirm-text")).sendKeys("confirm");
	Thread.sleep(5000);
	
	//Click on Delete Foreever button on pop up
	driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div/div[3]/p[1]/button")).click();
	Thread.sleep(5000);
	
    //Click on cancel link(7 day Trial Subscription)
	driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/article/div/div[1]/div[4]/div/div/div/div/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[7]/div/a[2]")).click();
	Thread.sleep(2000);
	
	//Enter Confirm
	driver.findElement(By.id("confirm-text")).sendKeys("confirm");
	Thread.sleep(5000);
	
	//Click on Delete Foreever button on pop up
	driver.findElement(By.cssSelector("html/body/div[2]/div/div[1]/div/div[3]/p[1]/button")).click();
	Thread.sleep(5000);  
	
    //Focus on My Account Menu
	Actions action1 = new Actions(driver);
	WebElement we1 = driver.findElement(By.cssSelector("#menu-item-1982"));
	action1.moveToElement(we1).build().perform();
	
	//Click on My Dashboard menu
	driver.findElement(By.cssSelector("#menu-item-2113 > a")).click();
	Thread.sleep(5000);
	
	System.out.println("Subscription Cancelled Successfully");

}

public void deleteAccount() throws InterruptedException
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
	
	//Click on Users menu
	driver.findElement(By.cssSelector("#menu-users > a")).click();
	Thread.sleep(5000); 
	
	driver.findElement(By.cssSelector("#user-search-input")).sendKeys("nadsoft.test02@gmail.com"); //Search User by Email ID
	Thread.sleep(2000); 
	
	//Click on search
	driver.findElement(By.id("search-submit")).click();
	Thread.sleep(5000);
	
	//Focus on My Account Menu
	Actions action = new Actions(driver);
	WebElement we = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div[3]/form/table/tbody/tr/td[1]"));
	action.moveToElement(we).build().perform();
	
	//Click on Delete
	driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div[3]/form/table/tbody/tr/td[1]/div/span[2]/a")).click();
	Thread.sleep(5000);
	
	//Click on Confirm Deletion
	driver.findElement(By.id("submit")).click();
	Thread.sleep(5000);
	
	System.out.println("User Deleted Successfully.");
	
}


}

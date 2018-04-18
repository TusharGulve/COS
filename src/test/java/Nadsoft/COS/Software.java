package Nadsoft.COS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Software {
	public static WebDriver driver;
	@Test
	public void testScript() throws InterruptedException, AWTException
	{
		//Login();
		//companyDetailsSection();
		//addCustomer();
        //addEstimate();
		//addJob();
		//addInsurance();
		//superAdminLogin();
		//addAppointment();
		//addPhotos();
		//addFile();
		//subcontractorTab();
		
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
		driver.manage().window().setSize(d);
		 
	
		 
		driver.get("http://nadqatestcomp.contractorestimatepro.com");
		Thread.sleep(8000);
		
	}
	
	public void drawCanvas() throws InterruptedException
	{
        Actions builder = new Actions(driver);
       // JavascriptExecutor jse8 = (JavascriptExecutor) driver;
        driver.switchTo().frame("signature-iframe");
        WebElement element3 = driver.findElement(By.cssSelector("#signature-pad > div.m-signature-pad--body > canvas"));
        //jse8.executeScript("arguments[0].scrollIntoView();", element3); //Scroll the page and move where the element is located
        Action drawAction = builder.moveToElement(element3, 185, 15) //start points x axis and y axis.
        		.clickAndHold()
                .moveByOffset(145, 15) // 2nd points (x1,y1)
                .moveByOffset(185, 15)// 3rd points (x2,y2)
                .moveByOffset(195, 15)// 3rd points (x2,y2)
                .moveByOffset(205, 25)
               .doubleClick()
                .build();
        drawAction.perform();
        
        // Click on save
        driver.findElement(By.id("btnSave")).click();
        Thread.sleep(5000);
    }
	
	public void superAdminLogin() throws InterruptedException
	{
		driver.findElement(By.id("ctl00_txtUserName")).sendKeys("cosadmin");   // Enter Username
		Thread.sleep(1000);
		
		driver.findElement(By.id("ctl00_txtPassword")).sendKeys("admin123");   // Enter Password
		Thread.sleep(1000);
		
		driver.findElement(By.id("ctl00_btnLogin")).click();   //Click on Login button
		Thread.sleep(8000);
		
		System.out.println("Super Admin Log In Successfully.");
	
	}
	
	public void Login() throws InterruptedException
	{
		
		/*driver.findElement(By.id("ctl00_btnLogin")).click();   //Click on Login button
		Thread.sleep(5000);
		
		// Capture and verify success message on pop up
	    driver.switchTo().activeElement();
	  	String actmsg = driver.findElement(By.cssSelector("#desktopAlertPanel > div > strong")).getText();
	  	String expmsg = "Login Failed, Please Try Again.";
	  	Assert.assertEquals(actmsg, expmsg);*/
		
		driver.findElement(By.id("ctl00_txtUserName")).sendKeys("nadqatestcomp");   // Enter Username
		Thread.sleep(1000);
		
		/*driver.findElement(By.id("ctl00_txtPassword")).sendKeys("nadsoft12");   // Enter Password
		Thread.sleep(3000);
		
		driver.findElement(By.id("ctl00_btnLogin")).click();   //Click on Login button
		Thread.sleep(5000);
		
		// Capture and verify success message on pop up
		driver.switchTo().activeElement();
	  	String actmsg1 = driver.findElement(By.cssSelector("#desktopAlertPanel > div > strong")).getText();
	  	String expmsg1 = "Login Failed, Password did not match.";
	  	Assert.assertEquals(actmsg1, expmsg1);*/
	  	
	  	driver.findElement(By.id("ctl00_txtPassword")).sendKeys("nadsoft123");   // Enter Password
		Thread.sleep(1000);
		
		driver.findElement(By.id("ctl00_btnLogin")).click();   //Click on Login button
		Thread.sleep(8000);
		
		System.out.println("Log In into Software Successfully.");
	}
	
	public void addCustomer()throws InterruptedException
	{
		// Click on Customer menu
		driver.findElement(By.linkText("Customers")).click();
		Thread.sleep(3000);
		
		//Click on Add New Customer
		driver.findElement(By.linkText("Add New Customer")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("ctl00$txtCompanyName")).sendKeys("CusComp"); // Enter Company name
		Thread.sleep(500);
		
		driver.findElement(By.name("ctl00$txtFirstName")).sendKeys("CusFName"); // Enter Customer First name
		Thread.sleep(500);
		
		driver.findElement(By.name("ctl00$txtLastName")).sendKeys("CusLName"); // Enter Customer Last name
		Thread.sleep(500);
		
		driver.findElement(By.name("ctl00$txtAddress")).sendKeys("J.M.Road"); // Enter Customer Address 1
		Thread.sleep(500);
		
		driver.findElement(By.name("ctl00$txtAddress2")).sendKeys("Deccan"); // Enter Customer Address 2
		Thread.sleep(500);
		
		driver.findElement(By.name("ctl00$txtCity")).sendKeys("Pune"); // Enter Customer City
		Thread.sleep(500);
		
		driver.findElement(By.name("ctl00$txtZip")).sendKeys("411004"); // Enter Customer Zip Code
		Thread.sleep(500);
		
		driver.findElement(By.name("ctl00$txtCountry")).sendKeys("India"); // Enter Customer Country
		Thread.sleep(500);
		
		driver.findElement(By.name("ctl00$txtPhone")).sendKeys("9876543210"); // Enter Customer Phone
		Thread.sleep(500);
		
		driver.findElement(By.name("ctl00$txtCellPhone")).sendKeys("9876543211"); // Enter Customer Cell Phone
		Thread.sleep(500);
		
		driver.findElement(By.name("ctl00$txtFax")).sendKeys("9876543212"); // Enter Customer Fax
		Thread.sleep(500);
		
		driver.findElement(By.name("ctl00$txtEmailAddress")).sendKeys("tushar@nadsoftdev.com"); // Enter Customer Email
		Thread.sleep(500);
		
		driver.findElement(By.id("ctl00_btnSave")).click();  // Click on Save button
		Thread.sleep(5000);
		
		System.out.println("----> Customer Saved Successfully.");
			
	}
	
	public void addEstimate()throws InterruptedException, AWTException
	{
		// Click on Customer menu
		driver.findElement(By.linkText("Customers")).click();
		Thread.sleep(3000);
		
		// Click on Edit Customer
		driver.findElement(By.cssSelector("#DataTables_Table_0 > tbody > tr.odd > td.sorting_1 > a > i")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("ctl00_liTabEstimates")).click(); // Click on Estimate Menu Tab
		Thread.sleep(500);
		  
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		
		driver.findElement(By.id("btnAddEstimate")).click(); // Click on Add Estimate button
		Thread.sleep(5000);
		
		driver.findElement(By.id("ctl00_btnCopyAddress")).click(); // Click on Copy button
		Thread.sleep(3000);
		
		/*driver.findElement(By.id("ctl00_btnSave")).click(); // Click on Save button
		Thread.sleep(5000);
		  
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,500)", "");
		
		driver.findElement(By.cssSelector("#dtEstimateGrid > tbody > tr > td:nth-child(1) > a > i")).click(); // Click on Edit Estimate button
		Thread.sleep(5000);*/
		
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		
		// Click on Add Item
		driver.findElement(By.id("btnAddItem")).click();
		Thread.sleep(3000);
		
		// Close Add Item Window
		driver.findElement(By.cssSelector("#modal-add-new > div > div > div.modal-header.modalHeader > button > i")).click();
		Thread.sleep(1000);
		
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("window.scrollBy(0,-300)", "");
		Thread.sleep(3000);
		
		driver.findElement(By.id("ctl00_btnApply")).click(); // Click on Apply button
		Thread.sleep(5000);
		
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		
		// Click on Add Item
		driver.findElement(By.id("btnAddItem")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame("modal-iframe");
		
		WebElement supl_dropdown = driver.findElement(By.id("ctl00_ddlSupplier"));
	  	Select supl_dd = new Select(supl_dropdown);
	  	
	  	//It will select 2nd supplier from list
	  	supl_dd.selectByIndex(0);
	  	
	  	Thread.sleep(3000);
		
		driver.findElement(By.id("ctl00_btnSelectProduct")).click(); // Click on Copy button button of Add Item
		Thread.sleep(5000);
		
		//Enter Shipping Amount
		driver.findElement(By.name("ctl00$txtShipping")).clear();
		driver.findElement(By.name("ctl00$txtShipping")).sendKeys("100");
		Thread.sleep(1000);
		
		//Enter Tax Amount
		driver.findElement(By.name("ctl00$txtTax")).clear();
		driver.findElement(By.name("ctl00$txtTax")).sendKeys("200");
		Thread.sleep(3000);
		
		// Click on Save
		driver.findElement(By.id("ctl00_btnSave")).click();
		Thread.sleep(5000);
		
		// Click on Job Description
		driver.findElement(By.id("ctl00_liTabDescription")).click();
		Thread.sleep(2000);
		 
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.cssSelector("#ctl00_tabDescription > div > div.Editor-editor"));
		// Right Click on Job Description
		Actions action = new Actions(driver).contextClick(element);
		action.build().perform();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		
		// Click on Payment Schedule Description
		driver.findElement(By.id("ctl00_liTabPaySchedule")).click();
		Thread.sleep(2000);
		
		// Print Payment Schedule Description
		String actPaymntschDesc = driver.findElement(By.cssSelector("#ctl00_tabPaySchedule > div > div.Editor-editor")).getText();
		System.out.println("Estimate Payment Schedule Description : " +actPaymntschDesc);
		 
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
        jse6.executeScript("window.scrollBy(0,-300)", "");
		Thread.sleep(3000);
		
		driver.findElement(By.id("ctl00_btnConvert")).click(); // Click on Convert button
		Thread.sleep(5000);
		
		driver.findElement(By.id("btnStandardEmail")).click(); // Click on Standard Estimate button
		Thread.sleep(5000);
		
		driver.switchTo().activeElement();
		String actmsg1 = driver.findElement(By.xpath("/html/body/div[10]/div/div/div[1]/div")).getText();
	  	String expmsg1 = "Estimate has been emailed.";
	  	Assert.assertEquals(actmsg1, expmsg1);
		driver.findElement(By.cssSelector("body > div.bootbox.modal.fade.bootbox-alert.in > div > div > div.modal-footer > button")).click();
		Thread.sleep(3000); 

		driver.findElement(By.id("btnDetailedEmail")).click(); // Click on Detailed Estimate button
		Thread.sleep(5000);
		
		driver.switchTo().activeElement();
		String actmsg2 = driver.findElement(By.xpath("/html/body/div[10]/div/div/div[1]/div")).getText();
	  	String expmsg2 = "Estimate has been emailed.";
	  	Assert.assertEquals(actmsg2, expmsg2);
		driver.findElement(By.xpath("/html/body/div[10]/div/div/div[2]/button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("ctl00_btnPrint")).click(); // Click on Print button
		Thread.sleep(7000);
		
		driver.findElement(By.id("ctl00_btnDelete")).click(); // Click on Delete button
		Thread.sleep(3000);
		
		driver.switchTo().activeElement();
		driver.findElement(By.cssSelector("body > div.bootbox.modal.fade.bootbox-confirm.in > div > div > div.modal-footer > button.btn.btn-default")).click();  // Click on Cancel Button
		Thread.sleep(1000);
		
		driver.findElement(By.id("ctl00_btnDelete")).click(); // Click on Delete button
		Thread.sleep(3000);
		
		driver.switchTo().activeElement();
		driver.findElement(By.cssSelector("body > div.bootbox.modal.fade.bootbox-confirm.in > div > div > div.modal-footer > button.btn.btn-primary")).click();  // Click on OK Button
		Thread.sleep(7000); 
		
		System.out.println("Estimate Actions completed Successfully.");
		
	}
	
	public void addJob()throws InterruptedException, AWTException
	{
		// Click on Customer menu
		driver.findElement(By.linkText("Customers")).click();
		Thread.sleep(3000);
		
		// Click on Edit Customer
		driver.findElement(By.cssSelector("#DataTables_Table_0 > tbody > tr.odd > td.sorting_1 > a > i")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("ctl00_liTabJobs")).click(); // Click on Job Menu Tab
		Thread.sleep(500);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;  
		jse.executeScript("window.scrollBy(0,500)", "");
		
		driver.findElement(By.id("btnAddJob")).click(); // Click on Add Job button
		Thread.sleep(5000);
		
		driver.findElement(By.id("ctl00_btnCopyAddress")).click(); // Click on Copy button
		Thread.sleep(3000);
		
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		
		// Click on Add Item
		driver.findElement(By.id("btnAddItem")).click();
		Thread.sleep(3000);
		
		// Close Add Item Window
		driver.findElement(By.cssSelector("#modal-add-new > div > div > div.modal-header.modalHeader > button > i")).click();
		Thread.sleep(1000); 
		
		/*driver.findElement(By.id("ctl00_btnSave")).click(); // Click on Save button
		Thread.sleep(5000);*/
		
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;  
		jse2.executeScript("window.scrollBy(0,500)", "");
		
		/*driver.findElement(By.cssSelector("#dtJobGrid > tbody > tr > td:nth-child(1) > a > i")).click(); // Click on Edit Job button
		Thread.sleep(5000);*/
		
		driver.findElement(By.id("ctl00_btnApply")).click(); // Click on Apply button
		Thread.sleep(5000);
		
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		
		// Click on Add Item
		driver.findElement(By.id("btnAddItem")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame("modal-iframe");
		
		WebElement supl_dropdown = driver.findElement(By.id("ctl00_ddlSupplier"));
	  	Select supl_dd = new Select(supl_dropdown);
	  	
	  	//It will select 2nd supplier from list
	  	supl_dd.selectByIndex(0);
	  	
	  	Thread.sleep(3000);
		
		driver.findElement(By.id("ctl00_btnSelectProduct")).click(); // Click on Copy button button of Add Item
		Thread.sleep(5000);
		
		//Enter Shipping Amount
		driver.findElement(By.name("ctl00$txtShipping")).clear();
		driver.findElement(By.name("ctl00$txtShipping")).sendKeys("100");
		Thread.sleep(1000);
		
		//Enter Tax Amount
		driver.findElement(By.name("ctl00$txtTax")).clear();
		driver.findElement(By.name("ctl00$txtTax")).sendKeys("200");
		Thread.sleep(3000);
		
		// Click on Save
		driver.findElement(By.id("ctl00_btnSave")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		
		// Click on Job Description
		driver.findElement(By.id("ctl00_liTabDescription")).click();
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.cssSelector("#ctl00_tabDescription > div > div.Editor-editor"));
		// Right Click on Job Description  
		Actions action = new Actions(driver).contextClick(element);
		action.build().perform();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		driver.findElement(By.id("ctl00_btnApply")).click(); // Click on Apply button
		Thread.sleep(5000);
		
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		
		
		// Click on Payment Schedule Description
		driver.findElement(By.id("ctl00_liTabPaySchedule")).click();
		Thread.sleep(2000);
		
		// Print Payment Schedule Description
		String actPaymntschDesc = driver.findElement(By.cssSelector("#ctl00_tabPaySchedule > div > div.Editor-editor")).getText();
		System.out.println("Job Payment Schedule Description : " +actPaymntschDesc);
		Thread.sleep(3000);
		
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("window.scrollBy(0,-400)", "");
		Thread.sleep(3000);
		
		driver.findElement(By.id("ctl00_btnPrint")).click(); // Click on Print button
		Thread.sleep(7000);
		
		driver.findElement(By.id("ctl00_btnDelete")).click(); // Click on Delete button
		Thread.sleep(3000);
		
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/button[1]")).click();  // Click on Cancel Button
		Thread.sleep(1000); 
		
		driver.findElement(By.id("ctl00_btnDelete")).click(); // Click on Delete button
		Thread.sleep(3000);
		
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/button[2]")).click();  // Click on OK Button
		Thread.sleep(7000);
		
		System.out.println("Job Actions completed Successfully.");	
		
	}
	
	public void addInsurance() throws InterruptedException, AWTException
	{
		// Click on Customer menu
		driver.findElement(By.linkText("Customers")).click();
		Thread.sleep(3000);
				
		// Click on Edit Customer
		driver.findElement(By.cssSelector("#DataTables_Table_0 > tbody > tr.odd > td.sorting_1 > a > i")).click();
		Thread.sleep(5000);
				
		driver.findElement(By.id("aTabInsurance")).click(); // Click on Insurance Page
		Thread.sleep(500);
		
		driver.findElement(By.id("ctl00_txtCompanyName")).clear();
		driver.findElement(By.id("ctl00_txtCompanyName")).sendKeys("InsComp");  // Enter Insurance Company Name
		Thread.sleep(500);

		driver.findElement(By.id("ctl00_txtFirstName")).clear();
		driver.findElement(By.id("ctl00_txtFirstName")).sendKeys("InsFname");  // Enter Insurance Contact First Name
		Thread.sleep(500);

		driver.findElement(By.id("ctl00_txtLastName")).clear();
		driver.findElement(By.id("ctl00_txtLastName")).sendKeys("InsLname");  // Enter Insurance Contact Last Name
		Thread.sleep(500);

	    driver.findElement(By.id("ctl00_txtAddress")).clear();
		driver.findElement(By.id("ctl00_txtAddress")).sendKeys("J.M.Road");  // Enter Insurance Address 1
		Thread.sleep(500);

		driver.findElement(By.id("ctl00_txtAddress2")).clear();
		driver.findElement(By.id("ctl00_txtAddress2")).sendKeys("Deccan");  // Enter Insurance Address 2
		Thread.sleep(500);

		driver.findElement(By.id("ctl00_txtCity")).clear();
		driver.findElement(By.id("ctl00_txtCity")).sendKeys("Pune");  // Enter Insurance City
		Thread.sleep(500);

		driver.findElement(By.id("ctl00_txtZip")).clear();
		driver.findElement(By.id("ctl00_txtZip")).sendKeys("411004");  // Enter Insurance Zip
		Thread.sleep(500);

		driver.findElement(By.id("ctl00_txtCountry")).clear();
		driver.findElement(By.id("ctl00_txtCountry")).sendKeys("India");  // Enter Insurance Country
		Thread.sleep(500);

		driver.findElement(By.id("ctl00_txtPhone")).clear();
		driver.findElement(By.id("ctl00_txtPhone")).sendKeys("1234567890");  // Enter Insurance Phone Number
		Thread.sleep(500);

		driver.findElement(By.id("ctl00_txtCellPhone")).clear();
		driver.findElement(By.id("ctl00_txtCellPhone")).sendKeys("1234567891");  // Enter Insurance Cell Phone Number
		Thread.sleep(500);

		driver.findElement(By.id("ctl00_txtFax")).clear();
		driver.findElement(By.id("ctl00_txtFax")).sendKeys("1234567892");  // Enter Insurance Fax Number
		Thread.sleep(500);

		driver.findElement(By.id("ctl00_txtEmailAddress")).clear();
		driver.findElement(By.id("ctl00_txtEmailAddress")).sendKeys("nadsoft.test01@gmail.com");  // Enter Insurance Email Address
		Thread.sleep(500);

		driver.findElement(By.id("ctl00_txtPolicyNumber")).clear();
		driver.findElement(By.id("ctl00_txtPolicyNumber")).sendKeys("POL-1230");  // Enter Policy Number
		Thread.sleep(500);

		driver.findElement(By.id("ctl00_txtclaimnumber")).clear();
		driver.findElement(By.id("ctl00_txtclaimnumber")).sendKeys("CN-4560");  // Enter Claim Number
		Thread.sleep(500);

		driver.findElement(By.id("ctl00_txtclaimtype")).clear();
		driver.findElement(By.id("ctl00_txtclaimtype")).sendKeys("CT-7890");  // Enter Claim Type
		Thread.sleep(500);
		
		driver.findElement(By.id("ctl00_btnEdit")).click();  // Click on Save button
		Thread.sleep(5000);

		driver.findElement(By.id("ctl00_btnEdit")).click();  // Click on Update button
		Thread.sleep(5000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;  
		jse.executeScript("window.scrollBy(0,500)", "");

		driver.findElement(By.id("ctl00_btnEdit1")).click();  // Click on Edit button of first Template
		Thread.sleep(10000);

		driver.findElement(By.cssSelector("#tblTemplates > tbody > tr:nth-child(1) > td:nth-child(3) > a")).click();  // Click on Send button of first template
		Thread.sleep(5000); 
		
		// Click on Close Button
		driver.switchTo().activeElement();
		String actmsg1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div")).getText();
	  	String expmsg1 = "Email has been sent"; 
	  	Assert.assertEquals(actmsg1, expmsg1);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#tblTemplates > tbody > tr:nth-child(1) > td:nth-child(4) > a")).click();  // Click on Download button
		Thread.sleep(5000);
		
    	JavascriptExecutor jse1 = (JavascriptExecutor) driver;  
		jse1.executeScript("window.scrollBy(0,200)", "");
		
		// Click on Browse button
		driver.findElement(By.cssSelector("#ctl00_btnBrowse1")).click();
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
		Thread.sleep(5000);	
		
		//Click on Upload
		driver.findElement(By.cssSelector("#ctl00_btnUploadInsuranceContingency")).click();
		Thread.sleep(7000);	
		
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;  
		jse2.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(2000);
		
		// Click on Download Button
		driver.findElement(By.cssSelector("#tblTemplates1 > tbody > tr:nth-child(1) > td:nth-child(3) > a > i")).click();
		Thread.sleep(5000);
		
		// Click on Send Button
		driver.findElement(By.cssSelector("#tblTemplates1 > tbody > tr:nth-child(1) > td:nth-child(5) > a")).click();
		Thread.sleep(5000);
		
		// Click on Close Button
		driver.switchTo().activeElement();
		String actmsg2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div")).getText();
		String expmsg2 = "Email has been sent"; 
		Assert.assertEquals(actmsg2, expmsg2);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button")).click();
		Thread.sleep(3000); 
		
		
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;  
		jse3.executeScript("window.scrollBy(0,-400)", "");
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_btnCancel")).click();  // Click on Cancel button
		Thread.sleep(5000);
		
		System.out.println("Insurance Actions Complted Successfully.");
		
	}
	
	public void addAppointment() throws InterruptedException
	{
		// Click on Customer menu
		driver.findElement(By.linkText("Customers")).click();
		Thread.sleep(3000);
				
		// Click on Edit Customer
		driver.findElement(By.cssSelector("#DataTables_Table_0 > tbody > tr.odd > td.sorting_1 > a > i")).click();
		Thread.sleep(5000);                
				
		/*driver.findElement(By.name("tabAppointments")).click(); // Click on Appointment Menu Tab
		Thread.sleep(500);*/
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;  
		jse.executeScript("window.scrollBy(0,500)", "");
		
		driver.findElement(By.id("btnAddAppointment")).click();  // Click on Add Appointment
		Thread.sleep(5000);
		
		driver.findElement(By.id("ctl00_btnCancel")).click();
		Thread.sleep(5000);
		
		jse.executeScript("window.scrollBy(0,500)", "");
		
		driver.findElement(By.id("btnAddAppointment")).click();  // Click on Add Appointment
		Thread.sleep(5000);
		
		driver.findElement(By.id("btnAptSendSms")).click();  // Click on Send Text button
		Thread.sleep(5000);
		
		driver.switchTo().activeElement();
		driver.findElement(By.cssSelector("body > div.bootbox.modal.fade.bootbox-confirm.in > div > div > div.modal-footer > button.btn.btn-success")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_txtEventName")).sendKeys("Test EventA ");  // Enter Event Name
		Thread.sleep(500);
		
		driver.findElement(By.id("ctl00_txtStartDateTime")).sendKeys("11/25/2017 10:30 AM");  // Enter Event Start Date
		Thread.sleep(500);
		
		driver.findElement(By.id("ctl00_txtEndDateTime")).sendKeys("11/30/2017 5:30 PM");  // Enter Event End Date
		Thread.sleep(500);
		
		driver.findElement(By.name("ctl00$txtEventDescription")).sendKeys("Test Event Description.");
		Thread.sleep(500);
		
		driver.findElement(By.id("ctl00_btnApply")).click();  // Click on Apply Appointment
		Thread.sleep(5000);
		
		driver.findElement(By.id("btnAptSendSms")).click();  // Click on Send Text button
		Thread.sleep(5000);
		
		driver.switchTo().activeElement();
		driver.findElement(By.cssSelector("body > div.bootbox.modal.fade.bootbox-confirm.in > div > div > div.modal-footer > button.btn.btn-success")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("ctl00_btnSave")).click();  // Click on Save Appointment
		Thread.sleep(5000);
		  
		jse.executeScript("window.scrollBy(0,500)", "");
		
		driver.findElement(By.cssSelector("#dtAppointmentGrid > tbody > tr:nth-child(1) > td:nth-child(1) > a")).click();  // Click on Edit Appointment
		Thread.sleep(5000);                
		                                   
		driver.findElement(By.id("ctl00_btnApply")).click();  // Click on Apply Appointment
		Thread.sleep(1000);
		
		driver.findElement(By.id("ctl00_btnPrint")).click();    // Click on Print Appointment
		Thread.sleep(5000);
		
		driver.findElement(By.id("ctl00_btnDelete")).click();    // Click on Delete Appointment
		Thread.sleep(3000);
		
		driver.switchTo().activeElement();
		driver.findElement(By.cssSelector("body > div.bootbox.modal.fade.bootbox-confirm.in > div > div > div.modal-footer > button.btn.btn-default")).click();  // Click on Cancel Button
		Thread.sleep(1000); 
		
		driver.findElement(By.id("ctl00_btnDelete")).click(); // Click on Delete button
		Thread.sleep(3000);
		
		driver.switchTo().activeElement();
		driver.findElement(By.cssSelector("body > div.bootbox.modal.fade.bootbox-confirm.in > div > div > div.modal-footer > button.btn.btn-primary")).click();  // Click on OK Button
		Thread.sleep(7000);
		
		System.out.println("Appointment Actions completed Successfully.");
			
	}
	
	public void addPhotos() throws InterruptedException, AWTException
	
	{
		
		/*// Specify the file location with extension
		StringSelection sel = new StringSelection("C:\\Users\\Admin\\Desktop\\images\\download (1).jpg");

		// Copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		System.out.println("selection" +sel);*/
				
		// Click on Customer menu
		driver.findElement(By.linkText("Customers")).click();
		Thread.sleep(3000);
						
		// Click on Edit Customer
		driver.findElement(By.cssSelector("#DataTables_Table_0 > tbody > tr.odd > td.sorting_1 > a > i")).click();
		Thread.sleep(5000);
						
		driver.findElement(By.id("ctl00_liTabImages")).click(); // Click on Photos Menu Tab
		Thread.sleep(500);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;  
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(500);
		
		driver.findElement(By.id("ctl00_btnAddPhoto")).click();  // Click on Add Photo
		Thread.sleep(10000);
		
		/*driver.findElement(By.id("ctl00_btnCancel")).click(); // Click on Cancel button
		Thread.sleep(7000);
		
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(500);
		
		driver.findElement(By.id("ctl00_btnAddPhoto")).click();  // Click on Add Photo
		Thread.sleep(7000);*/	
		
		/*driver.findElement(By.id("ctl00_RadAsyncUpload1fakeInput1")).click();  // Click on Select
		Thread.sleep(7000);

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
		Thread.sleep(5000);*/
		
		driver.findElement(By.id("ctl00_btnSave")).click();  // Click on Save
		Thread.sleep(7000);
		
		System.out.println("Photos Added Successfully.");
		
	}
	
	public void addFile() throws InterruptedException, AWTException
	{
		// Click on Customer menu
		driver.findElement(By.linkText("Customers")).click();
		Thread.sleep(3000);
								
		// Click on Edit Customer
		driver.findElement(By.cssSelector("#DataTables_Table_0 > tbody > tr.odd > td.sorting_1 > a > i")).click();
		Thread.sleep(5000);
								
		driver.findElement(By.id("ctl00_liTabFiles")).click(); // Click on File Tab
		Thread.sleep(500);
				
		JavascriptExecutor jse = (JavascriptExecutor) driver;  
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(500);
		
		driver.findElement(By.id("ctl00_FileUpload1")).click();  // Click on Choose file
		Thread.sleep(3000);
		
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
		Thread.sleep(5000);
		
		//Enter File Name
		driver.findElement(By.name("ctl00$aliasFileName")).sendKeys("Test File");
		Thread.sleep(2000);
		
		//Enter File Description
		driver.findElement(By.name("ctl00$fileDescription")).sendKeys("Test File Description");
		Thread.sleep(2000);
		
		// Click on Upload File button
		driver.findElement(By.id("ctl00_UploadFile")).click();
		Thread.sleep(5000);
		
		System.out.println("File uploaded successfully.");
				
	}
	
	public void subcontractorTab() throws InterruptedException
	{
		// Click on Customer menu
		driver.findElement(By.linkText("Customers")).click();
		Thread.sleep(3000);
										
		// Click on Edit Customer
	    driver.findElement(By.cssSelector("#DataTables_Table_0 > tbody > tr.odd > td.sorting_1 > a > i")).click();
		Thread.sleep(5000);
										
		driver.findElement(By.id("ctl00_liTabsubcontractor")).click(); // Click on SubContractor Tab
		Thread.sleep(500);
						
		JavascriptExecutor jse = (JavascriptExecutor) driver;  
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(1000);
		
		WebElement subcontractor_dropdown = driver.findElement(By.id("ctl00_ddsubcontractor"));
	  	Select subCotr_dd = new Select(subcontractor_dropdown);
	  	
	  	//It will select System Administrator
	  	subCotr_dd.selectByIndex(1);
	  	Thread.sleep(5000);

		WebElement job_dropdown = driver.findElement(By.id("ctl00_ddjob"));
	  	Select job_dd = new Select(job_dropdown);
	  	
	  	//It will select System Administrator
	  	job_dd.selectByIndex(1);
	  	Thread.sleep(5000);
	  	
	  	// Click on Send Work Order
	  	driver.findElement(By.id("ctl00_btnEmailWorkOrder")).click();
	  	Thread.sleep(7000);
	  	
	  	// Capture and verify success message on pop up
	  	driver.switchTo().activeElement();
	  	String actmsg = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div")).getText();
	  	String expmsg = "Work Order has been emailed.";
	  	Assert.assertEquals(actmsg, expmsg);
	  	
	  	// Click on OK button on Pop up
	  	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button")).click();
	  	Thread.sleep(1000);
		 
		System.out.println("Subcontractor Works Successfully.");
	}
	
	public void companyDetailsSection() throws InterruptedException
	{
		// Click on Company Name on Dashboard
		driver.findElement(By.cssSelector("#infoWidgetBody > div > div > div:nth-child(1) > div:nth-child(2) > h5 > a")).click();
		Thread.sleep(7000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;  
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		
		// Click on Estimate Terms
		driver.findElement(By.cssSelector("#AppContent > div.widget.widget-heading-simple.widget-body-white > div.widget-body > div.innerLR > div > div.widget-head > ul > li:nth-child(2) > a")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.cssSelector("#tabEstimateTerms > div > div.Editor-editor > div:nth-child(17)"));
		jse1.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(3000);
		
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;  
		jse2.executeScript("window.scrollBy(0,-200)", "");
		Thread.sleep(3000);
		
		// Click on Acceptance Text
		driver.findElement(By.cssSelector("#AppContent > div.widget.widget-heading-simple.widget-body-white > div.widget-body > div.innerLR > div > div.widget-head > ul > li:nth-child(3) > a")).click();
		Thread.sleep(5000);
		
		// Click on Warranty Text
		driver.findElement(By.cssSelector("#AppContent > div.widget.widget-heading-simple.widget-body-white > div.widget-body > div.innerLR > div > div.widget-head > ul > li:nth-child(4) > a")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		WebElement element2 = driver.findElement(By.cssSelector("#tabWarrantyText > div > div.Editor-editor > div > div > table > tbody > tr:nth-child(1) > td:nth-child(1) > p:nth-child(2) > span:nth-child(1) > strong:nth-child(3) > span > span:nth-child(1)"));
		jse3.executeScript("arguments[0].scrollIntoView(true);",element2);
		Thread.sleep(3000);
		
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;  
		jse4.executeScript("window.scrollBy(0,-200)", "");
		Thread.sleep(3000);
		
		
		// Click on Contractor Attachments
		driver.findElement(By.linkText("Contract Attachments")).click();
		Thread.sleep(5000);
		
		// Click on My Website
		driver.findElement(By.cssSelector("#AppContent > div.widget.widget-heading-simple.widget-body-white > div.widget-body > div.innerLR > div > div.widget-head > ul > li:nth-child(6) > a")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;  
		jse5.executeScript("window.scrollBy(0,-300)", "");
		Thread.sleep(3000);
		
		// Click on Save Button
		driver.findElement(By.id("ctl00_btnSave")).click();
		Thread.sleep(5000);
		
		// Capture Success Message
		String msg = driver.findElement(By.cssSelector("#desktopAlertPanel > div")).getText();
		System.out.println(msg);
		Thread.sleep(2000);
		
		// Click on Cancel Button
		driver.findElement(By.id("btnCancel")).click();
		Thread.sleep(5000);
		
		System.out.println("Company Details Verified Successfully.");
		
		// =================================== * User Section * ===========================================
		
		// Click on Users menu
		driver.findElement(By.id("SideNav_mnuShowUsers")).click();
		Thread.sleep(5000);
		
		//Click on Edit User
		driver.findElement(By.cssSelector("#dtTable > tbody > tr:nth-child(1) > td.sorting_1 > a")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;  
		jse6.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		
		// Click on Signature Tab
		driver.findElement(By.linkText("Signature")).click();
		Thread.sleep(5000);
		
		// Click on Open Signature Pad
		driver.findElement(By.id("btnToggleSignaturePad")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;  
		jse7.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(3000);
		
		Software soft = new Software();
		soft.drawCanvas();
		Thread.sleep(5000);
		
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;  
		jse8.executeScript("window.scrollBy(0,-200)", "");
		Thread.sleep(3000);
		
		//Click on Apply
		driver.findElement(By.id("ctl00_btnApply")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;  
		jse9.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(3000);
		
		// Click on Signature Tab
		driver.findElement(By.linkText("Signature")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;  
		jse10.executeScript("window.scrollBy(0,-200)", "");
		Thread.sleep(3000);
		
		// Clear and enter new email address
		driver.findElement(By.id("ctl00_txtEmailAddress")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_txtEmailAddress")).sendKeys("nadsoft.test02@gmail.com");
		Thread.sleep(2000);
		
		// Click on save
		driver.findElement(By.id("ctl00_btnSave")).click();
		Thread.sleep(7000);
		
		// Search Super Admin in listing
		driver.findElement(By.cssSelector("#dtTable_filter > label > input")).sendKeys("cosadmin1");
		String actmsg = driver.findElement(By.cssSelector("#dtTable > tbody > tr > td")).getText();
		String expmsg = "No matching records found";
		Assert.assertEquals(actmsg, expmsg);
		System.out.println("Super Admin doesn't Present in List");
		
		System.out.println("User Activity completed Successfully.");
		
		// Check Subcontractors
		driver.findElement(By.id("SideNav_mnuShowSubcontractors")).click();
		Thread.sleep(7000);
		
		// Check Suppliers
		driver.findElement(By.id("SideNav_mnuShowSuppliers")).click();
		Thread.sleep(7000);
		
		// Check Products
		driver.findElement(By.id("SideNav_mnuShowProducts")).click();
		Thread.sleep(7000);
		
		// Open and close the Pick List
		driver.findElement(By.id("SideNav_li_submenu_picklists")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("SideNav_lnk_submenu_picklists")).click();
		Thread.sleep(3000);
		
		// Import & Exports functionality
		driver.findElement(By.id("SideNav_li_submenu_import_export")).click();  // Open Sub-Menus of Import & Exports
		Thread.sleep(3000);
		
		driver.findElement(By.id("SideNav_mnuImportCustomers")).click(); // Click on Customer Import
		Thread.sleep(7000);
		
		driver.findElement(By.id("SideNav_lnk_submenu_import_export")).click();  // Close Sub-Menus of Import & Exports
		Thread.sleep(3000);
		
		// Click on Configuration Menu
		driver.findElement(By.id("SideNav_li_submenu_configuration")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("SideNav_mnuShowWebsite")).click(); // Click on Website Menu
		Thread.sleep(5000);
		
		driver.findElement(By.id("SideNav_mnuShowQuickbooksServer")).click(); // Click on QuickBook Menu
		Thread.sleep(5000);
		
		// Click on Reports menu
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.id("SideNav_mnuReportTemplateList")).click();  // Click on Report Templates
		Thread.sleep(7000);
		
		driver.findElement(By.name("ctl00$RadGrid1$ctl00$ctl03$ctl01$ctl10")).click(); // Click on Next
		Thread.sleep(5000);
		
		driver.findElement(By.name("ctl00$RadGrid1$ctl00$ctl03$ctl01$ctl02")).click(); // Click on Previous
		Thread.sleep(5000);
		
		System.out.println("All Action related to Company and Report Templates Completed Successfully.");
		
	}
}

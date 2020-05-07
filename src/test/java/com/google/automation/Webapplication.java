package com.google.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Webapplication {

	@Test()
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		String Total;
        //Login details
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//Ordering Items details
		
		driver.findElement(By.partialLinkText("Sauce Labs Backpack")).click();
		driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
		
		//click on Shopping cart using mouse hover function
		
		Actions cart = new Actions(driver);
		cart.click(driver.findElement(By.id("shopping_cart_container"))).perform();
		Thread.sleep(5000);
		
		//Checkout Details
		
		
		Actions check = new Actions(driver);
		check.click(driver.findElement(By.linkText("CHECKOUT"))).perform();
		Thread.sleep(5000);
		
		//Person Details 
		
		driver.findElement(By.id("first-name")).sendKeys("Sirisha");
		driver.findElement(By.id("last-name")).sendKeys("Siddhi");
		driver.findElement(By.id("postal-code")).sendKeys("30025");
		
		//CheckOut Continue Details using mouse hover function
		
		
		Actions cont = new Actions(driver);
		cont.click(driver.findElement(By.xpath("//input[@type='submit']"))).perform();
		  Total = driver.findElement(By.xpath("//div[@class='summary_total_label']")).getText();
		 System.out.println("Total Ammount of your Sale is : " +Total);
		 
		 //Finish Details
		 
		 Actions finish = new Actions(driver);
			finish.click(driver.findElement(By.linkText("FINISH"))).perform();
			Thread.sleep(5000);
		//Cancel your Order Details
			
			//Actions cancel = new Actions(driver);
				//cancel.click(driver.findElement(By.linkText("CANCEL"))).perform();
			
		//Display Final Sale Information Details
			
		String 	message1 = driver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
		String message2 = driver.findElement(By.xpath("//div[@class='complete-text']")).getText();
		System.out.println(message1);
		System.out.println(message2);
		
			Thread.sleep(5000);
	}
}
	
			//openERM
//		@Test()
//			public static void main1(String[] args) throws InterruptedException {
//				WebDriver driver = new ChromeDriver();
//				driver.manage().window().maximize();
//				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//			
//			driver.get("https://demo.openemr.io/a/openemr");
//			driver.findElement(By.name("authUser")).sendKeys("admin");
//			driver.findElement(By.name("clearPass")).sendKeys("pass");
//			//drop down option
//			
//			Select langchoice = new Select(driver.findElement(By.name("languageChoice")));
//	          langchoice.selectByValue("18");
//	          //creating own xpath
//	          
//	          driver.findElement(By.xpath("//button[@type='submit']")).click();
//	          
//	          //Mouse hover On administration
//	         
//	          Actions admin = new Actions(driver);
//	          admin.moveToElement(driver.findElement(By.xpath("//div[text()='Administration']"))).perform();
//	          driver.findElement(By.xpath("//div[text()='Facilities']")).click();
//	          Thread.sleep(5000);
//	          
//	          // switch to frames  (switch to main html and come out of frame)
//	         driver.switchTo().frame("adm");
//	         driver.findElement(By.xpath("//span[text()='Add Facility']")).click();
//	        
//	         //come out of frame
//	         
//	          driver.switchTo().defaultContent();
//	          //switch to Facility frame
//	          
//	         driver.switchTo().frame("modalframe");
//	         driver.findElement(By.name("facility")).sendKeys("Srinivas");
//	         driver.findElement(By.name("street")).sendKeys("9040 Laurel oak driver");
//	         driver.findElement(By.name("city")).sendKeys("9040 Suwanee");
//	         driver.findElement(By.name("state")).sendKeys("GA");
//	         driver.findElement(By.name("country_code")).sendKeys("01191");
//	         driver.findElement(By.name("website")).sendKeys("www.LaurelSpring.com");
//	         //Check box
//	         
//	         driver.findElement(By.name("billing_location")).click();
//	         driver.findElement(By.name("service_location")).click();
//	         driver.findElement(By.name("primary_business_entity")).click();
//	         //drop down for poc code
//	         
//	         Select poc =new Select(driver.findElement(By.name("pos_code")));
//	         poc.selectByVisibleText("22: Outpatient Hospital");
//	         driver.findElement(By.name("attn")).sendKeys("patient name");
//	         driver.findElement(By.name("domain_identifier")).sendKeys("12345");
//	         driver.findElement(By.name("facility_id")).sendKeys("6789");
//	         driver.findElement(By.name("oid")).sendKeys("12345");
//	         driver.findElement(By.name("mail_street")).sendKeys("2425 Lunetta Lane");
//	         driver.findElement(By.name("mail_street2")).sendKeys("Laurel Springs Subdivision");
//	 		driver.findElement(By.name("mail_city")).sendKeys("Suwanee");
//	 		driver.findElement(By.name("mail_state")).sendKeys("VA");
//	 		driver.findElement(By.name("mail_zip")).sendKeys("30020");
//	 		driver.findElement(By.name("phone")).sendKeys("4049821080");
//	 		driver.findElement(By.name("fax")).sendKeys("7703456897");
//	 		driver.findElement(By.name("postal_code")).sendKeys("30098");
//	 		//drop down Select class
//	 		
//	 		Select taxid = new Select(driver.findElement(By.name("tax_id_type")));
//	 		taxid.selectByIndex(1);
//	 		driver.findElement(By.name("federal_ein")).sendKeys("1123");
//	 		driver.findElement(By.name("facility_npi")).sendKeys("312345");
//	 		driver.findElement(By.name("facility_taxonomy")).sendKeys("3986501");
//	 		driver.findElement(By.name("email")).sendKeys("gita@yahoo.com");
//	 		driver.findElement(By.name("accepts_assignment")).click();
//	 		driver.findElement(By.name("ncolor")).sendKeys("red");
//	 		// Save the details 
//	 		
//	 		driver.findElement(By.name("form_save")).click();
//	 		//Cancel the details
//	 		
//	 		//driver.findElement(By.id("cancel")).click();
//	 		driver.switchTo().defaultContent();
//	 		//switch to frame
//	 		
//	 		 driver.switchTo().frame("adm");
//	 		 
//	 	WebElement firstEle= driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr[1]/td[1]"));
//	 	String att = firstEle.getAttribute("valign");
//	 	System.out.println(att);
//	 	String name = firstEle.getText();
//	 	System.out.println(name);
//	 	driver.switchTo().defaultContent();
//							
//	}
//	}

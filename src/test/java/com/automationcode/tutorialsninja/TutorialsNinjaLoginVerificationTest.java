package com.automationcode.tutorialsninja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(MyListener.class)
	public class TutorialsNinjaLoginVerificationTest{
	public WebDriver driver;
	public SoftAssert softassert = new SoftAssert();
	
		
		@BeforeMethod
		public void setUp(){
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo");			
		}
		
		@Test
		public void verifyTNinjaLoginPolicyWarningTest() {
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.id("input-email")).sendKeys("jinajahana@gmail.com");
		    driver.findElement(By.cssSelector("input.btn.btn-primary")).sendKeys("Begum12345");
		    String actualWarningMessage =driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		    String expectedWarningMessage="No match for E-Mail Address and/or Password.!";
		    
			softassert.assertAll();
		}

		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
		}

		



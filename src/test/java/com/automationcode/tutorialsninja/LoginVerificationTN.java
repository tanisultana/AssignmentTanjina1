package com.automationcode.tutorialsninja;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(MyListener.class)
	public class LoginVerificationTN {
		public WebDriver driver;
		SoftAssert softassert = new SoftAssert();
		
		@BeforeMethod
		public void Login(){
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		    driver.manage().window().maximize();
		    driver.get("https://tutorialsninja.com/demo");	
		    
		}
		
	    @Test (priority =1)
	    public void loginWithValidCredentials() {
	    driver.findElement(By.linkText("My Account")).click();
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("input-email")).sendKeys("jinajahan@gmail.com");
	    driver.findElement(By.cssSelector("input.btn.btn-primary")).sendKeys("Begum12345");
	    	
	    }
	    
	    @Test (priority =2)
	    public void logoutCredentials() {
	    driver.findElement(By.linkText("My Account")).click();
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("input-email")).sendKeys("jinajahan@gmail.com");
	    driver.findElement(By.cssSelector("input.btn.btn-primary")).sendKeys("Begum12345");
	    driver.findElement(By.linkText("Logout")).click();
	    
	    }
	    
	    @Test (priority =3)
	    public void loginWithInvalidCredentials() {
	    driver.findElement(By.linkText("My Account")).click();
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("input-email")).sendKeys("jinajahann@gmail.com");
	    driver.findElement(By.cssSelector("input.btn.btn-primary")).sendKeys("Begum123457");
	    String actualWarningMessage =driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
	    String expectedWarningMessage="No match for E-Mail Address and/or Password.!";
	    
		softassert.assertAll();
	    
	    }
	    
	    @Test (priority =4)
	    public void loginWithInvalidEmailValidPasswordCredentials() {
	    driver.findElement(By.linkText("My Account")).click();
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("input-email")).sendKeys("jinajahann@gmail.com");
	    driver.findElement(By.cssSelector("input.btn.btn-primary")).sendKeys("Begum12345");
	    String actualWarningMessage =driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
	    String expectedWarningMessage="No match for E-Mail Address and/or Password.!";
	    
		softassert.assertAll();
	    
	    }
	    
	    @Test (priority =5)
	    public void loginWithValidEmailinvalidPasswordCredentials() {
	    driver.findElement(By.linkText("My Account")).click();
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("input-email")).sendKeys("jinajahan@gmail.com");
	    driver.findElement(By.cssSelector("input.btn.btn-primary")).sendKeys("Begum123457");
	    String actualWarningMessage =driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
	    String expectedWarningMessage="No match for E-Mail Address and/or Password.!";
	    
		softassert.assertAll();
		
	    }
	    
	    @Test (priority =6)
	    public void loginWithNoCredentials() {
	    driver.findElement(By.linkText("My Account")).click();
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("input-email")).sendKeys("");
	    driver.findElement(By.cssSelector("input.btn.btn-primary")).sendKeys("");
	    String actualWarningMessage =driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
	    String expectedWarningMessage="No match for E-Mail Address and/or Password.!";
	    
		softassert.assertAll();
	    }
	    
	    
	    @AfterMethod
		public void tearDown() {
		 driver.quit();
		}
	    }



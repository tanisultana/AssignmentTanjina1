package com.automationcode.tutorialsninja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tutorialsninja_Register {
	public WebDriver driver;
	
	@BeforeMethod
	public void Register(){
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo");	
	}
	@Test (priority =1)
	public void registrationPagewithValidCredential()throws Exception {
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(1000);
	    driver.findElement(By.linkText("Register")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("input-firstname")).sendKeys("Jina");
	    Thread.sleep(1000);
	    driver.findElement(By.id("input-lastname")).sendKeys("Jahan");
	    Thread.sleep(1000);
	    driver.findElement(By.id("input-email")).sendKeys("jinajahan@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.id("input-telephone")).sendKeys("1212324567");
	    Thread.sleep(1000);
	    driver.findElement(By.id("input-password")).sendKeys("Begum12345");
	    Thread.sleep(1000);
	    driver.findElement(By.id("input-confirm")).sendKeys("Begum12345");
	    Thread.sleep(1000);
	    driver.findElement(By.name("agree")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	    Thread.sleep(1000); 
	    		
	}
	
	@Test (priority =2)
	public void registrationPagewithInvalidCredential()throws Exception {
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(1000);
	    driver.findElement(By.linkText("Register")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("input-firstname")).sendKeys("Jinaa");
	    Thread.sleep(1000);
	    driver.findElement(By.id("input-lastname")).sendKeys("Jahan");
	    Thread.sleep(1000);
	    driver.findElement(By.id("input-email")).sendKeys("jinajahan@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.id("input-telephone")).sendKeys("1212324567");
	    Thread.sleep(1000);
	    driver.findElement(By.id("input-password")).sendKeys("Begum12345");
	    Thread.sleep(1000);
	    driver.findElement(By.id("input-confirm")).sendKeys("Begum12345");
	    Thread.sleep(1000);
	    driver.findElement(By.name("agree")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	    Thread.sleep(1000); 
	}
	
	@Test (priority =3)
	public void registrationPagewithInvalidCredentialnull()throws Exception {
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(1000);
	    driver.findElement(By.linkText("Register")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("input-firstname")).sendKeys("");
	    Thread.sleep(1000);
	    driver.findElement(By.id("input-lastname")).sendKeys("");
	    Thread.sleep(1000);
	    driver.findElement(By.id("input-email")).sendKeys("");
	    Thread.sleep(1000);
	    driver.findElement(By.id("input-telephone")).sendKeys("");
	    Thread.sleep(1000);
	    driver.findElement(By.id("input-password")).sendKeys("");
	    Thread.sleep(1000);
	    driver.findElement(By.id("input-confirm")).sendKeys("");
	    Thread.sleep(1000);
	    driver.findElement(By.name("agree")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	    Thread.sleep(1000); 
	}
	
	@AfterMethod
	public void tearDown() {
	 driver.quit();
	}
}
    

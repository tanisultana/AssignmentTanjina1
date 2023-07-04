package com.automationcode.tutorialsninja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tutorialsninja_Login {
	public WebDriver driver;
	
	@BeforeMethod
	public void Login(){
		driver = new ChromeDriver();
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
    }
    
    @Test (priority =4)
    public void loginWithNoCredentials() {
    driver.findElement(By.linkText("My Account")).click();
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("input-email")).sendKeys("");
    driver.findElement(By.cssSelector("input.btn.btn-primary")).sendKeys("");
    }
    
    @AfterMethod
	public void tearDown() {
	 driver.quit();
	}
    }

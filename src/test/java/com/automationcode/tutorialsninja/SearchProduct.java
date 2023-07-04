package com.automationcode.tutorialsninja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SearchProduct {
		public WebDriver driver;
		
		@BeforeMethod
		public void SearchProducts(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");	
		}
		@Test (priority =1)
		public void validationofSearchProduct() {
			driver.findElement(By.name("search")).sendKeys("iphone");
		    driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
		    driver.findElement(By.id("button-search")).click();
		      		
		}
		@Test (priority =2)
		public void validationofinvalidSearchProduct() {
			driver.findElement(By.name("search")).sendKeys("DELL");
		    driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
		    driver.findElement(By.id("button-search")).click();
		}
		
		@Test (priority =3)
		public void Addavalidproduct()throws Exception {
			driver.findElement(By.name("search")).sendKeys("hp");
			Thread.sleep(1000);
		    driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
		    Thread.sleep(1000);
		    
		    
		    driver.findElement(By.cssSelector("hidden-xs hidden-sm hidden-md")).click();
		    driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		    Thread.sleep(1000);
		    
		    
		}
		@AfterMethod
		public void tearDown() {
		driver.quit();
}
}
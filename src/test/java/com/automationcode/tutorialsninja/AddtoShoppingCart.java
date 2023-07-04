package com.automationcode.tutorialsninja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(MyListener.class)
public class AddtoShoppingCart {

		public WebDriver driver;
		@BeforeMethod
		public void openBrowser(){	
		driver.get("https://tutorialsninja.com/demo/");
		}
		@Test
		public void addToCart()throws Exception {
		driver.findElement(By.xpath("//input[@class='form-control input-lg']")).sendKeys("iphone");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#content > p > label")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(1000);
		driver.get("https://tutorialsninja.com/demo/index.php?route=product/product&product_id=40&search=iphone&description=true");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		Thread.sleep(1000);
		String actualWarningMessage =driver.findElement(By.xpath("//*[@id=\"product-product\"]/div[1]")).getText();
		String expectedWarningMessage ="Success: You have added iPhone to your shopping cart!";
		
		}
		@Test
		public void addToCart1() {
		driver.findElement(By.xpath("//input[@class='form-control input-lg']")).sendKeys("Apple Cinema 30");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		driver.findElement(By.cssSelector("#content > p > label")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.get("https://tutorialsninja.com/demo/index.php?route=product/product&product_id=40&search=iphone&description=true");
		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		String actualWarningMessage =driver.findElement(By.xpath("//*[@id=\"product-search\"]/div[1]")).getText();
		String expectedWarningMessage =("Success: You have added iPhone to your shopping cart!");
		
		}
		@AfterMethod
		public void tearDown() {
		driver.quit();
		}
		}


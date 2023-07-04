package com.automationcode.tutorialsninja;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
    import org.testng.asserts.SoftAssert;


	public class SearchProductValidation {
			public WebDriver driver;
			public SoftAssert softassert = new SoftAssert();
			
			@BeforeMethod
			public void SearchProducts(){
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo");	
			}
			@Test (priority =1)
			public void validationofSearchProduct()throws Exception {
				driver.findElement(By.name("search")).sendKeys("dell");
				Thread.sleep(1000);
			    driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
			    Thread.sleep(1000);
			    driver.findElement(By.id("button-search")).click();
			    Thread.sleep(1000);
			    String actualWarningMessage =driver.findElement(By.xpath("//p[contains(text(),'There is no product that matches the search criter')]")).getText();
			    Thread.sleep(1000);
				String expectedWarningMessage="There is no product that matches the search criteria!";
				Thread.sleep(1000);
				softassert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
				Thread.sleep(1000);
				softassert.assertAll();
			      		
			}
			   
			
			@AfterMethod
			public void tearDown() {
			driver.quit();
	}
	}


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
public class TutorialsNinjaRegisterVerificationTest {
	public WebDriver driver;
	public SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void setUp(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input-btn-btn-primary")).click();
			
	}
	
	@Test(priority=1)
	public void verifyTNinjaRegisterPolicyWarningTest() {
		
		String actualWarningMessage =driver.findElement(By.xpath("div[@class='alert alert-danger alert-dismissible']")).getText();
		String expectedWarningMessage="Warning:You must agree to the Privacy Policy!";
		softassert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		softassert.assertAll();
	}

	@Test(priority=2)
	public void verifyTNinjaFirstNamePolicyWarningTest() {
		
		String actualWarningMessage =driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div[1]")).getText();
		String expectedWarningMessage="First Name must be between 1 and 32 characters!";
		softassert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		softassert.assertAll();
}
	@Test(priority=3)
	public void verifyTNinjaLastNamePolicyWarningTest() {
		
		String actualWarningMessage =driver.findElement(By.xpath("//input[@id='input-lastname']/following-sibling::div[1]")).getText();
		String expectedWarningMessage="Last Name must be between 1 and 32 characters!";
		softassert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		softassert.assertAll();
}
	@Test(priority=4)
	public void verifyTNinjaEmailPolicyWarningTest() {
		
		String actualWarningMessage =driver.findElement(By.xpath("//div[contains(text(),'E-Mail Address does not appear to be valid!')]")).getText();
		String expectedWarningMessage="Email.Address does not appear to be valid!";
		softassert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		softassert.assertAll();
}
	@Test(priority=5)
	public void verifyTNinjaTelephonePolicyWarningTest() {
		
		String actualWarningMessage =driver.findElement(By.xpath("//div[contains(text(),'Telephone must be between 3 and 32 characters!')]")).getText();
		String expectedWarningMessage="Telephone must be between 3 and 32 characters!";
		softassert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		softassert.assertAll();
}
	@Test(priority=6)
	public void verifyTNinjaPasswordPolicyWarningTest() {
		
		String actualWarningMessage =driver.findElement(By.xpath("//div[contains(text(),'Password must be between 4 and 20 characters!')]")).getText();
		String expectedWarningMessage="Password must be between 4 and 20 characters!";
		softassert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		softassert.assertAll();
}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	}

	


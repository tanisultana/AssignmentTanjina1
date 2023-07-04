package com.automationcode.tutorialsninja;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener{

	
	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Operation started");
	}

	
	public void onTestStart(ITestResult result) {
		
		ITestListener.super.onTestStart(result);
		String testName = result.getName();
		System.out.println(testName + "starting test");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		String testName = result.getName();
		System.out.println(testName + "passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testName = result.getName();
		System.out.println(testName + "failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testName = result.getName();
		System.out.println(testName + "skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	
	@Override
	public void onFinish(ITestContext context) {
		
		ITestListener.super.onFinish(context);
		System.out.println("Operation ended");
	}

}

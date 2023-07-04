package com.automationcode_ExtentReports_assignment;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {
	
	public static ExtentReports generateExtentReport() throws Exception {
	
	ExtentReports extentReport = new ExtentReports();
	File extentReportFile = new File(System.getProperty("user.dir") + "\\test-output\\ExtentReports\\extentreport.html");
	ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);
	sparkReporter.config().setTheme(Theme.DARK);
	sparkReporter.config().setReportName("TN Automation Results");
	sparkReporter.config().setDocumentTitle("TNReportTitleAutomationResults");
	sparkReporter.config().setTimeStampFormat("MM/dd/yyyy hh:mm:ss");
	extentReport.attachReporter(sparkReporter);
	
	Properties prop = new Properties();
	FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "src\\test\\java\\com\\automationcode_ExtentReports_assignment\\config.properties");
	prop.load(ip);
	
	extentReport.setSystemInfo("application url", prop.getProperty("url"));
	extentReport.setSystemInfo("browser name", prop.getProperty("browser"));
	extentReport.setSystemInfo("email", prop.getProperty("validUsername"));
	extentReport.setSystemInfo("password", prop.getProperty("validPassword"));
	extentReport.setSystemInfo("operating system", System.getProperty("os.name"));
	extentReport.setSystemInfo("operating system version", System.getProperty("os.version"));
	extentReport.setSystemInfo("SDET name", System.getProperty("user.name"));
	extentReport.setSystemInfo("java version", System.getProperty("java.version"));
	extentReport.setSystemInfo("java vendor", System.getProperty("java.vendor"));
	
	return extentReport;

}
}

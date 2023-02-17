package com.facebook23_baseTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

// Without WebDriverManger,  Selenium-java 4.8.0
public class BaseTest2 {
	protected WebDriver driver;

	@BeforeMethod
	@Parameters({ "browser" })
	public void setUp(@Optional("chrome") String browser) {
		if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			openApp();
			
		} else if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			openApp();		
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			openApp();
		} else 
		{
			throw new IllegalArgumentException("Invalid browser: " + browser);
		}

	}

	public void openApp() {
		driver.get("https://www.google.com");
		// maximizePage();
		driver.manage().window().maximize();

		// Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	
	  public void takeScreenshot(WebDriver driver, String fileName) { 
		  // String testName=result.getTestName(); 
		  File scrFile = ((TakesScreenshot)
	  driver).getScreenshotAs(OutputType.FILE);
	  
	  try { 
		  FileUtils.copyFile(scrFile, new File("screenshots/" + fileName)); }
	  catch (IOException e) { e.printStackTrace(); } }
	 

}

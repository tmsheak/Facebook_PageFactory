package com.facebook23_FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;

	@BeforeTest
	public void openApp() {

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void validLoginTest() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("Tarek123");
		driver.findElement(By.id("pass")).sendKeys("abcd123");
		driver.findElement(By.name("login")).click();

	}

	@Test
	public void inValidLoginTest() {
		driver.findElement(By.id("email")).sendKeys("Tarek123");
		driver.findElement(By.id("pass")).sendKeys("defgk234");
		driver.findElement(By.name("login")).click();
	}

	@AfterTest
	public void closeApp() {
		driver.close();
	}
}

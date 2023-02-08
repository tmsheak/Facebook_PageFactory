package com.facebook23_loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	public WebDriver driver;

	public void openApp() {

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	public WebElement getUserName() {
		driver.findElement(By.id("email")).sendKeys("Tarek123");
		return null; // null is for String and "0" for int

	}

	public WebElement getPassword() {
		driver.findElement(By.id("pass")).sendKeys("abcd123");
		return null;
	}

	public WebElement getLoginButton() {
		driver.findElement(By.name("login")).click();
		return null;

	}
}

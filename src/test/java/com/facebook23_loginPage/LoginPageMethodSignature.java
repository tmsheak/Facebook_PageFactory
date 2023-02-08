package com.facebook23_loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageMethodSignature {
	public WebDriver driver;

	public void openApp() {

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
	}

	// making dynamic with method signature
	public WebElement getUserName(String enterUserName) {
		driver.findElement(By.id("email")).sendKeys(enterUserName);
		return null;

	}

	public WebElement getPassword(String enterPassword) {
		driver.findElement(By.id("pass")).sendKeys(enterPassword);
		return null;
	}

	public WebElement getLoginButton() {
		driver.findElement(By.name("login")).click();
		return null;

	}
}

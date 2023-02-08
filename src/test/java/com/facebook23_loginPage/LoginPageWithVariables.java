package com.facebook23_loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* Creating Return type method with method signature for each WebElement
   by Creating variable for each element of page(webpage).Dynamic variables */

public class LoginPageWithVariables {
	public WebDriver driver;

	public void openApp() {

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
	}

	public WebElement getUserName(String enterUserName) {
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys(enterUserName);
		return userName;
	}

	public WebElement getPassword(String enterPassword) {
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(enterPassword);
		return password;
	}

	public WebElement getLoginButton() {
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		return loginButton;

	}
}

package com.facebook23_loginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.facebook23_loginPage.LoginPage;

public class LoginTest {
	LoginPage lp= new LoginPage();
	public WebDriver driver; 
	// by default  access modifier is public, but it is better to write public.
	
	@Test
	public void validLoginTest1() {
		//lp= new LoginPage();
		//LoginPage lp= new LoginPage();
		lp.openApp();		
		lp.getUserName();
		lp.getPassword();
		lp.getLoginButton();
		
	}
	
	@Test
	public void validLoginTest2() {
		//LoginPage lp= new LoginPage();		
		lp.openApp();		
		lp.getUserName();
		lp.getPassword();
		lp.getLoginButton();		
	}
	
	@AfterTest
	public void closeApp() {
		driver=new ChromeDriver();
		driver.quit();
	}
}
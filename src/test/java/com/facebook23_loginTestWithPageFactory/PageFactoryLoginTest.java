package com.facebook23_loginTestWithPageFactory;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.facebook23_loginPageWithPageFactory.PageFactoryLoginPage;

public class PageFactoryLoginTest {
	WebDriver driver;
	private PageFactoryLoginPage plp;

	@BeforeMethod
	public void openApp() {
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void validUserNameTest() {
		plp = new PageFactoryLoginPage(driver);
		plp.getUserName("tarek234");
		plp.getPassword("pass234");
		plp.getLoginButton();

	}

	@Test
	public void validPasswordTest() {
		plp = new PageFactoryLoginPage(driver);
		plp.getUserName("tarek234");
		plp.getPassword("pass234");
		plp.getLoginButton();

	}
     @Test
	public void doLoginTest() {
		plp = new PageFactoryLoginPage(driver);
		plp.getLoginPage("tarek34", "pass123");
	}

	@AfterMethod
	public void closeApp() {
		if (driver != null) {
			driver.quit();
		}
	}

}

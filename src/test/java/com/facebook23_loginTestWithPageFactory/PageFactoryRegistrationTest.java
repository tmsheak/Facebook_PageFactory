package com.facebook23_loginTestWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.facebook23_baseTest.BaseTest;
import com.facebook23_loginPageWithPageFactory.PageFactoryRegistrationPage;

public class PageFactoryRegistrationTest extends BaseTest {
	WebDriver driver;

	private PageFactoryRegistrationPage prp;

	@BeforeMethod
	public void init() {
		driver = openApp(); // if you write openApp(); does not work
		// Is-A Relationship with BaseTest

	}

	@Test(priority = 0)
	public void hello() {
		System.out.println("Bismillah. Just starting to call methods.");
	}

	@Test(priority = 1)
	public void signupNewAccount() {
		// Implemented with "Select"
		prp = new PageFactoryRegistrationPage(driver);
		prp.createNewAccount();
		prp.getFirstName("Tarek");
		prp.getLastName("Rahman");
		prp.getEmailAddress("janina@hs.com");
		prp.getConfirmEmailAddress("janina@hs.com");
		prp.getPassword("pass2344");
		prp.getMonth1("Apr");
		prp.getDay1("12");
		prp.getYear1("1996");
		prp.getCustomGender();
		prp.getMaleGender();
		// prp.getSignUpButton();

	}

	@Test(priority = 2)
	public void signupNewAccount1() {
		prp = new PageFactoryRegistrationPage(driver);
		prp.createNewAccount();
		prp.getFirstName("Manu");
		prp.getLastName("Sunu");
		prp.getEmailAddress("janina@hsil.com");
		prp.getConfirmEmailAddress("janina@hsil.com");
		prp.getPassword("paswo344");
		prp.getMonth();
		prp.selectBirthMonth();
		prp.getDay();
		prp.selectBirthDay();
		prp.getYear();
		prp.selectBirthYear();
		prp.getCustomGender();
		prp.getMaleGender();
		// prp.getSignUpButton();
	}

	@Test(priority = 3)
	public void regressionSignupNewAccount() {
		// Implemented with "Select"
		prp = new PageFactoryRegistrationPage(driver);
		prp.signupRegression("Kasem", "Meah", "tisoti@mail.com", "tisoti@mail.com", "pass2345", "Jul", "29", "1999");

	}

	@Test(priority = 4)
	public void regressionSignupNewAccount1() {
		prp = new PageFactoryRegistrationPage(driver);
		prp.signupRegression1("Amin", "Tarek", "Hahan@ail.com", "Hahan@mail.com", "pass2345");

	}

	 @AfterMethod
	public void closeApp() {
		if (driver != null) {
			driver.quit();
		}
	}

}

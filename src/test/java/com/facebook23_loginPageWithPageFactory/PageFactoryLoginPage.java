package com.facebook23_loginPageWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryLoginPage {

	/* Constructor instantiate(build) instance properties of a class
	 * No Return Type
	 * Same access modifier as class. 
	 * 'driver' instance variable.
	 */

	WebDriver driver; //

	public PageFactoryLoginPage(WebDriver driver) {
		// User Defined Constructor
		super();
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	// if no other class using- declared as private
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	private WebElement userName;

	public WebElement getUserName(String enterUserName) {
		userName.sendKeys(enterUserName);
		return userName;
	}

	// This normally used for Functional Test
	@FindBy(id = "pass")
	private WebElement password; // Both style work
	// @FindBy(how=How.ID,using="pass") private WebElement password;

	public WebElement getPassword(String enterPassword) {
		password.sendKeys(enterPassword);
		return password;
	}

	@FindBy(how = How.NAME, using = "login")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		loginButton.click();
		return loginButton;

	}

	// Combining all three in one method, Usually used for Regression Test
	public WebElement getLoginPage(String enterUserNmae, String enterPassword) {
		this.getUserName(enterUserNmae);
		this.getPassword(enterPassword);
		return this.getLoginButton();

	}

}

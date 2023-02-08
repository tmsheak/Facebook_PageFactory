package com.facebook23_loginPageWithPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageFactoryRegistrationPage {
	WebDriver driver;

	public PageFactoryRegistrationPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Used for functional Test
	@FindBy(how = How.XPATH, using = "(//a[@role='button'])[2]")
	private WebElement createAccout;

	public WebElement createNewAccount() {
		createAccout.click();
		return createAccout;
	}

	@FindBy(how = How.NAME, using = "firstname")
	private WebElement fName;

	public WebElement getFirstName(String enterFirstName) {
		fName.sendKeys(enterFirstName);
		return fName;
	}

	@FindBy(how = How.NAME, using = "lastname")
	private WebElement lName;

	public WebElement getLastName(String enterLastName) {
		lName.sendKeys(enterLastName);
		return lName;
	}

	@FindBy(how = How.XPATH, using = "//input[starts-with(@id,'u_2_g')]")
	private WebElement emailAddress;

	public WebElement getEmailAddress(String enterEmailAddress) {
		emailAddress.sendKeys(enterEmailAddress);
		return emailAddress;
	}

	@FindBy(how = How.XPATH, using = "//input[starts-with(@id,'u_2_j')]")
	private WebElement confirmEmailAddress;

	public WebElement getConfirmEmailAddress(String enterConfirmEmailAddress) {
		confirmEmailAddress.sendKeys(enterConfirmEmailAddress);
		return confirmEmailAddress;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='password_step_input']")
	private WebElement password;

	public WebElement getPassword(String enterPassword) {
		password.sendKeys(enterPassword);
		return password;
	}

	// Month: Using Select
	public WebElement getMonth1(String enterMonth) {
		WebElement selectMonth = driver.findElement(By.id("month"));
		Select select = new Select(selectMonth);
		select.selectByVisibleText(enterMonth);
		return selectMonth;
	}

	// Day: Using Select
	public WebElement getDay1(String enterDay) {
		WebElement selectDay = driver.findElement(By.id("day"));
		Select select1 = new Select(selectDay);
		select1.selectByVisibleText(enterDay);
		return selectDay;
	}

	// Year: Using Select
	public WebElement getYear1(String enterYear) {
		WebElement selectYear = driver.findElement(By.id("year"));
		Select select2 = new Select(selectYear);
		select2.selectByVisibleText(enterYear);
		return selectYear;
	}

	// Month: PageFactory
	@FindBy(how = How.ID, using = "month")
	private WebElement bMonth;

	public WebElement getMonth() {
		bMonth.click();
		return bMonth;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"month\"]/option[7]")
	private WebElement monthSelected;

	public WebElement selectBirthMonth() {
		monthSelected.click();
		return monthSelected;
	}

	// Day: PageFactory
	@FindBy(how = How.ID, using = "day")
	private WebElement bDay;

	public WebElement getDay() {
		bDay.click();
		return bDay;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='day']/option[17]")
	private WebElement daySelected;

	public WebElement selectBirthDay() {
		daySelected.click();
		return daySelected;
	}

	// Year: PageFactory
	@FindBy(how = How.ID, using = "year")
	private WebElement bYear;

	public WebElement getYear() {
		bYear.click();
		return bYear;
	}

	@FindBy(how = How.XPATH, using = "//option[@value='1995']")
	private WebElement yearSelected;

	public WebElement selectBirthYear() {
		yearSelected.click();
		return yearSelected;
	}

	@FindBy(how = How.XPATH, using = "//input[starts-with(@id,'u_2_4')])")
	private WebElement femaleGender;

	public WebElement getFemaleGender() {
		femaleGender.click();
		return femaleGender;
	}

	@FindBy(how = How.XPATH, using = "//input[@value='2']")
	private WebElement maleGender;

	public WebElement getMaleGender() {
		maleGender.click();
		return maleGender;
	}

	@FindBy(how = How.XPATH, using = "//input[@value='-1']")
	private WebElement customGender;

	public WebElement getCustomGender() {
		customGender.click();
		return customGender;

	}

	@FindBy(how = How.XPATH, using = "//select[@name='preferred_pronoun']")
	private WebElement customOption;

	public WebElement selectCustomOption() {
		customOption.click();
		return customOption;
	}

	@FindBy(how = How.NAME, using = "websubmit")
	private WebElement signUpButton;

	public WebElement getSignUpButton() {
		signUpButton.click();
		return signUpButton;

	}

	// All combined for Regression Test
	// If you use the Select Command use this
	public WebElement signupRegression(String enterFirstName, String enterLastName, String enterEmailAddress,
			String enterConfirmEmailAddress, String enterPassword, String enterMonth, String enterDay,
			String enterYear) {
		this.createNewAccount();
		this.getFirstName(enterFirstName);
		this.getLastName(enterLastName);
		this.getEmailAddress(enterEmailAddress);
		this.getConfirmEmailAddress(enterConfirmEmailAddress);
		this.getPassword(enterPassword);
		this.getMonth1(enterMonth);
		this.getDay1(enterDay);
		this.getYear1(enterYear);
		this.getMaleGender();
		return this.getSignUpButton();
	}

	// If you use PageFactory Pattern use this
	public WebElement signupRegression1(String enterFirstName, String enterLastName, String enterEmailAddress,
			String enterConfirmEmailAddress, String enterPassword) {
		this.createNewAccount();
		this.getFirstName(enterFirstName);
		this.getLastName(enterLastName);
		this.getEmailAddress(enterEmailAddress);
		this.getConfirmEmailAddress(enterConfirmEmailAddress);
		this.getPassword(enterPassword);
		this.getMonth();
		this.selectBirthMonth();
		this.getDay();
		this.selectBirthDay();
		this.getYear();
		this.selectBirthYear();
		this.getMaleGender();
		return this.getSignUpButton();
	}
}
package com.facebook23_loginTest;

import org.testng.annotations.Test;

import com.facebook23_loginPage.LoginPageMethodSignature;

public class LoginWithMethodSignatureTest {
	
	@Test
	public void positiveLoginTest() {
		
		LoginPageMethodSignature lpms=new LoginPageMethodSignature();
		lpms.openApp();
		lpms.getUserName("tarek2334");
		lpms.getPassword("pass1123");
		lpms.getLoginButton();
	}

}

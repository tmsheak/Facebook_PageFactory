package com.facebook23_loginTest;

import org.testng.annotations.Test;

import com.facebook23_loginPage.LoginPageWithVariables;

public class LoginPageWithVariablesTest {
	
	@Test
	public void boundaryLoginTest() {
		LoginPageWithVariables lpv=new LoginPageWithVariables();
		lpv.openApp();
		lpv.getUserName("tarek");
		lpv.getPassword("pass1232");
		lpv.getLoginButton();
		
	}

}

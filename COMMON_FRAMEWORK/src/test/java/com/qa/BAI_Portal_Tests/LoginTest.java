package com.qa.BAI_Portal_Tests;
import org.testng.annotations.Test;

import com.qa.BAI_Portal_Pages.GCC_Home;
import com.qa.BAI_Portal_Pages.LoginPage;

public class LoginTest extends BaseTest{
	public LoginPage Login;
	public GCC_Home gccHome;
	
	@Test
	public void loginWithValidCredentials(){
		Login=new LoginPage();
		gccHome=new GCC_Home();
		Login.login();
		gccHome.validate_user("Ramachandra.K@cognitivehealthit.com");
		gccHome.validate_projects();
	}

}

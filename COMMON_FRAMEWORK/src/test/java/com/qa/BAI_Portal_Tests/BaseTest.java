package com.qa.BAI_Portal_Tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import com.qa.base.BasePage;

public class BaseTest {
	
	@BeforeMethod
	public void init(){
		BasePage.init_Browser();
		BasePage.navigateURL();
	}
	
	@AfterMethod
	public void tearDown(){
		BasePage.quitBrowser();
	}
	
	@AfterSuite
	public void launchReport() throws IOException{
		BasePage.execReport();
	}

}

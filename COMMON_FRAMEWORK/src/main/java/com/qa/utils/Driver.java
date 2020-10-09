package com.qa.utils;

import org.openqa.selenium.WebDriver;

import com.qa.base.BasePage;

public class Driver {
	
	public static WebDriver getDriver(){
		return BasePage.driver;
	}

}

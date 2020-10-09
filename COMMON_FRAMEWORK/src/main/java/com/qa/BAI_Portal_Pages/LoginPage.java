package com.qa.BAI_Portal_Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BasePage;
import com.qa.utils.Driver;

public class LoginPage extends BasePage{
	
	@FindBy(xpath = "//input[@id='userLoginId']")
	WebElement UserName;
	
	@FindBy(xpath="//input[@id='userLoginPassword']")
	WebElement password;
	
	@FindBy(xpath="//a[@id='loginbuttonId']")
	WebElement submitBtn;
	
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	public GCC_Home login(){
		init_properties();
		
		UserName.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		System.out.println(prop.getProperty("username"));
		submitBtn.click();
		return new GCC_Home();
	}
	
}
	



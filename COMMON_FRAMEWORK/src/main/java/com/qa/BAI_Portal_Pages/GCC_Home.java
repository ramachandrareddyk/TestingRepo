package com.qa.BAI_Portal_Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.base.BasePage;
import com.qa.utils.Driver;

public class GCC_Home extends BasePage{
	@FindBy(xpath="//em[contains(text(),'Ramachandra.K@cognitivehealthit.com')]")
	WebElement UserMailid;
	
	@FindBy(xpath="//button[contains(text(),'BAIPortal')]")
	WebElement BAI_Portal;
	
	@FindBy(xpath="//button[contains(text(),'EpicAutomation')]")
	WebElement EpicAutomation;
	
	@FindBy(xpath="//button[contains(text(),'Correspondence')]")
	WebElement correspondence;
	
	public GCC_Home() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	public void validate_user(String UserMailId){
		Assert.assertEquals(UserMailid.getText(), UserMailId);
	}
	
	public void validate_projects(){
		Assert.assertTrue(BAI_Portal.isDisplayed());
		Assert.assertTrue(EpicAutomation.isDisplayed());
		Assert.assertTrue(correspondence.isDisplayed());
		
	}
	
	public void selectProject(String ProjectName){
		if(ProjectName.equalsIgnoreCase("BAIPortal")){
			BAI_Portal.click();
		} else if(ProjectName.equalsIgnoreCase("EpicAutomation")){
			EpicAutomation.click();
		} else if(ProjectName.equalsIgnoreCase("correspondence")){
			correspondence.click();
		}
	}
	

}

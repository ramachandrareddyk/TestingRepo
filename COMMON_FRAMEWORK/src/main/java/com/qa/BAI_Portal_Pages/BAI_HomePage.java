package com.qa.BAI_Portal_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.utils.Driver;
import com.qa.utils.Utils;

public class BAI_HomePage {

	@FindBy(xpath = "//h4[contains(text(),'BAI Consolidation Report')]")
	WebElement BAI_Home;

	@FindBy(xpath = "//h4[contains(text(),'BAI Consolidation Report')]")
	WebElement UserProfile;

	@FindBy(xpath = "//h6[contains(text(),'Last Logged In Time:')]")
	WebElement lastLoginTime;

	@FindBy(xpath = "//i[@class='fa fa-sign-out']")
	WebElement logOutBtn;

	@FindBy(tagName = "em")
	WebElement userProfileBtn;

	@FindBy(xpath = "//input[@id='from_time']")
	WebElement fromDate;

	@FindBy(xpath = "//input[@id='to_time']")
	WebElement toDate;

	@FindBy(xpath = "//select[@id='payor']")
	WebElement payor;

	@FindBy(xpath = "//button[@id='search_button']")
	WebElement searchBtn;

	@FindBy(xpath = "//img[@class='yale_excel']")
	WebElement eMailBtn;

	@FindBy(xpath = "//a[contains(text(),'YH')]")
	WebElement YHTab;

	@FindBy(xpath = "//a[contains(text(),'LH')]")
	WebElement LHTab;

	@FindBy(xpath = "//a[contains(text(),'GH')]")
	WebElement GHTab;

	@FindBy(xpath = "//a[contains(text(),'BH')]")
	WebElement BHTab;

	@FindBy(xpath = "//a[contains(text(),'WH')]")
	WebElement WHTab;

	@FindBy(xpath = "//li[contains(text(),'Cash Management not received')]")
	WebElement cashManagementReceived;

	@FindBy(xpath = "//li[contains(text(),'Combined 835s do not match BAI')]")
	WebElement BAIDoNotMatch;

	@FindBy(xpath = "//div[@class='sidebar-left-menu collapsed']//li[4]//a[1]")
	WebElement historicalPage;

	@FindBy(xpath = "//div[@class='sidebar-left-menu collapsed']//li[7]//a[1]")
	WebElement reconciliationPage;

	@FindBy(xpath = "//div[@class='sidebar-left-menu collapsed']//li[8]//a[1]")
	WebElement casherPage;

	@FindBy(xpath = "//li[9]//a[1]")
	WebElement HSCPage;

	@FindBy(xpath = "//li[10]//a[1]")
	WebElement interCompanyPage;

	@FindBy(xpath = "//li[12]//a[1]")
	WebElement overAllStatistics;

	@FindBy(xpath = "//li[13]//a[1]")
	WebElement NSD;

	@FindBy(xpath = "//li[14]//a[1]")
	WebElement schedulerReport;

	@FindBy(xpath = "//li[16]//a[1]")
	WebElement passwordChangeTab;

	@FindBy(xpath = "//div[@class='wrapper']//tbody//tr[1]//td[2]")
	WebElement filterPayor;

	@FindBy(xpath = "//div[@class='wrapper']//tbody//tr[1]//td[3]")
	WebElement Date;

	@FindBy(xpath = "//th[@class='text-left sorting'][contains(text(),'EFT#')]")
	WebElement YH_EFT;

	@FindBy(xpath = "//th[@class='text-left sorting'][contains(text(),'Payor')]")
	WebElement YH_payorName;

	@FindBy(xpath = "//th[@class='text-left sorting_desc']")
	WebElement YH_paymentDate;

	@FindBy(xpath = "//div[@id='tab1']//thead[@class='thead-light']//th[4]")
	WebElement YH_bankDeposit;

	@FindBy(xpath = "//th[contains(text(),'YH Legacy - SDK')]")
	WebElement YH_legacySDK;

	@FindBy(xpath = "//th[contains(text(),'YH Legacy - SRC')]")
	WebElement YH_legacySRC;

	@FindBy(xpath = "//div[@id='tab1']//thead[@class='thead-light']//th[7]")
	WebElement YH_GL;

	@FindBy(xpath = "//div[@id='tab1']//thead[@class='thead-light']//th[8]")
	WebElement YH_epic;

	@FindBy(xpath = "//div[@id='tab1']//thead[@class='thead-light']//th[9]")
	WebElement YH_corp;

	@FindBy(xpath = "//div[@id='tab1']//thead[@class='thead-light']//th[10]")
	WebElement YH_totalposted;

	@FindBy(xpath = "//th[11]")
	WebElement YH_variance;

	@FindBy(xpath = "//table[@id='tab2_example']//th[@class='text-left sorting'][contains(text(),'EFT#')]")
	WebElement LH_EFT;

	@FindBy(xpath = "//table[@id='tab2_example']//th[@class='text-left sorting'][contains(text(),'Payor')]")
	WebElement LH_payorName;

	@FindBy(xpath = "//table[@id='tab2_example']//th[@class='text-left sorting_desc'][contains(text(),'Payment Date')]")
	WebElement LH_paymentDate;

	@FindBy(xpath = "//div[@id='tab2']//thead[@class='thead-light']//th[4]")
	WebElement LH_bankDeposit;

	@FindBy(xpath = "//div[@id='tab2']//thead[@class='thead-light']//th[6]")
	WebElement LH_GL;

	@FindBy(xpath = "//div[@id='tab2']//thead[@class='thead-light']//th[7]")
	WebElement LH_epic;

	@FindBy(xpath = "//div[@id='tab2']//thead[@class='thead-light']//th[8]")
	WebElement LH_corp;

	@FindBy(xpath = "//div[@id='tab2']//th[9]")
	WebElement LH_totalPosted;

	@FindBy(xpath = "//div[@id='tab2']//th[10]")
	WebElement LH_variance;

	@FindBy(xpath = "//th[contains(text(),'LH Legacy')]")
	WebElement LH_legacy;

	@FindBy(xpath = "//table[@id='tab3_example']//th[@class='text-left sorting'][contains(text(),'EFT#')]")
	WebElement GH_EFT;

	@FindBy(xpath = "//table[@id='tab3_example']//th[@class='text-left sorting'][contains(text(),'Payor')]")
	WebElement GH_payorName;

	@FindBy(xpath = "//table[@id='tab3_example']//th[@class='text-left sorting_desc'][contains(text(),'Payment Date')]")
	WebElement GH_paymentDate;

	@FindBy(xpath = "//div[@id='tab3']//thead[@class='thead-light']//th[4]")
	WebElement GH_bankDeposit;

	@FindBy(xpath = "//th[contains(text(),'GH Legacy')]")
	WebElement GH_Legacy;

	@FindBy(xpath = "//div[@id='tab3']//thead[@class='thead-light']//th[6]")
	WebElement GH_GL;

	@FindBy(xpath = "//div[@id='tab3']//thead[@class='thead-light']//th[7]")
	WebElement GH_epic;

	@FindBy(xpath = "//div[@id='tab3']//thead[@class='thead-light']//th[8]")
	WebElement GH_corp;

	@FindBy(xpath = "//div[@id='tab3']//th[9]")
	WebElement GH_totalposted;

	@FindBy(xpath = "//div[@id='tab3']//th[10]")
	WebElement GH_variance;

	@FindBy(xpath = "//table[@id='tab4_example']//th[@class='text-left sorting'][contains(text(),'EFT#')]")
	WebElement BH_EFT;

	@FindBy(xpath = "//table[@id='tab4_example']//th[@class='text-left sorting'][contains(text(),'Payor')]")
	WebElement BH_payorName;

	@FindBy(xpath = "//table[@id='tab4_example']//th[@class='text-left sorting_desc'][contains(text(),'Payment Date')]")
	WebElement BH_paymentDate;

	@FindBy(xpath = "//div[@id='tab4']//thead[@class='thead-light']//th[4]")
	WebElement BH_bankDeposit;

	@FindBy(xpath = "//th[contains(text(),'BH Legacy - SDK')]")
	WebElement BH_Legacy;

	@FindBy(xpath = "//div[@id='tab4']//thead[@class='thead-light']//th[6]")
	WebElement BH_GL;

	@FindBy(xpath = "//div[@id='tab4']//thead[@class='thead-light']//th[7]")
	WebElement BH_epic;

	@FindBy(xpath = "//div[@id='tab4']//thead[@class='thead-light']//th[8]")
	WebElement BH_corp;

	@FindBy(xpath = "//div[@id='tab4']//th[9]")
	WebElement BH_totalposted;

	@FindBy(xpath = "//div[@id='tab4']//th[10]")
	WebElement BH_variance;

	@FindBy(xpath = "//table[@id='tab5_example']//th[@class='text-left sorting'][contains(text(),'EFT#')]")
	WebElement WH_EFT;

	@FindBy(xpath = "//table[@id='tab5_example']//th[@class='text-left sorting'][contains(text(),'Payor')]")
	WebElement WH_payorName;

	@FindBy(xpath = "//table[@id='tab5_example']//th[@class='text-left sorting_desc'][contains(text(),'Payment Date')]")
	WebElement WH_paymentDate;

	@FindBy(xpath = "//div[@id='tab5']//thead[@class='thead-light']//th[4]")
	WebElement WH_bankDeposit;

	@FindBy(xpath = "//div[@id='tab5']//thead[@class='thead-light']//th[6]")
	WebElement WH_GL;

	@FindBy(xpath = "//div[@id='tab5']//thead[@class='thead-light']//th[7]")
	WebElement WH_epic;

	@FindBy(xpath = "//th[contains(text(),'WH Legacy')]")
	WebElement WH_Legacy;

	@FindBy(xpath = "//div[@id='tab5']//thead[@class='thead-light']//th[8]")
	WebElement WH_corp;

	@FindBy(xpath = "//div[@id='tab5']//th[9]")
	WebElement WH_totalposted;

	@FindBy(xpath = "//div[@id='tab5']//th[10]")
	WebElement WH_variance;

	@FindBy(xpath = "//div[@id='tab1']//td[1]//input[1]")
	WebElement EFTSearchBox;

	@FindBy(xpath = "//div[@class='wrapper']//tbody//td[1]")
	WebElement EFTNumber;

	@FindBy(xpath = "//div[@id='tab1']//td[2]//input[1]")
	WebElement payorFilter;

	@FindBy(xpath = "//div[@class='wrapper']//tbody//tr[1]//td[2]")
	WebElement payorName;
	
	

	public BAI_HomePage() {

		PageFactory.initElements(Driver.getDriver(), this);
	}

	public void validateBAIHomePage(String UserName) throws InterruptedException {
		Assert.assertTrue(BAI_Home.isDisplayed());
		// Utils.explecitWaitUntillClickable(5, userProfileBtn);
		Utils.push(5000);
		Assert.assertEquals(userProfileBtn.getText(), UserName);
		
	}

	public void selectDate(String FromDate) {
		Utils.selectDateByJS(fromDate, FromDate);
		
	}

	public void selectTodate(String Todate) {
		Utils.selectDateByJS(toDate, Todate);
	}

	public void clickSearchBtn() {
		searchBtn.click();
	}

	public void validateHospitalTabs() {
		Assert.assertTrue(YHTab.isDisplayed());
		Assert.assertTrue(LHTab.isDisplayed());
		Assert.assertTrue(GHTab.isDisplayed());
		Assert.assertTrue(BHTab.isDisplayed());
		Assert.assertTrue(WHTab.isDisplayed());
		Assert.assertTrue(cashManagementReceived.isDisplayed());
		Assert.assertTrue(BAIDoNotMatch.isDisplayed());
	}

	public void selectHospital(String HospitalName) {
		if (HospitalName.equalsIgnoreCase("yh")) {
			YHTab.click();
		} else if (HospitalName.equalsIgnoreCase("lh")) {
			LHTab.click();
		} else if (HospitalName.equalsIgnoreCase("gh")) {
			GHTab.click();
		} else if (HospitalName.equalsIgnoreCase("BH")) {
			BHTab.click();
		} else if (HospitalName.equalsIgnoreCase("wh")) {
			WHTab.click();
		}
	}

	public void validateLeftPanel() {

		Assert.assertTrue(historicalPage.isDisplayed());
		Assert.assertTrue(reconciliationPage.isDisplayed());
		Assert.assertTrue(casherPage.isDisplayed());
		Assert.assertTrue(HSCPage.isDisplayed());
		Assert.assertTrue(interCompanyPage.isDisplayed());
		Assert.assertTrue(overAllStatistics.isDisplayed());
		Assert.assertTrue(NSD.isDisplayed());
		Assert.assertTrue(schedulerReport.isDisplayed());
		Assert.assertTrue(passwordChangeTab.isDisplayed());
	}

	public void selectPage(String pageName) {
		if (pageName.equalsIgnoreCase("historical")) {
			historicalPage.click();
		} else if (pageName.equalsIgnoreCase("DailyReconcilation")) {
			reconciliationPage.click();
		} else if (pageName.equalsIgnoreCase("HSC")) {
			HSCPage.click();
		} else if (pageName.equalsIgnoreCase("Intercompany")) {
			interCompanyPage.click();
		} else if (pageName.equalsIgnoreCase("overallStatistics")) {
			overAllStatistics.click();
		} else if (pageName.equalsIgnoreCase("NSD")) {
			NSD.click();
		} else if (pageName.equalsIgnoreCase("Schedulersreport")) {
			schedulerReport.click();
		} else if (pageName.equalsIgnoreCase("passwordChange")) {
			passwordChangeTab.click();
		}
	}

	public void selectPayor(String PayorName) {
		Utils.selectValue(payor, PayorName);
	}

	public void validatePayorName() {
		Assert.assertEquals(filterPayor.getText(), "UnitedHealthcare");
	}

	public void validateDate() {
		Assert.assertEquals(Date.getText(), "05/05/2020");
	}

	public void validate_YH_Labels() {
		Assert.assertEquals(YH_EFT.getText(), "EFT#");
		Utils.validateAssertEqual(YH_EFT, "EFT#");
		
		Assert.assertEquals(YH_payorName.getText(), "Payor");
		Assert.assertEquals(YH_paymentDate.getText(), "Payment Date");
		Assert.assertEquals(YH_bankDeposit.getText(), "Bank Deposit");
		Assert.assertEquals(YH_legacySDK.getText(), "YH Legacy - SDK");
		Assert.assertEquals(YH_legacySRC.getText(), "YH Legacy - SRC");
		Assert.assertEquals(YH_GL.getText(), "GL");
		Assert.assertEquals(YH_epic.getText(), "EPIC");
		Assert.assertEquals(YH_corp.getText(), "CORP");
		Assert.assertEquals(YH_totalposted.getText(), "Total Posted");
		Assert.assertEquals(YH_variance.getText(), "Variance");
	}

	public void validate_LH_Labels() {
		Assert.assertEquals(LH_EFT.getText(), "EFT#");
		Assert.assertEquals(LH_payorName.getText(), "Payor");
		Assert.assertEquals(LH_paymentDate.getText(), "Payment Date");
		Assert.assertEquals(LH_bankDeposit.getText(), "Bank Deposit");
		Assert.assertEquals(LH_legacy.getText(), "LH Legacy");
		Assert.assertEquals(LH_GL.getText(), "GL");
		Assert.assertEquals(LH_epic.getText(), "EPIC");
		Assert.assertEquals(LH_corp.getText(), "CORP");
		Assert.assertEquals(LH_totalPosted.getText(), "Total Posted");
		Assert.assertEquals(LH_variance.getText(), "Variance");
	}

	public void validate_GH_Labels() {
		Assert.assertEquals(GH_EFT.getText(), "EFT#");
		Assert.assertEquals(GH_payorName.getText(), "Payor");
		Assert.assertEquals(GH_paymentDate.getText(), "Payment Date");
		Assert.assertEquals(GH_bankDeposit.getText(), "Bank Deposit");
		Assert.assertEquals(GH_Legacy.getText(), "GH Legacy");
		Assert.assertEquals(GH_GL.getText(), "GL");
		Assert.assertEquals(GH_epic.getText(), "EPIC");
		Assert.assertEquals(GH_corp.getText(), "CORP");
		Assert.assertEquals(GH_totalposted.getText(), "Total Posted");
		Assert.assertEquals(GH_variance.getText(), "Variance");
	}

	public void validate_BH_Labels() {
		Assert.assertEquals(BH_EFT.getText(), "EFT#");
		Assert.assertEquals(BH_payorName.getText(), "Payor");
		Assert.assertEquals(BH_paymentDate.getText(), "Payment Date");
		Assert.assertEquals(BH_bankDeposit.getText(), "Bank Deposit");
		Assert.assertEquals(BH_Legacy.getText(), "BH Legacy - SDK");
		Assert.assertEquals(BH_GL.getText(), "GL");
		Assert.assertEquals(BH_epic.getText(), "EPIC");
		Assert.assertEquals(BH_corp.getText(), "CORP");
		Assert.assertEquals(BH_totalposted.getText(), "Total Posted");
		Assert.assertEquals(BH_variance.getText(), "Variance");
	}

	public void validate_WH_Labels() {
		Assert.assertEquals(WH_EFT.getText(), "EFT#");
		Assert.assertEquals(WH_payorName.getText(), "Payor");
		Assert.assertEquals(WH_paymentDate.getText(), "Payment Date");
		Assert.assertEquals(WH_bankDeposit.getText(), "Bank Deposit");
		Assert.assertEquals(WH_Legacy.getText(), "WH Legacy");
		Assert.assertEquals(WH_GL.getText(), "GL");
		Assert.assertEquals(WH_epic.getText(), "EPIC");
		Assert.assertEquals(WH_corp.getText(), "CORP");
		Assert.assertEquals(WH_totalposted.getText(), "Total Posted");
		Assert.assertEquals(WH_variance.getText(), "Variance");
	}

	public void validate_EFTSearch(String EFTNum) throws InterruptedException {
		EFTSearchBox.sendKeys(EFTNum);
		Thread.sleep(3000);
		Assert.assertEquals(EFTNumber.getText(), EFTNum);
	}

	public void payorSearchAndValidateseachedPoyer(String Payor) throws InterruptedException {
		payorFilter.sendKeys(Payor);
		Utils.push(4000);
		Assert.assertEquals(payorName.getText(), Payor);
	}

}

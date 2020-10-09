package com.qa.BAI_Portal_Tests;

import org.testng.annotations.Test;

import com.qa.BAI_Portal_Pages.BAI_HomePage;
import com.qa.BAI_Portal_Pages.GCC_Home;
import com.qa.BAI_Portal_Pages.LoginPage;
import com.qa.utils.Utils;

public class BAI_Home_Test extends BaseTest {

	public LoginPage Login;
	public GCC_Home gccHome;
	public BAI_HomePage BAI_Home;

	 @Test
	public void validateHomePage() throws InterruptedException {
		Login = new LoginPage();
		gccHome = new GCC_Home();
		BAI_Home = new BAI_HomePage();
		Login.login();
		gccHome.validate_user("Ramachandra.K@cognitivehealthit.com");
		gccHome.validate_projects();
		gccHome.selectProject("BAIPortal");
		BAI_Home.validateBAIHomePage("Ramachandra K");
	}

	 @Test
	public void validateDateFilters() throws InterruptedException {
		Login = new LoginPage();
		gccHome = new GCC_Home();
		BAI_Home = new BAI_HomePage();
		Login.login();
		gccHome.validate_user("Ramachandra.K@cognitivehealthit.com");
		gccHome.validate_projects();
		gccHome.selectProject("BAIPortal");
		Utils.push(10000);
		BAI_Home.selectDate("04/08/2020");
		BAI_Home.selectTodate("05/05/2020");
		BAI_Home.clickSearchBtn();
		Utils.push(10000);

	}

	 @Test
	public void validatePayorselectePayor() throws InterruptedException {
		Login = new LoginPage();
		gccHome = new GCC_Home();
		BAI_Home = new BAI_HomePage();
		Login.login();
		gccHome.validate_user("Ramachandra.K@cognitivehealthit.com");
		gccHome.validate_projects();
		gccHome.selectProject("BAIPortal");
		Utils.push(10000);
		BAI_Home.selectDate("04/08/2020");
		BAI_Home.selectTodate("05/05/2020");
		BAI_Home.clickSearchBtn();
		BAI_Home.validateDate();
		BAI_Home.selectPayor("UnitedHealthcare");
		BAI_Home.clickSearchBtn();
		BAI_Home.validatePayorName();

	}

	 @Test
	public void leftPannel() throws InterruptedException {
		Login = new LoginPage();
		gccHome = new GCC_Home();
		BAI_Home = new BAI_HomePage();
		Login.login();
		gccHome.validate_user("Ramachandra.K@cognitivehealthit.com");
		gccHome.validate_projects();
		gccHome.selectProject("BAIPortal");
		Utils.push(10000);
		BAI_Home.validateLeftPanel();
	}

	 @Test
	public void validateHospitalTabs() throws InterruptedException {
		Login = new LoginPage();
		gccHome = new GCC_Home();
		BAI_Home = new BAI_HomePage();
		Login.login();
		gccHome.validate_user("Ramachandra.K@cognitivehealthit.com");
		gccHome.validate_projects();
		gccHome.selectProject("BAIPortal");
		Utils.push(10000);
		BAI_Home.validateHospitalTabs();
	}

	 @Test
	public void selectHospitalAndValidateLabels() throws InterruptedException {
		Login = new LoginPage();
		gccHome = new GCC_Home();
		BAI_Home = new BAI_HomePage();
		Login.login();
		gccHome.validate_user("Ramachandra.K@cognitivehealthit.com");
		gccHome.validate_projects();
		gccHome.selectProject("BAIPortal");
		Utils.push(10000);
		BAI_Home.validate_YH_Labels();
		Utils.push(5000);
		BAI_Home.selectHospital("LH");
		Utils.push(5000);
		BAI_Home.validate_LH_Labels();
		BAI_Home.selectHospital("GH");
		Utils.push(5000);
		BAI_Home.validate_GH_Labels();
		BAI_Home.selectHospital("BH");
		Utils.push(5000);
		BAI_Home.validate_BH_Labels();
		BAI_Home.selectHospital("WH");
		Utils.push(5000);
		BAI_Home.validate_WH_Labels();
	}

	 @Test
	public void validateEFTFilter() throws InterruptedException {
		Login = new LoginPage();
		gccHome = new GCC_Home();
		BAI_Home = new BAI_HomePage();
		Login.login();
		gccHome.validate_user("Ramachandra.K@cognitivehealthit.com");
		gccHome.validate_projects();
		gccHome.selectProject("BAIPortal");
		Utils.push(10000);
		BAI_Home.selectDate("04/08/2020");
		BAI_Home.selectTodate("05/05/2020");
		BAI_Home.clickSearchBtn();
		BAI_Home.validateDate();
		Utils.push(2000);
		BAI_Home.validate_EFTSearch("529429431");
	}

	@Test
	public void validatePayorFilter() throws InterruptedException {
		Login = new LoginPage();
		gccHome = new GCC_Home();
		BAI_Home = new BAI_HomePage();
		Login.login();
		gccHome.validate_user("Ramachandra.K@cognitivehealthit.com");
		gccHome.validate_projects();
		gccHome.selectProject("BAIPortal");
		Utils.push(10000);
		BAI_Home.selectDate("04/08/2020");
		BAI_Home.selectTodate("05/05/2020");
		BAI_Home.clickSearchBtn();
		BAI_Home.validateDate();
		Utils.push(2000);
		BAI_Home.payorSearchAndValidateseachedPoyer("UnitedHealthcare");
	}
}

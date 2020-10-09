package com.qa.base;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qa.listeners.WebEventListener;
import com.qa.utils.Driver;
import com.qa.utils.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	public static WebDriver driver;
	public static String projectPath=System.getProperty("user.dir");
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public static void init_Browser(){
		init_properties();
		if (prop.getProperty("browser").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(OptionsManger.chromeOptionsManager());
		}
		else if (prop.getProperty("browser").equals("firefox")) {
			OptionsManger.ignoreFirefoxLogs();
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver(OptionsManger.firefoxOptionsManager());
		}
		
		e_driver = new EventFiringWebDriver(driver);
		//Now create object of EventListerHandler to register it with EventFiringWebDriver.
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Utils.PAGE_LOAD_TIMEOUTS, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utils.IMPLECITLY_WAIT, TimeUnit.SECONDS);
	}
	
	public static void init_properties(){
		try {
			FileInputStream fis=new FileInputStream(projectPath+"/src/main/java/com/qa/config/config.properties");
			prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void execReport() throws IOException{
		if (prop.getProperty("DisplayReport").equalsIgnoreCase("yes")) {
			File htmlFile=new File(projectPath+"/ExtentReport/TestExecutionReport.html");
			Desktop.getDesktop().browse(htmlFile.toURI());
		}
	}
	
	public static void closeBrowser(){
		if (!Driver.getDriver().equals(null)) {
			Driver.getDriver().close();
		}
	}
	
	public static void quitBrowser(){
		if (Driver.getDriver()!=null) {
			Driver.getDriver().quit();
		}
	}
	
	public static void navigateURL(){
		String url= prop.getProperty("url");
		driver.get(url);
	}

}

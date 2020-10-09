package com.qa.base;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;


//	https://chromium.googlesource.com/chromium/src/+/master/chrome/common/chrome_switches.cc LIST OF SWITCHES

// https://chromium.googlesource.com/chromium/src/+/master/chrome/common/pref_names.cc   LIST OF PREFERENCES

//  https://peter.sh/experiments/chromium-command-line-switches/      List of Chromium Command Line Switches


public class OptionsManger {
	
	public static ChromeOptions chromeOptionsManager(){
		ChromeOptions options=new ChromeOptions();
		
//		options.addArguments("user-data-dir=PROFILEPATH");
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-infobars");
//		options.AddArgument("--incognito");
//		options.addArguments("--window-size=1920,1080");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--disable-popup-blocking");
		return options;
	}
	
	public static FirefoxOptions firefoxOptionsManager(){
//		ProfilesIni p=new ProfilesIni();
//		FirefoxProfile prof=p.getProfile("profilename");
		
		FirefoxProfile profile=new FirefoxProfile();
		FirefoxOptions options=new FirefoxOptions();
		
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(false);
		
//		Disable notifications
		profile.setPreference("dom.webnotifications.enabled", false);
		
//		Proxy servers
		profile.setPreference("network.proxy.type", 1);
		profile.setPreference("network.proxy.socks", "192.168.90.54");
		profile.setPreference("network.proxy.socke_port", 1744);
		
		
//		options.setCapability(FirefoxDriver.PROFILE, profile);
		options.setProfile(profile);
		return options;
	}
	
	public static String ignoreFirefoxLogs(){
		return System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
	}

}
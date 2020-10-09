package com.qa.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.qa.utils.Utils;

public class RetryAnalyzer implements IRetryAnalyzer{
	int counter = 0;
	int retryLimit = 2;
	
	public boolean retry(ITestResult result)
	{
		if (Utils.retryLogicPermission.equalsIgnoreCase("yes")) {
			if(counter < retryLimit)
			{
				counter++;
				return true;
			}
		}
		return false;
	}
}

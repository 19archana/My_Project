package com.app.testngprgm;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedRetry_logic implements IRetryAnalyzer {
int min=1, max=5;
	
	public boolean retry(ITestResult result) {
		if(min<max) {
			min++;
			return true;
		}
		return false;
	}

}

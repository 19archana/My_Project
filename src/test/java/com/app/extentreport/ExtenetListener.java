package com.app.extentreport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ExtenetListener implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ExtentRepo.createTest(result.getName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ExtentRepo.extest.log(Status.PASS, "TestCasePasses");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ExtentRepo.extest.log(Status.FAIL, "TestcaseFailed");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ExtentRepo.extest.log(Status.SKIP, "TestcaseSkipped");
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ExtentRepo.getInstance();
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ExtentRepo.flushReport();
	}

}

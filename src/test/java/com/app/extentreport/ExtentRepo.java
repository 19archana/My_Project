package com.app.extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentRepo {
	
	public static ExtentSparkReporter spkrepo=null;
	public static ExtentReports exrepo=null;
	public static ExtentTest extest=null;
	public static  String  reportLocation=System.getProperty("user.dir") +"/reports/test.html";
		
	public static ExtentReports createInstance() {
		spkrepo =new ExtentSparkReporter(reportLocation);
		spkrepo.config().setDocumentTitle("Test Extent Report");
		spkrepo.config().setTheme(Theme.DARK);
		spkrepo.config().setReportName("Test Report");
		exrepo=new ExtentReports();
		exrepo.attachReporter(spkrepo);
		exrepo.setSystemInfo("citi", "cards");
		exrepo.setSystemInfo("card", "Indianoil");
		exrepo.setSystemInfo("cardtype", "Rupaycard");
		return exrepo;
	}
public static void createTest(String name) {
	extest=exrepo.createTest(name);
}
public static ExtentReports getInstance() {
	if(exrepo==null) {
		return createInstance();
	}
	return exrepo;
	
}
	public static void flushReport() {
		exrepo.flush();
	}
}

package com.app.testngprgm;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Testng {


	@Test (dataProvider = "test")
	public void test1(String data1,String data2) {
		System.out.println(data1);
		System.out.println(data2);	
	}
	@DataProvider (name="test")
	public Object[][] dpMethod() {
		return new Object[][] {{"archan","vishnu"},{"anirudh","Visaka"}};
	}

}



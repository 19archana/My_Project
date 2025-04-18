package com.app.testngprgm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatafrmExceltoDP {
	
	@Test (dataProvider = "getdata")
	public void test1(String data1,String data2) {
		System.out.println(data1);
		System.out.println(data2);		
	}
	@DataProvider (name="getdata")
	public Object[][] dpMeth() throws IOException{
	
		File fl=new File("D:\\Eclipse Workspace\\SampleProject\\src\\test\\resources\\Testdata\\Class1.xlsx");
		FileInputStream fis=new FileInputStream(fl);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sh=wb.getSheet("arch");
		int rcount=sh.getPhysicalNumberOfRows();
		int ccount=sh.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[rcount][ccount];
		for (int i=0;i<rcount;i++) {
			Row rw=sh.getRow(i);
			for(int j=0;j<ccount;j++){
				Cell cl=rw.getCell(j);
				//data[i][j]=rw.getCell(j).toString();
		String value=cl.getStringCellValue();
		data[i][j]=value;

			}		
		}
		return data;
	}

}


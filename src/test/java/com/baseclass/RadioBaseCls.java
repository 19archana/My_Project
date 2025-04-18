package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioBaseCls {
    public static WebDriver driver;
	public static void browserLaunch() {
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
	
	public static void getUrl(String url) {
	driver.get(url);
}

	public static String excelReuse(int i,int j) {
		String value=null;
		try {
			File file=new File("D:\\Eclipse Workspace\\SampleProject\\src\\test\\resources\\Testdata\\Class1.xlsx");
			FileInputStream fis=new FileInputStream(file);
			Workbook wb=new XSSFWorkbook(fis);
			Sheet sh=wb.getSheet("Sheet3");
			Row rw=sh.getRow(i);
			Cell cl=rw.getCell(j);
			int cellType=cl.getCellType();
			if(cellType==1) {
				value=cl.getStringCellValue();
				System.out.println(value);
			}else if(cellType==0) {
				if(DateUtil.isCellDateFormatted(cl)) {
					Date dateCellValue=cl.getDateCellValue();
					//System.out.println(dateCellValue);
					SimpleDateFormat sm=new SimpleDateFormat("MM/dd/yy");
					value=sm.format(dateCellValue);
				}else {
					double numericCellValue=cl.getNumericCellValue();
					long l=(long)numericCellValue;
					value =String.valueOf(l);
					System.out.println(value);
				}	
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	public static void clickBtn(WebElement element) {
		element.click();
	}
	public static void checkMethod(WebElement element) {
		boolean isDisplayed=element.isDisplayed();
		boolean isEnabled=element.isEnabled();
		boolean isSelected=element.isSelected();
		System.out.println(isDisplayed);
		System.out.println(isEnabled);
		System.out.println(isSelected);
	}
}


package com.app.junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.app.locators.Locators;

public class BaseClass extends Locators  {
	public static WebDriver driver;	
	@BeforeClass
	public static void getBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/HotelAppBuild2/");
		WebElement userName=driver.findElement(By.id("username"));
		userName.sendKeys("Archana1992");
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.sendKeys("archana1992");
		WebElement login=driver.findElement(By.id("login"));
		login.click();			
		}
	
	public static String excelReuse1(int i,int j) {
			String value=null;
		try {
			File f=new File("D:\\Eclipse Workspace\\SampleProject\\src\\test\\resources\\Testdata\\Class1.xlsx");
			FileInputStream fis=new FileInputStream(f);
			Workbook wb=new XSSFWorkbook(fis);
			Sheet sh=wb.getSheet("Sheet2");
			Row rw=sh.getRow(i);
			Cell cl=rw.getCell(j);
			int cellType=cl.getCellType();
			if(cellType==1) {
				value=cl.getStringCellValue();
				System.out.println(value);
			}else if(cellType==0) {
				if(DateUtil.isCellDateFormatted(cl)) {
					Date dateCellValue=cl.getDateCellValue();
					SimpleDateFormat sm=new SimpleDateFormat("MM/dd/yy");
					value=sm.format(dateCellValue);
				}else {
					double numericCellValue=cl.getNumericCellValue();
					long l=(long)numericCellValue;
					value=String.valueOf(l);
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
	
}

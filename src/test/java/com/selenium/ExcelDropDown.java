package com.selenium;

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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDropDown {
	public static String excelReuse(int i,int j)  {
		
		String value = null;
		try {
			File fl=new File("D:\\Eclipse Workspace\\SampleProject\\src\\test\\resources\\Testdata\\Class1.xlsx");
			// read
			FileInputStream fis = new FileInputStream(fl);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet2");
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(j);
			// System.out.println(cell);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				value = cell.getStringCellValue();
				System.out.println(value);
			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					// System.out.println(dateCellValue);
					SimpleDateFormat sm = new SimpleDateFormat("MM/dd/yy");
					value = sm.format(dateCellValue);
					System.out.println(value);
				} else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					value = String.valueOf(l);
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
	
	public static void dropDown(WebElement element,String value) {
		Select dd=new Select(element);
		dd.selectByValue(value);
	}
public static void main(String[] args) {
	excelReuse(43,0);
//	WebDriverManager.chromedriver().setup();
//	WebDriver driver=new ChromeDriver();
//	driver.get("https://letcode.in/dropdowns");
//	//driver.findElement(By.xpath("//select[@id='fruits']"));
//
//	dropDown(driver.findElement(By.xpath("//select[@id='fruits']")),excelReuse(43,0) );
}
	
}
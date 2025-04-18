package com.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchFromExcel {


	public static void excel()  {    //read only one data from excel

		try {
			File fl=new File("D:\\Eclipse Workspace\\SampleProject\\src\\test\\resources\\Testdata\\Class1.xlsx");
			FileInputStream fis = new FileInputStream(fl);
			// workBook
			Workbook wb = new XSSFWorkbook(fis);
			// sheet
			Sheet sheet = wb.getSheet("Sheet1");
			// row
			Row row = sheet.getRow(0);
			// cell
			Cell cell = row.getCell(1);
			System.out.println(cell);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void excelRead_AllData() {
		try {
			File fl=new File("D:\\Eclipse Workspace\\SampleProject\\src\\test\\resources\\Testdata\\Class1.xlsx");
			// read
			FileInputStream fis = new FileInputStream(fl);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
			for (int i = 0; i < physicalNumberOfRows; i++) {
				Row row = sheet.getRow(i);
				int physicalNumberOfCells = row.getPhysicalNumberOfCells();
				for (int j = 0; j < physicalNumberOfCells; j++) {
					Cell cell = row.getCell(j);
					// System.out.println(cell);
					int cellType = cell.getCellType();
					if (cellType == 1) {
						String stringCellValue = cell.getStringCellValue();
						System.out.println(stringCellValue);
					} else if (cellType == 0) {
						if (DateUtil.isCellDateFormatted(cell)) {
							Date dateCellValue = cell.getDateCellValue();
							// System.out.println(dateCellValue);
							SimpleDateFormat sm = new SimpleDateFormat("MM/dd/yy");
							String format = sm.format(dateCellValue);
							System.out.println(format);
						} else {
							double numericCellValue = cell.getNumericCellValue();
							long l = (long) numericCellValue;
							String valueOf = String.valueOf(l);
							System.out.println(valueOf);
						}
					}

				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String excelRead_reuse(int i, int j) {
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
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(excelRead_reuse(0,0));
		driver.findElement(By.id("password")).sendKeys(excelRead_reuse(1,0));
		driver.findElement(By.id("login")).click();
	
}
}
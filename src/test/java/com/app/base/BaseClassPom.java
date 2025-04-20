package com.app.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClassPom {
	public static WebDriver driver;
	//commitclass
	@BeforeClass
	public static void browserLaunch() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(propFileReuse("url"));
	}
	public static void inputText(WebElement element, String data) {
		element.sendKeys(data);
	}
	public static void buttonClick(WebElement element) {
		element.click();
	}
	public static void dropDown(WebElement element,String data) {
		Select s = new Select(element);
		s.selectByValue(data);
	}
	public static WebElement getCheckIn() {
		return driver.findElement(By.xpath("//input[@id='todate_in']"));
	}
	public static WebElement getcheckOut() {
		return driver.findElement(By.xpath("//input[@id='datepick_out']"));
	}
	public static void clear(WebElement element) {
	       element.clear();
	}
	
	public static void mouseHover(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
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
					SimpleDateFormat sm = new SimpleDateFormat("dd/MM/YYYY");
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
	public static String propFileReuse(String data) {
		String value=null;
		try {
			File file=new File("D:\\Eclipse Workspace\\SampleProject\\src\\test\\resources\\Testdata\\config.properties");

			FileReader fRead=new FileReader(file);
			Properties prop=new Properties();
			prop.load(fRead);
			value=prop.getProperty(data);
			//System.out.println(value);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	
	@AfterClass
	public static void getScreenShot() {
		try {
		TakesScreenshot ts=(TakesScreenshot) driver;
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		File ScreenshotAs=ts.getScreenshotAs(OutputType.FILE);
		File Destination=new File("E:\\Archana\\Archana_Java_2024\\Screenshot\\ord1.jpg");
		FileHandler.copy(ScreenshotAs, Destination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	

}

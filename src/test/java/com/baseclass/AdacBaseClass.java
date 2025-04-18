package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdacBaseClass {
	public static Select s;
	public static WebDriver driver;
	public static void setProperty() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
	}

	public static void maximizeWin() {
		driver.manage().window().maximize();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void sendKeys(WebElement element,String value) {
		
		element.sendKeys(value);
	}
	public static void click(WebElement element) {
		element.click();
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
	public static void excelWrite(String i) {
		try {
			File file=new File("D:\\Eclipse Workspace\\SampleProject\\src\\test\\resources\\Testdata\\Class1.xlsx");
			FileInputStream fis=new FileInputStream(file);
			Workbook wb=new XSSFWorkbook(fis);
			Sheet sh=wb.getSheet("Sheet2");
			Row rw=sh.createRow(48);
			Cell cl=rw.createCell(0);
			cl.setCellValue(i);
			FileOutputStream fos=new FileOutputStream(file);
			wb.write(fos);

		}catch(FileNotFoundException e) {

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String getAttribute() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement  orderNo=driver.findElement(By.xpath("//input[@name='order_no']"));
		String attribute=orderNo.getAttribute("value");
		System.out.println(attribute);
		return attribute;
	}
	public static void selectByValue(WebElement element, String value)
	{
		s = new Select(element);
		s.selectByValue(value);
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
}

package com.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write {

	public static void excelWrite() {
		try {
			File file=new File("D:\\Eclipse Workspace\\SampleProject\\src\\test\\resources\\Testdata\\Class1.xlsx");
			FileInputStream fis=new FileInputStream(file);
			Workbook wb=new XSSFWorkbook(fis);
			Sheet sh=wb.getSheet("arch");
			Row rw=sh.createRow(1);
			Cell cl=rw.createCell(0);
			cl.setCellValue("Manual Testing");
			FileOutputStream fos=new FileOutputStream(file);
			wb.write(fos);

		}catch(FileNotFoundException e) {

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void excel_Modify() {
		try {
			File file=new File("D:\\Eclipse Workspace\\SampleProject\\src\\test\\resources\\Testdata\\Class1.xlsx");
			FileInputStream fis=new FileInputStream(file);
			Workbook wb=new XSSFWorkbook(fis);
			Sheet sh=wb.getSheet("arch");
			Row rw=sh.getRow(0);
			Cell cl=rw.getCell(0);
			if(cl.getStringCellValue().equals("java")) {
				cl.setCellValue("selenium");
			}
			FileOutputStream fos=new FileOutputStream(file);
			wb.write(fos);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {

		excelWrite();
	}
}
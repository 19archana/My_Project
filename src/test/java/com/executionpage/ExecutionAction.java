package com.executionpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseAction;

public class ExecutionAction extends BaseAction {
	
	public static void main(String[] args) {
		
		BaseAction.browserLaunch(excelReuse(8,0));
		BaseAction.getUrl("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		//BaseAction.actionMethod(driver.findElement(By.xpath("//a[text()='About']")));
		//BaseAction.clickBtn(driver.findElement(By.xpath("//a[text()='About']")));
		//BaseAction.doubleClick(driver.findElement(By.xpath("//a[text()='About']")));
		//BaseAction.contextClick(driver.findElement(By.xpath("//a[text()='About']")));
	WebElement	dragable=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement dropable=driver.findElement(By.xpath("//div[@id='droppable']"));
        BaseAction.dragandDrop(dragable, dropable);                      
		
	}

}

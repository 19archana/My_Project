package com.repositoryclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.AdacBaseClass;

public class RepositoryClass extends AdacBaseClass{
	
	public static WebElement byId(String idValue) {
		return driver.findElement(By.id(idValue));
	}

	public static WebElement byName(String nameValue) {
		return driver.findElement(By.name(nameValue));

	}

	public static WebElement byClass(String classvalue) {
		return driver.findElement(By.className(classvalue));

	}

	public static List<WebElement> byTag(String tagValue) {
		return driver.findElements(By.tagName(tagValue));

	}

	public static WebElement byLinktext(String linkValue) {
		return driver.findElement(By.linkText(linkValue));

	}

	public static WebElement byPartialText(String partialValue) {
		return driver.findElement(By.partialLinkText(partialValue));

	}

	public static WebElement byCss(String cssvalue) {
		return driver.findElement(By.cssSelector(cssvalue));
	}

	public static WebElement byXpath(String xpathValue) {
		return driver.findElement(By.xpath(xpathValue));
	
}
}
package com.RideallyStageVendor.generic;

import java.io.File;
import java.io.IOException;

import org.apache.bcel.generic.Select;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericUtils {
public static void getscreenshot(WebDriver driver,String name)  
{
	
	try {
		TakesScreenshot t=(TakesScreenshot) driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./screenshot/"+name+".png"));
	} 
	catch (IOException e) {
	}
}
public static void SelectByIndex(WebElement element,int index)
{
	org.openqa.selenium.support.ui.Select sel=new org.openqa.selenium.support.ui.Select(element);
	sel.selectByIndex(index);
}
public static void SelectByValue(WebElement element, String value)
{
	org.openqa.selenium.support.ui.Select sel=new org.openqa.selenium.support.ui.Select(element);
	sel.selectByValue(value);
}
public static void SelectByVisibleText(WebElement element, String text)
{
	org.openqa.selenium.support.ui.Select sel=new org.openqa.selenium.support.ui.Select(element);
	sel.selectByVisibleText(text);
}
}

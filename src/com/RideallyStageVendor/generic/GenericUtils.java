package com.RideallyStageVendor.generic;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;


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
	Select sel=new Select(element);
	sel.selectByIndex(index);
}
public static void SelectByValue(WebElement element,String value)
{
	Select sel=new Select(element);
	sel.selectByValue(value);
}
public static void SelectByVisbleText(WebElement element,String text)
{
	Select sel=new Select(element);
	sel.selectByVisibleText(text);
}
//public static void GetFirstSelectedOption(WebElement element)
//{
//	Select sel=new Select(element);
//	 sel.getFirstSelectedOption();	
//	
//}
public static void SelecyByStartDate(WebElement driver)
{
	Date date=new Date();
	SimpleDateFormat s1=new SimpleDateFormat("d");
	String day=s1.format(date);
//	SimpleDateFormat s2=new SimpleDateFormat("MMMM");
//	String month=s2.format(date);
	String xp="//a[.='"+day+"']";
    driver.findElement(By.xpath(xp)).click();
}
public static void SelectByReturnDate(WebElement driver, int days)
{
	Date date=new Date();
	SimpleDateFormat s1=new SimpleDateFormat("d");
	Calendar cal=Calendar.getInstance();
	cal.setTime(date);
	cal.add(Calendar.DATE, days);
	date=cal.getTime();
	String day=s1.format(date);
	
	String xp="//a[.='"+day+"']";
    driver.findElement(By.xpath(xp)).click();
}
}

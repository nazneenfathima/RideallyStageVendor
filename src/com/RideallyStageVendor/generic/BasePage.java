package com.RideallyStageVendor.generic;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage
{
public WebDriver driver;
public BasePage(WebDriver driver)
{
	this.driver=driver;
}
//To verify title
public void VerifyTitle(String etitle)
{
	WebDriverWait wait=new WebDriverWait(driver, 10);
	try
	{
		wait.until(ExpectedConditions.titleIs(etitle));
		Reporter.log("Title is matching"+etitle,true);
	}
	catch(Exception e)
	{
		Reporter.log("Title is not matching; Expected title is:"+etitle,true);
		Reporter.log("Actual title is:"+driver.getTitle(),true);
		Assert.fail();
	}	
}
//To verify element
public void VerifyElement(WebElement element,String text)
{
	WebDriverWait wait=new WebDriverWait(driver, 10);
	try
	{
	wait.until(ExpectedConditions.visibilityOf(element));
	Reporter.log("Element is present"+ text , true);
	}
	catch(Exception e)
	{
		Reporter.log("Element is not present..", true);
		Assert.fail();
	}
}
}

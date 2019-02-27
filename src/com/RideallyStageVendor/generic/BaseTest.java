package com.RideallyStageVendor.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant
{
public WebDriver driver;
static
{
	System.setProperty(gecko_key, gecko_value);
	System.setProperty(chrome_key, chrome_value);
	
}
@BeforeMethod
public void PreCondition()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("http://prodtst.rideally.com/vendor/login?err&url=%2Fvendor");
}
@AfterMethod
public void PostCondition(ITestResult res)
{
	int status=res.getStatus();
	if(status==2)
	{
		String name=res.getName();
		GenericUtils.getscreenshot(driver, name);
	}
	driver.close();
}
}




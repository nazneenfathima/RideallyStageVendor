package com.RideallyStageVendor.tests;

import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.RideallyStageVendor.generic.BaseTest;
import com.RideallyStageVendor.generic.ExcelData;
import com.RideallyStageVendor.pages.LoginPage;

public class InvalidLoginLogoutTest extends BaseTest {
@Test(priority=2)
public void testInvalidLoginLogout()
{
	String expectedErrorMSG=ExcelData.getData(file_path, "TC02", 1, 2);
	LoginPage lp=new LoginPage(driver);
	int rc=ExcelData.getRowCount(file_path, "TC02");
	
	for(int i=1;i<=rc;i++)
	{
		String user=ExcelData.getData(file_path, "TC02", i, 0);
		String pass=ExcelData.getData(file_path, "TC02", i, 1);
		
		//Enter invalid username:
		Reporter.log("Invalid Username:"+user,true);
		lp.enterUserName(user);
		
		//Enter invalid password:
		Reporter.log("Invalid Passwprd:"+pass,true);
		lp.enterPassword(pass);
		
		//Click on login
		lp.clickOnLogin();
		
		//Verify error msg
		String actualerrormsg=lp.verifyErrorMessage();
		Assert.assertEquals(actualerrormsg, expectedErrorMSG);
		Reporter.log("Element is exactly matching",true);
	}
	
}
}

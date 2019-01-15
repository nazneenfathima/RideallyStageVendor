package com.RideallyStageVendor.tests;


import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.RideallyStageVendor.generic.BaseTest;
import com.RideallyStageVendor.generic.ExcelData;
import com.RideallyStageVendor.pages.BookingListPage;
import com.RideallyStageVendor.pages.LoginPage;

public class ValidLoginLogoutTest extends BaseTest {
@Test(priority=1)
public void testValidLoginLogout() throws InterruptedException
{
	String  user=ExcelData.getData(file_path, "TC01", 1, 0);
	String pass=ExcelData.getData(file_path, "TC01", 1, 1);
//	String LoginTitle=ExcelData.getData(file_path, "TC01", 1, 2);
//	String BookingList=ExcelData.getData(file_path, "TC01", 1, 3);
//	
	
	LoginPage lp=new LoginPage(driver);
	BookingListPage bp=new BookingListPage(driver);
	
	//Verify the Login Page
//	Reporter.log("Verifying title:"+LoginTitle,true);
//	lp.verifyPage(LoginTitle);
	
	//verify login title element
	lp.verifyElementTitle();
	Reporter.log("--------------------",true);
	
	//Enter Valid Username:
	Reporter.log("Valid username:"+user,true);
	lp.enterUserName(user);
	
	//Enter Valid Password:
	Reporter.log("Valid password:"+pass,true);
	lp.enterPassword(pass);
	
	//Click on Login
	lp.clickOnLogin();
	Reporter.log("logged in successfully",true);
	Reporter.log("-------------------",true);
	
	//Verify Booking List page:
	//lp.verifyPage(BookingList);
	bp.verifyElementTitle();
	
	Thread.sleep(2000);
	
	//click on account
	bp.ClickOnAccount();
	
	//click on logout
	bp.ClickOnLogout();
	Reporter.log("logged out successfully",true);
	Reporter.log("-------------------",true);
	
	//verify the login page again
	//lp.verifyPage(LoginTitle);
	lp.verifyElementTitle();
}
}

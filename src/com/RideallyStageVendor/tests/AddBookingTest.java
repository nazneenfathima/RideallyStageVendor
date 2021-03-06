package com.RideallyStageVendor.tests;

import org.testng.annotations.Test;

import com.RideallyStageVendor.generic.BaseTest;
import com.RideallyStageVendor.generic.ExcelData;
import com.RideallyStageVendor.pages.BookingListPage;
import com.RideallyStageVendor.pages.ConfirmBookingPage;
import com.RideallyStageVendor.pages.EnterMobileNumbPage;
import com.RideallyStageVendor.pages.LoginPage;
import com.RideallyStageVendor.pages.ValidCabBookPage;

public class AddBookingTest extends BaseTest {
	@Test(priority=3)
	public void testAddBooking() throws InterruptedException
	{
		String MobileNumb=ExcelData.getData(file_path, "TC03", 1, 0);
		String User=ExcelData.getData(file_path, "TC01", 1, 0);
		String Pass=ExcelData.getData(file_path, "TC01", 1, 1);
		String Pickup=ExcelData.getData(file_path, "TC03", 1, 5);
		String Drop=ExcelData.getData(file_path, "TC03", 1, 6);
		String ABLRID=ExcelData.getData(file_path, "TC04", 1, 0);
		
		LoginPage lp=new LoginPage(driver);
		BookingListPage bp=new BookingListPage(driver);
		EnterMobileNumbPage mp=new EnterMobileNumbPage(driver);
		ValidCabBookPage Vp=new ValidCabBookPage(driver);
		ConfirmBookingPage Cb=new ConfirmBookingPage(driver);
		
        //Enter Username
		lp.enterUserName(User);
		//Enter Password
		lp.enterPassword(Pass);
		//Click on Login
		lp.clickOnLogin();
		
		//Click on AddNew
		bp.MouseHovertoPlus();
		
		//Enter MobileNumb
		mp.EnterMobileNumb(MobileNumb);
		
		//Select 4hr package
		Vp.Package4hr();
		
	
		
		Vp.SelectStartDate();
		Thread.sleep(2000);
		
		Vp.SelectDepartTime(90);
		Thread.sleep(2000);
		Vp.ACButton();
		Thread.sleep(6000);
		
		Vp.MiniACBTN();
		
//		Vp.Coupon(1);
//		Vp.SelectCreatedBy(1);
	
		Vp.ConfirmButton();
		Thread.sleep(4000);
		
		Cb.CheckCofirmBooking();
	    //Cb.SelectDriverAttachment(ABLRID);
		//Cb.CancelBooking(4);		
	    //Cb.Ongoing();
	}

}

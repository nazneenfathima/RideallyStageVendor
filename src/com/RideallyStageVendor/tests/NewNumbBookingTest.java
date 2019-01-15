package com.RideallyStageVendor.tests;

import org.testng.annotations.Test;

import com.RideallyStageVendor.generic.BaseTest;
import com.RideallyStageVendor.generic.ExcelData;
import com.RideallyStageVendor.pages.BookingListPage;
import com.RideallyStageVendor.pages.ConfirmBookingPage;
import com.RideallyStageVendor.pages.EnterMobileNumbPage;
import com.RideallyStageVendor.pages.LoginPage;
import com.RideallyStageVendor.pages.ValidCabBookPage;

public class NewNumbBookingTest extends BaseTest{
	@Test(priority=4)
	public void testNewNumbBooking() throws InterruptedException
	{
		String MobileNumb=ExcelData.getData(file_path, "TC03", 1, 0);
		String User=ExcelData.getData(file_path, "TC01", 1, 0);
		String Pass=ExcelData.getData(file_path, "TC01", 1, 1);
		String fn=ExcelData.getData(file_path, "TC03", 1, 1);
		String ln=ExcelData.getData(file_path, "TC03", 1, 2);
		String email=ExcelData.getData(file_path, "TC03", 1, 3);
		String Pickup=ExcelData.getData(file_path, "TC03", 1, 5);
		String Drop=ExcelData.getData(file_path, "TC03", 1, 6);
		
		
		LoginPage lp=new LoginPage(driver);
		BookingListPage bp=new BookingListPage(driver);
		EnterMobileNumbPage mp=new EnterMobileNumbPage(driver);
		ValidCabBookPage Vp=new ValidCabBookPage(driver);
		ConfirmBookingPage Cb=new ConfirmBookingPage(driver);
		
		lp.enterUserName(User);
		lp.enterPassword(Pass);
		lp.clickOnLogin();
		bp.MouseHovertoPlus();
		mp.EnterMobileNumb(MobileNumb);
		
		Vp.Gender(2);
		Vp.Details(fn, ln, email);
		Vp.PickupLoc(Pickup, Drop);
		
		
		Thread.sleep(2000);
		Vp.Outstation250();
		
		Vp.SelectStartDate();
		Thread.sleep(2000);
		
		Vp.SelectDepartTime();
		Thread.sleep(2000);
		
		Vp.SelectReturnDate();
		Vp.SelectReturnTime();
		Vp.ACButton();
		Thread.sleep(6000);
		
		Vp.MiniACBTN();
		
		Vp.SelectCreatedBy(4);
		
//		Vp.ConfirmButton();
//		Thread.sleep(4000);
//		
//		Cb.CheckCofirmBooking();
//		
	}

}

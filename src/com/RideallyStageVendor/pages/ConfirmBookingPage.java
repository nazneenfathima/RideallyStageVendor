package com.RideallyStageVendor.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.RideallyStageVendor.generic.BasePage;
import com.RideallyStageVendor.generic.GenericUtils;

public class ConfirmBookingPage extends BasePage{
	//Declaration
	//Confirmed option
	 @FindBy(xpath="(//option[@selected='selected'])[1]")
	 private WebElement BookingStatus; 
	 @FindBy(id="booking_status_options")
	 private WebElement SelectBookingstatus;
	 
	 //CancelDriveR Or OnGOING status
	 @FindBy(xpath="//span[@class='checkmark']")
	 private WebElement CancelDriver;
	 @FindBy(id="unassign_driver")
	 private WebElement UnassignDriver;
	 
	 @FindBy(id="otp")
	 private WebElement EnterOTP;
	 @FindBy(id="opening_km")
	 private WebElement OpeningKM;
	 @FindBy(id="verify_otp")
	 private WebElement VerifyOTP;
	 @FindBy(xpath="//label[contains(.,'OTP Verified And Ride Started')]")
	 private WebElement OTPSuccessMSG;
	 
	 //Cancelrides
	 @FindBy(id="cancel_reason")
	 private WebElement CancelByRDLY;
	 @FindBy(xpath="//button[@onclick='checkCancelForm()']")
	 private WebElement Submit;
	 
	
	 //Info of booking 
	 @FindBy(xpath="(//div[@class='panel-heading'])[1]")
	 private WebElement BookingInfo;   
	 
	 //Driver ABLR box
	 @FindBy(id="select2-vehicle_id-container")
	 private WebElement DriverAttachment;
	 
	 //ABLR field to send text
	 @FindBy(className="select2-search__field")
	 private WebElement DriverABLRfielld;
	 
	 //Checkbox of default driver
	 @FindBy(id="set_def_driver")
	 private WebElement DefaultDBLR;
	 
	 //Check the default driver selected or not
	 @FindBy(xpath="//span[contains(@title,'DBLR000')]")
	 private WebElement CheckDBLR;
	 //Click on assign button.
	 @FindBy(xpath="(//button[contains(.,'Assign')])[2]")
	 private WebElement AssignDriver;
	 
	 //Price Details
	 @FindBy(id="cost")
	 private WebElement BasePrice;
	 @FindBy(id="extra_km_dist")
	 private WebElement ExtraKM_Distance;
	 @FindBy(id="(//span[@id='price_per_km'])[1]")
	 private WebElement Price_PerKM;
	 @FindBy(id="extra_km")
	 private WebElement Total_ExtraKM;
	 @FindBy(id="extra_time_val")
	 private WebElement Extra_Time;
	 @FindBy(id="(//span[@id='price_per_km'])[2]")
	 private WebElement Price_PerHr;
	 @FindBy(id="extra_hr")
	 private WebElement Extra_HR;
	 @FindBy(id="toll_parking")
	 private WebElement Toll;
	 @FindBy(id="parking")
	 private WebElement Parking;
	 @FindBy(id="cab_coupon_discount")
	 private WebElement coupon_discount;
	 @FindBy(id="discount")
	 private WebElement other_discount;
	 @FindBy(id="others")
	 private WebElement Others;
	 @FindBy(id="side_seen_km")
	 private WebElement Sightseen_KM;
	 @FindBy(id="price_per_km_s")
	 private WebElement Sightseen_Price_PerKM;
	 @FindBy(id="side_seen_price")
	 private WebElement Sightseen_Total_Price;
	 @FindBy(id="no_day_bata")
	 private WebElement Numbof_DayAllow;
	 @FindBy(id="day_bata")
	 private WebElement Total_DayBata_Price;
	 @FindBy(id="no_ngt_bata")
	 private WebElement Numbof_NightAllow;
	 @FindBy(id="ngt_bata")
	 private WebElement Total_NightBata_Price;
	 @FindBy(id="permit")
	 private WebElement Permit;
	 @FindBy(id="final_cost")
	 private WebElement Final_Cost;
	 @FindBy(id="tax")
	 private WebElement Tax;
	 @FindBy(id="final_cost_withtax")
	 private WebElement Final_Cost_WithTax;
	 @FindBy(id="invoice_email_id")
	 private WebElement Invoice_Email;
	 @FindBy(id="invoice_person_name")
	 private WebElement Invoice_person_name;
	 @FindBy(id="customer_to_pay_to_rdly")
	 private WebElement Customer_To_Pay;
	 @FindBy(id="adv_cust_to_rdly")
	 private WebElement Paid_by_Customer_To_RDLY;
	 
	 //Driver structure price
	 @FindBy(id="driver_to_pay_to_rdly")
	 private WebElement Driver_To_Pay_To_Rdly;
	 @FindBy(id="driver_cost")
	 private WebElement Commission_Taken_On;
	 @FindBy(id="base_commission")
	 private WebElement Base_Commission;
	 @FindBy(id="fianl_commission_driver")
	 private WebElement Fianl_Commission_Driver;
	 @FindBy(id="discount_driver")
	 private WebElement Discount_to_driver;
	 @FindBy(id="collected_by_driver")
	 private WebElement Collected_from_Customer;
	 @FindBy(id="adv_rdly_to_driver")
	 private WebElement Paid_By_RDLY_To_Driver;
	 @FindBy(id="final_rdly_commission")
	 private WebElement Final_Commission_to_RDLY;
	 
	 @FindBy(xpath="//div[@class='panel-heading collapsed']")
	 private WebElement AllPriceDETAILS;
	 
	
	 
	  //Initialization
	  public ConfirmBookingPage(WebDriver driver) 
	  {
			super(driver);
			PageFactory.initElements(driver, this);	
		}
	  
	  //Utilization
	  public void CheckCofirmBooking() throws InterruptedException
	  {
		 String text=BookingStatus.getText();
		 if(BookingStatus.isSelected())
			 Reporter.log("Element is selected and now booking status is: "+text,true);
		 else
			 Reporter.log("Element is not selected: "+text,true);
		 Thread.sleep(2000);
		 
		 Reporter.log("Price details are: "+AllPriceDETAILS.getText(),true);	
		 Reporter.log("Base Price="+BasePrice.getAttribute("value"),true);
		 Reporter.log("Extra KM=: "+Extra_Time.getAttribute("value"),true);
		 Reporter.log("Price_PerHr="+Price_PerHr.getText(),true);
		 Reporter.log("Extra_HR="+Extra_HR.getAttribute("value"),true);
		 Reporter.log("Toll="+Toll.getAttribute("value"),true);
		 Reporter.log("Parking="+Parking.getAttribute("value"),true);
		 Reporter.log("Coupon_Discount="+coupon_discount.getAttribute("value"),true); 	
		 Reporter.log("Other_Discount="+other_discount.getAttribute("value"),true); 
		 Reporter.log("Others="+Others.getAttribute("value"),true); 
		 Reporter.log("Final_Cost="+Final_Cost.getAttribute("value"),true); 	
		 Reporter.log("Tax="+Tax.getAttribute("value"),true);		
		 Reporter.log("Final_Cost_WithCost="+Final_Cost_WithTax.getAttribute("value"),true); 
		 Reporter.log("Invoice_Email="+Invoice_Email.getAttribute("value"),true);
		 Reporter.log("Invoice_Person_Name="+Invoice_person_name.getAttribute("value"),true);
		 Reporter.log("Paid_by_Customer_To_RDLY="+Paid_by_Customer_To_RDLY.getAttribute("value"),true); 
		 Reporter.log("Customer_To_Pay="+Customer_To_Pay.getAttribute("value"),true);
		 Reporter.log("Commission_Taken_On="+Commission_Taken_On.getAttribute("value"),true);	
		 Reporter.log("Base_Commission="+Base_Commission.getAttribute("value"),true); 
		 Reporter.log("Discount_to_driver="+Discount_to_driver.getAttribute("value"),true);
		 Reporter.log("Paid_By_RDLY_To_Driver="+Paid_By_RDLY_To_Driver.getAttribute("value") ,true);	 
	     Reporter.log("Driver_To_Pay_To_Rdly"+Driver_To_Pay_To_Rdly.getAttribute("value"),true);
	  }
	  
	  public void SelectDriverAttachment(String ABLRID) throws InterruptedException
	  {
		  //Assigning the driver.
		  DriverAttachment.click();
		  Thread.sleep(2000);
		  DriverABLRfielld.sendKeys(ABLRID);
		  Thread.sleep(2000);
		  DriverABLRfielld.sendKeys(Keys.ENTER);
		  Thread.sleep(2000);
		  DefaultDBLR.click();
		  Thread.sleep(2000);
		  String t = CheckDBLR.getText();
		  if(CheckDBLR.isDisplayed())
			  Reporter.log("Default driver selected is: "+t,true);
		  else
			  Reporter.log("Default driver is not selected"+t,true);	 
		  AssignDriver.click();
		  Thread.sleep(8000);
		  
		  //Checking Booking status.
		  String text=BookingStatus.getText();
		  if(BookingStatus.isSelected())
			Reporter.log("Element is selected and now booking status is: "+text,true);
			else
			Reporter.log("Element is not selected: "+text,true);
	  }
		  
	  public void CancelBooking(int index) throws InterruptedException
	  {
		 GenericUtils.SelectByIndex(SelectBookingstatus, index);
		 Thread.sleep(1000);
		 CancelByRDLY.sendKeys("Wrong Info");
         Submit.click();
         Thread.sleep(3000);
         Alert a=driver.switchTo().alert();
		  Thread.sleep(1000);
		  String text1=a.getText();
		  Reporter.log(text1);
		  a.accept();
		  Thread.sleep(2000);
         String text=BookingStatus.getText();
		  if(BookingStatus.isSelected())
			Reporter.log("Element is selected and now booking status is: "+text,true);
			else
			Reporter.log("Element is not selected: "+text,true);	  
	  }	 
	  public void CancelByDriver(int index)
	  {
		  GenericUtils.SelectByIndex(SelectBookingstatus, 1);
		  GenericUtils.SelectByIndex(CancelDriver, index);
		  UnassignDriver.click();
		  String text=BookingStatus.getText();
		  if(BookingStatus.isSelected())
			Reporter.log("Element is selected and now booking status is: "+text,true);
			else
			Reporter.log("Element is not selected: "+text,true);	  
	  }
	  public void Ongoing() throws InterruptedException
	  {
		  GenericUtils.SelectByIndex(SelectBookingstatus, 4);
		  EnterOTP.sendKeys("1234");
		  Thread.sleep(2000);
		  OpeningKM.sendKeys("100");
		  VerifyOTP.click();
		  
		  Thread.sleep(3000);
		  String text1 = OTPSuccessMSG.getText();
		  if(OTPSuccessMSG.isDisplayed())
			  Reporter.log("OTP MSG= "+text1,true);
		  else
			  Reporter.log("Fail",true);
		  Thread.sleep(5000);
		  String text=BookingStatus.getText();
		  if(BookingStatus.isSelected())
			Reporter.log("Element is selected and now booking status is: "+text,true);
			else
			Reporter.log("Element is not selected: "+text,true);
		   Thread.sleep(2000);		 
	  }
	  
}	  


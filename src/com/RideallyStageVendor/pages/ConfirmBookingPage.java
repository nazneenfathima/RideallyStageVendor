package com.RideallyStageVendor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.RideallyStageVendor.generic.BasePage;

public class ConfirmBookingPage extends BasePage{
	//Declaration
	 @FindBy(xpath="//h2[@class='col-lg-6']")
	 private WebElement ConfirmedBooking;
	  //Initialization
	  public ConfirmBookingPage(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);	
		}
	  
	  //Utilization
	  public void CheckCofirmBooking()
	  {
		  VerifyElement(ConfirmedBooking);
		  Reporter.log("Cab booking is confirmed",true);
	  }
}

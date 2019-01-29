package com.RideallyStageVendor.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.RideallyStageVendor.generic.BasePage;

public class ConfirmBookingPage extends BasePage{
	//Declaration
	 @FindBy(id="booking_status_options")
	 private WebElement ConfirmedBooking;
	 @FindBy(xpath="(//div[contains(.,'RCR')])[1]")
	 private WebElement BookingID;
	 
	  //Initialization
	  public ConfirmBookingPage(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);	
		}
	  
	  //Utilization
	  public void CheckCofirmBooking()
	  {
		  Select sel=new Select(ConfirmedBooking);
		  List<WebElement> aloptions=sel.getOptions();
		  for(int i=0;i<1;i++) 
		  {
		  WebElement options=aloptions.get(i);
		  String text=options.getText();
		  boolean v = ConfirmedBooking.isSelected();
		  if(v)
		  Reporter.log("Element is selected"+text,true);
	      else
		  Reporter.log("Element is not selected"+text,true);
		  }
		  
		 
	  }
}

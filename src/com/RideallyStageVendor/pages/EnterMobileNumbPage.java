package com.RideallyStageVendor.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RideallyStageVendor.generic.BasePage;

public class EnterMobileNumbPage extends BasePage{
  //Declaration
  @FindBy(id="umobile")
  private WebElement EnterMobile;
  
  //Initialization
  public EnterMobileNumbPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}
  
  //Utilization
  public void EnterMobileNumb(String numb) throws InterruptedException
	{
		EnterMobile.sendKeys(numb,Keys.ENTER);
		Thread.sleep(2000);
	}
  

}

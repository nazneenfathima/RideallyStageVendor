package com.RideallyStageVendor.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.RideallyStageVendor.generic.BasePage;

public class BookingListPage extends BasePage 
{
	//Declaration
	@FindBy(xpath="(//i[@class='fa fa-user'])[1]")
	private WebElement accountBTN;
	
    @FindBy(xpath="(//i[@class='fa fa-user'])[1]/../../../..//a[@href='/vendor/index/logout']")
    private WebElement logoutBTN;

    @FindBy(xpath="//span[.='Booking List']")
	private WebElement BookingTitle;
    
    @FindBy(xpath="//i[@class='fa fa-plus nav_icon']")
    private WebElement PlusIcon;

//    @FindBy(xpath="//span[.=' Add New']")
//    private WebElement AddNewBTN;
    
    
    //Initialisation
	public BookingListPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}

	//Utilisation
	public void verifyElementTitle()
	{
		VerifyElement(BookingTitle);
		String text=BookingTitle.getText();
		 Reporter.log("Element Name is:"+text,true);
	}

	public void ClickOnAccount()
	{
		accountBTN.click();
	}
	public void ClickOnLogout()
	{
		logoutBTN.click();
	}
//	public void ClickOnAddNewBTN()
//	{
//		AddNewBTN.click();
//	}
	public void MouseHovertoPlus()
	{
		PlusIcon.click();	
	}
	
}
	


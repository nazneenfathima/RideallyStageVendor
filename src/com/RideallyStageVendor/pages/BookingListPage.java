package com.RideallyStageVendor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RideallyStageVendor.generic.BasePage;

public class BookingListPage extends BasePage 
{
	//Declaration
	@FindBy(xpath="(//i[@class='fa fa-user'])[1]")
	private WebElement accountBTN;
	
	
    @FindBy(xpath="(//i[@class='fa fa-user'])[1]/../../../..//a[@href='/vendor/index/logout']")
    private WebElement logoutBTN;


    //Initialisation
	public BookingListPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}

	//Utilisation
	public void ClickOnAccount()
	{
		accountBTN.click();
	}
	public void ClickOnLogout()
	{
		logoutBTN.click();
	}
}

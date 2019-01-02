package com.RideallyStageVendor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RideallyStageVendor.generic.BasePage;

public class LoginPage extends BasePage 
{
	//Declaration
	@FindBy(id="email")
	private WebElement usernameTB;

	@FindBy(id="inputPassword")
	private WebElement passwordTB;
	
	@FindBy(xpath="//button[.='Login']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//div[.='Invalid Login Details']")
	private WebElement errormessage;	

	//Initialization
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public void verifyPage(String eTitle)
	{
		VerifyTitle(eTitle);
	}
	
	public void enterUserName(String un)
	{
		usernameTB.sendKeys(un);
	}
	
	public void enterPassword(String pwd)
	{
		passwordTB.sendKeys(pwd);
	}
	
	public void clickOnLogin()
	{
		loginBTN.click();
	}
	
	public String verifyErrorMessage()
	{
		VerifyElement(errormessage);
		String aErrMessage = errormessage.getText();
		return aErrMessage;
	}
}

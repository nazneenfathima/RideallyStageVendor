package com.RideallyStageVendor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.RideallyStageVendor.generic.BasePage;
import com.RideallyStageVendor.generic.GenericUtils;

public class ValidCabBookPage extends BasePage
{
    //declaration
	
	//Select Gender
	@FindBy(id="gender")
	private WebElement Gender;
	
	//Select FirstName,LastName, Email
	@FindBy(id="ufirst_name")
	private WebElement FirstName;
	@FindBy(id="ulast_name")
	private WebElement LastName;
	@FindBy(id="uemail_id")
	private WebElement EmailID;
	
	//Pickup & Drop loc 
	@FindBy(id="route_src1")
	private WebElement PickupLoc;
	@FindBy(id="route_src")
	private WebElement PickupBox;
	@FindBy(id="route_dest")
	private WebElement DropBox;
	@FindBy(xpath="//img[@class='flip_loc']")
	private WebElement Flip;
	@FindBy(id="save_route_dest")
	private WebElement SaveLocations;
	
	//All Booking types
	@FindBy(xpath="//img[@alt='Airport']")
	private WebElement AirportBTN;
	@FindBy(xpath="//img[@alt='Point2Point']")
	private WebElement P2PBTN;
	@FindBy(xpath="//img[@alt='4hr 40 km']")
	private WebElement Pack4hr;
	@FindBy(xpath="//img[@alt='6hr 60 km']")
	private WebElement Pack6hr;
	@FindBy(xpath="//img[@alt='8hr 80 km']")
	private WebElement Pack8hr;
	@FindBy(xpath="//img[@alt='12hr 120 km']")
	private WebElement Pack12hr;
	@FindBy(xpath="//img[@alt='16hr 200 km']")
	private WebElement Pack16hr;
	@FindBy(xpath="//img[@alt='250 Km/day']")
	private WebElement Out250;
	@FindBy(xpath="//img[@alt='300 Km/day']")
	private WebElement Out300;
	
	//preferred vehicle type AC/NonAC
	@FindBy(xpath="//label[@class='btn btn-default btn-on btn-xs ac_vehicles']")
	private WebElement ACBTN;	
	@FindBy(xpath="//label[@class='btn btn-default btn-off btn-xs  non_ac_vehicles']")
	private WebElement NonACBTN;
	
	//All Vehicles
	@FindBy(xpath="//img[@alt='Mini AC']")
	private WebElement MiniACBTN;
	@FindBy(xpath="//img[@alt='Sedan AC']")
	private WebElement SedanACBTN;
	@FindBy(xpath="//img[@alt='SUV 6+1 AC']")
	private WebElement SUV6ACBTN;
	@FindBy(xpath="//img[@alt='SUV 7+1 AC']")
	private WebElement SUV7ACBTN;
	@FindBy(xpath="//img[@alt='SUV 9+1 AC']")
	private WebElement SUV9ACBTN;
	@FindBy(xpath="//img[@alt='TT 12+1 AC']")
	private WebElement TT12ACBTN;
	@FindBy(xpath="//img[@alt='Mini Bus 21+1 AC']")
	private WebElement MiniBus21ACBTN;
	@FindBy(xpath="//img[@alt='Mini Bus 25+1 AC']")
	private WebElement MiniBus25ACBTN;
	@FindBy(xpath="//img[@alt='Mini Non AC']")
	private WebElement MiniNonACBTN;
	@FindBy(xpath="//img[@alt='Sedan Non AC']")
	private WebElement SedanNonACBTN;
	@FindBy(xpath="//img[@alt='SUV 6+1 Non AC']")
	private WebElement SUV6NonACBTN;
	@FindBy(xpath="//img[@alt='SUV 7+1 Non AC']")
	private WebElement SUV7NonACBTN;
	@FindBy(xpath="//img[@alt='SUV 9+1 Non AC']")
	private WebElement SUV9NonACBTN;
	@FindBy(xpath="//img[@alt='TT 12+1 Non AC']")
	private WebElement TT12NonACBTN;
	@FindBy(xpath="//img[@alt='Mini Bus 21+1 Non AC']")
	private WebElement MiniBus21NonACBTN;
	@FindBy(xpath="//img[@alt='Mini Bus 25+1 Non AC']")
	private WebElement MiniBus25NonACBTN;
	
	//Payment type Cash & credit
	@FindBy(xpath="//label[@class='btn btn-default btn-off btn-xs  ']")
	private WebElement CreditBTN;
	@FindBy(xpath="//label[@class='btn btn-default btn-on btn-xs']")
	private WebElement CashBTN;
	
	//Select CreatedBy
	@FindBy(id="booked_by")
	private WebElement CreatedBy;

	//Uncheck of Tax
	@FindBy(id="//input[@id='show_invoice_details']")
	private WebElement taxUncheck;
	
	//Tap on confirm Booking
	@FindBy(xpath="//button[.='Confirm Booking']")
	private WebElement ConfirmBooking;
	
	//Start date & Return date
	@FindBy(id="start_date")
	private WebElement StartDate;
	@FindBy(id="return_date")
	private WebElement ReturnDate;
	
	//Select depart time
	@FindBy(id="taxi_ride_time")
	private WebElement DepartTime;
	 @FindBy(xpath="(//a[@class='ui-corner-all'])[6]")
	 private WebElement DepartTimelist;
	 @FindBy(id="taxi_return_time")
	 private WebElement ReturnTime;
	 @FindBy(xpath="(//a[@class='ui-corner-all'])[15]")
	 private WebElement ReturnTimelist;

	
	//Initialisation
	public ValidCabBookPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	
	//Utilisation
	
	//Select Gender
	public void Gender(int index)
	{
		GenericUtils.SelectByIndex(Gender, index);
	}
	//Select FirstName & Last Name
	public void Details(String fn, String ln,String email)
	{
		FirstName.sendKeys(fn);
		LastName.sendKeys(ln);
		EmailID.sendKeys(email);
	}
	
	//Select Pickup & Drop Loc
	public void PickupLoc(String pickup,String drop)
	{
		PickupLoc.click();
		PickupBox.click();
		PickupBox.sendKeys(pickup);
		DropBox.click();
		DropBox.sendKeys(drop);
		SaveLocations.click();
	}

	//All Booking types utilisation
	public void Airport()
	{
		AirportBTN.click();
	}
	public void P2P()
	{
		P2PBTN.click();
	}
	public void Package4hr()
	{
		Pack4hr.click();
	}	
	public void Package6hr()
	{
		Pack6hr.click();
	}	
	public void Package8hr()
	{
		Pack8hr.click();
	}	
	public void Package12hr()
	{
		Pack12hr.click();
	}
	public void Package16hr()
	{
		Pack16hr.click();
	}
	public void Outstation250()
	{
		Out250.click();
	}
	public void Outstation300()
	{
		Out300.click();
	}
	
	//Preferred vehicle type AC/NonAC utilisation
	public void ACButton()
	{
		ACBTN.click();
	}
	public void NonACButton()
	{
		NonACBTN.click();
	}

	//All vehicles utilisation
	public void MiniACBTN()
	{
		MiniACBTN.click();
	}
	public void SedanACBTN()
	{
		SedanACBTN.click();
	}
	public void SUV6ACBTN()
	{
		SUV6ACBTN.click();
	}
	public void SUV7ACBTN()
	{
		SUV7ACBTN.click();
	}
	public void SUV9ACBTN()
	{
		SUV9ACBTN.click();
	}
	public void TT12ACBTN()
	{
		TT12ACBTN.click();
	}
	public void MiniBus21ACBTN()
	{
		MiniBus21ACBTN.click();
	}
	public void MiniBus25ACBTN()
	{
		MiniBus25ACBTN.click();
	}
	public void MiniNonACBTN()
	{
		MiniNonACBTN.click();
	}
	public void SedanNonACBTN()
	{
		SedanNonACBTN.click();
	}
	public void SUV6NonACBTN()
	{
		SUV6NonACBTN.click();
	}
	public void SUV7NonACBTN()
	{
		SUV7NonACBTN.click();
	}
	public void SUV9NonACBTN()
	{
		SUV9NonACBTN.click();
	}
	public void TT12NonACBTN()
	{
		TT12NonACBTN.click();
	}
	public void MiniBus21NonACBTN()
	{
		MiniBus21NonACBTN.click();
	}
	public void MiniBus25NonACBTN()
	{
		MiniBus25NonACBTN.click();
	}
	
	//Paymnet type cash  & credit utilization
	public void PaymentTypeCredit()
	{
		CreditBTN.click();
	}
	public void PaymentTypeCash()
	{
		CashBTN.click();
	}
	
	//Selection of createdby
	public void SelectCreatedBy(int index)
	{
		GenericUtils.SelectByIndex(CreatedBy, 1);
	}
	
	//Uncheck of tax
	public void TaxUncheck()
	{
		taxUncheck.click();
	}
	
	//Clicking of Confirm button
	public void ConfirmButton()
	{
		ConfirmBooking.click();
	}
	
	
	//Selecting of Start Date & Return Date
	public void SelectStartDate()
	{
		StartDate.click();
		GenericUtils.SelecyByStartDate(StartDate);  
	}
	public void SelectReturnDate()
	{
		ReturnDate.click();
		GenericUtils.SelectByReturnDate(ReturnDate, 2);
	}
	
	//Selection of DepartTime & ReturnTime
	public void SelectDepartTime()
	{
		DepartTime.click();
		DepartTimelist.click();
	}
	public void SelectReturnTime()
	{
		ReturnTime.click();
		ReturnTimelist.click();
	}
	
}


	
	
	
	


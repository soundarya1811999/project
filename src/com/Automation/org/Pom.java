package com.Automation.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
    public static WebDriver driver;

	@FindBy(id="username")
    private WebElement username;

	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath ="//input[@type='Submit']")
	private WebElement login;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(name="room_type")
	private WebElement roomtype;
	
	@FindBy(name="room_nos")
	private WebElement roomno ;
	
	@FindBy(name="datepick_in")
	private WebElement datepickin ;
	
	@FindBy(name="datepick_in")
	private WebElement datepick_in ;
	
	@FindBy(name="datepick_out")
	private WebElement datepickout ;
	
	@FindBy(name="datepick_out")
	private WebElement datepick_out ;
	
	@FindBy(name="adult_room")
	private WebElement adultroom ;
	
	@FindBy(name="child_room")
	private WebElement childroom ;
	
	@FindBy(name="Submit")
	private WebElement submit ;
	
	@FindBy(name="radiobutton_0")
	private WebElement radiobutton ;
	
	@FindBy(name="continue")
	private WebElement continuee ;
	
	@FindBy(name="first_name")
	private WebElement firstname ;
	
	@FindBy(name="last_name")
	private WebElement lastname ;
	
	@FindBy(name="address")
	private WebElement address ;
	
	@FindBy(name="cc_num")
	private WebElement ccnum ;
	
	@FindBy(name="cc_type")
	private WebElement cctype ;
	
	@FindBy(name="cc_exp_month")
	private WebElement ccexpmonth ;
	
	@FindBy(name="cc_exp_year")
	private WebElement ccexpyear ;
	
	@FindBy(name="cc_cvv")
	private WebElement cccvv ;


	@FindBy(name="book_now")
	private WebElement booknow ;
	
	@FindBy(name="my_itinerary")
	private WebElement myitinerary ;
	
	@FindBy(name="order_id_text")
	private WebElement orderidtext ;
	
	@FindBy(name="search_hotel_id")
	private WebElement  searchhotelid;


	@FindBy(name="logout")
	private WebElement logout ;



	public  Pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);	
	}
	
	public WebElement getMyitinerary() {
		return myitinerary;
	}
	public WebElement getOrderidtext() {
		return orderidtext;
	}

	public WebElement getSearchhotelid() {
		return searchhotelid;
	}
	
	public WebElement getLogout() {
		return logout;
	}
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getDatepickin() {
		return datepickin;
	}

	public WebElement getDatepick_in() {
		return datepick_in;
	}

	public WebElement getDatepickout() {
		return datepickout;
	}

	public WebElement getDatepick_out() {
		return datepick_out;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinuee() {
		return continuee;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	public WebElement getCccvv() {
		return cccvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}



	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public static WebDriver getDriver() {
		return driver;
	}



}

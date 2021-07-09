package com.Automation.org;

import org.openqa.selenium.By;

public class adactin_project extends Base_class {
	public static void main(String[] args) {
		getBrowser("chrome");
		get("https://adactinhotelapp.com/");
		implicityWait(driver);
		Pom p = new Pom(driver);

		inputOnElement(p.getUsername(), "soundaryaharini18");
		isEnabled(driver.findElement(By.xpath("//input[@name='username']")));
		inputOnElement(p.getPassword(), "Sun5hin@");
		clickOnElement(p.getLogin());
	    dropDown(p.getLocation(),"byValue", "London");
	    dropDown(p.getHotels(), "byVisibleText", "Hotel Sunshine");
	    dropDown(p.getRoomtype(), "byValue", "Deluxe");
	    dropDown(p.getRoomno(), "byIndex", "3");
	    clearOnElement(p.getDatepickin());
	    inputOnElement(p.getDatepick_in(), "10/06/2021");
	    clearOnElement(p.getDatepickout());
	    inputOnElement(p.getDatepick_out(), "15/06/2021");
	    dropDown(p.getAdultroom(), "byIndex", "2");
	    dropDown(p.getChildroom(), "byIndex", "4");
	    clickOnElement(p.getSubmit());
	    clickOnElement(p.getRadiobutton());
	    clickOnElement(p.getContinuee());
	    inputOnElement(p.getFirstname(), "soundarya");
	    inputOnElement(p.getLastname(), "manoharan");
	    inputOnElement(p.getAddress(), "chennai");
	    inputOnElement(p.getCcnum(), "1234567890123456");
	    dropDown(p.getCctype(), "byValue", "VISA");
	    dropDown(p.getCcexpmonth(), "byVisibleText", "May");
	    dropDown(p.getCcexpyear(), "byValue", "2022");
	    inputOnElement(p.getCccvv(), "897");
	    clickOnElement(p.getBooknow());
	    clickOnElement(p.getMyitinerary());
	    inputOnElement(p.getOrderidtext(), "70IY5GSCZ6");
	    clickOnElement(p.getSearchhotelid());
	    clickOnElement(p.getLogout());
	    
	  /*  inputOnElement(p.getSearchhotelid(), "70IY5GSCZ6");
	    clickOnElement(p.getOrderidtext());
	    clickOnElement(p.getLogout());*/
	  
}}

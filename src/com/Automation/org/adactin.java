package com.Automation.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class adactin extends Base_class{
	public static void main(String[] args) {
		
		getBrowser("chrome");
		implicityWait(driver);
		get("https://adactinhotelapp.com/");
		
		WebElement username= driver.findElement(By.id("username"));
		boolean enabled=username.isEnabled();
		System.out.println("enabled or not:" + enabled);
	    inputOnElement(driver.findElement(By.id("username")), "soundaryaharini18");
	    inputOnElement(driver.findElement(By.id("password")), "Sun5hin@");
	    clickOnElement(driver.findElement(By.id("login")));
	    dropDown(driver.findElement(By.id("location")), "byValue", "London");
	    dropDown(driver.findElement(By.id("hotels")), "byVisibleText", "Hotel Sunshine");
	    dropDown(driver.findElement(By.name("room_type")), "byValue", "Deluxe");
	    dropDown(driver.findElement(By.name("room_nos")), "byIndex", "3");
	    clearOnElement(driver.findElement(By.name("datepick_in")));
	    inputOnElement(driver.findElement(By.name("datepick_in")), "10/06/2021");
	    clearOnElement(driver.findElement(By.name("datepick_out")));
	    inputOnElement(driver.findElement(By.name("datepick_out")), "15/06/2021");
	    dropDown(driver.findElement(By.name("adult_room")), "byIndex", "2");
	    dropDown(driver.findElement(By.name("child_room")), "byIndex", "4");
	    clickOnElement(driver.findElement(By.name("Submit")));
	    clickOnElement(driver.findElement(By.name("radiobutton_0")));
	    clickOnElement(driver.findElement(By.name("continue")));
	    inputOnElement(driver.findElement(By.id("first_name")), "soundarya");
	    inputOnElement(driver.findElement(By.id("last_name")), "manoharan");
	    inputOnElement(driver.findElement(By.name("address")), "chennai");
	    inputOnElement(driver.findElement(By.name("cc_num")), "1234567890123456");
	    dropDown(driver.findElement(By.name("cc_type")), "byValue", "VISA");
	    dropDown(driver.findElement(By.name("cc_exp_month")), "byVisibleText", "May");
	    dropDown(driver.findElement(By.name("cc_exp_year")), "byValue", "2022");
	    inputOnElement(driver.findElement(By.name("cc_cvv")), "897");
	    clickOnElement(driver.findElement(By.name("book_now")));
	    //clickOnElement(driver.findElement(By.id("search_hotel")));
	    //clickOnElement(driver.findElement(By.id("my_itinerary")));
	    clickOnElement(driver.findElement(By.id("logout")));
	}

}


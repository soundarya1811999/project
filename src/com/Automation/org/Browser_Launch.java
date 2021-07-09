package com.Automation.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Browser_Launch {
	
	public static void main(String[] args) {
		System.setProperty( "webdriver.chrome.driver",
				"C:\\Users\\manoharan\\eclipse-workspace\\Automation practice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\manoharan\\eclipse-workspace\\Automation practice\\Driver\\msedgedriver.exe");
		
		WebDriver driveredge = new EdgeDriver();
		
		System.setProperty("webdriver.opera.driver",
				"C:\\Users\\manoharan\\eclipse-workspace\\Automation practice\\Driver\\operadriver.exe");
		
		WebDriver opera = new OperaDriver();
	

	}
}

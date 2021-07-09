package com.Automation.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xpath {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manoharan\\eclipse-workspace\\Automation practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.twitter.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement signup = driver.findElement(By.xpath("(//div[@dir='auto'])[3]"));
		signup.click();
		Thread.sleep(3000);
		
	    WebElement name = driver.findElement(By.xpath("//input[@autocapitalize='sentences']"));
		name.sendKeys("soundarya");
	    WebElement number = driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[2]"));
		number.sendKeys("1234567890");
	
		WebElement month = driver.findElement(By.xpath("//select[@id='Month']"));
		
		Select s =new Select(month);
		s.selectByIndex(1);
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.xpath("//select[@id='Day']"));
		
		Select s1 =new Select(day);
		s1.selectByValue("15");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='Year']"));
		
		Select s2=new Select(year);
		s2.selectByVisibleText("1999");
		
		
	}

}

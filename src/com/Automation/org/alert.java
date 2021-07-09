package com.Automation.org;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\manoharan\\eclipse-workspace\\Automation practice\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	/*	driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
	    WebElement simplealert = driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')][1]"));
		simplealert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement alert = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		alert.click();
		Thread.sleep(7000);
		driver.switchTo().alert().accept();
	
        WebElement alert1 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
	    alert1.click();
	    Thread.sleep(2000);
	    driver.switchTo().alert().dismiss();
	    
	    WebElement alert2 = driver.findElement(By.xpath("//button[@id='promtButton']"));
	    alert2.click();
	    Thread.sleep(2000);
	    driver.switchTo().alert().sendKeys("soundarya");
	    driver.switchTo().alert().accept();
	    
	    TakesScreenshot ts =(TakesScreenshot) driver;
	    File faf =ts.getScreenshotAs(OutputType.FILE);
	    File gag =new File("C:\\Users\\manoharan\\eclipse-workspace\\Automation practice\\screenshot\\img.png");
        FileUtils.copyFileToDirectory(faf, gag);*/
	
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		Thread.sleep(4000);
		WebElement signin = driver.findElement(By.xpath("//input[@class='btn btn-default']"));
		signin.click();
		driver.switchTo().alert().accept();
		
	    TakesScreenshot ts =(TakesScreenshot) driver;
	    File faf =ts.getScreenshotAs(OutputType.FILE);
	    File gag =new File("C:\\Users\\manoharan\\eclipse-workspace\\Automation practice\\screenshot\\img.png");
        FileUtils.copyFileToDirectory(faf, gag);
		

	}
	

}

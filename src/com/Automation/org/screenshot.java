package com.Automation.org;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
/*
import java.io.File;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class screenshot {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manoharan\\eclipse-workspace\\Automation practice\\Driver\\chromedriver.exe");
		
	/*	WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target =new File("C:\\Users\\manoharan\\eclipse-workspace\\Automation practice\\screenshot \\img.png");
		FileUtils.copyFileToDirectory(source, target); */
		
	/*	WebDriver drive=new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("http://www.greenstechnologys.com/");
		WebElement sub =drive.findElement(By.xpath("//a[text()='CONTACT US']"));
		sub.click();
		Thread.sleep(3000);
		WebElement name = drive.findElement(By.xpath("//input[@type=\"text\"]"));
		name.sendKeys("soundarya");
		Thread.sleep(3000);
		WebElement email = drive.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("soundarya@gmail.com");	
        WebElement phone = drive.findElement(By.xpath("(//input[@type='text'])[2]"));
        phone.sendKeys("9876123455");
        WebElement course = drive.findElement(By.xpath("//select[@name='courses']"));
        course.sendKeys("selenium");
        WebElement cour = drive.findElement(By.xpath("//option[@value='Dot Net']"));
        cour.click();
        WebElement branch = drive.findElement(By.xpath("//select[@name='branch']"));
        branch.sendKeys("adayar");
        WebElement branchh = drive.findElement(By.xpath("//option[@value='Adyar']"));
        branchh.click();
        WebElement time = drive.findElement(By.xpath("//select[@name='time']"));
        time.sendKeys("three month");
        WebElement timee = drive.findElement(By.xpath("//option[@value='Immediately']"));
        timee.click();
        WebElement message = drive.findElement(By.xpath("//textarea[@name='comments']"));
        message.sendKeys("joining details");     
        WebElement submit = drive.findElement(By.xpath("//button[@id='submit']"));
        submit.click();   
        
        TakesScreenshot ts = (TakesScreenshot) drive;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File("C:\\Users\\manoharan\\eclipse-workspace\\Automation practice\\screenshot\\img.png");
        FileUtils.copyFileToDirectory(source, target);*/
        
	/*	WebDriver drive=new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("http://www.greenstechnologys.com/");
        drive.navigate().to("http://www.greenstechnologys.com/");
        TakesScreenshot screen =(TakesScreenshot) drive;
        File Source =screen.getScreenshotAs(OutputType.FILE);
        File Target =new File("C:\\\\Users\\\\manoharan\\\\eclipse-workspace\\\\Automation practice\\\\screenshot\\\\img.png");
        FileUtils.copyToDirectory(Source, Target);
        
        WebElement policy = drive.findElement(By.xpath("//a[text()=' Privacy Policy']"));
                JavascriptExecutor js =(JavascriptExecutor) drive;
        js.executeScript("arguments[0].scrollIntoView();", policy);
        Thread.sleep(3000);
        WebElement find = drive.findElement(By.xpath("//img[@title='Greens Technology Facebook']"));  
        js.executeScript("arguments[0].scrollIntoView();", find);*/
		
		WebDriver drive =new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
        

        
        
        
        
        
        
	}

}

package com.Automation.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.SingleKeyAction;

public class Frame_concept {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\manoharan\\eclipse-workspace\\Automation practice\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		
		WebElement sf = driver.findElement(By.name("SingleFrame"));
		driver.switchTo().frame(sf);
		WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		text.sendKeys("gud eve");
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		
		WebElement iframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		iframe.click();
		Thread.sleep(2000);	
		
		WebElement outer_frame = driver
				.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		driver.switchTo().frame(outer_frame);
		Thread.sleep(2000);
		
		WebElement inner_frame = driver
				.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(inner_frame);
		Thread.sleep(2000);
		
		WebElement value = driver.findElement(By.xpath("(//input[@type='text'])"));
		value.sendKeys("sound");
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
	}
	

}

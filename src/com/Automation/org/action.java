package com.Automation.org;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ContextClickAction;

public class action {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\manoharan\\eclipse-workspace\\Automation practice\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		Robot r =new Robot();
		
	/*	driver.get("http://www.amazon.in/");
		Thread.sleep(3000);
		
        WebElement bestseller = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
        
        Actions av=new Actions(driver);
        av.contextClick(bestseller).build().perform();
        Robot rr =new Robot();
        rr.keyPress(KeyEvent.VK_DOWN);
        rr.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(3000);
        rr.keyPress(KeyEvent.VK_ENTER);
        rr.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		av.contextClick(mobile).build().perform();
	    rr.keyPress(KeyEvent.VK_DOWN);   
	    rr.keyRelease(KeyEvent.VK_DOWN);
	    Thread.sleep(3000);
        rr.keyPress(KeyEvent.VK_ENTER);
        rr.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        
        WebElement prime = driver.findElement(By.xpath("//a[@id='nav-link-prime']"));
        av.contextClick(prime).build().perform();
        rr.keyPress(KeyEvent.VK_DOWN);
        rr.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        rr.keyPress(KeyEvent.VK_ENTER);
        rr.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
	    
        WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
		av.contextClick(fashion).build().perform();
		rr.keyPress(KeyEvent.VK_DOWN);
		rr.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rr.keyPress(KeyEvent.VK_ENTER);
		rr.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		Set<String> all_id = driver.getWindowHandles();
	    for (String id : all_id) {
			System.out.println(id);
			String title =driver.switchTo().window(id).getTitle();
			System.out.println(title);
		}
	    String actualtitle ="Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
	    for ( String id: all_id) {
	    	if (driver.switchTo().window(id).getTitle().equals(actualtitle)) {
				break;
			}
	}*/
	/*	driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement lang = driver.findElement(By.xpath("//a[text()='English (UK)']"));
		lang.click();
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("soundarya@gmail.com");
		Thread.sleep(2000);
		

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_C);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.click();
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);*/
		
	/*	driver.navigate().to("https://www.google.co.in/webhp");		
		Thread.sleep(2000);
		
		WebElement dot = driver.findElement(By.xpath("//a[@class='gb_C']"));
		dot.click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement gmail = driver.findElement(By.xpath("//span[@class='MrEfLc']"));
		
		ac.contextClick(gmail).build().perform();	
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);*/
		
		driver.get("http//.demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);

		
		
		
	}
}

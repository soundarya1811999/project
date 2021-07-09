package com.Automation.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xpathu2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manoharan\\eclipse-workspace\\Automation practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
	/*  driver.get("https://www.google.com/");
	    WebElement enter = driver.findElement(By.xpath("//input[contains(@class,'gLFyf gsfi')]"));
        enter.sendKeys("greens technology");
        Thread.sleep(3000);*/
		
	/*	driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		
		WebElement from = driver.findElement(By.xpath("//input[@id='src']"));
		from.sendKeys("chennai");
		WebElement to = driver.findElement(By.xpath("//input[@id='dest']"));
		to.sendKeys("bangalore");
		WebElement value = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		value.click();
		WebElement date = driver.findElement(By.xpath("//td[@class='wd day']"));
		date.click();*/
		
	/*  driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("//input[@name='username']"));
		login.sendKeys("soudarya");
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.xpath("//input[@name='password']"));
		username.sendKeys("876555544");
		Thread.sleep(3000);
		WebElement signup = driver.findElement(By.xpath("(//div[contains(@class,'                     Igw0E     IwRSH      eGOV_         _4EzTm')])[4]"));
		signup.click();*/
		
	/*	driver.navigate().to("https://www.snapdeal.com/login");
		WebElement phone = driver.findElement(By.xpath("//input[@type='text']"));
		phone.sendKeys("987654321");
		Thread.sleep(3000);
		
		WebElement click = driver.findElement(By.xpath("//button[@id='checkUser']"));
		click.click();*/
		
	/*	driver.navigate().to("https://www.facebook.com/");
		WebElement phone = driver.findElement(By.xpath("//input[@name='email']"));
		phone.sendKeys("987654321");
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("soundarya");
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();*/
		
	/*	driver.navigate().to("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		username.sendKeys("jikfgjdej");
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		password.sendKeys("987654321");
		
		WebElement login = driver.findElement(By.xpath("//span[contains(@class,'oj-button-text')]"));
		login.click();*/
		
	/*	driver.navigate().to("https://infinity.icicibank.com/corp/Login.jsp");
		WebElement username = driver.findElement(By.xpath("//input[@name='DUMMY1']"));
		username.sendKeys("soundarya");
		Thread.sleep(3000);
	
		
		WebElement login = driver.findElement(By.xpath("//a[@title='Create UserId']"));
		login.click();*/
		
	/*	driver.navigate().to("https://netbanking.hdfcbank.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@class,'input_password')]"));
		username.sendKeys("soundarya");
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.xpath("//img[@alt='continue']"));
		login.click();*/
		
	/*	driver.navigate().to("https://www.swiggy.com");
		WebElement enter = driver.findElement(By.xpath("//input[@name='location']"));
		enter.sendKeys("arumbakkam");
        Thread.sleep(3000);
        
        WebElement find = driver.findElement(By.xpath("//a[contains(@class,'_3iFC5')]"));
        find.click();*/
		
		driver.navigate().to("https://www.irctc.co.in/");
		WebElement ok = driver.findElement(By.xpath("//button[@type='submit']"));
		ok.click();
		Thread.sleep(3000);
		WebElement from = driver.findElement(By.xpath("//input[@aria-autocomplete='list']"));
		from.sendKeys("madurai");
		Thread.sleep(3000);
	    WebElement to = driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[2]"));
		to.sendKeys("chennai");
		Thread.sleep(2000);
		WebElement allclass = driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c66-11')]"));
        allclass.click();
        Thread.sleep(2000);
        WebElement general = driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c66-12')]"));
		general.click();
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("/button[@type='submit']"));
		search.click();
		Thread.sleep(2000);
		
	/*	driver.navigate().to("https://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("soundarya");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("987654321");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();
		Thread.sleep(3000);*/
		
	/*	driver.get("https://www.twitter.com/");
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
		s2.selectByVisibleText("1999");	*/
	}
}

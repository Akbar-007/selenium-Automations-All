package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class AllMethods {
	public static void main(String[] args) throws InterruptedException {
		//webDriver methods
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		String currenturl = driver.getCurrentUrl();
	    driver.getCurrentUrl();
	    System.out.println("this page currenturl : "+currenturl );
	    driver.getPageSource();
	    System.out.println(driver.getPageSource());
	    
	    //navigation methos
	    Thread.sleep(4000);
	    driver.navigate().to("https://www.instagram.com/accounts/login/");
	    Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.navigate().forward();
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    
	    
	    
	    //manage command
	    driver.manage().window().maximize();
	    Dimension size=driver.manage().window().getSize();
	    System.out.println(size);
	    
	    
	    
	    
	    
	    
	    
	    
	}

}

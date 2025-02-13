package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Imagetouch {
	public static void main(String[] args) {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.co.in/");
	  
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.id("hplogo")).click();
			  
	}

}

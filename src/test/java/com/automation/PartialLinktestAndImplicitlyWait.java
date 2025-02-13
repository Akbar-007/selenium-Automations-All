package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinktestAndImplicitlyWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://my.microfocus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.manage().getCookies();
		driver.findElement(By.partialLinkText("login")).click();
		driver.findElement(By.id("username")).sendKeys("akbar007");
		
		
	}
}

package com.automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectionandDeselection {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/att_select_multiple.asp");
		driver.findElement(By.xpath("//a[@class='w3-btn w3-margin-bottom']")).click();
		
		Set<String> allwindows=driver.getWindowHandles();
		for(String windows:allwindows) {
		driver.switchTo().window(windows);
		}
		driver.switchTo().frame("iframeResult");
		
		WebElement listcars = driver.findElement(By.id("cars"));
		
	    Select select = new Select (listcars);
	    select.selectByIndex(0);
		
		Thread.sleep(2000);
		
		select.selectByVisibleText("Saab");
		
		Thread.sleep(2000);
		
		select.selectByValue("audi");
		
		Thread.sleep(5000);
		
		select.deselectByValue("audi");
		
		Thread.sleep(2000);
		
		select.deselectByIndex(0);
		
		Thread.sleep(2000);
		
	    select.deSelectByContainsVisibleText("Saab");
	    
	    Thread.sleep(2000);

		driver.quit();
		
		
		
		
		
	}

}

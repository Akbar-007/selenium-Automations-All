package com.automation;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EnterKeyss {
	 public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.apsrtconline.in/oprs-web/");
		WebElement txtfrom = driver.findElement(By.id("fromPlaceName"));
		
		Actions action = new Actions(driver);
		
		action.sendKeys(txtfrom, "CHEN").perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.ARROW_DOWN).perform();
		action.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.ENTER).perform();
		
		WebElement txtTo = driver.findElement(By.xpath("//input[@type='text'][2]"));
		action.sendKeys(txtTo, "pon").perform();
		action.sendKeys(Keys.ARROW_DOWN).perform();
		action.sendKeys(Keys.ARROW_DOWN).perform();
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
	    WebElement dateform = driver.findElement(By.id("txtJourneyDate"));
	    dateform.click();
	     
	    driver.findElement(By.xpath("(//a[@class='ui-state-default'])[3]")).click();
	    
	    driver.findElement(By.xpath("(//a[@class='ui-state-default'])[5]")).click();
	    
	    WebElement checkava = driver.findElement(By.id("searchBtn"));
	    checkava.click();
	    
	    
	    
		
		
		
		
		
		
	}

}

package com.automation;


import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		 
		  WebDriver driver = new ChromeDriver(); 
		 
		  driver.manage().window().maximize(); 
		 
		  driver.get("http://hamcrest.org/JavaHamcrest/javadoc/2.2/"); 
//		  two ways possible
		  driver.switchTo().frame(0);
//		  driver.switchTo().frame("packageListFrame");
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("org.hamcrest")).click(); 
		  driver.switchTo().defaultContent();
		  Thread.sleep(2000);
		  driver.switchTo().frame(1);
		  driver.findElement(By.xpath("//span[text()='Matcher']")).click();
		  Thread.sleep(2000);
		  driver.switchTo().defaultContent();
		  driver.switchTo().frame(2);
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("IsCollectionWithSize")).click();
		  Thread.sleep(2000);
//		  driver.quit();  
	 } 
	}

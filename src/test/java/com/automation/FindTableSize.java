package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTableSize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qavbox.github.io/demo/webtable/"); 
		System.out.println("tables :"+ driver.findElements(By.xpath("//table")).size());
		Thread.sleep(5000);
		driver.quit();
	}

}

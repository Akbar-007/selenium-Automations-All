package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_method {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://datatables.net/");
		driver.manage().window().maximize();
		
		System.out.println("#tables "+ driver.findElements(By.xpath("//Table")).size());
		System.out.println("#Row "+ driver.findElements(By.xpath("//div[@class='hero-callout']//tr")).size());
		System.out.println("#Table body Rows " + driver.findElements(By.xpath("//div[@class='hero-callout']//tbody//tr")).size());
		System.out.println("#colums"+ driver.findElements(By.xpath("//div[@class='hero-callout']//thead/td")).size());
		System.out.println("#Row 1"+ driver.findElements(By.xpath("(//div[@class='hero-callout']//tr)[1]//th")).size());
		
		
	}

}

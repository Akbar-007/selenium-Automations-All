package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchCaseTest {
	public static void main(String[] args) {
		WebDriver driver = null;
		
		System.out.println("start");
		
		String input = "firefox";
		
		switch (input) {
		case "chrome":
			driver = new ChromeDriver();			
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
		    break;
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.quit();
	}

}

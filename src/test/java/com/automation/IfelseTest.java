package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxCommandContext;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IfelseTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		System.out.println("start");
		
        String input = "edge";
        Thread.sleep(2000);
        if(input.equals("chrome")) {
        	driver = new ChromeDriver();
        }
        else if (input.equals("firefox")) {
        	driver = new FirefoxDriver();			
		}
        else if (input.equals("edge")) {
        	driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.quit();
        
		
	}

}

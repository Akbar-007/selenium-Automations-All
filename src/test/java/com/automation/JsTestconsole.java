package com.automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsTestconsole {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://emicalculator.net/");
		
//		((JavascriptExecutor)driver).executeScript("document.getElementById('loanamount').value=300000;");
		
		((JavascriptExecutor)driver).executeScript("document.getElementsByName('loanamount').value=300000;");
		
	}

}

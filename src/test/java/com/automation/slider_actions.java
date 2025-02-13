package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider_actions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
//		WebElement sliders = driver.findElement(By.tagName("span"));
//		Actions action = new Actions(driver);
//		action.dragAndDropBy(sliders, 525, 0).perform();
//		Thread.sleep(2000);
		
		 WebElement slider = driver.findElement(By.tagName("span"));
	        
	        // Get slider size
	        int sliderWidth = slider.getSize().getWidth();
	        int sliderHeight = slider.getSize().getHeight();
	        
	        System.out.println("Slider Width: " + sliderWidth + " pixels");
	        System.out.println("Slider Height: " + sliderHeight + " pixels");
		
		
		
		
		
		 
	}

}

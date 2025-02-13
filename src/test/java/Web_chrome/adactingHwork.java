package Web_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class adactingHwork {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 
	    driver.get("https://adactinhotelapp.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.className("login_register")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("username")).sendKeys("mohamed");
	    Thread.sleep(2000);
	    driver.findElement(By.id("password")).sendKeys("6754");
	    Thread.sleep(2000);
	    driver.findElement(By.id("re_password")).sendKeys("6754");
	    Thread.sleep(2000);
	    driver.findElement(By.id("full_name")).sendKeys("mohamed akbar");
	    Thread.sleep(2000);
	    driver.findElement(By.id("email_add")).sendKeys("a.mdakbar@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.id("captcha-form")).sendKeys("laager");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("Submit")).click();
	    Thread.sleep(3000);
	    driver.close();
	    
	    
	}

}

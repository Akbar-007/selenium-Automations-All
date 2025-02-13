package Web_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addemp {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		
		WebElement log = driver.findElement(By.xpath("//button[@type='submit']"));
		log.click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[2]")).click();
//		WebElement pim = driver.findElement(By.linkText("PIM"));
//		pim.click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add Employee")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.name("firstName")).sendKeys("mohamed");
		Thread.sleep(2000);

		driver.findElement(By.name("lastName")).sendKeys("akbar");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		driver.quit();
		Thread.sleep(2000);
		
	}

}

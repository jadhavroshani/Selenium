package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit {
	
	public static void main(String []args) throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROSGAJAN\\Desktop\\Automation\\Selenium\\selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("admin");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("successfully done");
	
		driver.findElement(By.cssSelector("input[id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input[class='button']")).click();
		
		driver.close();
	    
	    driver.quit();
	    System.out.println("successfully done");
	}
	
	

}

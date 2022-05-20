package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class name 
{
	public static void main(String []agrs) throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROSGAJAN\\Desktop\\Automation\\Selenium\\selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();	
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
		driver.findElement(By.name("txtUsername")).click();
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtUsername")).click();
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		Thread.sleep(3000);
	
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.name("Submit")).click();
	

		
		
	
	}

}

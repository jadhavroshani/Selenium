package exceptionHanding;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class methodofException {
	
	
	
	public static void main(String[] args) throws Exception{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROSGAJAN\\Desktop\\Automation\\Selenium\\selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		//WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.google.com" );
		try{
		driver.findElement(By.xpath("//*[@id='register']")).click();
		}catch (Exception e) {
		System.out.println("Register element is not found.");
		throw(e);
		}
		System.out.println("Register element is found.");
		}

}

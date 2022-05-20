package alertPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {


public static void main(String[] args) throws NoAlertPresentException,InterruptedException { 
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ROSGAJAN\\Desktop\\Automation\\Selenium\\selenium\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://www.browserstack.com/users/sign_up");

driver.findElement(By.id("user_full_name")).sendKeys("username"); driver.findElement(By.id("input-lg text user_email_ajax")).sendKeys("username.xyz.net");
driver.findElement(By.id("user_password")).sendKeys("Your_Password");
driver.findElement(By.id("user_submit")).click();

Thread.sleep(5000);

Alert alert = driver.switchTo().alert(); // switch to alert

String alertMessage= driver.switchTo().alert().getText(); // capture alert message

System.out.println(alertMessage); // Print Alert Message
Thread.sleep(5000);
alert.accept(); 
}
}
package alertPopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertgetText {
	   public static void main(String[] args) {
		   WebDriver driver;
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ROSGAJAN\\Desktop\\Automation\\Selenium\\selenium\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.manage().window().maximize();
		      //implicit wait
		      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		      //URL launch
		      driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		      
		      WebElement l = driver.
		      findElement(By.xpath("//*[text()='Click for JS Alert']"));
		      l.click();
		     
		      Alert a = driver.switchTo().alert();
		    
		      String s= driver.switchTo().alert().getText();
		      System.out.println("Alert text is: " + s);
		     
		      a.accept();
		      driver.quit();
		   }
		
}

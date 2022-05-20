package alertPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertdismiss {

	public static void main(String[] args) {  



		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROSGAJAN\\Desktop\\Automation\\Selenium\\selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();


        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");   
  
        driver.findElement(By.linkText("Generate Alert Box")).click();  
          
        Alert alert = (Alert) driver.switchTo().alert();          
        Alert confirmBox = (Alert) driver.switchTo().alert();     
        ((Alert) confirmBox).dismiss();  
  
  
      
    }  
}

package alertPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Alertaccept {
	
	public static void main(String[] args) {  
        
    
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROSGAJAN\\Desktop\\Automation\\Selenium\\selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
     
          
  
    
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");   
  
        driver.findElement(By.linkText("Generate Alert Box")).click();  
      
        Alert alert = (Alert) driver.switchTo().alert();  
          
      
        alert.accept();  
      
        driver.findElement(By.linkText("Generate Confirm Box")).click();  
          
         
      
    }  
}

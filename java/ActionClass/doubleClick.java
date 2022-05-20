package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String []args)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROSGAJAN\\Desktop\\Automation\\Selenium\\selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/open-source/demo/");
		WebElement option= driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[1]/a"));
		Actions action= new Actions(driver);
		WebElement elementLocator = driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[3]/li[1]/a"));
		action.doubleClick(elementLocator).perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit();
		
		
	}
}

package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class visible {

	public static void main(String []args) throws InterruptedException
	{
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROSGAJAN\\Desktop\\Automation\\Selenium\\selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();


		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		Actions actions = new Actions(driver);

		WebElement option = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));

		actions.moveToElement(option).perform();

		System.out.println("Done Mouse hover");

		Thread.sleep(3000);


		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[1]/a")).click();

		System.out.println("sub menu 'T-shirts is selected");
		
		
		
		Select jobrole = new Select(driver.findElement(By.id("selectProductSort")));
			
			jobrole.selectByVisibleText("Price: Highest first");
			 
		    driver.close();
		    
		    driver.quit();
		    System.out.println("successfully done");
			

		
		
	}

}

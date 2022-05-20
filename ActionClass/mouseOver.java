package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOver 
{
	public static void main(String []args) throws InterruptedException
	{

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROSGAJAN\\Desktop\\Automation\\Selenium\\selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();


		/***********************************Login to the website.  ****************************************/

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");



		/********************************* Move your cursor over Women's link *************************************/

		//Instantiate Action Class        

		Actions actions = new Actions(driver);
		//Retrieve WebElement 'Women' to perform mouse hover 

		WebElement option = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));
		//Mouse hover option 'women'

		actions.moveToElement(option).perform();

		System.out.println("Done Mouse hover");

		Thread.sleep(3000);
		System.out.println("done");
		driver.quit();
	}

}

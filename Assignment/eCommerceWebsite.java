package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class eCommerceWebsite 
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



		/********************************* click on sub menu 'T-shirts' *************************************/

		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[1]/a")).click();

		System.out.println("sub menu 'T-shirts is selected");



		/********************************* Mouse hover on the second product displayed. *************************************/

		WebElement TshirtOption = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img"));
		//Mouse hover product

		actions.moveToElement(TshirtOption).perform();

		System.out.println("Done Mouse hover");


		/********************************* More' button will be displayed, click on 'More' button. *************************************/

		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[2]")).click();

		System.out.println("done(more button)");

		/*********************************Increase quantity to 2.  *************************************/

		driver.findElement(By.id("quantity_wanted")).clear();
		driver.findElement(By.id("quantity_wanted")).click();
		driver.findElement(By.id("quantity_wanted")).sendKeys("2");

		System.out.println("Quantity is selected");


		/********************************* Select size 'L'***********************************/

		Select size = new Select(driver.findElement(By.id("group_1")));
		size.selectByVisibleText("L");
		System.out.println("size is selected");

		/*********************************  Select colour.*************************************/

		driver.findElement(By.id("color_14")).click();
		System.out.println("color is selected");



		/*******************************Click 'Add to Cart' button.*************************************/

		driver.findElement(By.name("Submit")).click();
		System.out.println("Add to cart done");

		/*******************Click 'Proceed to checkout' button.***********************/

		//driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a")).click();
		 driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();		    
		 driver.close();		    
		 driver.quit();
		 System.out.println("successfully done");


	}

}

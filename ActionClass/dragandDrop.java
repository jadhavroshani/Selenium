package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragandDrop {
	public static void main(String[] args) throws InterruptedException {		
		
		 
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROSGAJAN\\Desktop\\Automation\\Selenium\\selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		 
		
		 
		driver.get("https://demoqa.com/droppable/");
		 
		driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		


		Actions builder = new Actions(driver);
		 
		WebElement from = driver.findElement(By.id("draggable"));
		Thread.sleep(3000);
		 
		WebElement to = driver.findElement(By.id("droppable"));	 

		builder.dragAndDrop(from, to).perform();
		Thread.sleep(3000);


		String textTo = to.getText();

		if(textTo.equals("Dropped!")) {
			System.out.println("PASS: Source is dropped to target as expected");
		}else {
			System.out.println("FAIL: Source couldn't be dropped to target as expected");
		}
		Thread.sleep(3000);
		driver.close();

	}	
}

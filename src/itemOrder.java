import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class itemOrder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Seleninum\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String item = "Cucumber";
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000L);
		List<WebElement> name = driver.findElements(By.cssSelector(".product-name"));
		
		
		for(int i=0; i<name.size();i++)
		{
			String productneeded = name.get(i).getText();
			
			if (productneeded.contains(item))
			{
			driver.findElement(By.xpath("//button[@type='button']")).click();
		}
		}
		
		
	}

}

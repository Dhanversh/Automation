
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class NewOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Seleninum\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String[] item = {"Cucumber"};
		
		List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));
		
		for (int i =0; i<products.size(); i++)
		{
			String[] name = products.get(i).getText().split("-");
			String exactName = name[0].trim();
			List itemNeeded = Arrays.asList(item);
			
			if (itemNeeded.contains(exactName))
			{
				driver.findElements(By.cssSelector("button[type='button']")).get(i).click();
			}
		}
		
	}

}

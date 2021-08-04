import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Seleninum\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String[] item = {"Cucumber", "Brocolli"};
		List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));
		
		for (int i=0; i<products.size(); i++)
		{
					String[] name = products.get(i).getText().split("-");
					String formattedName = name[0].trim();
					
			 List itemNeeded = Arrays.asList(item);
			
			if(itemNeeded.contains(formattedName))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				
			}
			
			
		}
		
	}

}

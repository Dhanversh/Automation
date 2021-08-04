import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderWebPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Seleninum\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
		String[] itemsNeeded = {"Cucumber","Brocolli"};
		List <WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		
		
		
		for (int i=0; i<product.size(); i++ )
		{
			String[] productneeded = product.get(i).getText().split("-");
			String formattedName = productneeded[0].trim();
			List itemsreq = Arrays.asList(itemsNeeded);
			
			if (itemsreq.contains(formattedName) )
				
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		
			}
			
		}
		
		
		
		
	}

}

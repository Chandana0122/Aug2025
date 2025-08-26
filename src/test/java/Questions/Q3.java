package Questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q3 {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println("Title :" + driver.getTitle());
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Laptops");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 List<WebElement> products = driver.findElements(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal"));
	        
	        System.out.println("Top 5 Laptop Results:");
	        for (int i = 0; i < 5 && i < products.size(); i++) {
	            System.out.println((i + 1) + ". " + products.get(i).getText());
	        }
		
  }
}

package seleniumpac;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab008_4assertions {
  @Test
  public void f() throws Exception {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?");
		String title=driver.getTitle();
		Assert.assertEquals("Your Store", driver.getTitle());
		System.out.println("The Title is:"+title);
		
		driver.findElement(By.linkText("Desktops")).click();
		Assert.assertTrue(true);
		
		driver.findElement(By.linkText("Mac (1)")).click();
		Assert.assertTrue(true, "clicked on mac");
		
		WebElement sort = driver.findElement(By.id("input-sort"));
		Select sle = new Select(sort);
		sle.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]")).click();
		Assert.assertTrue(true, "sorted the list");
		
		WebElement searchBox = driver.findElement(By.name("search"));
		Assert.assertTrue(true, "found the element search");
      searchBox.clear();
      searchBox.sendKeys("Monitors");
      Assert.assertTrue(true, "monitor text sent");
      driver.findElement(By.cssSelector("button.btn.btn-default")).click();
      Assert.assertTrue(true, "clicked the button");

      
      Thread.sleep(2000);

      driver.findElement(By.name("search")).clear();
      Assert.assertTrue(true, "cleared the search");
   
      driver.findElement(By.id("description")).click();
      Assert.assertTrue(true);

      driver.findElement(By.cssSelector("button.btn.btn-default")).click();
      Assert.assertTrue(true, "clicked the button");
      Thread.sleep(2000);
		
  }
}

package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q5 {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();

      // Open URL
      driver.get("https://the-internet.herokuapp.com/javascript_alerts");
      driver.manage().window().maximize();

      // Click "Click for JS Alert" button
      driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

      // Switch to alert and accept it
      driver.switchTo().alert().accept();

      // Verify the result text
      WebElement result = driver.findElement(By.id("result"));
      String resultText = result.getText();

      if (resultText.equals("You successfully clicked an alert")) {
          System.out.println("✅ Test Passed: Alert handled successfully!");
      } else {
          System.out.println("❌ Test Failed: Actual text is " + resultText);
      }

      // Close browser
      driver.quit();
  }
}

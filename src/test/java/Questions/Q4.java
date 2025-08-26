package Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q4 {
  @Test
  public void f() {
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();

      // Open URL
      driver.get("https://www.selenium.dev/selenium/web/web-form.html");
      driver.manage().window().maximize();

      // Locate dropdown
      WebElement dropdownElement = driver.findElement(By.name("my-select"));

      // Create Select object
      Select dropdown = new Select(dropdownElement);

      // ✅ Select by visible text (correct option name is "Two")
      dropdown.selectByVisibleText("Two");

      // Verify selected option
      WebElement selectedOption = dropdown.getFirstSelectedOption();
      String selectedText = selectedOption.getText();

      // Using TestNG assertion instead of if-else
      Assert.assertEquals(selectedText, "Two", "Dropdown selection failed!");

      System.out.println("✅ Test Passed: 'Two' is selected.");

      // Close browser
      driver.quit();
  }
}

package seleniumpac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC0014 {
	@Parameters("browser")
	  @Test
	  public void test2(String browser) {
		  if(browser.equalsIgnoreCase("chrome"))
		  {
		  System.out.println("This is chrometest");
		  WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
		  }
		  else if(browser.equalsIgnoreCase("firefox"))
				  {
			  System.out.println("This is firefoxtest");
			  WebDriverManager.firefoxdriver().setup();
				WebDriver driver=new FirefoxDriver();
				driver.get("https://www.flipkart.com/");
				  }
		  else if(browser.equalsIgnoreCase("edge"))
		  {
	  System.out.println("This is edgetest");
	  WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		  }
	 
				  
	  }
	}
/*
 * <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite" parallel='tests'  thread-count="2">
  <test thread-count="5" name="chrometest">
  <parameter name="browser" value="chrome" />
    <classes>
      <class name="seleniumpac.TC0014"/>
       </classes>
  </test> <!-- Test -->
    <test thread-count="5" name="firefoxtest">
      <parameter name="browser" value="firefox" />
    <classes>
      <class name="seleniumpac.TC0014"/>
       </classes>
  </test> <!-- Test -->
    <test thread-count="5" name="edgetest">
      <parameter name="browser" value="edge" />
    <classes>
      <class name="seleniumpac.TC0014"/>
       </classes>
  </test> <!-- Testing1 -->
</suite> <!-- Suite -->

 */

	
 
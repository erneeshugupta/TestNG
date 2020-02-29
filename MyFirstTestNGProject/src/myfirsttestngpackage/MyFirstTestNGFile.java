package myfirsttestngpackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class MyFirstTestNGFile {
public WebDriver driver;

@BeforeTest
public void beforeTest() 
  { System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
	  driver = new ChromeDriver();  
	}
	
  @Test  (priority=1)
  public void openUrl () {
System.out.println("Hi");
 driver.get("http://www.gmail.com"); 
	}
  
  @Test  (priority=2)
  public void login () {
	  System.out.println("Hi 2");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	  WebElement searchBox = driver.findElement(By.name("identifier"));
		 searchBox.sendKeys("er.neeshugupta@gmail.com");
		 
		 WebElement button = driver.findElement(By.id("identifierNext"));
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		button.click();
	} 


 /* @AfterTest
  public void afterTest() { driver.close();
  }*/

}

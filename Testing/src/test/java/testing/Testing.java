package testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Testing {
	WebDriver driver;
	  @Test
	  public void login() {
		  driver.findElement(By.name("userName")).sendKeys("sunil");
		  driver.findElement(By.name("password")).sendKeys("sunil");
		  
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.gecko.driver", "E:\\Gecofriver for BDD Firefox\\geckodriver.exe");
		  driver= new FirefoxDriver();
		  driver.get("http://newtours.demoaut.com/");
		  
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }


}

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
		  driver.findElement(By.name("uname")).sendKeys("admin");
		  driver.findElement(By.name("psw")).sendKeys("pass");
		  driver.findElement(By.xpath("//*[@type='submit']")).click();
		  System.out.println("Sucessful");
		  String breakpoint=driver.findElement(By.tagName("h2")).getText();
		  Assert.assertEquals(breakpoint, "Prolearn");
		  
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");  //"E:\\geckodriver-v0.20.1-win64\\geckodriver.exe"
		  driver= new FirefoxDriver();
		  driver.get("http://http://ec2-18-222-145-43.us-east-2.compute.amazonaws.com:8090/TestWebapp");
		  
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }


}

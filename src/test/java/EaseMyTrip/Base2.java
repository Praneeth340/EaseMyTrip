package EaseMyTrip;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.Select;

public class Base2 {
	static WebDriver driver;
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
			 driver=new ChromeDriver(new ChromeOptions().addArguments("--disable-notifications"));
			 driver.manage().deleteAllCookies();
	  }

	  @AfterTest
	  public void afterTest() throws Exception {
		  Thread.sleep(2000);

			driver.quit();
	  }

}

package EaseMyTrip;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PropertyExample1 {
	static WebDriver driver;
	Properties prop= new Properties();


	  @BeforeTest
	  public void beforeTest() throws Exception {
		  Thread.sleep(3000);

	  }

	  @AfterTest
	  public void afterTest() throws Exception {
		  Thread.sleep(3000);

			driver.quit();
	  }
 
  @Test(priority=1,enabled=true,description="Invalid Mail Id")
  public void TC36() throws Exception {
	  prop.load(new FileInputStream("setting1.property"));
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		 driver=new ChromeDriver(new ChromeOptions().addArguments("--disable-notifications"));
		 driver.get(prop.getProperty("url"));


	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//li[@class='click-mul border-rht mul-hid']")).click();//it will click on multiway
		
	    driver.findElement(By.xpath("//input[@id='FromSector-mul1_show']")).click();
	
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@id='FromSector-mul1_show']")).sendKeys(prop.getProperty("source1"));// entering source1 city
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='FromSector-mul1_show']")).sendKeys(Keys.ENTER);
	     Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='ToSector-mul1_show']")).click();
		driver.findElement(By.xpath("//input[@id='ToSector-mul1_show']")).sendKeys(prop.getProperty("destination1"));//entering destination1 & source2 city 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ToSector-mul1_show']")).sendKeys(Keys.ENTER);
	     Thread.sleep(1000);


	
	     driver.findElement(By.xpath("//input[@id='ToSector-mul2_show']")).click();
	     driver.findElement(By.xpath("//input[@id='ToSector-mul2_show']")).sendKeys(prop.getProperty("destination2"));//entering destination2 city
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[@id='ToSector-mul2_show']")).sendKeys(Keys.ENTER);
	     Thread.sleep(1000);

	
	    WebElement E1=driver.findElement(By.xpath("//input[@id='ddateMul1']"));//selecting date1
		E1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='10']")).click();
		
		
		
		  WebElement E2=driver.findElement(By.xpath("//input[@id='ddateMul2']"));//selecting date 2
		  E2.click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		  driver.findElement(By.xpath("//a[normalize-space()='11']")).click();
		 Thread.sleep(3000);

		 
		
		  driver.findElement(By.xpath("//a[@class='dropbtn_n']")).click();
			 driver.findElement(By.cssSelector("div[class='mobile-wi1-multi mul-sho'] div[class='innr_pnl'] div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1) input:nth-child(1)")).click();
			 driver.findElement(By.cssSelector("body > form:nth-child(8) > div:nth-child(9) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
			 driver.findElement(By.cssSelector("div[class='mobile-wi1-multi mul-sho'] div:nth-child(3) div:nth-child(2) div:nth-child(1) div:nth-child(1) input:nth-child(1)")).click();
		 
		  driver.findElement(By.xpath("//div[@class='mobile-wi1-multi mul-sho']//div[@class='innr_pnl']//div[1]//div[2]//div[1]//div[3]//input[1]")).click();//adding adults
		  driver.findElement(By.xpath("//div[@class='mobile-wi1-multi mul-sho']//div[2]//div[2]//div[1]//div[3]//input[1]")).click();//adding childs
		 driver.findElement(By.xpath("//div[@class='mobile-wi1-multi mul-sho']//div[3]//div[2]//div[1]//div[3]//input[1]")).click();//adding infants
		  driver.findElement(By.xpath("//div[@id='myDropdown_n2']//label[@class='cont_flt'][normalize-space()='Business']//span[@class='chk_flt']")).click();//adding class
		  driver.findElement(By.xpath("//div[@id='myDropdown_n2']//a[@class='dn_btn'][normalize-space()='Done']")).click();
		  Thread.sleep(1000);
	
			  
			  driver.findElement(By.xpath("//input[@onclick='ValidateMuticity();']")).click();//clicking on search
			  Thread.sleep(20000);
			  driver.findElement(By.xpath("//div[5]//div[2]//div[1]//div[2]//div[1]//div[2]//button[1]")).click();//selecting a particular flight
		  driver.findElement(By.xpath("//input[@id='txtEmailId']")).sendKeys(prop.getProperty("mailid"));
		  driver.findElement(By.xpath("//span[@id='spnVerifyEmail']")).click();
		  
		  WebElement E36= driver.findElement(By.xpath("//span[normalize-space()='Please enter a valid email Id']"));
		  String alert36=E36.getText();
		  Assert.assertEquals("Please enter a valid email Id", alert36);
		  System.out.println(alert36);

}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  @Test(priority=2,enabled=true,description="Invalid Coupon")
  public void TC37() throws Exception {
	  prop.load(new FileInputStream("setting1.property"));
			System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));


		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//li[@class='click-mul border-rht mul-hid']")).click();//it will click on multiway
			
		    driver.findElement(By.xpath("//input[@id='FromSector-mul1_show']")).click();
		
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//input[@id='FromSector-mul1_show']")).sendKeys(prop.getProperty("source1"));// entering source1 city
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//input[@id='FromSector-mul1_show']")).sendKeys(Keys.ENTER);
		     Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@id='ToSector-mul1_show']")).click();
			driver.findElement(By.xpath("//input[@id='ToSector-mul1_show']")).sendKeys(prop.getProperty("destination1"));//entering destination1 & source2 city 
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='ToSector-mul1_show']")).sendKeys(Keys.ENTER);
		     Thread.sleep(1000);


		
		     driver.findElement(By.xpath("//input[@id='ToSector-mul2_show']")).click();
		     driver.findElement(By.xpath("//input[@id='ToSector-mul2_show']")).sendKeys(prop.getProperty("destination2"));//entering destination2 city
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//input[@id='ToSector-mul2_show']")).sendKeys(Keys.ENTER);
		     Thread.sleep(1000);

		
		    WebElement E1=driver.findElement(By.xpath("//input[@id='ddateMul1']"));//selecting date1
			E1.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			driver.findElement(By.xpath("//a[normalize-space()='10']")).click();
			
			
			
			  WebElement E2=driver.findElement(By.xpath("//input[@id='ddateMul2']"));//selecting date 2
			  E2.click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			  driver.findElement(By.xpath("//a[normalize-space()='11']")).click();
			 Thread.sleep(3000);

			 
			
			  driver.findElement(By.xpath("//a[@class='dropbtn_n']")).click();
				 driver.findElement(By.cssSelector("div[class='mobile-wi1-multi mul-sho'] div[class='innr_pnl'] div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1) input:nth-child(1)")).click();
				 driver.findElement(By.cssSelector("body > form:nth-child(8) > div:nth-child(9) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
				 driver.findElement(By.cssSelector("div[class='mobile-wi1-multi mul-sho'] div:nth-child(3) div:nth-child(2) div:nth-child(1) div:nth-child(1) input:nth-child(1)")).click();
			 
			  driver.findElement(By.xpath("//div[@class='mobile-wi1-multi mul-sho']//div[@class='innr_pnl']//div[1]//div[2]//div[1]//div[3]//input[1]")).click();//adding adults
			  driver.findElement(By.xpath("//div[@class='mobile-wi1-multi mul-sho']//div[2]//div[2]//div[1]//div[3]//input[1]")).click();//adding childs
			 driver.findElement(By.xpath("//div[@class='mobile-wi1-multi mul-sho']//div[3]//div[2]//div[1]//div[3]//input[1]")).click();//adding infants
			  driver.findElement(By.xpath("//div[@id='myDropdown_n2']//label[@class='cont_flt'][normalize-space()='Business']//span[@class='chk_flt']")).click();//adding class
			  driver.findElement(By.xpath("//div[@id='myDropdown_n2']//a[@class='dn_btn'][normalize-space()='Done']")).click();
			  Thread.sleep(1000);

			  Thread.sleep(1000);
			  driver.findElement(By.xpath("//input[@onclick='ValidateMuticity();']")).click();//clicking on search
			  Thread.sleep(20000);
			  driver.findElement(By.xpath("//div[5]//div[2]//div[1]//div[2]//div[1]//div[2]//button[1]")).click();//selecting a particular flight
		
		  driver.findElement(By.xpath("//input[@id='txtEmailId']")).sendKeys(prop.getProperty("mailid"));
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector(".cancl")).click();
		  Thread.sleep(2000);
		  //driver.findElement(By.xpath("//div[@class='cancl']")).click(); 
		  driver.findElement(By.xpath("//input[@id='txtCouponCode']")).sendKeys(prop.getProperty("invalidcoupon"));
		  driver.findElement(By.cssSelector(".apl")).click();
		  WebElement E37=driver.findElement(By.id("easeFareDetails1_promodiv"));
		  String alert37=E37.getText();
		  Assert.assertEquals("",alert37);
		  System.out.println(alert37);


}
}

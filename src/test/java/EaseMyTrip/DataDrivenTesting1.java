package EaseMyTrip;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class DataDrivenTesting1 {
	WebDriver driver;
	  @Test(dataProvider = "dp",enabled=true,description="Booking a Flight without Source ")
	  public void TC43(String source1, String destination2) throws Exception {  
		  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	   
	    driver.findElement(By.xpath("//li[@class='click-mul border-rht mul-hid']")).click();
		
	    driver.findElement(By.xpath("//input[@id='FromSector-mul1_show']")).click();
	
	    Thread.sleep(3000);
	   driver.findElement(By.xpath("//input[@id='FromSector-mul1_show']")).sendKeys(source1);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='FromSector-mul1_show']")).sendKeys(Keys.ENTER);
	
		driver.findElement(By.xpath("//input[@id='ToSector-mul1_show']")).click();
		/*driver.findElement(By.xpath("//input[@id='ToSector-mul1_show']")).sendKeys(destination1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ToSector-mul1_show']")).sendKeys(Keys.ENTER);
		

	
	     driver.findElement(By.xpath("//input[@id='ToSector-mul2_show']")).click();*/
	     driver.findElement(By.xpath("//input[@id='ToSector-mul2_show']")).sendKeys(destination2);
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[@id='ToSector-mul2_show']")).sendKeys(Keys.ENTER);
	
	
	    WebElement E1=driver.findElement(By.xpath("//input[@id='ddateMul1']"));
		E1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='10']")).click();
		
		
		
		  WebElement E2=driver.findElement(By.xpath("//input[@id='ddateMul2']"));
		  E2.click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		  driver.findElement(By.xpath("//a[normalize-space()='14']")).click();
		 Thread.sleep(3000);

		 
		
		  driver.findElement(By.xpath("//a[@class='dropbtn_n']")).click();
		  driver.findElement(By.xpath("//div[@class='mobile-wi1-multi mul-sho']//div[@class='innr_pnl']//div[1]//div[2]//div[1]//div[3]//input[1]")).click();
		  driver.findElement(By.xpath("//div[@class='mobile-wi1-multi mul-sho']//div[2]//div[2]//div[1]//div[3]//input[1]")).click();
		 driver.findElement(By.xpath("//div[@class='mobile-wi1-multi mul-sho']//div[3]//div[2]//div[1]//div[3]//input[1]")).click();
		  driver.findElement(By.xpath("//div[@id='myDropdown_n2']//label[@class='cont_flt'][normalize-space()='Business']//span[@class='chk_flt']")).click();
		  driver.findElement(By.xpath("//div[@id='myDropdown_n2']//a[@class='dn_btn'][normalize-space()='Done']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@onclick='ValidateMuticity();']")).click();
		  Alert ac43= driver.switchTo().alert();
		  String alert43=ac43.getText();
		  Assert.assertEquals("Destination cannot be Empty", alert43);
		  System.out.println(alert43);

	  }

	  @DataProvider
	  public Object[][] dp() throws Exception{
	      Excel1 ex=new Excel1("F:\\desktop\\praneeth files\\LTI\\selinium_day_1_soft\\Book2.xlsx");
	      Object data[][]=new Object[ex.getRowNum("Sheet1")][ex.getColNum("Sheet1")];
	      for (int i=0;i<data.length;i++) {
	    	  data[i][0]=ex.getData("Sheet1", i, 0);
	    	  data[i][1]=ex.getData("Sheet1", i, 1);
	      }
		return data;

	    };
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
			 driver=new ChromeDriver();
				driver.get("https://www.easemytrip.com/");

	  }

	  @AfterTest
	  public void afterTest() throws Exception {
		  Thread.sleep(2000);
		  driver.quit();
	  }
}

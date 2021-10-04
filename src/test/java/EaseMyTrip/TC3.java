package EaseMyTrip;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC3 extends Base2 {
	  @Test(priority=1,enabled=true,description="Invalid phone number")
	  public void TC41() throws Exception { 
		  driver.get("https://www.easemytrip.com/");
			 driver.manage().deleteAllCookies();
			 driver.manage().window().maximize();
			 Thread.sleep(1000);
			  
			   
			    driver.findElement(By.xpath("//li[@class='click-mul border-rht mul-hid']")).click();//it will click on multiway
				
			    driver.findElement(By.xpath("//input[@id='FromSector-mul1_show']")).click();
			
			    Thread.sleep(5000);
			    
			    driver.findElement(By.xpath("//input[@id='FromSector-mul1_show']")).sendKeys("Chennai");// entering source1 city
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("//input[@id='FromSector-mul1_show']")).sendKeys(Keys.ENTER);
			     Thread.sleep(1000);

				driver.findElement(By.xpath("//input[@id='ToSector-mul1_show']")).click();
				driver.findElement(By.xpath("//input[@id='ToSector-mul1_show']")).sendKeys("Bangalore");//entering destination1 & source2 city 
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='ToSector-mul1_show']")).sendKeys(Keys.ENTER);
			     Thread.sleep(1000);


			
			     driver.findElement(By.xpath("//input[@id='ToSector-mul2_show']")).click();
			     driver.findElement(By.xpath("//input[@id='ToSector-mul2_show']")).sendKeys("mumbai");//entering destination2 city
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
			
			  driver.findElement(By.xpath("//input[@id='txtEmailId']")).sendKeys("14cn041@gmail.com");
			  driver.findElement(By.xpath("//span[@id='spnVerifyEmail']")).click();
		
			  
			  
			  WebElement E3=driver.findElement(By.xpath("//select[@id='titleAdult0']"));
			  Select s1=new Select(E3);
			  s1.selectByVisibleText("MR");
			  driver.findElement(By.xpath("//input[@id='txtFNAdult0']")).sendKeys("adult");
			  driver.findElement(By.xpath("//input[@id='txtLNAdult0']")).sendKeys("aaaaa");
				
			  
			 WebElement E4=driver.findElement(By.xpath("//select[@id='titleChild0']"));
			 Select s4=new Select(E4);
			 s4.selectByVisibleText("Miss");
			 driver.findElement(By.xpath("//input[@id='txtFNChild0']")).sendKeys("child");
			 driver.findElement(By.xpath("//input[@id='txtLNChild0']")).sendKeys("bbbbb");
			 
			 
			 
			 driver.findElement(By.cssSelector("a[class='add_adlt']")).click();
			 
			 WebElement E9=driver.findElement(By.cssSelector("#titleAdult1"));
			 Select s9=new Select(E9);
			 s9.selectByVisibleText("MR");
			 driver.findElement(By.cssSelector("#txtFNAdult1")).sendKeys("adulttwo");
			 driver.findElement(By.cssSelector("#txtLNAdult1")).sendKeys("dddddd");
					 
					
					  
					  
			WebElement E5=driver.findElement(By.xpath("//select[@id='titleInfant0']"));
			Select s5=new Select(E5);
		    s5.selectByVisibleText("Miss");
			driver.findElement(By.xpath("//input[@id='txtFNInfant0']")).sendKeys("infant");
			driver.findElement(By.xpath("//input[@id='txtLNInfant0']")).sendKeys("ccccc");	  
			  
			 WebElement E6=driver.findElement(By.xpath("//select[@id='divDOBDayInfant0']"));
			 Select s6=new Select(E6);
			 s6.selectByValue("05");
		
			WebElement E7=driver.findElement(By.xpath("//select[@id='divDOBMonInfant0']"));
			Select s7=new Select(E7);
			s7.selectByValue("09");
							
			WebElement E8=driver.findElement(By.xpath("//select[@id='divDOBYarInfant0']"));
			Select s8=new Select(E8);
			s8.selectByValue("2020");
							
			driver.findElement(By.xpath("//input[@id='txtCPhone']")).sendKeys("77777");
			   driver.findElement(By.xpath("//span[@class='checkmark1a']")).click();

			  driver.findElement(By.xpath("//span[@id='spnTransaction']")).click();
			 Thread.sleep(1000);
			  driver.findElement(By.xpath("//span[@id='spnTransaction']")).click();
			  WebElement E41= driver.findElement(By.xpath("//span[@id='spanError']"));
			  String alert41=E41.getText();
			  Assert.assertEquals("Please enter a valid mobile number", alert41);
			  System.out.println(alert41);

			 
	  }
//////////////////////////////////////////////////////////////////////////////////////////	  /
	  @Test(priority=2,enabled=true,description="Booking a Flight without Source ")
	  public void TC42() throws Exception {  
			driver.get("https://www.easemytrip.com/");
			 driver.manage().deleteAllCookies();

		  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	   
	    driver.findElement(By.xpath("//li[@class='click-mul border-rht mul-hid']")).click();
		
	    driver.findElement(By.xpath("//input[@id='FromSector-mul1_show']")).click();
	
	    Thread.sleep(5000);
	   /* driver.findElement(By.xpath("//input[@id='FromSector-mul1_show']")).sendKeys("Chennai");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='FromSector-mul1_show']")).sendKeys(Keys.ENTER);
	
		driver.findElement(By.xpath("//input[@id='ToSector-mul1_show']")).click();*/
		driver.findElement(By.xpath("//input[@id='ToSector-mul1_show']")).sendKeys("Bangalore");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ToSector-mul1_show']")).sendKeys(Keys.ENTER);
		

	
	     driver.findElement(By.xpath("//input[@id='ToSector-mul2_show']")).click();
	     driver.findElement(By.xpath("//input[@id='ToSector-mul2_show']")).sendKeys("mumbai");
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
		  driver.findElement(By.cssSelector("div[class='mobile-wi1-multi mul-sho'] div[class='innr_pnl'] div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1) input:nth-child(1)")).click();
			 driver.findElement(By.cssSelector("body > form:nth-child(8) > div:nth-child(9) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
			 driver.findElement(By.cssSelector("div[class='mobile-wi1-multi mul-sho'] div:nth-child(3) div:nth-child(2) div:nth-child(1) div:nth-child(1) input:nth-child(1)")).click();
		  driver.findElement(By.xpath("//div[@class='mobile-wi1-multi mul-sho']//div[@class='innr_pnl']//div[1]//div[2]//div[1]//div[3]//input[1]")).click();
		  driver.findElement(By.xpath("//div[@class='mobile-wi1-multi mul-sho']//div[2]//div[2]//div[1]//div[3]//input[1]")).click();
		 driver.findElement(By.xpath("//div[@class='mobile-wi1-multi mul-sho']//div[3]//div[2]//div[1]//div[3]//input[1]")).click();
		  driver.findElement(By.xpath("//div[@id='myDropdown_n2']//label[@class='cont_flt'][normalize-space()='Business']//span[@class='chk_flt']")).click();
		  driver.findElement(By.xpath("//div[@id='myDropdown_n2']//a[@class='dn_btn'][normalize-space()='Done']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@onclick='ValidateMuticity();']")).click();
		  Alert ac42= driver.switchTo().alert();
		  String alert42=ac42.getText();
		  Assert.assertEquals("Source cannot be Empty", alert42);
		  System.out.println(alert42);

	  }
//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////	  



}

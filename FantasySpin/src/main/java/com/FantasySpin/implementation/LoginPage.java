package com.FantasySpin.implementation;


import org.openqa.selenium.By;
import com.FantasySpin.repository.Config;
import com.FantasySpin.repository.Object_Repository;
import com.FantasySpin.utility.Read;
import com.FantasySpin.utility.Reusable_Function;

import io.appium.java_client.MobileElement;

public class LoginPage extends LaunchApplication
{

	public static Read read=new Read();
	public static Reusable_Function rf = new Reusable_Function();
//	public static AppiumDriver<MobileElement> driver =null;

		
	//Negative Test case
	
	public static void Blank() throws Exception
	{
	
		
	}
	
	
	
	public static void invalidUserName() throws Exception
	{
				
	}
	
	
	
	public static void invalidPassword() throws Exception
	{
		rf.clickButton(driver, Object_Repository.LoginIcon);

		
		Thread.sleep(1000);
		
		rf.sendValue(driver, Object_Repository.Email, Config.Username);
		rf.sendValue(driver, Object_Repository.Password, Config.InvalidPassword);
		Thread.sleep(1000);
		rf.clickButton(driver, Object_Repository.Login);

		Thread.sleep(2000);

		
	}
	
	
	//Positive Test case
	
	public static void ValidCredentials() throws Exception
	{
		
	//	driver.switchTo().alert().accept(); 

		rf.clickButton(driver, Object_Repository.LoginIcon);
		Thread.sleep(1000);

		rf.cleardata(driver, Object_Repository.Email);
		rf.cleardata(driver, Object_Repository.Password);
		
		//driver.navigate().back();
		
		rf.clickButton(driver, Object_Repository.LoginIcon);

		
		Thread.sleep(1000);


		rf.sendValue(driver, Object_Repository.Email, Config.Username);
		rf.sendValue(driver, Object_Repository.Password, Config.Password);
		Thread.sleep(2000);
		
		rf.clickButton(driver, Object_Repository.Login);

		Thread.sleep(6000);

		
	}
	
	public static void login() throws Exception
	{
		rf.clickButton(driver, Object_Repository.Login);

		Thread.sleep(6000);
		
		MobileElement DailySpin = driver.findElement(By.id("FSDLYspinbtn"));
		MobileElement NewDeviceUsePopUp = driver.findElement(By.id("FSNDFokbtn"));
		
		if(DailySpin.isDisplayed() == true)
		{
			rf.clickButton(driver, Object_Repository.DailySpin);
			Thread.sleep(3000);
			
			rf.clickButton(driver, Object_Repository.NewDeviceOKbutton);
			Thread.sleep(1000);
			
			rf.sendValue(driver, Object_Repository.CountryUSA, Config.Country);
			Thread.sleep(1000);

			rf.clickButton(driver, Object_Repository.PhoneNumber);
			rf.sendValue(driver, Object_Repository.PhoneNumber, Config.PhoneNumber);
			Thread.sleep(1000);
			
			rf.clickButton(driver, Object_Repository.TextMe);

			
		}
		
		else if(NewDeviceUsePopUp.isDisplayed() == true)
		{
			rf.clickButton(driver, Object_Repository.NewDeviceOKbutton);
			Thread.sleep(1000);
//			rf.clickButton(driver, Object_Repository.CountryUSA);
			
/*			RemoteWebElement element = (RemoteWebElement)driver. findElement(By.id("FSEPNcanada"));
			String elementID = element.getId();
			HashMap<String, String> scrollObject = new HashMap<String, String>();
			scrollObject.put("element", elementID);
			scrollObject.put("toVisible", "not an empty string");
			driver.executeScript("mobile:scroll", scrollObject);
*/
			
/*			MobileElement element1 = driver.findElement(MobileBy.iOSClassChain(
	                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"FSEPNcanada\"));"));

			element1.click();
*/
//			rf.clickButton(driver, Object_Repository.ClearCountry);
 
			MobileElement clear = driver.findElement(By.name("Clear text"));
			clear.click();

			rf.sendValue(driver, Object_Repository.CountryUSA, Config.Country);
			Thread.sleep(1000);
			
			

			rf.clickButton(driver, Object_Repository.PhoneNumber);
			rf.sendValue(driver, Object_Repository.PhoneNumber, Config.PhoneNumber);
			Thread.sleep(1000);
			
			rf.clickButton(driver, Object_Repository.TextMe);

			
		}
		else
		{
			System.out.println("New Device Use pop-up message is not Presented.");
		} 
	}
	
	
		
}

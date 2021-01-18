package com.FantasySpin.implementation;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class LaunchApplication
{
	
	
	public static AppiumDriver<MobileElement> driver;

    public static AppiumDriver<MobileElement> launchApp()throws Exception
	{
		
		 DesiredCapabilities cap = new DesiredCapabilities();

		 cap.setCapability("deviceName", "iPhone 11");
		 cap.setCapability("platformName", "iOS");
		 cap.setCapability("platformVersion", "13.7");
	//	 cap.setCapability("udid", "780DC199-524D-42ED-AFC7-9FD3690D836F");
	//	 cap.setCapability("appPackage", "com.reimbursify.Reimbursify");
		 cap.setCapability("bundleId", "com.footballnation.fantasyspin.debug");
	//	 cap.setCapability("app", "/Users/apple/Downloads/FantasySpin 2.app");

			 
	try 
	{ 
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		driver=new IOSDriver<MobileElement>(url, cap);
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		Thread.sleep(10000);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
	
	try{   
		   driver.switchTo().alert().accept(); 
	}catch(Exception e){ 
		   System.out.println("unexpected alert not present");   
	}
	Thread.sleep(2000);

	
	try{   
		   driver.switchTo().alert().accept(); 
	}catch(Exception e){ 
		   System.out.println("unexpected alert not present");   
	}

	
	return driver;
	
	
	}

}

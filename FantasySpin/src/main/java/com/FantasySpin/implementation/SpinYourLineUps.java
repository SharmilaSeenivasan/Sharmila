package com.FantasySpin.implementation;

import org.openqa.selenium.By;

import com.FantasySpin.repository.Object_Repository;

import io.appium.java_client.MobileElement;

public class SpinYourLineUps extends LoginPage
{
	
	public static void spin() throws Exception
	{

	/*	MobileElement CloseButton = driver.findElement(By.id("FSINVFRNDSclosebtn"));
		
		if(CloseButton.isDisplayed() == true)
		{
			rf.clickButton(driver, Object_Repository.CloseInvite);
		}
	*/	
		rf.clickButton(driver, Object_Repository.SpinYourLineups);
		Thread.sleep(5000);
		rf.clickButton(driver, Object_Repository.Hockey);
		Thread.sleep(2000);

	/*	MobileElement ClosePopup = driver.findElement(By.xpath("XCUIElementTypeApplication[@name=\\\"FSDev\\\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton"));
		
		if(ClosePopup.isDisplayed() == true)
		{
			rf.clickButton(driver, Object_Repository.ClosePopup);
		}
	*/	
		//rf.clickButton(driver, Object_Repository.ClosePopup);
		//Thread.sleep(2000);

		rf.clickButton(driver, Object_Repository.ChipTokenTourneys);
		Thread.sleep(5000);
		
		rf.clickButton(driver, Object_Repository.StandardOneK);
		Thread.sleep(2000);
		
		rf.clickButton(driver, Object_Repository.SpinButton);
		Thread.sleep(2000);
		
		/*rf.clickButton(driver, Object_Repository.LockPlayer);
		Thread.sleep(2000);


		rf.clickButton(driver, Object_Repository.LockPlayerOne);
		Thread.sleep(2000);

		rf.clickButton(driver, Object_Repository.LockConfirm);
		Thread.sleep(3000);
*/
	}


}

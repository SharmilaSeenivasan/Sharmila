package com.FantasySpin.implementation;

import com.FantasySpin.repository.Object_Repository;

public class SettingsFlow extends LoginPage
{
	public static void settings() throws Exception
	{
		rf.clickButton(driver, Object_Repository.Settings);
		
	}
	
	public static void LinkAccounts() throws Exception
	{
		rf.clickButton(driver, Object_Repository.Settings);
		rf.clickButton(driver, Object_Repository.Unlink);

		
	}

	
	public static void HowtoPlay() throws Exception
	{
		rf.clickButton(driver, Object_Repository.HowtoPlay);
		Thread.sleep(4000);
		
		rf.clickButton(driver, Object_Repository.FSDevBackButton);
		Thread.sleep(2000);

	}
	
	
	public static void Scoring() throws Exception
	{
		driver.navigate().back();
		

		rf.clickButton(driver, Object_Repository.Scoring);
		Thread.sleep(2000);

		rf.clickButton(driver, Object_Repository.NFLfootball);
		Thread.sleep(3000);
		driver.navigate().back();

		rf.clickButton(driver, Object_Repository.MLBbaseball);
		Thread.sleep(3000);
		driver.navigate().back();

		rf.clickButton(driver, Object_Repository.NBAbasketball);
		Thread.sleep(3000);
		driver.navigate().back();

		rf.clickButton(driver, Object_Repository.NHLhockey);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);

	}
	
	
	public static void FAQs() throws Exception
	{
		rf.clickButton(driver, Object_Repository.ScroingBackbutton);
		Thread.sleep(1000);

		rf.clickButton(driver, Object_Repository.FAQ);
		Thread.sleep(3000);

		
	}
	
	public static void LegalSupport() throws Exception
	{
		driver.navigate().back();

		rf.clickButton(driver, Object_Repository.LegalSupport);
		Thread.sleep(1000);

		
		rf.clickButton(driver, Object_Repository.AboutFS);
		Thread.sleep(3000);
		driver.navigate().back();

		rf.clickButton(driver, Object_Repository.PrivacyPolice);
		Thread.sleep(3000);
		driver.navigate().back();

		rf.clickButton(driver, Object_Repository.TermsOfUse);
		Thread.sleep(3000);
		driver.navigate().back();

		rf.clickButton(driver, Object_Repository.ContactUs);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);

		
	}
	
	public static void Feedback() throws Exception
	{
		rf.clickButton(driver, Object_Repository.LegalSupportBackbutton);
		Thread.sleep(1000);

		rf.clickButton(driver, Object_Repository.Feedback);
		Thread.sleep(3000);

		
	}







}

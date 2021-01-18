package com.FantasySpin.test;

import org.testng.annotations.Test;

import com.FantasySpin.implementation.LaunchApplication;
import com.FantasySpin.implementation.LoginPage;
import com.FantasySpin.implementation.SettingsFlow;
import com.FantasySpin.report.Base;

public class Settings extends Base
{
	
	@Test
	public void LaunchApp() throws Exception
	{
		driver= LaunchApplication.launchApp();

	}
	
	
	@Test(priority=1)
	public void ValidCredentials() throws Exception
	{
		LoginPage.ValidCredentials();
	}

	
	@Test(priority=2)
	public void LoginScreen() throws Exception
	{
		LoginPage.login();
	}


	
	@Test(priority=3)
	public void SettingsTab() throws Exception
	{
		SettingsFlow.settings();
	}
	
	@Test(priority=4)
	public void HowtoPlay() throws Exception
	{
		SettingsFlow.HowtoPlay();
	}
	
	@Test(priority=5)
	public void Scorings() throws Exception
	{
		SettingsFlow.Scoring();
	}

	@Test(priority=6)
	public void FrequentlyAskedQuestions() throws Exception
	{
		SettingsFlow.FAQs();
	}

	@Test(priority=7)
	public void LegalAndSupport() throws Exception
	{
		SettingsFlow.LegalSupport();
	}
	
	@Test(priority=8)
	public void Feedback() throws Exception
	{
		SettingsFlow.Feedback();
	}



}

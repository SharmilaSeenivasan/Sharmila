package com.FantasySpin.test;

import org.testng.annotations.Test;

import com.FantasySpin.implementation.LaunchApplication;
import com.FantasySpin.implementation.LoginPage;
import com.FantasySpin.implementation.SpinYourLineUps;
import com.FantasySpin.report.Base;

public class Login extends Base
{
	@Test
	public void LaunchApp() throws Exception
	{
		driver= LaunchApplication.launchApp();

	}
	
/*	@Test(priority=1)
	public void InvalidPassword() throws Exception
	{
		LoginPage.invalidPassword();
	}
*/
	
	@Test(priority=2)
	public void ValidCredentials() throws Exception
	{
		LoginPage.ValidCredentials();
	}

	
/*	@Test(priority=3)
	public void LoginScreen() throws Exception
	{
		LoginPage.login();
	}

*/	

	
	@Test(priority=4)
	public void Spin() throws Exception
	{
		SpinYourLineUps.spin();
	}

	/*
	@Test(priority=44)
	public void Verify_ValidData() throws Exception
	{
		LoginPage.login();
		test.assignCategory("LoginScreen");
		test.info("Enter the VALID USERNAME and VALID PASSWORD, and click the sign in button, it should take it to the next screen.");
	}
	
*/

}

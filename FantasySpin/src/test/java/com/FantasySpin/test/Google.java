package com.FantasySpin.test;

import org.testng.annotations.Test;

import com.FantasySpin.implementation.GoogleLogin;
import com.FantasySpin.implementation.LaunchApplication;
import com.FantasySpin.report.Base;

public class Google extends Base
{
	@Test
	public void LaunchApp() throws Exception
	{
		driver= LaunchApplication.launchApp();

	}
	
	@Test(priority=1)
	public void GoogleLogin() throws Exception
	{
		GoogleLogin.googlelogin();
	}




}

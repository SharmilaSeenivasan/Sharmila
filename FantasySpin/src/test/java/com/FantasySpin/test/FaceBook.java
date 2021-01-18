package com.FantasySpin.test;

import org.testng.annotations.Test;

import com.FantasySpin.implementation.FacebookLogin;
import com.FantasySpin.implementation.LaunchApplication;
import com.FantasySpin.report.Base;

public class FaceBook extends Base
{
	@Test
	public void LaunchApp() throws Exception
	{
		driver= LaunchApplication.launchApp();

	}
	
	@Test(priority=1)
	public void FaceBookLogin() throws Exception
	{
		FacebookLogin.facebooklogin();
	}

 

}

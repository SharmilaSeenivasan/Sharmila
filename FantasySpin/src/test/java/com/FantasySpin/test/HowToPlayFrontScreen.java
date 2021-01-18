package com.FantasySpin.test;

import org.testng.annotations.Test;

import com.FantasySpin.implementation.HowtoplayFrontscreen;
import com.FantasySpin.implementation.LaunchApplication;
import com.FantasySpin.report.Base;

public class HowToPlayFrontScreen extends Base
{
	@Test
	public void LaunchApp() throws Exception
	{
		driver= LaunchApplication.launchApp();

	}
	
	@Test(priority=1)
	public void HowToPlay() throws Exception
	{
		HowtoplayFrontscreen.howtoplay();
	}
 
}

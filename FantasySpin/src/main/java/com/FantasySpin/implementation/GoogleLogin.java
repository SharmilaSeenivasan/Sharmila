package com.FantasySpin.implementation;

import com.FantasySpin.repository.Object_Repository;

public class GoogleLogin extends LoginPage 
{

	
	public static void googlelogin() throws Exception
	{
		rf.clickButton(driver, Object_Repository.GoogleLogin);

		
		Thread.sleep(1000);
		rf.clickButton(driver, Object_Repository.GoogleContinueButton);
		Thread.sleep(1000);

	}

}

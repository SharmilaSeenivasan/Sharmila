package com.FantasySpin.implementation;

import com.FantasySpin.repository.Object_Repository;

public class FacebookLogin extends LoginPage

{
	
	public static void facebooklogin() throws Exception
	{
		rf.clickButton(driver, Object_Repository.FacebookLogin);

		Thread.sleep(1000);
		
		rf.clickButton(driver, Object_Repository.FacebookContinueButton);
		Thread.sleep(1000);

		
	}


}

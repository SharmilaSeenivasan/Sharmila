package com.FantasySpin.implementation;

import com.FantasySpin.repository.Object_Repository;

public class SpinYourLineUps extends LoginPage
{
	
	public static void spin() throws Exception
	{
		rf.clickButton(driver, Object_Repository.SpinYourLineups);
		Thread.sleep(5000);
		rf.clickButton(driver, Object_Repository.FootBall);

		//	rf.clickButton(driver, Object_Repository.BasketBall);
		Thread.sleep(2000);

		//rf.clickButton(driver, Object_Repository.ClosePopup);
		//Thread.sleep(2000);


		
		rf.clickButton(driver, Object_Repository.TouneysOnly);
		Thread.sleep(5000);
		
		/*rf.clickButton(driver, Object_Repository.StandardOneK);
		Thread.sleep(2000);
		
		rf.clickButton(driver, Object_Repository.SpinButton);
		Thread.sleep(2000);
		
		rf.clickButton(driver, Object_Repository.LockPlayer);
		Thread.sleep(2000);


		rf.clickButton(driver, Object_Repository.LockPlayerOne);
		Thread.sleep(2000);

		rf.clickButton(driver, Object_Repository.LockConfirm);
		Thread.sleep(3000);
*/
	}


}

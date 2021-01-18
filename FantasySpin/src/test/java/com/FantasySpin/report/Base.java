package com.FantasySpin.report;

import org.testng.annotations.AfterMethod;
import java.util.Date;


import java.io.IOException;

import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class Base extends ExtentReport
{
	


	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException 
	{
		  
		test.getModel().setStartTime(new Date(result.getStartMillis()));
		test.getModel().setEndTime(new Date(result.getEndMillis()));

		
		if (result.getStatus() == ITestResult.FAILURE) 
		{
			 //  test.log(Status.FAIL,"RESULT:"); 											// to add name in extent report	
			 test.log(Status.FAIL, MarkupHelper.createLabel("The test case is FAILED. Refer the Snapshot:", ExtentColor.RED));
//			 test.log(Status.FAIL, "Error Message: " + result.getThrowable()); // to add error/exception in extent report
			 
		     test.fail(result.getThrowable());

			 String screenshotPath = ExtentReport.getScreenshot(driver, result.getName());
	         test.addScreenCaptureFromPath(screenshotPath);								// adding screen shot
	         test.assignCategory(result.getName());
			//String screenshotBase64 = ExtentReport.getScreenshotAsBase64(driver);
			//test.addScreenCaptureFromBase64String(screenshotBase64);
	


		} 
		else if (result.getStatus() == ITestResult.SKIP) 
		{
				 //test.log(Status.SKIP, "The above test Case is SKIPPED. " + result.getName());
		    test.skip(MarkupHelper.createLabel("The above test case is SKIPPED.", ExtentColor.GREY));
		    test.skip(result.getThrowable());
	        test.assignCategory(result.getName());

		 }
		
		else if (result.getStatus() == ITestResult.SUCCESS) 
		{
				//   test.log(Status.PASS, "RESULT:");
			  test.log(Status.PASS, MarkupHelper.createLabel("The test case is PASSED. Refer the Snapshot:", ExtentColor.GREEN));

			   String screenshotPath = ExtentReport.getScreenshot(driver, result.getName());
			   test.addScreenCaptureFromPath(screenshotPath);// adding screen shot
	
		
			  //String screenshotBase64 = ExtentReport.getScreenshotAsBase64(driver);
			  //test.addScreenCaptureFromBase64String(screenshotBase64);
		
		}

	//	driver.quit();		
	}

}


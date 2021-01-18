package com.FantasySpin.report;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.FantasySpin.utility.Read;
import com.FantasySpin.utility.Reusable_Function;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ExtentReport 
{
	 public static Read read=new Read();
	 public static Reusable_Function rf = new Reusable_Function();



	 public static AppiumDriver<MobileElement> driver;
	 public static ExtentHtmlReporter htmlReporter;
	 public static ExtentReports extent;
	 public static ExtentTest test, parentTest, childTest;

	 
	 @BeforeSuite
	 public void setExtent() 
	 {
	  // specify location of the report
	  htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/myReport.html");

	  htmlReporter.config().setDocumentTitle("Automation Report");	 // Tile of report
	  htmlReporter.config().setReportName("REIMBURSIFY ANDROID"); // Name of the report
	  htmlReporter.config().setReportName("Regression Testing"); // Name of the report

	  htmlReporter.config().setTheme(Theme.STANDARD);
	  
	  extent = new ExtentReports();
	  extent.attachReporter(htmlReporter);
	  
	  // Passing General information
	  extent.setSystemInfo("Host name", "Reim Demo Runner");
	  extent.setSystemInfo("Environemnt", "QA");
	//  extent.setSystemInfo("User", "Sharmila");
	  extent.setSystemInfo("iOS", "13.6");
	  extent.setSystemInfo("Application Version", "QA Version 3.3.15");
	  extent.setSystemInfo("Type of Testing", "E2E Test");
	 }

	 
/*		 @BeforeTest
	 public void setup() throws IOException, Exception 
	 {  
		 DesiredCapabilities cap = new DesiredCapabilities();
			
		 cap.setCapability("deviceName", "Redmi 6A");
		 cap.setCapability("udid", "emulator-5554");
		 cap.setCapability("platformName", "Android");
		 cap.setCapability("platformVersion", "8.1");
		 cap.setCapability("appPackage", "com.reimbursify");
		 cap.setCapability("appActivity", "com.reimbursify.splash.ActivitySplash");
	
		 
	try 
	{ 
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		driver=new AndroidDriver<MobileElement>(url, cap);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(10000);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
		 
	
	 // test = extent.createTest("Application is launched successfully.");
	  rf.screenShot(driver, "Application is Launched Successfully");

	 }

*/		 
	 @BeforeMethod
		public void beforeMethod(Method method) {
		//In before method we are collecting the current running test case name
		String className = this.getClass().getSimpleName();
		test=extent.createTest(className+ " -- " +method.getName());
		 
		/* String className = this.getClass().getSimpleName();
		 String methodName = method.getName();
		 parentTest = extent.createTest(className);
		 childTest = test.createNode(methodName);	*/	 
	 }
	 

	 
			 
/*	 @AfterMethod
	 public void tearDown(ITestResult result) throws IOException {
	  if (result.getStatus() == ITestResult.FAILURE) {
	  // test.log(Status.FAIL, "The above test case is FAILED. Kindly refer the snapshot attached below:"); // to add name in extent report
	  // test.fail(MarkupHelper.createLabel("The above test case is FAILED. Kindly refer the snapshot attached below:", ExtentColor.RED));
	   test.log(Status.FAIL, "Error Message: " + result.getThrowable()); // to add error/exception in extent report
	   String screenshotPath = ExtentReport.getScreenshot(driver, result.getName());
	   test.addScreenCaptureFromPath(screenshotPath);// adding screen shot
	  } else if (result.getStatus() == ITestResult.SKIP) {
	 //  test.log(Status.SKIP, "The above test Case is SKIPPED. " + result.getName());
	   test.skip(MarkupHelper.createLabel("The above test case is SKIPPED.", ExtentColor.GREY));

	  }
	  else if (result.getStatus() == ITestResult.SUCCESS) {
	   //test.log(Status.PASS, "The above test case is PASSED. Kindly refer the snapshot attached below:");
	 //  test.pass(MarkupHelper.createLabel("The above test case is PASSED. Kindly refer the snapshot attached below:", ExtentColor.GREEN));

	   String screenshotPath = ExtentReport.getScreenshot(driver, result.getName());
	   test.addScreenCaptureFromPath(screenshotPath);// adding screen shot

	  }
	 // driver.quit();
	 }
	 
	*/ 
	 
	


	@AfterTest
	 public void teardown()
	 {
		  driver.closeApp();
		  //extent.flush();

	 }
	 
	
	 
	 @AfterSuite
	 public void endReport() throws Exception {
	  extent.flush();
	  
	  Thread.sleep(2000);

/*	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\KarthiSharmi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  System.setProperty("webdriver.chrome.driver","/path/to/chromedriver");
	  WebDriver driver=new ChromeDriver();
      driver.get("C:\\Users\\KarthiSharmi\\git\\reimbursify-mobile-automation\\Reimbursify_Android\\test-output\\myReport.html");	 
      driver.manage().window().maximize();
    //  SendEmailReport.execute("Reimbursify_Android");

    /*  Runtime r=Runtime.getRuntime();  	  
  	r.addShutdownHook(new Thread(){  
  	public void run(){  
  		Email sm = new Email();
  		try {
  			sm.mail();
  			System.out.println("Report has been sent"); 
  		} catch (IOException | MessagingException e) {
  			e.printStackTrace();
  		}
  		
  	    }  
  	}  
  	);  
  	try{Thread.sleep(5000);}catch (Exception e) 
  	{
  		System.out.println(e);
  	}  
  	
*/
	 
	 }

	
	 
	public static String getScreenshot(AppiumDriver<MobileElement> driver, String screenshotName) throws IOException {
		  String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		  TakesScreenshot ts = (TakesScreenshot) driver;
		  File source = ts.getScreenshotAs(OutputType.FILE);
		  
		  // after execution, you could see a folder "FailedTestsScreenshots" under src folder
		//  String destination = "./Screenshots/" + screenshotName + dateName + ".png";
		  
		  String destination = System.getProperty("user.dir")+ "/Screenshots/" + screenshotName + dateName + ".png";
		  File finalDestination = new File(destination);
		  FileUtils.copyFile(source, finalDestination);
		  return destination;
		 }


	public static String getScreenshotAsBase64(AppiumDriver<MobileElement> driver) throws IOException 
	{
		  TakesScreenshot ts = (TakesScreenshot) driver;
		  return ts.getScreenshotAs(OutputType.BASE64);
	}




}

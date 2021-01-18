package com.FantasySpin.utility;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Reusable_Function 
{


	static WebDriver driver;
	public static AppiumDriver<MobileElement> driver1;
	public  WebDriver chrome()
	{
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\Selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
return driver;
	}
	public By getBy(WebDriver driver, String element){
		String[] value=element.split(">");
		By by=null;
		
		switch(value[0]){
		
		case "id":
			by =By.id(value[1]);
			break; 
		case "name":
			by=By.name(value[1]);
			break;
		case "tagname":
			by=By.tagName(value[1]);
			break;
		case "partialtext":
			by=By.partialLinkText(value[1]);
			break;
		case "xpath":
			by=By.xpath(value[1]);
			break;
		case "cssselector":
			by=By.cssSelector(value[1]);
			break;
			
		case "linkText":
			by=By.linkText(value[1]);
			break;
		case "className":
			by=By.className(value[1]);
			break;
			
		
		}
		return by;
	
		
	}
	
	
	public Boolean find(WebDriver driver, String element)
	{
			
		 Boolean value=driver.findElement(getBy(driver,element)).isDisplayed();
		return value;
		
			
	}


	
	public void clickButton(WebDriver driver, String element) {
		try{
			
			
		driver.findElement(getBy(driver,element)).click();
			}catch(Exception e){
			System.out.println("Error in button "+element);
			 e.printStackTrace();
			// System.exit(1);
			// Assert.fail("Element: "+element+" not found");
			 
		}}

	
	public void cleardata(WebDriver driver,String element)
	{
	try {
		//To check enable
		//To check visible
		//Highlight
		
	driver.findElement(getBy(driver,element)).clear();
 }
	catch(Exception e)
	{
		   e.printStackTrace();
		   //System.exit(1);
		   //Assert.fail("Element: "+element+" not found");

	}
}



	public void sendValue(WebDriver driver, String element, String value){
		try {
			//To check enable
			//To check visible
			//Highlight		

			
		driver.findElement(getBy(driver,element)).sendKeys(value);
	}catch(Exception e){
		   e.printStackTrace();
		   //System.exit(1);
		  //Assert.fail("Element: "+element+" not found");

		
	}
		
}
	
	
	
	public void selectedby(WebDriver driver, String element,String data)
	{
		Select dropdown=new Select(driver.findElement(getBy(driver,element)));
		dropdown.selectByVisibleText(data);

	}
public void setClipboardData(String value)throws Exception
{
	StringSelection stringsel = new StringSelection(value);
	 
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringsel,null);
	 System.out.println("selection" +stringsel);


	 Robot robot = new Robot();
	 Thread.sleep(1000);
	      
	  // Press Enter
	 robot.keyPress(KeyEvent.VK_ENTER);
	 
	// Release Enter
	 robot.keyRelease(KeyEvent.VK_ENTER);
	 
	  // Press CTRL+V
	 robot.keyPress(KeyEvent.VK_CONTROL);
	 robot.keyPress(KeyEvent.VK_V);
	 
	// Release CTRL+V
	 robot.keyRelease(KeyEvent.VK_CONTROL);
	 robot.keyRelease(KeyEvent.VK_V);
	 Thread.sleep(1000);
	        
	         
	 robot.keyPress(KeyEvent.VK_ENTER);
	 robot.keyRelease(KeyEvent.VK_ENTER);	
		
	}


public void winHandle()
{
	String hand=driver.getWindowHandle();
	Set<String>hands=driver.getWindowHandles();
	String winhand=hands.iterator().next();
	if(winhand !=hand)
	{
		String secwind=winhand;
		driver.switchTo().window(secwind);
	}
	
}
public String db(String a) throws Exception, IllegalAccessException, ClassNotFoundException
{ 
		Connection con=null;
		String selva = null;
	String dbUrl="jdbc:mysql://localhost:3306/scrutinysoft?useSSL=true";
	String driver="com.mysql.cj.jdbc.Driver";
	String userName="root";
	String password="selva";
	Class.forName(driver).newInstance();
	con=DriverManager.getConnection(dbUrl, userName, password);
	System.out.println("connection successfully");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from flipkart where Field_Name="+a+"");
	while(rs.next()) {
		selva=rs.getString("Input_Data");
		//System.out.println(selva);
		
		}
	rs.close();
	return selva;
}

public void screenShot(AppiumDriver<MobileElement> driver,String name) throws IOException
{
	
	String folder_name="C:\\Users\\KarthiSharmi\\eclipse-workspace\\Reimbursify\\Screenshot";
	
    File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    //Date format fot screenshot file name
   DateFormat df=new  SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
    //create dir with given folder name
  String file_name=name+df.format(new Date())+".png";
      new File(folder_name).mkdir();
    //Setting file name
    //copy screenshot file into screenshot folder.
 


     try 
     {
    	 FileUtils.copyFile(f, new File(folder_name + "/" + file_name));
     }
     catch(IOException e)
     {
    	System.out.println(e.getMessage());
     }
}

     
public Boolean presentElement(WebDriver driver, String element)
{
Boolean isPresent = true;
try{

isPresent=driver.findElement(getBy(driver,element))!=null;

}catch(Exception e){
System.out.println("Error in button "+element);

}
return isPresent;

}


public void takescreenShot(String name) throws IOException
{
	
	String folder_name="C:\\Users\\KarthiSharmi\\eclipse-workspace\\Reimbursify_Android\\test-output\\myReport.html";
	
    File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    //Date format fot screenshot file name
   DateFormat df=new  SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
    //create dir with given folder name
  String file_name=name+df.format(new Date())+".png";
      new File(folder_name).mkdir();
    //Setting file name
    //copy screenshot file into screenshot folder.
 


     try 
     {
    	 FileUtils.copyFile(f, new File(folder_name + "/" + file_name));
     }
     catch(IOException e)
     {
    	System.out.println(e.getMessage());
     }
}



}

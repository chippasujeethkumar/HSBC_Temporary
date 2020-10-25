package HSBC_Training_Assignment.HSBC_Assignment3;

import org.testng.annotations.Test;

import pricegrabber.pricegrabber.ExtentHtmlReporter;
import pricegrabber.pricegrabber.ExtentReports;
import pricegrabber.pricegrabber.ExtentTest;

public class ExtendReport 
{
	public class  ExtendReport
	{
		@Test
		public void loginTest()
		{
			ExtentHtmlReporter reporter=new ExtentHtmlReporter("D:\\HSBC_Final\\extendreport.html");
			
			
			ExtentReports extent=new ExtentReports();
			
			extent.attachReporter(reporter);
			
			ExtentTest logger1=extent.createTest("LoginTest");
			logger1.log(Status.INFO, "LOGIN TO HomePage");
			logger1.log(Status.PASS, "Title verified");
			extent.flush();
			
			ExtentTest logger2=extent.createTest("Logoff Test");
			logger2.log(Status.INFO, "Title to be Verified");
			logger2.log(Status.FAIL, "Title verified");
			extent.flush();		
		}
	}
}

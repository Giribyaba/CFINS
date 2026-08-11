package Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import CommonClass.BaseTest;

public class ExtentReport implements ITestListener {
	public static  ExtentSparkReporter sparkReporter; 
	public static ExtentReports Extent;//populate common info on the report
	public static ExtentTest test;//  creating the test case entries



	    @Override
	    public void onTestStart(ITestResult result) {
	   String timestamp    = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
	   String reportname= result.getMethod().getMethodName() + timestamp    + ".html" ;
	    sparkReporter = new ExtentSparkReporter(".\\reports\\"+reportname);
	    Extent = new ExtentReports();
	   Extent.attachReporter(sparkReporter);
	   
	   
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	    	ExtentTest test = Extent.createTest(result.getTestClass().getName());
	    	String imagepath = new BaseTest().capturescreenshot(result.getName());
	    	test.addScreenCaptureFromPath(imagepath);
	    		   test.assignCategory(result.getMethod().getMethodName());
	    		   test.log(Status.PASS, "Test is passed : " + result.getName());
	    	
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        ExtentTest test = Extent.createTest(result.getTestClass().getName());
	        test.assignCategory(result.getMethod().getMethodName());
	        test.fail(result.getThrowable().getMessage());
	        test.fail(result.getName() + " got failed" );
	        
	        try 
	        {
	        	String imagepath = new BaseTest().capturescreenshot(result.getName());
	        	
	        	test.addScreenCaptureFromPath(imagepath);
	        	
	        }
	        catch(Exception e)
	        {
	        	e.printStackTrace();
	    }
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        System.out.println("Test Skipped: " + result.getName());
	    }

	        @Override
	        public void onFinish(org.testng.ITestContext context) {
	        	if (Extent != null) {
	                Extent.flush();
	         }
	}}


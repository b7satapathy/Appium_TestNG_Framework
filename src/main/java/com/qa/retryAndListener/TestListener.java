/**
 * 
 */
package com.qa.retryAndListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.qa.report.ExtentManager;
import com.qa.testbase.CreateSession;

/**
 * @author Biswajit Satapathy
 *
 */
public class TestListener extends CreateSession implements ITestListener{

	private static ExtentReports extent = ExtentManager.createInstance("extent.html");
	private static ThreadLocal<ExtentTest> parentTest = new ThreadLocal<ExtentTest>();
	private static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();

	@Override
	public synchronized void onStart(ITestContext context) {
    	ExtentTest parent = extent.createTest(getClass().getName());
        parentTest.set(parent);
	}

	@Override
	public synchronized void onFinish(ITestContext context) {
		extent.flush();
	}
	
	@Override
	public synchronized void onTestStart(ITestResult result) {
		ExtentTest child = ((ExtentTest) parentTest.get()).createNode(result.getMethod().getMethodName());
        test.set(child);
	}

	@Override
	public synchronized void onTestSuccess(ITestResult result) {
		((ExtentTest) test.get()).pass("Test passed");
	}

	@Override
	public synchronized void onTestFailure(ITestResult result) {
		((ExtentTest) test.get()).fail(result.getThrowable());
	}

	@Override
	public synchronized void onTestSkipped(ITestResult result) {
		((ExtentTest) test.get()).skip(result.getThrowable());
	}

	@Override
	public synchronized void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	
	
}

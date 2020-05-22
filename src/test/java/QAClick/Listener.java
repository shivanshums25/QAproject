package QAClick;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.ExtentReporterNG;
import resources.base2;

public class Listener extends base2 implements ITestListener
{
	
	ExtentReports extent=ExtentReporterNG.getReportObject();
	ExtentTest test;
	
	
	public void onTestStart(ITestResult result) {
	test=extent.createTest(result.getMethod().getMethodName());
	}
	
	public void onTestSuccess(ITestResult result) {
	test.log(Status.PASS, "Test Is passes");
		}
	
	public void onFinish(ITestContext context) {
	extent.flush();
	}

	public void onTestFailure(ITestResult result) {
	test.fail(result.getThrowable());
	}
	
	

	

}

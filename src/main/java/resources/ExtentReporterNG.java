package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {

	static ExtentReports extent;
	
	public static ExtentReports getReportObject()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation");
		reporter.config().setDocumentTitle("Automation Report");
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
// To set Tester name in report
		extent.setSystemInfo("Tester Name", "Shivanshu");
		return extent;
		
	}
}

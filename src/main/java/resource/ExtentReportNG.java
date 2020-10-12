package resource;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentReportNG {
	
	 static ExtentReports extent;
	public  static ExtentReports getReportObject()
	{
		String path= System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter =new ExtentSparkReporter(path);
		reporter.config().setReportName("Sks solutions automation results");
		reporter.config().setDocumentTitle("Automation results");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Rasika K");
		
		return extent;
		
	}

}

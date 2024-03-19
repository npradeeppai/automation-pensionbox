package generic;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtils {
    public static void main(String[] args) {
        ExtentReports eReports=new ExtentReports();
        ExtentSparkReporter sparkReporter=new ExtentSparkReporter("./pensionbox-qa-automation/reports/ExRep.html");        
        eReports.attachReporter(sparkReporter);


        eReports.flush();
    }
    
    
}

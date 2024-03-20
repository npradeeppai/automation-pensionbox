package generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {
    public static WebDriver driver;
    public static ExtentReports exReports;
    public static ExtentTest exTest;

    @BeforeSuite
    public void initializeExReports(){
        ExtentSparkReporter sparkReporter_All=new ExtentSparkReporter("First.html");
        exReports = new ExtentReports();
        exReports.attachReporter(sparkReporter_All);
        exReports.setSystemInfo("OS",System.getProperty("os.name"));
    }

    @AfterSuite
    public void generateExReports(){
        exReports.flush();
    }

    @BeforeTest
    public void setup(ITestContext context){
       exTest=exReports.createTest(context.getName()); 
    }
    @BeforeClass
    public void openBrowser(){
        Reporter.log("Opening the Browser",true);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void closeBrowser() throws InterruptedException{
        Reporter.log("Closing the Browser",true);
        Thread.sleep(3000);
        driver.quit();
    }

}

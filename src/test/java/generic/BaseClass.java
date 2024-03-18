package generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    public static WebDriver driver;

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

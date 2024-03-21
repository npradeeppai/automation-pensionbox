package testScripts;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ZScrap {
    @Test
    public void Sample1(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Reporter.log(null);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    
}

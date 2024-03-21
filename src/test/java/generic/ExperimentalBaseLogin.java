package generic;

import org.openqa.selenium.WebDriver;

import pom.HomePage;
import pom.LoginPage;

public class ExperimentalBaseLogin extends BaseClass {
    public void baselogin(WebDriver driver){
        HomePage h1=new HomePage(driver);
        LoginPage l1=new LoginPage(driver);
        driver.get("https://qa.pensionbox.in");
        h1.getLoginBtn().click();
        l1.getLogInPhoneNumberTF().sendKeys("8088634021");
        l1.getLogInLoginBtn().click();
        l1.getLogInOtpTF().sendKeys("3"+"9"+"9"+"1");
    }
    public static void main(String[] args) {
        ExperimentalBaseLogin bl = new ExperimentalBaseLogin();
        bl.baselogin(driver);
    }
}

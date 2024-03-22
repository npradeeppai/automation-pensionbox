package testScripts;

import org.testng.annotations.Test;

import generic.BaseClass;
import pom.HomePage;
import pom.LoginPage;

public class Login extends BaseClass{
    @Test
    public void login(){
        HomePage h1=new HomePage(driver);
        LoginPage l1=new LoginPage(driver);
        driver.get("https://qa.pensionbox.in");
        h1.getLoginBtn().click();
        l1.getLogInPhoneNumberTF().sendKeys("8088634021");
        l1.getLogInLoginBtn().click();
        l1.getLogInOtpTF().sendKeys("3"+"9"+"9"+"1");

    }
}

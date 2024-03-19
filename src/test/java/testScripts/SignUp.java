package testScripts;

import org.testng.annotations.Test;

import generic.BaseClass;
import pom.GetStartedPage;
import pom.HomePage;

public class SignUp extends BaseClass {
    // HomePage h=new HomePage(driver);
    // GetStartedPage gsp=new GetStartedPage(driver);

    @Test
    public void signUp(){
        HomePage h=new HomePage(driver);
        GetStartedPage gsp=new GetStartedPage(driver);

        driver.get("https://qa.pensionbox.in/");
        h.getGetStartedBtn().click();
        gsp.getGetStartedPhoneNumberTF().sendKeys("8088634021");
        gsp.getGetStartedSignUpBtn().click();
        gsp.getGetStartedOtpTF().sendKeys("3"+"9"+"9"+"1");
    }
    
}

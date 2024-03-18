package testScripts;


import org.testng.annotations.Test;

import generic.BaseClass;
import pom.HomePage;

public class SignUp extends generic.BaseClass {
    @Test
    public void createAccount(){
        driver.get("https://qa.pensionbox.in/");
        HomePage h=new HomePage(driver);
        h.getGetStartedBtn().click();
    }
}

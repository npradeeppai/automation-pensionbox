package testScripts;

import java.util.Scanner;

import org.testng.annotations.Test;

// import generic.BaseClass;
import generic.BaseClassForIndividualTests;
import pom.DashboardPage;
import pom.HomePage;
import pom.KycPage;
import pom.LoginPage;

public class KycFlow extends BaseClassForIndividualTests{
    @Test
    public void login(){
        HomePage h1=new HomePage(driver);
        LoginPage l1=new LoginPage(driver);
        driver.get("https://qa.pensionbox.in");
        h1.getLoginBtn().click();
        l1.getLogInPhoneNumberTF().sendKeys("8088634021");
        l1.getLogInLoginBtn().click();
        l1.getLogInOtpTF().sendKeys("3"+"9"+"9"+"1");
        /*
         * 
         */
        DashboardPage dp=new DashboardPage(driver);
        KycPage kp=new KycPage(driver);
        dp.getcompleteKycBtn().click();
        kp.getPanNumberTF().sendKeys("DWQPP6585N");
        kp.getProceedWithDigiBtn().click();
        kp.getDigiAadhaarNumberTF().sendKeys("7"+"2"+"2"+"2"+"3"+"6"+"4"+"4"+"2"+"1"+"8"+"9");
        kp.getDigiNextBtn().click();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Otp Here: ");
        String otp = in.nextLine();
        System.out.println("Otp recorded: "+otp);

        kp.getDigiOtpTF().sendKeys(otp);
        in.close();
        kp.getDigiSubmitOtpBtn().click();
        kp.getDigiPinTF().sendKeys("5"+"7"+"6"+"2"+"1"+"9");
        kp.getDigiSubmitOtpBtn().click();
        kp.getDigiAllowBtn().click();
    }


    @Test
    public void completekyc(){
        DashboardPage dp=new DashboardPage(driver);
        KycPage kp=new KycPage(driver);
        dp.getcompleteKycBtn().click();
        kp.getPanNumberTF().sendKeys("DWQPP6585N");
        kp.getProceedWithDigiBtn().click();
        kp.getDigiAadhaarNumberTF().sendKeys("7"+"2"+"2"+"2"+"3"+"6"+"4"+"4"+"2"+"1"+"8"+"9");
        kp.getDigiNextBtn().click();
        // NEED TO MAKE SOME CHANGES HERE
        // Scanner in=new Scanner(System.in);
        String otp=null;
        kp.getDigiOtpTF().sendKeys(otp);
        // in.close();
        kp.getDigiSubmitOtpBtn().click();
        kp.getDigiPinTF().sendKeys("5"+"7"+"6"+"2"+"1"+"9");
        kp.getDigiSubmitOtpBtn().click();
        kp.getDigiAllowBtn().click();

        
    }
}

package testScripts;

import java.io.Console;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
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
        l1.getLogInPhoneNumberTF().sendKeys("9844267177");
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
        // Scanner in=new Scanner(System.in);
        // System.out.println("Enter Otp Here: ");
        // String otp = in.nextLine();
        // System.out.println("Otp recorded: "+otp);

        // kp.getDigiOtpTF().sendKeys(otp);
        // in.close();
        //kp.getDigiSubmitOtpBtn().click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("verify_pin_button")));
        kp.getDigiPinTF().sendKeys("5"+"7"+"6"+"2"+"1"+"9");
        kp.getDigiPinDoneBtn().click();
        kp.getDigiAllowBtn().click();
        Reporter.log("KYC FINISHED");
    }
        
    
}

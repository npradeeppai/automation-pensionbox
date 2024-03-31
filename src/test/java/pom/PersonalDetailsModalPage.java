package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalDetailsModalPage {
    @FindBy(xpath = "//input[@name='mobileNumber']")
    private WebElement PDM_MobileNumberTF;

    @FindBy(xpath = "//input[@name='emailAddress']")
    private WebElement PDM_EmailAddressTF;

    @FindBy(xpath = "//label[text()='DOB']/..//input")
    private WebElement PDM_DateOfBirthTF;

    @FindBy(xpath = "//input[@name='gender']")
    private WebElement PDM_GenderDropDown;

    @FindBy(xpath = "//input[@name='countryOfBirthLabel']")
    private WebElement PDM_CountryOfBirthTF;

    @FindBy(xpath = "//input[@name='nationality']")
    private WebElement PDM_NationalityTF;

    @FindBy(xpath = "//div[text()='Resident Indian']")
    private WebElement PDM_ResidentFlagTF;
    

}

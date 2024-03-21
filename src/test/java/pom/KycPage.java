package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KycPage {
    @FindBy(xpath = "//input[@name='PAN']")
    private WebElement panNumberTF;

    @FindBy(xpath = "//div[contains(@class,'closeIcon')]")
    private WebElement kycCloseBtn;
}

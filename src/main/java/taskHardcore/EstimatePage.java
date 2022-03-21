package taskHardcore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EstimatePage extends AbstractPage {
    public EstimatePage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath = "//button[@id=\"email_quote\"]")
    WebElement buttonEmail;
    @FindBy(xpath ="//input[@id=\"input_533\"]")
    WebElement email;
    @FindBy(xpath = "//button[@aria-label=\"Send Email\"]")
    WebElement buttonSendEmail;
    @FindBy(xpath = "//h2/b[@class=\"ng-binding\"]")
    WebElement cost;

public EstimatePage clickButtonEmail(){
    buttonEmail.click();
    return this;
}
    public EstimatePage sendEmail(String emailAddress){
    email.sendKeys(emailAddress);
    waitForElementClickable(buttonSendEmail).click();
        return this;
    }
    public boolean isEstimateCostEqualsInEmail(String costEmail){
    return isFieldMatchedToEntered(costEmail,cost);
    }

}



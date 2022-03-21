package taskHurtMePlenty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractPage {

    protected  WebDriver webDriver;


    public AbstractPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);

    }

    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        webDriver.quit();
    }
    public WebElement waitForElementVisible(WebElement webElement){
     return new WebDriverWait(webDriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(webElement));
    }
    public WebElement waitForElementClickable(WebElement webElement){
        return new WebDriverWait(webDriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(webElement));
    }
    public boolean isFieldMatchedToEntered(String value, WebElement field){
        if( field.getText().contains(value)){
            return true;
        }
        return false;


    }


}

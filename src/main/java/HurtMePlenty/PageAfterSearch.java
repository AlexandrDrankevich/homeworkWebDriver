package HurtMePlenty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageAfterSearch extends AbstractPage {

    public PageAfterSearch(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//b[contains (text(), 'Google Cloud Pricing')]")
    // @FindBy(xpath ="//body/section[1]/section[1]/main[1]/devsite-content[1]/article[1]/article[1]/div[1]/devsite-cse[1]/devsite-analytics-scope[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement calculator;


    public CalculatorPage openCalculator() throws InterruptedException {

       waitForElementVisible(calculator).click();
        return new CalculatorPage(webDriver);

    }


}



package taskICanWin;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverSeleniumPage1 {
    private static String url = "https://pastebin.com";
    private WebDriver webDriver;

    public WebDriverSeleniumPage1(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);

    }

    @FindBy(xpath = "//textarea[@id='postform-text']")
    WebElement pasteCode;

    @FindBy(xpath = "//span[@id='select2-postform-expiration-container']")
    WebElement openSelectionExpiration;
    @FindBy(xpath = "//body[1]/span[2]/span[1]/span[2]/ul[1]/li[3]")
    WebElement pasteExpiration;

    @FindBy(xpath = "//input[@id='postform-name']")
    WebElement pasteName;

    @FindBy(xpath = "//button[contains(text(),'Create New Paste')]")
    WebElement createNewPaste;

    public WebDriverSeleniumPage1 pageOpen() {
        webDriver.get(url);
        return this;
    }

    public WebDriverSeleniumPage1 pasteCode() {

        pasteCode.sendKeys("Hello from WebDriver");
        return this;
    }


    public WebDriverSeleniumPage1 pasteExpiration() {
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView();",openSelectionExpiration);
      new WebDriverWait(webDriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(openSelectionExpiration)).click();
      new WebDriverWait(webDriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(pasteExpiration)).click();

        return this;

    }

    public WebDriverSeleniumPage1 pasteName() {
        pasteName.sendKeys("helloweb");
        return this;
    }

    public WebDriverSeleniumPage1 createNewPaste() {

        new WebDriverWait(webDriver, Duration.ofSeconds(3)).until((ExpectedConditions.visibilityOf(createNewPaste))).click();
        return this;
    }
}

package taskBringItOn;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebDriverSeleniumHomePage extends WebDriverSeleniumAbstractPage {
    private String url = "https://pastebin.com";
    private String name = "how to gain dominance among developers";

    public WebDriverSeleniumHomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//textarea[@id='postform-text']")
    WebElement pasteCode;
    @FindBy(xpath = "//input[@id='postform-name']")
    WebElement pasteName;
    @FindBy(xpath = "//span[@id='select2-postform-expiration-container']")
    WebElement openSelectionExpiration;
    @FindBy(xpath = "//body[1]/span[2]/span[1]/span[2]/ul[1]/li[3]")
    WebElement pasteExpiration;
    @FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/label[1]")
    WebElement switchHighLighting;
    @FindBy(xpath = "//span[@id='select2-postform-format-container']")
    WebElement openSelectionHighLighting;
    @FindBy(xpath = "/html[1]/body[1]/span[2]/span[1]/span[2]/ul[1]/li[2]/ul[1]/li[1]")
    WebElement selectSyntaxHighLighting;
    @FindBy(xpath = "//button[contains(text(),'Create New Paste')]")
    WebElement createNewPaste;

    public WebDriverSeleniumHomePage pageOpen() {
        webDriver.get(url);
        return this;
    }

    public WebDriverSeleniumHomePage pasteCode() {
        pasteCode.sendKeys(code);
        return this;
    }

    public WebDriverSeleniumHomePage pasteExpiration() {
        openSelectionExpiration.click();
        pasteExpiration.click();
        return this;
    }

    public WebDriverSeleniumHomePage pasteName() {
        pasteName.sendKeys(name);
        return this;
    }

    public WebDriverSeleniumHomePage turnOnHighLighting() {
        switchHighLighting.click();
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", switchHighLighting);
        openSelectionHighLighting.click();
        selectSyntaxHighLighting.click();
        return this;
    }

    public WebDriverSeleniumNewPage createNewPaste() {
        createNewPaste.click();
        return new WebDriverSeleniumNewPage(webDriver);
    }


}

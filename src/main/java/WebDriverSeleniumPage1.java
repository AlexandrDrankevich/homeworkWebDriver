import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebDriverSeleniumPage1 {
    private static String  url= "https://pastebin.com";
    private WebDriver webDriver;
    public WebDriverSeleniumPage1(WebDriver webDriver){
        this.webDriver=webDriver;
        PageFactory.initElements(webDriver,this);

    }
    @FindBy (xpath = "//textarea[@id='postform-text']")
    WebElement pasteCode;
    @FindBy(xpath = "//li[@id='select2-postform-expiration-result-4l2v-10M']")
    WebElement pasteExpiration;
    @FindBy(xpath = "//input[@id='postform-name']")
    WebElement pasteName;

    public WebDriverSeleniumPage1 pageOpen(){
        webDriver.get(url);
        return this;
    }

    public WebDriverSeleniumPage1 pasteCode(){

        pasteCode.sendKeys("Hello from WebDriver");
        return this;
    }
    public WebDriverSeleniumPage1 pasteExpiration(){
        pasteExpiration.click();
        return this;

    }

    public WebDriverSeleniumPage1 pasteName(){
        pasteName.sendKeys("helloweb");
        return this;
    }
}

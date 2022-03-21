package taskHardcore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YopMailPage {
   private  static WebDriver webDriver;
    private String url = "https://yopmail.com/";
    protected String login="54y54thgrhgh";

   public YopMailPage(WebDriver webDriver){
        this.webDriver=webDriver;
       PageFactory.initElements(webDriver, this);
    }
    @FindBy(xpath = "//input[@id='login']")
    WebElement fieldLogin;
   @FindBy(xpath ="//i[contains(text(),'\uE5C8')]")
   WebElement enterButton;
   @FindBy(xpath = "//div[@class=\"bname\"]")
   WebElement email;
   @FindBy(xpath  ="//button[@id='refresh']")
   WebElement refresh;
   @FindBy(xpath = "//iframe[@id='ifmail']")
   WebElement newFrame;
   @FindBy(xpath = "//td[2]/h3")
   WebElement cost;

    public YopMailPage openPage(){
       webDriver.get(url);
       return this;
    }
    public YopMailPage openEmail(){
        fieldLogin.sendKeys(login);
        enterButton.click();
        return this;
    }
    public String getEmailAddress(){
        return email.getText();
    }
    public YopMailPage clickRefresh(){
        refresh.click();
        return this;
    }
    public String getCost(){
        webDriver.switchTo().frame(newFrame);
        return cost.getText();
    }
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
       webDriver.quit();
    }


}

package taskHardcore;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }
    private String url = "https://cloud.google.com/";

    private String name = "how to gain dominance among developers";

    @FindBy(xpath = "//devsite-header/div[1]/div[1]/div[1]/div[1]/div[2]/devsite-search[1]/form[1]/div[1]/div[1]/input[1]")
    WebElement openSearch;



    public HomePage pageOpen(){
        webDriver.get(url);
        return this;
    }

    public PageAfterSearch search(String request) {
        openSearch.click();
        openSearch.sendKeys(request);
        openSearch.sendKeys(Keys.ENTER);

        return new PageAfterSearch(webDriver);
    }



}

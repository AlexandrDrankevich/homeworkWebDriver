package taskBringItOn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebDriverSeleniumNewPage extends WebDriverSeleniumAbstractPage {

    public WebDriverSeleniumNewPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//a[contains(text(),'Bash')]")
    WebElement bash;


    public String searchTitleName() {
        System.out.println(webDriver.getTitle());
        return webDriver.getTitle();
    }

    public boolean SyntaxHighlighting() {
        if (bash.getText().contains("Bash")) {
            return true;
        }
        return false;
    }
}



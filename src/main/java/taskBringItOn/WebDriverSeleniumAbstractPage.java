package taskBringItOn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class WebDriverSeleniumAbstractPage {

    protected  WebDriver webDriver;
    protected String code = "git config --global user.name  \"New Sheriff in Town\"\n" +
            "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
            "git push origin master --force";

    public WebDriverSeleniumAbstractPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        webDriver.quit();
    }
}

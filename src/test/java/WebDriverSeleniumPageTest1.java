import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import taskICanWin.WebDriverSeleniumPage1;

public class WebDriverSeleniumPageTest1 {
    private static WebDriverSeleniumPage1 webDriver;
    private static WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void webDriverLoad() {
        webDriver = new WebDriverSeleniumPage1(driver);
    }

    @Test
    public void testWebPage() throws InterruptedException {
        webDriver.pageOpen().pasteCode().pasteExpiration().pasteName();
        Thread.sleep(3000);
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();

    }


}

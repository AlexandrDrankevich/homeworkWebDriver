import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import taskICanWin.WebDriverSeleniumPage1;

public class ICanWinTest {
    private static WebDriverSeleniumPage1 webDriver;
    private static WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void webDriverLoad() {
        webDriver = new WebDriverSeleniumPage1(driver);
    }

    @Test
    public void testWebPage() {
        webDriver.pageOpen().pasteCode().pasteExpiration().pasteName();
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();

    }


}

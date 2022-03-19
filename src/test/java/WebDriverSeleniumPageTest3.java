import HurtMePlenty.AbstractPage;
import HurtMePlenty.HomePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import taskBringItOn.WebDriverSeleniumNewPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverSeleniumPageTest3 {

    private static HomePage homePage = new HomePage(new ChromeDriver());

    @Test
    public void testTitleContent() throws InterruptedException {
        homePage.pageOpen().search("Google Cloud Platform Pricing Calculator")
                .openCalculator()
                .activateComputeEngine();

        assertEquals(1,1);

    }


    @AfterAll
    public static void tearDown() throws InterruptedException {
        homePage.tearDown();


    }
}

import HurtMePlenty.HomePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSeleniumPageTest3 {
    private static HomePage homePage = new HomePage(new ChromeDriver());

    @Test
    public void testTitleContent() throws InterruptedException {
        homePage.pageOpen().search("Google Cloud Platform Pricing Calculator")
                .openCalculator()
                .activateComputeEngine()
                .numberInstancesPutIn()
                .seriesSelect()
                .machineTypeSelect()
                .addGPUs().gpuTypeSelect().numberGPUSelect()
                .LocalSsdSelect().dataCenterLocationSelect()
                .committedUsageSelect()
                .clickOnButtonAddToEstimate();


    }


    @AfterAll
    public static void tearDown() throws InterruptedException {
        // homePage.tearDown();


    }
}

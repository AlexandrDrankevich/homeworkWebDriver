import HurtMePlenty.EstimatePage;
import HurtMePlenty.HomePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebDriverSeleniumPageTest3 {
    private static HomePage homePage = new HomePage(new ChromeDriver());

    @Test
    public void testUserIsAbleToUseCalculator() throws InterruptedException {
        EstimatePage estimatePage = homePage.pageOpen().search("Google Cloud Platform Pricing Calculator")
                .openCalculator()
                .activateComputeEngine()
                .numberInstancesPutIn()
                .seriesSelect()
                .machineTypeSelect()
                .addGPUs().gpuTypeSelect().numberGPUSelect()
                .LocalSsdSelect().dataCenterLocationSelect()
                .committedUsageSelect()
                .clickOnButtonAddToEstimate();
        assertTrue(estimatePage.isVmClassMatchedValue("regular"));
        assertTrue(estimatePage.isInstanceTypeMatchedValue("n1-standard-8"));
        assertTrue(estimatePage.isRegionMatchedValue("Frankfurt"));
        assertTrue(estimatePage.isLocalSSDMatchedValue("2x375 GiB"));
        assertTrue(estimatePage.isCommitmentTermMatchedValue("1 Year"));

    }

    @AfterAll
    public static void tearDown() throws InterruptedException {
         homePage.tearDown();
    }
}

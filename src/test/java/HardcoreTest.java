import taskHardcore.EstimatePage;
import taskHardcore.HomePage;
import taskHardcore.YopMailPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HardcoreTest {
    private static HomePage homePage = new HomePage(new ChromeDriver());
    private static YopMailPage yopMailPage;

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
                .clickOnButtonAddToEstimate().clickButtonEmail();
        yopMailPage=new YopMailPage(new ChromeDriver())
                .openPage()
                .openEmail();
        estimatePage.sendEmail(yopMailPage.getEmailAddress());
        Thread.sleep(4000);
        String costInEmail = yopMailPage.clickRefresh().clickRefresh().getCost();
        assertTrue(estimatePage.isEstimateCostEqualsInEmail(costInEmail));


    }

    @AfterAll
    public static void tearDown() throws InterruptedException {
     homePage.tearDown();
     yopMailPage.tearDown();


    }
}

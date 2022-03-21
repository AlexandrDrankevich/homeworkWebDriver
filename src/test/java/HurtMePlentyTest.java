import taskHurtMePlenty.EstimatePage;
import taskHurtMePlenty.HomePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class HurtMePlentyTest {
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
assertAll(
        ()-> assertTrue(estimatePage.isVmClassMatchedValue("regular"),"VmClass value is not equals regular"),
        ()->  assertTrue(estimatePage.isInstanceTypeMatchedValue("n1-standard-8"),"InstanceType value is not equals n1-standard-8"),
        ()->  assertTrue(estimatePage.isRegionMatchedValue("Frankfurt"),"Region value is not equals Frankfurt"),
        ()-> assertTrue(estimatePage.isLocalSSDMatchedValue("2x375 GiB"),"LocalSSD value is not equals 2x375 GiB"),
        ()->  assertTrue(estimatePage.isCommitmentTermMatchedValue("1 Year"),"CommitmentTerm value is not equals 1 Year")
);
    }

    @AfterAll
    public static void tearDown() throws InterruptedException {
         homePage.tearDown();
    }
}

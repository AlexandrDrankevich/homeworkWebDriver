import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverSeleniumPageTest1 {
    private  static WebDriverSeleniumPage1 webDriver;
    private  static WebDriver driver=new ChromeDriver();

    @BeforeAll
    public static void webDriverLoad(){
         webDriver=new WebDriverSeleniumPage1(driver);
    }

    @Test
public void testWebPage() throws InterruptedException {
       // driver.get("https://pastebin.com");
       // driver.findElement(By.xpath("//textarea[@id='postform-text']")).sendKeys("Hello from WebDriver");
        webDriver.pageOpen();
        webDriver.pasteCode();

        webDriver.pasteName();
        webDriver.pasteExpiration();


        Thread.sleep(3000);


    }
    @AfterAll
    public static void tearDown(){
        driver.quit();

    }


}

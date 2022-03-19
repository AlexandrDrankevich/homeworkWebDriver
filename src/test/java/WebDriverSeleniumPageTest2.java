import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import taskBringItOn.WebDriverSeleniumHomePage;
import taskBringItOn.WebDriverSeleniumNewPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebDriverSeleniumPageTest2 {
    private static WebDriverSeleniumHomePage webDriver=new WebDriverSeleniumHomePage();
    private static WebDriverSeleniumNewPage newPage;

    @BeforeAll
    public static void webDriverLoad() throws InterruptedException {

        newPage=webDriver.pageOpen().pasteCode().turnOnHighLighting().pasteExpiration().pasteName().createNewPaste();
    }

    @Test
    public void testTitleContent() {

        assertEquals("how to gain dominance among developers - Pastebin.com", newPage.searchTitleName(),
                "title is not equals expected");
    }

    @Test
    public void testSyntaxHighlightingChoice() throws InterruptedException {
        assertTrue(newPage.SyntaxHighlighting(), "Choise of Syntax Highlighting is not equals Bash");
        Thread.sleep(3000);
    }


    @AfterAll
    public static void tearDown() throws InterruptedException {
        webDriver.tearDown();


    }
}
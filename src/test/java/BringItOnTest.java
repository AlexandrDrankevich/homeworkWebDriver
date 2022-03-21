import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import taskBringItOn.WebDriverSeleniumHomePage;
import taskBringItOn.WebDriverSeleniumNewPage;

import static org.junit.jupiter.api.Assertions.*;

public class BringItOnTest {

    private static WebDriverSeleniumHomePage homePage = new WebDriverSeleniumHomePage(new ChromeDriver());

    @Test
    public void testInputInformation() throws InterruptedException {

        WebDriverSeleniumNewPage newPage = homePage.pageOpen()
                .pasteCode()
                .turnOnHighLighting()
                .pasteExpiration()
                .pasteName()
                .createNewPaste();
        Thread.sleep(3000);

        assertAll(
                () -> assertEquals("how to gain dominance among developers - Pastebin.com", newPage.searchTitleName(),
                        "title is not equals expected"),
                () -> assertTrue(newPage.SyntaxHighlighting(), "Choise of Syntax Highlighting is not equals Bash"),
                () -> assertTrue(newPage.checkCodeInput(), "code text is not equals input code text")
        );
    }

    @AfterAll
    public static void tearDown() {
        homePage.tearDown();


    }
}

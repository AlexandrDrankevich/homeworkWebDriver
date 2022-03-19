package HurtMePlenty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorPage extends AbstractPage{
   public CalculatorPage(WebDriver webDriver){
       super(webDriver);
   }
   // @FindBy(xpath = "//div[contains( text(),Compute Engine]")
            @FindBy(xpath = "//html[@ng-app=\"cloudpricingcalculator\"]//div[@layout='column'] //div[@class='name ng-binding' and contains(text(),'Compute Engine')]")
   // @FindBy(xpath ="//a[contains(text(),'Contact Us')]")
    WebElement computeEngine;


    public CalculatorPage activateComputeEngine()  {
        webDriver.switchTo().frame(webDriver.findElement(By.xpath("/html[1]/body[1]/section[1]/section[1]/main[1]/devsite-content[1]/article[1]/div[2]/article[1]/devsite-iframe[1]/iframe[1]")));
       webDriver.switchTo().frame("myFrame");
        waitForElementVisible(computeEngine).click();
        return new CalculatorPage(webDriver);

    }
}

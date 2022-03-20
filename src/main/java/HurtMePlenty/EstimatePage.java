package HurtMePlenty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EstimatePage extends AbstractPage{
    public EstimatePage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath = "//md-list[1]//div[contains( text(), 'VM class: regular')]")
    WebElement vmClass;
    @FindBy(xpath = "//md-list[1]//div[contains( text(), 'Instance type: n1-standard-8')]")
    WebElement instanceType;
    @FindBy(xpath = "//md-list[1]//div[contains( text(), 'Frankfurt')]")
    WebElement region;
    @FindBy(xpath = "//md-list[1]//div[contains( text(), 'Local SSD: 2x375 GiB')]")
    WebElement localSSD;
    @FindBy(xpath = "//md-list[1]//div[contains( text(), 'Commitment term: 1 Year')]")
    WebElement term;



    public boolean isVmClassMatchedValue (String value){
       return isFieldMatchedToEntered(value,vmClass);
    }
    public boolean isInstanceTypeMatchedValue (String value){
        return isFieldMatchedToEntered(value,instanceType);
    }

    public boolean isRegionMatchedValue (String value){
        return isFieldMatchedToEntered(value,region);
    }
    public boolean isLocalSSDMatchedValue (String value){
        return isFieldMatchedToEntered(value,localSSD);
    }
    public boolean isCommitmentTermMatchedValue (String value){
        return isFieldMatchedToEntered(value,term);
    }
}



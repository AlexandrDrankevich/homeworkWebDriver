package HurtMePlenty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorPage extends AbstractPage{
   public CalculatorPage(WebDriver webDriver){
       super(webDriver);
   }

   @FindBy(xpath = "//div[@class='name ng-binding' and contains(text(),'Compute Engine')]")
    WebElement computeEngine;
   @FindBy(xpath = "//input[@id=\"input_80\"]")
   WebElement numberInstances;

   @FindBy(xpath ="//md-select-value[@id=\"select_value_label_75\"]")
   WebElement seriesOpen;
   @FindBy(xpath ="//md-option[@id=\"select_option_220\"]")
   WebElement seriesSelect;

    @FindBy(xpath ="//md-select-value[@id=\"select_value_label_76\"]")
    WebElement machineTypeOpen;
    @FindBy(xpath ="//md-option[@id=\"select_option_423\"]")
    WebElement typeSelect;

    @FindBy(xpath = "//md-input-container/md-checkbox/div[contains(text(),'Add GPUs')]")
    WebElement gpus;

    @FindBy(xpath ="//md-select[@placeholder=\"Number of GPUs\"]")
    WebElement numberGPUsOpen;
    @FindBy(xpath ="//md-option[@id=\"select_option_467\"]")
    WebElement numberGPU;

    @FindBy(xpath ="//md-select[@placeholder=\"GPU type\"]")
    WebElement gpuTypeOpen;
    @FindBy(xpath ="//md-option[@id=\"select_option_464\"]")  //463 TeslaV100
    WebElement gpuType;

    @FindBy(xpath ="//md-select-value[@id=\"select_value_label_417\"]")
    WebElement localSsdOpen;
    @FindBy(xpath ="//md-option[@id=\"select_option_444\"]")
    WebElement localSSD;

    @FindBy(xpath ="//md-select-value[@id=\"select_value_label_78\"]")
    WebElement locationOpen;
    @FindBy(xpath ="//md-option[@id=\"select_option_241\"]")
    WebElement location;

    @FindBy(xpath ="//md-select-value[@id=\"select_value_label_79\"]")
    WebElement usageOpen;
    @FindBy(xpath ="//md-option[@id=\"select_option_118\"]")
    WebElement committedUsage;

    @FindBy(xpath = "//md-card/md-card-content/div/div[1]//button[@aria-label=\"Add to Estimate\"]")
    WebElement buttonAddToEstimate;


    public CalculatorPage activateComputeEngine()  {
        webDriver.switchTo().frame(webDriver.findElement(By.xpath("/html[1]/body[1]/section[1]/section[1]/main[1]/" +
                "devsite-content[1]/article[1]/div[2]/article[1]/devsite-iframe[1]/iframe[1]")));
       webDriver.switchTo().frame("myFrame");
        waitForElementVisible(computeEngine).click();
        return new CalculatorPage(webDriver);

    }

    public CalculatorPage numberInstancesPutIn(){
        numberInstances.sendKeys("4");
        return this;
    }

    public CalculatorPage seriesSelect(){
        seriesOpen.click();
        waitForElementVisible(seriesSelect).click();
        return this;
    }

    public CalculatorPage machineTypeSelect(){
        machineTypeOpen.click();
        waitForElementVisible(typeSelect).click();
        return this;
    }

    public CalculatorPage addGPUs() throws InterruptedException {
        gpus.click();
        return this;
    }
    public CalculatorPage gpuTypeSelect(){
        waitForElementVisible(gpuTypeOpen).click();
        waitForElementVisible(gpuType).click();
        return this;
    }



    public CalculatorPage numberGPUSelect(){
        waitForElementVisible(numberGPUsOpen).click();
        waitForElementClickable(numberGPU).click();
        return this;
    }

    public CalculatorPage LocalSsdSelect(){
        localSsdOpen.click();
        waitForElementVisible(localSSD).click();
        return this;
    }
    public CalculatorPage dataCenterLocationSelect(){
        locationOpen.click();
        waitForElementVisible(location).click();
        return this;
    }
    public CalculatorPage committedUsageSelect(){
        usageOpen.click();
        waitForElementVisible(committedUsage).click();
        return this;
    }
    public EstimatePage clickOnButtonAddToEstimate() throws InterruptedException {
        Thread.sleep(3000);
        buttonAddToEstimate.click();
        return new EstimatePage(webDriver);
    }


}

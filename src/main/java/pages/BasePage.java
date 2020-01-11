package pages;


import helper.factory.Browser;
import helper.factory.MyLogger;
import helper.factory.WebDriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public abstract class BasePage {

    public Browser browser;
    public  WebDriver driver;


    public BasePage(){

        browser=new Browser();
        driver=browser.init();
        browser.open();
        PageFactory.initElements(driver,this);


    }
    public void close()  {
         browser.close();
    }




    public void waitIfElementIsClickable(WebElement element, int time ) {
        WebDriverWait wait = new WebDriverWait(driver, time);

        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitIfElementIsClickable(WebElement element) {

        waitIfElementIsClickable(element, 20);

    }

    public void waitIfElementIsEnabled(WebElement element, int time) {

        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void waitIfElementIsEnabled(WebElement element) {

        waitIfElementIsEnabled(element, 20);

    }

    public void waitIfElementIsClickableFluent(WebElement element, int Timeout, int Polling) {

        Wait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(Timeout))
                .pollingEvery(Duration.ofSeconds(Polling))
                .ignoring(Exception.class);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitIfElementIsClickableFluent(WebElement element) {

        waitIfElementIsClickableFluent(element, 20, 5);

    }

    public WebElement getClickableElement(WebElement element) {

        waitIfElementIsClickableFluent(element);
        return element;
    }

    public WebElement getEnabledElement(WebElement element) {

        waitIfElementIsEnabled(element);
        return element;
    }

    public WebElement getClickableFluentElement(WebElement element) {

        waitIfElementIsClickableFluent(element);
        return element;
    }


    public void clickIfElementIsClickable(WebElement element) {

        waitIfElementIsClickable(element);
        element.click();
    }

    public void clickIfElementIsClickableFluent(WebElement element) {

        waitIfElementIsClickableFluent(element);
        element.click();
    }

    public void clickIfElementIsEnabled(WebElement element) {

        waitIfElementIsEnabled(element);
        element.click();
    }

    public void clearField(WebElement element) {

        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
    }


}

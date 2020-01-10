package pages;


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
import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public abstract class BasePage {


    protected static WebDriver driver;
    public static Locale locale;
    public static ResourceBundle exampleBundle;
    static String url = "https://web.uk.test6.maratest.info/en/casino/lobby";

    public BasePage(){

        if (Objects.isNull(driver)) {
            driver = WebDriverSingleton.init();
        }

        PageFactory.initElements(driver,this);

        driver.manage().window().maximize();
        driver.get(url);
        driverWait(10);
        locale =new Locale(System.getProperty("locale"));
        MyLogger.info(locale+" selected");
        exampleBundle =ResourceBundle.getBundle("ResourceBundle",locale);

    }
    public void close()  {


        WebDriverSingleton.kill(driver);
        driver = null;
    }

    public void driverWait(int time){

        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }


    public void refreshPage(){

        driver.navigate().refresh();
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

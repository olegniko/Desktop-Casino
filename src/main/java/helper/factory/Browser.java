package helper.factory;

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

public  class Browser {


    protected  WebDriver driver;
    public static Locale locale;
    public static ResourceBundle exampleBundle;
    static String url = "https://web.uk.test6.maratest.info/en/casino/lobby";


    public WebDriver open() {
        if (Objects.isNull(driver)) {
            driver = WebDriverSingleton.init();
        }

		PageFactory.initElements(driver,this);
		driver.manage().window().maximize();
		driver.get(url);
        locale =new Locale(System.getProperty("locale"));
		MyLogger.info(locale+" selected");
        exampleBundle =ResourceBundle.getBundle("ResourceBundle",locale);

        return driver;
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

}

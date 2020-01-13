package helper.factory;

import org.openqa.selenium.WebDriver;

import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class Browser {


    public static WebDriver driver;
    public static Locale locale;
    public static Locale localeServer;
    public static ResourceBundle exampleBundle;
    public static ResourceBundle exampleBundleServer;
    String url;


    public WebDriver init() {
        if (Objects.isNull(driver)) {
            driver = WebDriverSingleton.init();
        }
        return driver;
    }


    public void open() {
        locale = new Locale(System.getProperty("locale"));
        MyLogger.info(locale + " selected");
        exampleBundle = ResourceBundle.getBundle("ResourceBundle", locale);

        localeServer = new Locale(System.getProperty("localeServer"));
        MyLogger.info(localeServer + " selected");
        exampleBundleServer = ResourceBundle.getBundle("ResourceBundle_server", localeServer);

        url = exampleBundleServer.getString("url");

        MyLogger.info(url + " is opening");

        driver.manage().window().maximize();
        driver.get(url);
        sleep(5);

    }

    public void close() {
        WebDriverSingleton.kill(driver);
        driver = null;
    }


    public static void sleep(int seconds) {
        try {

            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();
        }
    }

    public void driverWait(int time) {

        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

    }


    public void refreshPage() {

        driver.navigate().refresh();
    }

}







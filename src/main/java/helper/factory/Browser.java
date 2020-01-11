package helper.factory;

import org.openqa.selenium.WebDriver;

import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class Browser {


    public static WebDriver driver;
    public static Locale locale;
    public static ResourceBundle exampleBundle;
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
        String server = System.getProperty("server");
        MyLogger.info(server + " selected");

        switch (server) {
            case ("cur2"):
                url = exampleBundle.getString("url_cur2");
                break;
            case ("ald2"):
                url = exampleBundle.getString("url_ald2");
                break;
            case ("es1"):
                url = exampleBundle.getString("url_es1");
                break;
            case ("dk1"):
                url = exampleBundle.getString("url_dk1");
                break;

        }
        MyLogger.info(url + " is opening");
        driver.manage().window().maximize();
        driver.get(url);
        driverWait(10);

    }

    public void close() {
        WebDriverSingleton.kill(driver);
        driver = null;
    }


    public void driverWait(int time) {

        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

    }


    public void refreshPage() {

        driver.navigate().refresh();
    }

}







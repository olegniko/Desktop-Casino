package helper.factory;

import org.openqa.selenium.WebDriver;
import java.net.MalformedURLException;

public class WebDriverSingleton {


    public static WebDriver init() {

        String browser = System.getProperty("browser", "chrome");
        WebDriverFactory factory;


        if ("chrome".equalsIgnoreCase(browser)){

            factory = new ChromeDriverFactory();
            MyLogger.info("Chrome selected");

       }
        else if("firefox".equalsIgnoreCase(browser)) {

            factory = new FirefoxDriverFactory();
            MyLogger.info("Firefox selected");

       }
        else if("opera".equalsIgnoreCase(browser)) {

            factory = new OperaDriverFactory();
            MyLogger.info("Opera selected");

        }
        else if("edge".equalsIgnoreCase(browser)) {

            factory = new EdgeDriverFactory();
            MyLogger.info("Edge selected");

        }
        else{

            factory = new ChromeDriverFactory();
            MyLogger.info("Chrome selected");

        }

        try {

            return factory.create();

        } catch (MalformedURLException e) {

            throw new RuntimeException("Failed to init browser", e);

        }



    }

    public static void kill(WebDriver driver) {

        driver.quit();
    }
}


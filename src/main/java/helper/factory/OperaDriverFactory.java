package helper.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

/**
 * Created by User on 03.01.2019.
 */
public class OperaDriverFactory extends WebDriverFactory {
    @Override

        public WebDriver create() {

        System.setProperty("webdriver.opera.driver", "./src/main/resources/operadriver.exe");

        OperaOptions options = new OperaOptions();

        options.setBinary("C:\\Users\\nikulenko.o\\AppData\\Local\\Programs\\Opera\\launcher.exe");


        return new OperaDriver(options);


    }

}


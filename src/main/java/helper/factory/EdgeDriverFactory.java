package helper.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

/**
 * Created by User on 03.01.2019.
 */
public class EdgeDriverFactory extends WebDriverFactory {
    @Override
    public WebDriver create() {

        System.setProperty("webdriver.edge.driver", "./src/main/resources/msedgedriver.exe");

        EdgeOptions edgeOptions = new EdgeOptions();

        return new EdgeDriver(edgeOptions);

    }
}

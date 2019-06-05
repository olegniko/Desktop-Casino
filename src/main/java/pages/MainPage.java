package pages;

import helper.factory.WebDriverSingleton;
import org.openqa.selenium.support.PageFactory;
import java.net.MalformedURLException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;


public  class MainPage extends BasePage {


	public MainPage(String browser) throws MalformedURLException {

		driver = WebDriverSingleton.init(browser);
		PageFactory.initElements(driver, this);
	}

	public void open(Locale locale)  {

		String lan;

		if ( locale.getLanguage() == null) {
			lan = "en";
		}
		else
			lan=locale.getLanguage();

		String url = "https://web.uk.test6.maratest.info/%lan%/casino/lobby".replace("%lan%", lan);

		driver.get(url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	}
	public void close()  {


		WebDriverSingleton.kill(driver);
	}

}

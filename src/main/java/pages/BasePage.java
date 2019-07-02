package pages;

import helper.factory.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;


public abstract  class BasePage {

	protected WebDriver driver;



	public BasePage(String browser) throws MalformedURLException {

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
		driver.manage().window().maximize();
		driverWait();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}
	public void close()  {


		WebDriverSingleton.kill(driver);
	}
	public void driverWait(){
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}


	public void refreshPage(){

		driver.navigate().refresh();
	}

	public void clickIfElementIsClickable(WebElement element1 ){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(element1));
		element.click();

	}

	public void waitIfElementIsClickable(WebElement element1 )  {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(element1));


	}



}

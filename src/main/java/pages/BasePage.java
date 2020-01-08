package pages;

import helper.factory.MyLogger;
import helper.factory.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;


public abstract  class BasePage {


	protected static WebDriver driver;
	public static Locale locale;
	public static ResourceBundle exampleBundle;
	static String url = "https://web.uk.test6.maratest.info/en/casino/lobby";

	public BasePage()  {

		if (Objects.isNull(driver)) {
			driver = WebDriverSingleton.init();
		}
		PageFactory.initElements(driver, this);
		driver.manage().window().maximize();
		driver.get(url);
		locale = new Locale(System.getProperty("locale"));
		MyLogger.info(locale+ " selected");
		exampleBundle = ResourceBundle.getBundle("ResourceBundle", locale);


	}
	public void close()  {


		WebDriverSingleton.kill(driver);
		driver = null;
	}

	public void driverWait(){
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}


	public void refreshPage(){

		driver.navigate().refresh();
	}

	public void clickIfElementIsClickable(WebElement element1 ){
		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.elementToBeClickable(element1));
		
		element1.click();
	}

	public void waitIfElementIsClickable(WebElement element1 ) {
		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.elementToBeClickable(element1));
	}



}

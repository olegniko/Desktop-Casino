package pages;

import helper.factory.WebDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.Locale;


public  class CasinoPage extends MainPage {

	public CasinoPage(String browser) throws MalformedURLException {
		super(browser);
	}

    @FindBy(xpath = "//*[@id=\"casino_app\"]/div/div/div/div[1]/nav/div[2]/casino-search-box")
    protected WebElement Search_Casino;

    public boolean isSearch(){

        return Search_Casino.isDisplayed();
    }
}

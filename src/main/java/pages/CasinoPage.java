package pages;

import helper.factory.WebDriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.Locale;


public  class CasinoPage extends MainPage {

	public CasinoPage(String browser) throws MalformedURLException {
		super(browser);
	}

    public void click_Casino(){
        Casino_label_header.click();
    }

    @FindBy(xpath = "//*[@id=\"casino_app\"]/div/div/div/div[1]/nav/div[2]/casino-search-box/div/input")
    protected WebElement Search_Casino;



    @FindBy( className = "gi-svg-button__base-layer ng-scope")
    protected WebElement Cross_In_Search;

    public WebElement getCross_In_Search(){
        return Cross_In_Search;
    }

    public void clearSearchInCasino(){

        Search_Casino.clear();
    }

    public void clearSearchInCasinoByCross(){

        Cross_In_Search.clear();
    }

    @FindBy(xpath = "//*[@id=\"loginMessage\"]/div")
    protected WebElement OK_In_successfull_Message;

    public void clickOK_In_successfull_Message(){

        OK_In_successfull_Message.sendKeys(Keys.ENTER);
    }

    @FindBy(xpath = "//*[@id=\"casino_app\"]/div/div/div/div[2]/casino-search-page/section/div/h1")
    protected WebElement Search_Result;

    public String getSearch_Result(){
        return Search_Result.getText();
    }


    @FindBy(xpath = "//*[@id=\"casino_app\"]/div/div/div/div[2]/casino-search-page/section/lazy-load-block/casino-game/div/div/div[2]/div")
    protected WebElement Game_Title_After_search;

    public String getGameTitleText(){
        return Game_Title_After_search.getText();
    }

    public WebElement getGameTitle(){
        return Game_Title_After_search;
    }


    public void click_Search_in_casino(){

        Search_Casino.click();
    }

    public void  enter_symbols_to_Search(String Symbols){

        Search_Casino.sendKeys(Symbols);
    }


}

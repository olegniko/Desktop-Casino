package pages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import java.net.MalformedURLException;



public  class CasinoPage extends MainPage {

	public CasinoPage(String browser) throws MalformedURLException {
		super(browser);
	}


    public void click_Casino(){
        Casino_label_header.click();
    }

    @FindBy(xpath = "//*[@id=\"casino_app\"]/div/div/div/div[1]/nav/div[2]/casino-search-box/div/input")
    protected WebElement Search_Casino;


    @FindBy( xpath = "//*[@id=\"casino_app\"]/div/div/div/div[1]/nav/div[1]/a[2]/svg-button[2]/div")
    protected WebElement Favourites;

    public WebElement getFavourites(){
        return Favourites;
    }

    @FindBy( xpath = "//*[@id=\"casino_app\"]/div/div/div/div[1]/nav/div[1]/a[2]/svg-button[2]")
    protected WebElement numberFavourites;

    public WebElement getNumberFavourites(){
        return numberFavourites;
    }



    @FindBy( xpath = "//*[@id=\"casino_app\"]/div/div/div/div[1]/nav/div[2]/casino-search-box/div/svg-button[2]/div")
    protected WebElement Cross_In_Search;

    public WebElement getCross_In_Search(){
        return Cross_In_Search;
    }

    public void clearSearchInCasino(){

        Search_Casino.clear();
    }

    public void clearSearchInCasinoByCross(){

        Cross_In_Search.click();
    }

    @FindBy(xpath = "//*[@id=\"loginMessage\"]/div")
    protected WebElement OK_In_successfull_Message;

    public WebElement getOK_In_successfull_Message(){
        return OK_In_successfull_Message;
    }

    public void clickOK_In_successfull_Message(){

        OK_In_successfull_Message.click();

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

package pages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import java.net.MalformedURLException;


public  class CasinoPage extends MainPage {

    public CasinoPage(String browser) throws MalformedURLException {
        super(browser);
    }



    public void clickCasino(){
        CasinoLabelHeader.click();
    }

    @FindBy(xpath = "//*[@id=\"casino_app\"]/div/div/div/div[1]/nav/div[2]/casino-search-box/div/input")
    protected WebElement SearchCasino;

    public WebElement getSearchCasino(){

        return SearchCasino;

    }


    @FindBy( xpath = "//*[@id=\"casino_app\"]/div/div/div/div[1]/nav/div[1]/a[2]/svg-button[2]/div")
    protected WebElement Favourites;

    public WebElement getFavourites(){

        return Favourites;

    }



    @FindBy( xpath = "//*[@id=\"casino_app\"]/div/div/div/div[1]/nav/div[1]/a[2]/div")
    protected WebElement numberFavourites;

    public WebElement getNumberFavourites(){
        return numberFavourites;
    }


    @FindBy( xpath = "//*[@id=\"casino_app\"]/div/div/div/div[2]/casino-search-page/section/lazy-load-block/casino-game[1]/div/div/div[2]/button")
    protected WebElement FavouriteForIssoftSearchPage;

    public WebElement getFavouriteForIssoftSearchPage(){
        return FavouriteForIssoftSearchPage;
    }



    @FindBy( xpath = "//*[@id=\"casino_app\"]/div/div/div/div[2]/section/lazy-load-block/casino-game[1]/div/div/div[2]/button")
    protected WebElement FavouriteForIssoft;

    public WebElement getFavouriteForIssoft(){
        return FavouriteForIssoft;
    }



    @FindBy( xpath = "//*[@id=\"casino_app\"]/div/div/div/div[1]/nav/div[2]/casino-search-box/div/svg-button[2]/div")
    protected WebElement CrossInSearch;

    public WebElement getCrossInSearch(){
        return CrossInSearch;
    }

    public void clearSearchInCasino(){

        SearchCasino.clear();
    }

    public void clearSearchInCasinoByCross(){

        CrossInSearch.click();
    }


    @FindBy(xpath = "//*[@id=\"loginMessage\"]/div")
    protected WebElement OkInSuccessfullMessage;

    public WebElement getOkInSuccessfullMessage(){
        return OkInSuccessfullMessage;
    }

    public void clickOkInSuccessfullMessage(){

        OkInSuccessfullMessage.click();

    }

    @FindBy(xpath = "//*[@id=\"casino_app\"]/div/div/div/div[2]/casino-search-page/section/div/h1")
    protected WebElement SearchResult;

    public String getSearchResult(){
        return SearchResult.getText();
    }


    @FindBy(xpath = "//*[@id=\"casino_app\"]/div/div/div/div[2]/casino-search-page/section/lazy-load-block/casino-game/div/div/div[2]/div")
    protected WebElement GameTitleAfterSearch;

    public String getGameTitleText(){
        return GameTitleAfterSearch.getText();
    }

    public WebElement getGameTitle(){
        return GameTitleAfterSearch;
    }


    public void clickSearchInCasino(){

        SearchCasino.click();
    }

    public void  enterSymbolsToSearch(String Symbols){

        SearchCasino.sendKeys(Symbols);
    }


    @FindBy( xpath = "//*[@id=\"casino_app\"]/div/div/div/div[1]/nav/div[2]/casino-dropdown[1]/div/div[1]")
    protected WebElement OtherDropDown;

    public WebElement getOtherDropDown(){
        return OtherDropDown;
    }

    @FindBy( xpath = "//*[@id=\"casino_app\"]/div/div/div/div[1]/nav/div[2]/casino-dropdown[1]/div/div[2]/div/div/div[4]")
    protected WebElement AutotestCategory;

    public WebElement getAutotestCategory(){
        return AutotestCategory;
    }



}

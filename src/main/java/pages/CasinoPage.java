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

    public String getNumberFavouritesText(){return numberFavourites.getText();}




    @FindBy( css = "[index=\"0\"] button")
    protected WebElement FavouriteForFirstElementOfSix;

    public WebElement getFavouriteForFirstElementOfSix(){
        return FavouriteForFirstElementOfSix;
    }


    @FindBy( css = "[index=\"1\"] button")
    protected WebElement FavouriteForSecondElementOfSix;

    public WebElement getFavouriteForSecondElementOfSix(){
        return FavouriteForSecondElementOfSix;
    }



    @FindBy( css = "[index=\"2\"] button")
    protected WebElement FavouriteForThirdElementOfSix;

    public WebElement getFavouriteForThirdElementOfSix(){
        return FavouriteForThirdElementOfSix;
    }



    @FindBy( css = "[index=\"3\"] button")
    protected WebElement FavouriteForForthElementOfSix;

    public WebElement getFavouriteForForthElementOfSix(){
        return FavouriteForForthElementOfSix;
    }



    @FindBy( css = "[index=\"4\"] button")
    protected WebElement FavouriteForFifthElementOfSix;

    public WebElement getFavouriteForFifthElementOfSix(){
        return FavouriteForFifthElementOfSix;
    }



    @FindBy( css = "[index=\"5\"] button")
    protected WebElement FavouriteForSixthElementOfSix;

    public WebElement getFavouriteForSixthElementOfSix(){
        return FavouriteForSixthElementOfSix;
    }



    @FindBy( xpath = "//*[@id=\"casino_app\"]/div/div/div/div[2]/section[1]/div/casino-game[1]/div/div/div[2]/button")
    protected WebElement FavouriteForTop;

    public WebElement getFavouriteForTop(){
        return FavouriteForTop;
    }


    @FindBy( xpath = "//*[@id=\"casino_app\"]/div/div/div/div[2]/section[2]/div/casino-game[1]/div/div/div[2]/button")
    protected WebElement FavouriteForNew;

    public WebElement getFavouriteForNew(){
        return FavouriteForNew;
    }



    @FindBy(  xpath = "//*[@id=\"casino_app\"]/div/div/div/div[2]/section[3]/div/casino-game[1]/div/div/div[2]/button")
    protected WebElement FavouriteForFeatured;

    public WebElement getFavouriteForFeatured(){
        return FavouriteForFeatured;
    }


    @FindBy( css = "#casino_app a.gi-casino-navbar__logo")
    protected WebElement Lobby;

    public WebElement getLobbyElement(){
        return Lobby;
    }
//*[@id="casino_app"]/div/div/div/div[1]/nav/div[1]/a[1]


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

    public String getSearchResultText(){
        return SearchResult.getText();
    }



    @FindBy(xpath = "//*[@id=\"casino_app\"]/div/div/div/div[2]/casino-search-page/section/lazy-load-block/casino-game/div/div/div[2]/div")
    protected WebElement GameTitleAfterSearch;

    public String getGameTitleText(){
        return GameTitleAfterSearch.getText();
    }

    public WebElement getGameTitleElement(){
        return GameTitleAfterSearch;
    }



    @FindBy(xpath = "//*[@id=\"casino_app\"]/div/div/div/div[2]/casino-search-page/section/lazy-load-block/casino-game/div/div/div[2]/div")
    protected WebElement GameTitleInCategory;

    public String getGameTitleInCategoryText(){
        return GameTitleInCategory.getText();
    }

    public WebElement getGameTitleInCategoryElement(){
        return GameTitleInCategory;
    }


    public void clickSearchInCasino(){

        SearchCasino.click();
    }

    public void  enterSymbolsToSearch(String Symbols){

        SearchCasino.sendKeys(Symbols);
    }


    @FindBy( xpath = "//*[@id=\"casino_app\"]/div/div/div/div[1]/nav/div[2]/casino-dropdown[1]/div/a/svg-button/div")
    protected WebElement OtherDropDown;

    public WebElement getOtherDropDownElement(){
        return OtherDropDown;
    }

    public String getOtherDropDownText(){
        return OtherDropDown.getText();
    }



    @FindBy( xpath = "//*[@id=\"casino_app\"]/div/div/div/div[1]/nav/div[2]/casino-dropdown[1]/div/div[2]/div/div/div[4]/svg-button/div")
    protected WebElement AutotestCategory;

    public WebElement getAutotestCategory(){
        return AutotestCategory;
    }



    @FindBy( xpath = "//*[@id=\"logoutLink\"]")
    protected WebElement Logout;

    public WebElement getLogoutElement(){
        return Logout;
    }




}

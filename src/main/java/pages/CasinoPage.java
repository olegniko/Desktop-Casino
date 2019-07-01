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
    protected WebElement FavouriteForFirstElementSearchPage;

    public WebElement getFavouriteForFirstElementSearchPage(){
        return FavouriteForFirstElementSearchPage;
    }



    @FindBy( xpath = "//*[@id=\"casino_app\"]/div/div/div/div[2]/category-component/section[1]/lazy-load-block/casino-game[1]/div/div/div[2]/button")
    protected WebElement FavouriteForFirstElementInCategory;

    public WebElement getFavouriteForFirstElementInCategory(){
        return FavouriteForFirstElementInCategory;
    }


    @FindBy( xpath = "//*[@id=\"casino_app\"]/div/div/div/div[2]/category-component/section[1]/lazy-load-block/casino-game[2]/div/div/div[2]/button")
    protected WebElement FavouriteForSecondElementInCategory;

    public WebElement getFavouriteForSecondElementInCategory(){
        return FavouriteForSecondElementInCategory;
    }



    @FindBy( xpath = "//*[@id=\"casino_app\"]/div/div/div/div[2]/category-component/section[1]/lazy-load-block/casino-game[3]/div/div/div[2]/button")
    protected WebElement FavouriteForThirdElementInCategory;

    public WebElement getFavouriteForThirdElementInCategory(){
        return FavouriteForThirdElementInCategory;
    }



    @FindBy( xpath = "//*[@id=\"casino_app\"]/div/div/div/div[2]/category-component/section[1]/lazy-load-block/casino-game[4]/div/div/div[2]/button")
    protected WebElement FavouriteForForthElementInCategory;

    public WebElement getFavouriteForForthElementInCategory(){
        return FavouriteForForthElementInCategory;
    }



    @FindBy( xpath = "//*[@id=\"casino_app\"]/div/div/div/div[2]/category-component/section[1]/lazy-load-block/casino-game[5]/div/div/div[2]/button")
    protected WebElement FavouriteForFifthElementInCategory;

    public WebElement getFavouriteForFifthElementInCategory(){
        return FavouriteForFifthElementInCategory;
    }



    @FindBy( xpath = "//*[@id=\"casino_app\"]/div/div/div/div[2]/category-component/section[1]/lazy-load-block/casino-game[6]/div/div/div[2]/button")
    protected WebElement FavouriteForSixthElementInCategory;

    public WebElement getFavouriteForSixthElementInCategory(){
        return FavouriteForSixthElementInCategory;
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


    @FindBy( xpath = "//*[@id=\"casino_app\"]/div/div/div/div[1]/nav/div[2]/casino-dropdown[1]/div/a/svg-button")
    protected WebElement OtherDropDown;

    public WebElement getOtherDropDownElement(){
        return OtherDropDown;
    }

    //*[@id="casino_app"]/div/div/div/div[1]/nav/div[2]/casino-dropdown[1]/div/a/svg-button




    @FindBy( xpath = "//*[@id=\"casino_app\"]/div/div/div/div[1]/nav/div[2]/casino-dropdown[1]/div/div[2]/div/div/div[4]")
    protected WebElement AutotestCategory;

    public WebElement getAutotestCategory(){
        return AutotestCategory;
    }



}

package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CasinoPage extends MainPage {

    public CasinoPage() throws Exception {
        super();
    }


    @FindBy(css = "div[class='gi-casino-search-box'] input")
    protected WebElement searchFieldElement;
    @FindBy(css = "svg-button[class='gi-casino-search-box__icon gi-casino-search-box__icon_remove gi-svg-button ng-scope ng-isolate-scope']")
    protected WebElement crossIconSearchFieldElement;
    @FindBy(css = "svg-button[class='gi-casino-search-box__icon gi-casino-search-box__icon_search gi-svg-button ng-isolate-scope']")
    protected WebElement searchIconSearchFieldElement;
    @FindBy(css = "h1[class='gi-casino-empty-section__header ng-scope']")
    protected WebElement searchResultHeaderElement;
    @FindBy(css = "p[class='gi-casino-empty-section__text ng-scope']")
    protected WebElement searchResultBodyElement;
    @FindBy(css = "a[title='Favourites']")
    protected WebElement favoriteIconElement;
    @FindBy(xpath = "//div[contains(@class,'favorites-counter')]")
    protected WebElement favoriteNumberElement;

    @FindBy(xpath = "//div[normalize-space(text()) = 'olegMgAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement mgGameElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegMgAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__play ng-scope']")
    protected WebElement mgGamePlayElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegMgAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__demo ng-scope']")
    protected WebElement mgGameDemoElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegMgAutotest']//ancestor::casino-game[@game='game']//descendant::button[contains(@class,'gi-casino-game__favorite')]")
    protected WebElement mgGameFavouriteElement;

    @FindBy(xpath = "//*[normalize-space(text()) = 'olegRelaxAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement relaxGameElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegRelaxAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__play ng-scope']")
    protected WebElement relaxGamePlayElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegRelaxAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__demo ng-scope']")
    protected WebElement relaxGameDemoElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegRelaxAutotest']//ancestor::casino-game[@game='game']//descendant::button[contains(@class,'gi-casino-game__favorite')]")
    protected WebElement relaxGameFavouriteElement;

    @FindBy(xpath = "//*[normalize-space(text()) = 'olegPlayngoAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement playngoGameElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegPlayngoAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__play ng-scope']")
    protected WebElement playngoGamePlayElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegPlayngoAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__demo ng-scope']")
    protected WebElement playngoGameDemoElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegPlayngoAutotest']//ancestor::casino-game[@game='game']//descendant::button[contains(@class,'gi-casino-game__favorite')]")
    protected WebElement playngoGameFavouriteElement;

    @FindBy(xpath = "//*[normalize-space(text()) = 'olegIssoftAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement issoftGameElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegIssoftAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__play ng-scope']")
    protected WebElement issoftGamePlayElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegIssoftAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__demo ng-scope']")
    protected WebElement issoftGameDemoElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegIssoftAutotest']//ancestor::casino-game[@game='game']//descendant::button[contains(@class,'gi-casino-game__favorite')]")
    protected WebElement issoftGameFavouriteElement;

    @FindBy(xpath = "//*[normalize-space(text()) = 'olegEvolutionAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement evolutionGameElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegEvolutionAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__play ng-scope']")
    protected WebElement evolutionGamePlayElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegEvolutionAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__demo ng-scope']")
    protected WebElement evolutionGameDemoElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegEvolutionAutotest']//ancestor::casino-game[@game='game']//descendant::button[contains(@class,'gi-casino-game__favorite')]")
    protected WebElement evolutionGameFavouriteElement;

    @FindBy(xpath = "//*[normalize-space(text()) = 'olegYggdrasilAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement yggdrasilGameElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegYggdrasilAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__play ng-scope']")
    protected WebElement yggdrasilGamePlayElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegYggdrasilAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__demo ng-scope']")
    protected WebElement yggdrasilGameDemoElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegYggdrasilAutotest']//ancestor::casino-game[@game='game']//descendant::button[contains(@class,'gi-casino-game__favorite')]")
    protected WebElement yggdrasilGameFavouriteElement;

    @FindBy(xpath = "//*[normalize-space(text()) = 'olegIforiumAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement iforiumGameElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegIforiumAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__play ng-scope']")
    protected WebElement iforiumGamePlayElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegIforiumAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__demo ng-scope']")
    protected WebElement iforiumGameDemoElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegIforiumAutotest']//ancestor::casino-game[@game='game']//descendant::button[contains(@class,'gi-casino-game__favorite')]")
    protected WebElement iforiumGameFavouriteElement;


    @FindBy (css = "div[id='login-popup']")
    protected WebElement loginPopupElement;
    @FindBy (xpath = "//div[@id='login-popup']//svg-button[contains(@class,'gi-modal-header__close')]")
    protected WebElement loginPopupCrossElement;
    @FindBy (xpath = "//div[@id='login-popup']//h2[contains(@class,'gi-login-form__title')]")
    protected WebElement loginPopupTitleElement;
    @FindBy (xpath = "//div[@id='login-popup']//input[@name='login']")
    protected WebElement loginFieldLoginPopupElement;
    @FindBy (xpath = "//div[@id='login-popup']//input[@name='login_password']")
    protected WebElement passwordFieldLoginPopupElement;
    @FindBy (xpath = "//div[@id='login-popup']//a[contains(@class,'lostpass')]")
    protected WebElement lostPasswordLoginPopupElement;
    @FindBy (xpath = "//div[@id='login-popup']//button[contains(@class,'gi-but-login')]")
    protected WebElement loginButtonPopupElement;
    @FindBy (xpath = "//div[@id='login-popup']//a[contains(@class,'but-join')]")
    protected WebElement joinNowButtonPopupElement;
    @FindBy(css = "div[id='errorMessage']")
    protected WebElement incorrectLoginMessagePopupElement;
    @FindBy(css = "div[id='errorMessage'] button")
    protected WebElement incorrectLoginMessageOkButtonPopupElement;

    @FindBy(xpath = "//div[@class='gi-iframe-modal']//descendant::svg-button[contains(@class,'modal-header__close')]")
    protected WebElement crossInGameElement;

    public WebElement getSearchFieldElement() { return getEnabledElement(searchFieldElement); }
    public WebElement getCrossIconSearchFieldElement() { return getClickableElement(crossIconSearchFieldElement); }
    public WebElement getSearchIconSearchFieldElement() { return getClickableElement(searchIconSearchFieldElement); }
    public WebElement getSearchResultHeaderElement() { return getEnabledElement(searchResultHeaderElement); }
    public WebElement getSearchResultBodyElement() { return searchResultBodyElement; }
    public WebElement getFavoriteIconElement() { return favoriteIconElement; }
    public WebElement getFavoriteNumberElement() { return favoriteNumberElement; }

    public WebElement getMgGameElement() { return getEnabledElement(mgGameElement); }
    public WebElement getMgGamePlayElement() { return mgGamePlayElement; }
    public WebElement getMgGameDemoElement() { return mgGameDemoElement; }
    public WebElement getMgGameFavouriteElement() { return getEnabledElement(mgGameFavouriteElement); }

    public WebElement getRelaxGameElement() { return getEnabledElement(relaxGameElement); }
    public WebElement getRelaxGamePlayElement() { return relaxGamePlayElement; }
    public WebElement getRelaxGameDemoElement() { return relaxGameDemoElement; }
    public WebElement getRelaxGameFavouriteElement() { return getEnabledElement(relaxGameFavouriteElement); }

    public WebElement getPlayngoGameElement() { return getEnabledElement(playngoGameElement); }
    public WebElement getPlayngoGamePlayElement() { return playngoGamePlayElement; }
    public WebElement getPlayngoGameDemoElement() { return playngoGameDemoElement; }
    public WebElement getPlayngoGameFavouriteElement() { return getEnabledElement(playngoGameFavouriteElement); }


    public WebElement getIssoftGameElement() { return getEnabledElement(issoftGameElement); }
    public WebElement getIssoftGamePlayElement() { return issoftGamePlayElement; }
    public WebElement getIssoftGameDemoElement() { return issoftGameDemoElement; }
    public WebElement getIssoftGameFavouriteElement() { return getEnabledElement(issoftGameFavouriteElement); }


    public WebElement getEvolutionGameElement() { return getEnabledElement(evolutionGameElement); }
    public WebElement getEvolutionGamePlayElement() { return evolutionGamePlayElement; }
    public WebElement getEvolutionGameDemoElement() { return evolutionGameDemoElement; }
    public WebElement getEvolutionGameFavouriteElement() { return getEnabledElement(evolutionGameFavouriteElement); }

    public WebElement getYggdrasilGameElement() { return getEnabledElement(yggdrasilGameElement); }
    public WebElement getYggdrasilGamePlayElement() { return yggdrasilGamePlayElement; }
    public WebElement getYggdrasilGameDemoElement() { return yggdrasilGameDemoElement; }
    public WebElement getYggdrasilGameFavouriteElement() { return getEnabledElement(yggdrasilGameFavouriteElement); }

    public WebElement getIforiumGameElement() { return getEnabledElement(iforiumGameElement); }
    public WebElement getIforiumGamePlayElement() { return iforiumGamePlayElement; }
    public WebElement getIforiumGameDemoElement() { return iforiumGameDemoElement; }
    public WebElement getIforiumGameFavouriteElement() { return getEnabledElement(iforiumGameFavouriteElement); }

    public WebElement getLoginPopupElement() { return getEnabledElement(loginPopupElement); }
    public WebElement getLoginPopupCrossElement() { return getEnabledElement(loginPopupCrossElement); }
    public WebElement getLoginPopupTitleElement() { return getEnabledElement(loginPopupTitleElement); }
    public WebElement getLoginFieldLoginPopupElement() { return getEnabledElement(loginFieldLoginPopupElement); }
    public WebElement getPasswordFieldLoginPopupElement() { return getEnabledElement(passwordFieldLoginPopupElement); }
    public WebElement getLostPasswordLoginPopupElement() { return getEnabledElement(lostPasswordLoginPopupElement); }
    public WebElement getLoginButtonPopupElement() { return getEnabledElement(loginButtonPopupElement); }
    public WebElement getJoinNowButtonPopupElement() { return getEnabledElement(joinNowButtonPopupElement); }
    public WebElement getIncorrectLoginMessagePopupElement() { return getClickableElement(incorrectLoginMessagePopupElement); }
    public WebElement getIncorrectLoginMessageOkButtonPopupElement() { return getClickableElement(incorrectLoginMessageOkButtonPopupElement); }

    public WebElement getCrossInGameElement() { return getClickableFluentElement(crossInGameElement); }


    public String getTextSearchFieldElement() { return getClickableElement(searchFieldElement).getAttribute("placeholder"); }
    public String getTextSearchResultHeaderElement() { return getEnabledElement(searchResultHeaderElement).getText(); }
    public String getTextSearchResultBodyElement() { return getEnabledElement(searchResultBodyElement).getText(); }
    public String getTextFavoriteNumberElement() { return getEnabledElement(favoriteNumberElement).getText(); }




    public void search(String data){
        waitIfElementIsClickable(getSearchFieldElement());
        getSearchFieldElement().sendKeys(data);
    }

    public void addToFavourites(WebElement element){
        waitIfElementIsEnabled(element);
        clickIfElementIsClickable(element);
    }
    public void removeFromFavourites(WebElement element){
        waitIfElementIsEnabled(element);
        clickIfElementIsClickable(element);
    }

    public void fillLoginInPopup(String login) { getLoginFieldLoginPopupElement().sendKeys(login); }

    public void fillPasswordInPopup(String password) { getPasswordFieldLoginPopupElement().sendKeys(password); }

    public void clickLoginButtonInPopup() { clickIfElementIsClickable(getLoginButtonPopupElement()); }

    public void loginByPopup(String login, String password) {
        fillLoginInPopup(login);
        loginFieldLoginPopupElement.sendKeys(Keys.TAB);
        fillPasswordInPopup(password);
        clickLoginButtonInPopup();
    }

    public void correctLoginByPopup(String login, String password)  {
        fillLoginInPopup(login);
        loginFieldLoginPopupElement.sendKeys(Keys.TAB);
        fillPasswordInPopup(password);
        clickLoginButtonInPopup();
        closeSuccessfulMessagePopup();
        }

    public void closeSuccessfulMessagePopup(){
        driverWait(5);

            moveToElement(getLoginMessageOkButtonElement());
            clickIfElementIsClickable(getLoginMessageOkButtonElement());


    }

    public void closeGame(){
        moveToElement(getCrossInGameElement());
        clickIfElementIsClickableFluent(getCrossInGameElement());
    }
}




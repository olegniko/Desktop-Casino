package pages;


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
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegMgAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement mgGameElement;
    @FindBy(xpath = "//*[normalize-space(text()) = 'olegRelaxAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement relaxGameElement;
    @FindBy(xpath = "//*[normalize-space(text()) = 'olegPlayngoAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement playngoGameElement;
    @FindBy(xpath = "//*[normalize-space(text()) = 'olegIssoftAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement issoftGameElement;
    @FindBy(xpath = "//*[normalize-space(text()) = 'olegEvolutionAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement evolutionGameElement;
    @FindBy(xpath = "//*[normalize-space(text()) = 'olegYggdrasilAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement yggdrasilGameElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegMgAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__play ng-scope']")
    protected WebElement mgGamePlayElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegMgAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__demo ng-scope']")
    protected WebElement mgGameDemoElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegMgAutotest']//ancestor::casino-game[@game='game']//descendant::button[@class = 'gi-casino-game__favorite']")
    protected WebElement mgGameFavouriteElement;

    public WebElement getSearchFieldElement() { return getClickableElement(searchFieldElement); }
    public WebElement getCrossIconSearchFieldElement() { return getClickableElement(crossIconSearchFieldElement); }
    public WebElement getSearchIconSearchFieldElement() { return getClickableElement(searchIconSearchFieldElement); }
    public WebElement getSearchResultHeaderElement() { return searchResultHeaderElement; }
    public WebElement getSearchResultBodyElement() { return searchResultBodyElement; }

    public WebElement getMgGameElement() { return mgGameElement; }
    public WebElement getMgGamePlayElement() { return mgGamePlayElement; }
    public WebElement getMgGameDemoElement() { return mgGameDemoElement; }
    public WebElement getMgGameFavouriteElement() { return mgGameFavouriteElement; }

    public WebElement getRelaxGameElement() { return relaxGameElement; }
    public WebElement getPlayngoGameElement() { return playngoGameElement; }
    public WebElement getIssoftGameElement() { return issoftGameElement; }
    public WebElement getEvolutionGameElement() { return evolutionGameElement; }
    public WebElement getYggdrasilGameElement() { return yggdrasilGameElement; }



    public String getTextSearchFieldElement() { return getClickableElement(searchFieldElement).getAttribute("placeholder"); }
    public String getTextSearchResultHeaderElement() { return searchResultHeaderElement.getText(); }
    public String getTextSearchResultBodyElement() { return searchResultBodyElement.getText(); }



    public void search(String data){
        waitIfElementIsClickable(getSearchFieldElement());
        getSearchFieldElement().sendKeys(data);
    }
}

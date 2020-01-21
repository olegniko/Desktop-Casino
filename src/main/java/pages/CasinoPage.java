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
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegMgAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__play ng-scope']")
    protected WebElement mgGamePlayElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegMgAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__demo ng-scope']")
    protected WebElement mgGameDemoElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegMgAutotest']//ancestor::casino-game[@game='game']//descendant::button[@class = 'gi-casino-game__favorite']")
    protected WebElement mgGameFavouriteElement;

    @FindBy(xpath = "//*[normalize-space(text()) = 'olegRelaxAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement relaxGameElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegRelaxAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__play ng-scope']")
    protected WebElement relaxGamePlayElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegRelaxAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__demo ng-scope']")
    protected WebElement relaxGameDemoElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegRelaxAutotest']//ancestor::casino-game[@game='game']//descendant::button[@class = 'gi-casino-game__favorite']")
    protected WebElement relaxGameFavouriteElement;

    @FindBy(xpath = "//*[normalize-space(text()) = 'olegPlayngoAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement playngoGameElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegPlayngoAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__play ng-scope']")
    protected WebElement playngoGamePlayElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegPlayngoAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__demo ng-scope']")
    protected WebElement playngoGameDemoElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegPlayngoAutotest']//ancestor::casino-game[@game='game']//descendant::button[@class = 'gi-casino-game__favorite']")
    protected WebElement playngoGameFavouriteElement;

    @FindBy(xpath = "//*[normalize-space(text()) = 'olegIssoftAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement issoftGameElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegIssoftAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__play ng-scope']")
    protected WebElement issoftGamePlayElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegIssoftAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__demo ng-scope']")
    protected WebElement issoftGameDemoElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegIssoftAutotest']//ancestor::casino-game[@game='game']//descendant::button[@class = 'gi-casino-game__favorite']")
    protected WebElement issoftGameFavouriteElement;

    @FindBy(xpath = "//*[normalize-space(text()) = 'olegEvolutionAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement evolutionGameElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegEvolutionAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__play ng-scope']")
    protected WebElement evolutionGamePlayElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegEvolutionAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__demo ng-scope']")
    protected WebElement evolutionGameDemoElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegEvolutionAutotest']//ancestor::casino-game[@game='game']//descendant::button[@class = 'gi-casino-game__favorite']")
    protected WebElement evolutionGameFavouriteElement;

    @FindBy(xpath = "//*[normalize-space(text()) = 'olegYggdrasilAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement yggdrasilGameElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegYggdrasilAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__play ng-scope']")
    protected WebElement yggdrasilGamePlayElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegYggdrasilAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__demo ng-scope']")
    protected WebElement yggdrasilGameDemoElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegYggdrasilAutotest']//ancestor::casino-game[@game='game']//descendant::button[@class = 'gi-casino-game__favorite']")
    protected WebElement yggdrasilGameFavouriteElement;

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
    public WebElement getRelaxGamePlayElement() { return relaxGamePlayElement; }
    public WebElement getRelaxGameDemoElement() { return relaxGameDemoElement; }
    public WebElement getRelaxGameFavouriteElement() { return relaxGameFavouriteElement; }

    public WebElement getPlayngoGameElement() { return playngoGameElement; }
    public WebElement getPlayngoGamePlayElement() { return playngoGamePlayElement; }
    public WebElement getPlayngoGameDemoElement() { return playngoGameDemoElement; }
    public WebElement getPlayngoGameFavouriteElement() { return playngoGameFavouriteElement; }


    public WebElement getIssoftGameElement() { return issoftGameElement; }
    public WebElement getIssoftGamePlayElement() { return issoftGamePlayElement; }
    public WebElement getIssoftGameDemoElement() { return issoftGameDemoElement; }
    public WebElement getIssoftGameFavouriteElement() { return issoftGameFavouriteElement; }


    public WebElement getEvolutionGameElement() { return evolutionGameElement; }
    public WebElement getEvolutionGamePlayElement() { return evolutionGamePlayElement; }
    public WebElement getEvolutionGameDemoElement() { return evolutionGameDemoElement; }
    public WebElement getEvolutionGameFavouriteElement() { return evolutionGameFavouriteElement; }

    public WebElement getYggdrasilGameElement() { return yggdrasilGameElement; }
    public WebElement getYggdrasilGamePlayElement() { return yggdrasilGamePlayElement; }
    public WebElement getYggdrasilGameDemoElement() { return yggdrasilGameDemoElement; }
    public WebElement getYggdrasilGameFavouriteElement() { return yggdrasilGameFavouriteElement; }


    public String getTextSearchFieldElement() { return getClickableElement(searchFieldElement).getAttribute("placeholder"); }
    public String getTextSearchResultHeaderElement() { return searchResultHeaderElement.getText(); }
    public String getTextSearchResultBodyElement() { return searchResultBodyElement.getText(); }



    public void search(String data){
        waitIfElementIsClickable(getSearchFieldElement());
        getSearchFieldElement().sendKeys(data);
    }
}

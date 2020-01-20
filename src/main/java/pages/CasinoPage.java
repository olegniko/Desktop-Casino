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
    @FindBy(xpath = "//*[normalize-space(text()) = 'olegMgAutotest']")
    protected WebElement mgTitleElement;
    @FindBy(xpath = "//*[normalize-space(text()) = 'olegRelaxAutotest']")
    protected WebElement relaxTitleElement;
    @FindBy(xpath = "//*[normalize-space(text()) = 'olegPlayngoAutotest']")
    protected WebElement playngoTitleElement;
    @FindBy(xpath = "//*[normalize-space(text()) = 'olegIssoftAutotest']")
    protected WebElement issoftTitleElement;
    @FindBy(xpath = "//*[normalize-space(text()) = 'olegEvolutionAutotest']")
    protected WebElement evolutionTitleElement;
    @FindBy(xpath = "//*[normalize-space(text()) = 'olegYggdrasilAutotest']")
    protected WebElement yggdrasilTitleElement;


    public WebElement getSearchFieldElement() { return getClickableElement(searchFieldElement); }
    public WebElement getCrossIconSearchFieldElement() { return getClickableElement(crossIconSearchFieldElement); }
    public WebElement getSearchIconSearchFieldElement() { return getClickableElement(searchIconSearchFieldElement); }
    public WebElement getSearchResultHeaderElement() { return searchResultHeaderElement; }
    public WebElement getSearchResultBodyElement() { return searchResultBodyElement; }
    public WebElement getMgTitleElement() { return mgTitleElement; }
    public WebElement getRelaxTitleElement() { return relaxTitleElement; }
    public WebElement getPlayngoTitleElement() { return playngoTitleElement; }
    public WebElement getIssoftTitleElement() { return issoftTitleElement; }
    public WebElement getEvolutionTitleElement() { return evolutionTitleElement; }
    public WebElement getYggdrasilTitleElement() { return yggdrasilTitleElement; }



    public String getTextSearchFieldElement() { return getClickableElement(searchFieldElement).getAttribute("placeholder"); }
    public String getTextSearchResultHeaderElement() { return searchResultHeaderElement.getText(); }
    public String getTextSearchResultBodyElement() { return searchResultBodyElement.getText(); }



    public void search(String data){
        waitIfElementIsClickable(getSearchFieldElement());
        getSearchFieldElement().sendKeys(data);
    }
}

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



    public WebElement getSearchFieldElement() {
        return getClickableElement(searchFieldElement);
    }
    public WebElement getCrossIconSearchFieldElement() {
        return getClickableElement(crossIconSearchFieldElement);
    }
    public WebElement getSearchIconSearchFieldElement() {
        return getClickableElement(searchIconSearchFieldElement);
    }


    public String getTextSearchFieldElement() { return getClickableElement(searchFieldElement).getAttribute("placeholder"); }


}

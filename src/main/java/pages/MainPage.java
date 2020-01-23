package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage {

    public MainPage() throws Exception {
        super();
    }


    @FindBy(css = "input[data-id='auth_login']")
    protected WebElement loginFieldHeaderElement;
    @FindBy(css = "input[data-id='auth_login_password']")
    protected WebElement passwordFieldHeaderElement;
    @FindBy(css = "button[class='button btn-login']")
    protected WebElement loginButtonHeaderElement;
    @FindBy(css = "a[class='button btn-join']")
    protected WebElement joinNowButtonHeaderElement;
    @FindBy(css = "a[class='lostpass']")
    protected WebElement lostPasswordHeaderElement;
    @FindBy(css = "div[id='any_message']")
    protected WebElement incorrectLoginMessageElement;
    @FindBy(css = "div[id='any_message'] button")
    protected WebElement incorrectLoginMessageOkButtonElement;
    @FindBy(css = "div[id='loginMessage']")
    protected WebElement loginMessageElement;
    @FindBy(css = "div[id='simplemodal-container'] button")
    protected WebElement loginMessageOkButtonElement;
    @FindBy(css = "img[alt='Marathonbet Logo']")
    protected WebElement marathonbetIconHeaderElement;
    @FindBy(css = "a[id='logoutLink']")
    protected WebElement logoutButtonHeaderElement;
    @FindBy(css = "a[class='button btn-deposit']")
    protected WebElement depositButtonHeaderElement;
    @FindBy(css = "a[class='button btn-deposit']")
    protected WebElement myAccountButtonHeaderElement;


    @FindBy(xpath = "//div[@class='grid-footer']//descendant::span[contains(@data-show-help,'help')]")
    protected WebElement aboutUsFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::span[contains(@data-show-help,'privacy_policy')]")
    protected WebElement privacyPolicyFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::span[contains(@data-show-help,'responsible_gambling')]")
    protected WebElement responsibleGamingFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::span[contains(@data-show-help,'terms_and_conditions')]")
    protected WebElement termsAndConditionsFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::span[contains(@data-show-help,'contact_us')]")
    protected WebElement contactUsFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::span[contains(@data-show-help,'payments')]")
    protected WebElement paymentsFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::a[contains(@href,'mobile.marathonbet')]")
    protected WebElement mobileSiteFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::a[contains(@href,'blog.marathonbet')]")
    protected WebElement blogFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::a[contains(@href,'partners.marathonbet')]")
    protected WebElement affiliatesFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::a[contains(@href,'partners.htm')]")
    protected WebElement ourParntersFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::a[contains(@href,'partnerName=manchester')]")
    protected WebElement partnreshipHistoryFooterElement;

    public WebElement getLoginFieldHeaderElement() { return getClickableElement(loginFieldHeaderElement); }
    public WebElement getPasswordFieldHeaderElement() { return getClickableElement(passwordFieldHeaderElement); }
    public WebElement getLoginButtonHeaderElement() { return getClickableFluentElement(loginButtonHeaderElement); }
    public WebElement getJoinNowButtonHeaderElement() { return getClickableElement(joinNowButtonHeaderElement); }
    public WebElement getLostPasswordHeaderElement() {
        return getClickableElement(lostPasswordHeaderElement);
    }
    public WebElement getIncorrectLoginMessageElement() { return getClickableElement(incorrectLoginMessageElement); }
    public WebElement getLoginMessageElement() {
        return getClickableElement(loginMessageElement);
    }
    public WebElement getIncorrectLoginMessageOkButtonElement() { return getClickableElement(incorrectLoginMessageOkButtonElement); }
    public WebElement getLoginMessageOkButtonElement() { return getClickableElement(loginMessageOkButtonElement); }
    public WebElement getMarathonbetIconHeaderElement() {
        return getClickableElement(marathonbetIconHeaderElement);
    }
    public WebElement getLogoutButtonHeaderElement() {
        return getClickableElement(logoutButtonHeaderElement);
    }
    public WebElement getDepositButtonHeaderElement() {
        return getClickableElement(depositButtonHeaderElement);
    }
    public WebElement getMyAccountButtonHeaderElement() {
        return getClickableElement(myAccountButtonHeaderElement);
    }

    public WebElement getAboutUsFooterElement() { return getClickableFluentElement(aboutUsFooterElement); }
    public WebElement getPrivacyPolicyFooterElement() { return getEnabledElement(privacyPolicyFooterElement); }
    public WebElement getResponsibleGamingFooterElement() { return getEnabledElement(responsibleGamingFooterElement); }
    public WebElement getTermsAndConditionsFooterElement() { return getClickableElement(termsAndConditionsFooterElement); }
    public WebElement getContactUsFooterElement() { return getEnabledElement(contactUsFooterElement); }
    public WebElement getPaymentsFooterElement() { return getEnabledElement(paymentsFooterElement); }
    public WebElement getMobileSiteFooterElement() { return getEnabledElement(mobileSiteFooterElement); }
    public WebElement getBlogFooterElement() { return getEnabledElement(blogFooterElement); }
    public WebElement getAffiliatesFooterElement() { return getEnabledElement(affiliatesFooterElement); }
    public WebElement getOurParntersFooterElement() { return ourParntersFooterElement; }
    public WebElement getPartnreshipHistoryFooterElement() { return partnreshipHistoryFooterElement; }

    public String getTextLoginFieldHeaderElement() { return getClickableElement(loginFieldHeaderElement).getAttribute("placeholder"); }

    public String getTextPasswordFieldHeaderElement() { return getClickableElement(passwordFieldHeaderElement).getAttribute("placeholder"); }

    public String getTextLoginButtonHeaderElement() { return getClickableElement(loginButtonHeaderElement).getText(); }

    public String getTextJoinNowButtonHeaderElement() { return getClickableElement(joinNowButtonHeaderElement).getText(); }

    public String getTextLostPasswordHeaderElement() { return getClickableElement(lostPasswordHeaderElement).getText(); }

    public String getTextLogoutButtonHeaderElement() { return getClickableElement(logoutButtonHeaderElement).getText(); }

    public String getTextDepositButtonHeaderElement() { return getClickableElement(depositButtonHeaderElement).getText(); }

    public String getTextMyAccountButtonHeaderElement() { return getClickableElement(myAccountButtonHeaderElement).getText(); }




    public void fillLoginInHeader(String login) { getLoginFieldHeaderElement().sendKeys(login); }

    public void fillPasswordInHeader(String password) { getPasswordFieldHeaderElement().sendKeys(password); }

    public void clickLoginButtonInHeader() { clickIfElementIsClickable(getLoginButtonHeaderElement()); }

    public void login(String login, String password) {
        fillLoginInHeader(login);
        loginFieldHeaderElement.sendKeys(Keys.TAB);
        fillPasswordInHeader(password);
        passwordFieldHeaderElement.sendKeys(Keys.TAB);
        clickLoginButtonInHeader();
    }


    public void correctLogin(String login, String password) {
        fillLoginInHeader(login);
        loginFieldHeaderElement.sendKeys(Keys.TAB);
        fillPasswordInHeader(password);
        loginFieldHeaderElement.sendKeys(Keys.TAB);
        clickLoginButtonInHeader();
        if(getDepositButtonHeaderElement().isEnabled()){ }
        else
            waitIfElementIsClickable(getLoginMessageOkButtonElement());
            clickIfElementIsClickable(getLoginMessageOkButtonElement());
        waitIfElementIsEnabled(getDepositButtonHeaderElement());
    }


    public void logout(){

        clickIfElementIsClickableFluent(getLogoutButtonHeaderElement());
        waitIfElementIsClickableFluent(loginButtonHeaderElement);
    }

}

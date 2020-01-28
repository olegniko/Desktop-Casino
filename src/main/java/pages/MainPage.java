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
    @FindBy(xpath = "//button[contains(@class,'auth-form__submit')]")
    protected WebElement loginButtonHeaderElement;
    @FindBy(xpath = "//a[contains(@class,'auth-form__join-button')]")
    protected WebElement joinNowButtonHeaderElement;
    @FindBy(xpath = "//a[contains(@class,'auth-form__input-helper')]")
    protected WebElement lostPasswordHeaderElement;
    @FindBy(css = "div[id='any_message']")
    protected WebElement incorrectLoginMessageElement;
    @FindBy(css = "div[id='any_message'] button")
    protected WebElement incorrectLoginMessageOkButtonElement;
    @FindBy(xpath = "//div[@id='simplemodal-container']//descendant::div[@id='loginMessage']")
    protected WebElement loginMessageElement;
    @FindBy(xpath="//div[@id='loginMessage']//descendant::button[@aria-label='OK']")
    protected WebElement loginMessageOkButtonElement;
    @FindBy(css = "img[alt='Marathonbet Logo']")
    protected WebElement marathonbetIconHeaderElement;
    @FindBy(xpath = "//a[contains(@class,'logout')]")
    protected WebElement logoutButtonHeaderElement;
    @FindBy(xpath = "//a[contains(@class,'deposit')]")
    protected WebElement depositButtonHeaderElement;
    @FindBy(xpath = "//span[contains(@class,'marathon_icons-profile')]")
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
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::a[contains(@href,'affiliates')]")
    protected WebElement affiliatesFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::a[contains(@href,'partners.htm')]")
    protected WebElement ourParntersFooterElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::a[contains(@href,'partnerName=manchester')]")
    protected WebElement partnreshipHistoryFooterElement;

    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-mancity']")
    protected WebElement manCityElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-sevilla']")
    protected WebElement sevillaElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-girona']")
    protected WebElement gironaElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-dinamo_moscow']")
    protected WebElement dinamoElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-karpaty']")
    protected WebElement karpatyElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-zaragoza']")
    protected WebElement zaragozaElement;


    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-visa']")
    protected WebElement visaIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-mastercard']")
    protected WebElement mastercardIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-maestro']")
    protected WebElement maestroIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-bank_transfer']")
    protected WebElement bankTransferIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-moneybookers']")
    protected WebElement skrillIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-neteller']")
    protected WebElement netellerIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-paysafecard']")
    protected WebElement paySafeCardIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-trustly']")
    protected WebElement trustlyIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-ecopayz']")
    protected WebElement ecoPayzIconElement;


    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-rgt-donor']")
    protected WebElement rgtDonorIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-gamstop']")
    protected WebElement gamstopIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-gamcare']")
    protected WebElement gamecareIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-alderney']")
    protected WebElement alderneyIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-gamblingcommission']")
    protected WebElement gamblingCommissionIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-ibas']")
    protected WebElement ibasIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-social_facebook']")
    protected WebElement facebookIconElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::em[@class='sprite-social_twitter']")
    protected WebElement twitterIconElement;



    @FindBy(xpath = "//div[@class='grid-footer']//descendant::a[contains(@href,'gamblingcommission.gov.uk')]")
    protected WebElement gamblingCommissionLinkElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::a[contains(@href,'gamblingcontrol.org')]")
    protected WebElement gamblingControlLinkElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::a[contains(@href,'begambleaware.org')]")
    protected WebElement begamblewareLinkElement;
    @FindBy(xpath = "//div[@class='grid-footer']//descendant::a[contains(@href,'shutterstock.com')]")
    protected WebElement shutterstockLinkElement;


    public WebElement getLoginFieldHeaderElement() { return getClickableElement(loginFieldHeaderElement); }
    public WebElement getPasswordFieldHeaderElement() { return getClickableElement(passwordFieldHeaderElement); }
    public WebElement getLoginButtonHeaderElement() { return getClickableFluentElement(loginButtonHeaderElement); }
    public WebElement getJoinNowButtonHeaderElement() { return getClickableElement(joinNowButtonHeaderElement); }
    public WebElement getLostPasswordHeaderElement() { return getEnabledElement(lostPasswordHeaderElement); }
    public WebElement getIncorrectLoginMessageElement() { return getClickableElement(incorrectLoginMessageElement); }
    public WebElement getLoginMessageElement() {
        return getEnabledElement(loginMessageElement);
    }
    public WebElement getIncorrectLoginMessageOkButtonElement() { return getClickableElement(incorrectLoginMessageOkButtonElement); }
    public WebElement getLoginMessageOkButtonElement() { return loginMessageOkButtonElement; }
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
    public WebElement getOurParntersFooterElement() { return getEnabledElement(ourParntersFooterElement); }
    public WebElement getPartnreshipHistoryFooterElement() { return getEnabledElement(partnreshipHistoryFooterElement); }

    public WebElement getManCityElement() { return getEnabledElement(manCityElement); }
    public WebElement getSevillaElement() { return getEnabledElement(sevillaElement); }
    public WebElement getGironaElement() { return getEnabledElement(gironaElement); }
    public WebElement getDinamoElement() { return getEnabledElement(dinamoElement); }
    public WebElement getKarpatyElement() { return getEnabledElement(karpatyElement); }
    public WebElement getZaragozaElement() { return getEnabledElement(zaragozaElement); }

    public WebElement getVisaIconElement() { return getEnabledElement(visaIconElement); }
    public WebElement getMastercardIconElement() { return getEnabledElement(mastercardIconElement); }
    public WebElement getMaestroIconElement() { return getEnabledElement(maestroIconElement); }
    public WebElement getBankTransferIconElement() { return getEnabledElement(bankTransferIconElement); }
    public WebElement getSkrillIconElement() { return getEnabledElement(skrillIconElement); }
    public WebElement getNetellerIconElement() { return getEnabledElement(netellerIconElement); }
    public WebElement getPaySafeCardIconElement() { return getEnabledElement(paySafeCardIconElement); }
    public WebElement getTrustlyIconElement() { return getEnabledElement(trustlyIconElement); }
    public WebElement getEcoPayzIconElement() { return getEnabledElement(ecoPayzIconElement); }

    public WebElement getRgtDonorIconElement() { return getEnabledElement(rgtDonorIconElement); }
    public WebElement getGamstopIconElement() { return getEnabledElement(gamstopIconElement); }
    public WebElement getGamecareIconElement() { return getEnabledElement(gamecareIconElement); }
    public WebElement getAlderneyIconElement() { return getEnabledElement(alderneyIconElement); }
    public WebElement getGamblingCommissionIconElement() { return getEnabledElement(gamblingCommissionIconElement); }
    public WebElement getIbasIconElement() { return getEnabledElement(ibasIconElement); }
    public WebElement getFacebookIconElement() { return getEnabledElement(facebookIconElement); }
    public WebElement getTwitterIconElement() { return getEnabledElement(twitterIconElement); }

    public WebElement getGamblingCommissionLinkElement() { return getEnabledElement(gamblingCommissionLinkElement); }
    public WebElement getGamblingControlLinkElement() { return getEnabledElement(gamblingControlLinkElement); }
    public WebElement getBegamblewareLinkElement() { return getEnabledElement(begamblewareLinkElement); }
    public WebElement getShutterstockLinkElement() { return getEnabledElement(shutterstockLinkElement); }


    public String getTextLoginFieldHeaderElement() { return getClickableElement(loginFieldHeaderElement).getAttribute("placeholder"); }
    public String getTextPasswordFieldHeaderElement() { return getClickableElement(passwordFieldHeaderElement).getAttribute("placeholder"); }
    public String getTextLoginButtonHeaderElement() { return getClickableElement(loginButtonHeaderElement).getText(); }
    public String getTextJoinNowButtonHeaderElement() { return getClickableElement(joinNowButtonHeaderElement).getText(); }
    public String getTextLostPasswordHeaderElement() { return getClickableElement(lostPasswordHeaderElement).getText(); }
    public String getTextLogoutButtonHeaderElement() { return getClickableElement(logoutButtonHeaderElement).getText(); }
    public String getTextDepositButtonHeaderElement() { return getClickableElement(depositButtonHeaderElement).getText(); }
    public String getTextMyAccountButtonHeaderElement() { return getClickableElement(myAccountButtonHeaderElement).getText(); }

    public String getTextAboutUsFooterElement() { return getAboutUsFooterElement().getText(); }
    public String getTextPrivacyPolicyFooterElement() { return getPrivacyPolicyFooterElement().getText(); }
    public String getTextResponsibleGamingFooterElement() { return getResponsibleGamingFooterElement().getText(); }
    public String getTextTermsAndConditionsFooterElement() { return getTermsAndConditionsFooterElement().getText(); }
    public String getTextContactUsFooterElement() { return getContactUsFooterElement().getText(); }
    public String getTextPaymentsFooterElement() { return getPaymentsFooterElement().getText(); }
    public String getTextMobileSiteFooterElement() { return getMobileSiteFooterElement().getText(); }
    public String getTextBlogFooterElement() { return getBlogFooterElement().getText(); }
    public String getTextAffiliatesFooterElement() { return getAffiliatesFooterElement().getText(); }
    public String getTextOurParntersFooterElement() { return getOurParntersFooterElement().getText(); }
    public String getTextPartnreshipHistoryFooterElement() { return getPartnreshipHistoryFooterElement().getText(); }





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

        if (getLoginMessageOkButtonElement().isDisplayed()) {
            clickIfElementIsClickable(getLoginMessageOkButtonElement());
        }
        waitIfElementIsEnabled(getDepositButtonHeaderElement());
    }


    public void logout(){
        clickIfElementIsClickableFluent(getLogoutButtonHeaderElement());
        waitIfElementIsClickableFluent(loginButtonHeaderElement);
    }

}


package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage {

    public MainPage() {
        super();
    }


    @FindBy(css = "input[data-id='auth_login']")
    protected WebElement loginFieldHeaderElement;

    public WebElement getLoginFieldHeaderElement() {

        return getClickableElement(loginFieldHeaderElement);

    }

    public String getTextLoginFieldHeaderElement() {

        return getClickableElement(loginFieldHeaderElement).getAttribute("placeholder");
    }


    @FindBy(css = "input[data-id='auth_login_password']")
    protected WebElement passwordFieldHeaderElement;

    public WebElement getPasswordFieldHeaderElement() {

        return getClickableElement(passwordFieldHeaderElement);

    }

    public String getTextPasswordFieldHeaderElement() {

        return getClickableElement(passwordFieldHeaderElement).getAttribute("placeholder");
    }


    @FindBy(css = "button[class='button btn-login']")
    protected WebElement loginButtonHeaderElement;

    public WebElement getLoginButtonHeaderElement() {

        return getEnabledElement(loginButtonHeaderElement);

    }

    public String getTextLoginButtonHeaderElement() {

        return getClickableElement(loginButtonHeaderElement).getText();
    }


    public void fillLoginInHeader(String login) {

        getLoginFieldHeaderElement().sendKeys(login);
    }


    public void fillPasswordInHeader(String password) {

        getPasswordFieldHeaderElement().sendKeys(password);
    }

    public void clickLoginButtonInHeader() {

        getLoginButtonHeaderElement().click();
    }

    public void login(String login, String password) {

        fillLoginInHeader(login);
        loginFieldHeaderElement.sendKeys(Keys.TAB);
        fillPasswordInHeader(password);
        loginFieldHeaderElement.sendKeys(Keys.TAB);
        clickLoginButtonInHeader();


    }


    @FindBy(css = "a[class='button btn-join']")
    protected WebElement joinNowButtonHeaderElement;

    public WebElement getJoinNowButtonHeaderElement() {

        return getClickableElement(joinNowButtonHeaderElement);

    }

    public String getTextJoinNowButtonHeaderElement() {

        return getClickableElement(joinNowButtonHeaderElement).getText();
    }


    @FindBy(css = "a[class='lostpass']")
    protected WebElement lostPasswordHeaderElement;

    public String getTextLostPasswordHeaderElement() {
        return getClickableElement(lostPasswordHeaderElement).getText();
    }

    public WebElement getLostPasswordHeaderElement() {
        return getClickableElement(lostPasswordHeaderElement);
    }


    @FindBy(css = "div[id='any_message']")
    protected WebElement incorrectLoginMessageElement;

    public WebElement getIncorrectLoginMessageElement() {
        return getClickableElement(incorrectLoginMessageElement);
    }


    @FindBy(css = "div[id='any_message'] button")
    protected WebElement incorrectLoginMessageOkButtonElement;

    public WebElement getIncorrectLoginMessageOkButtonElement() {
        return getClickableElement(incorrectLoginMessageOkButtonElement);
    }


    @FindBy(css = "div[id='loginMessage']")
    protected WebElement loginMessageElement;

    public WebElement getLoginMessageElement() {
        return getClickableElement(loginMessageElement);
    }


    @FindBy(css = "div[id='loginMessage'] button")
    protected WebElement loginMessageOkButtonElement;

    public WebElement getLoginMessageOkButtonElement() {
        return getClickableElement(loginMessageOkButtonElement);
    }


    @FindBy(css = "img[alt='Marathonbet Logo']")
    protected WebElement marathonbetIconHeaderElement;

    public WebElement getMarathonbetIconHeaderElement() {
        return getClickableElement(marathonbetIconHeaderElement);
    }


    @FindBy(css = "a[id='logoutLink']")
    protected WebElement logoutButtonHeaderElement;

    public String getTextLogoutButtonHeaderElement() {
        return getClickableElement(logoutButtonHeaderElement).getText();
    }

    public WebElement getLogoutButtonHeaderElement() {
        return getClickableElement(logoutButtonHeaderElement);
    }


    @FindBy(css = "a[class='button btn-deposit']")
    protected WebElement depositButtonHeaderElement;

    public String getTextDepositButtonHeaderElement() {
        return getClickableElement(depositButtonHeaderElement).getText();
    }

    public WebElement getDepositButtonHeaderElement() {
        return getClickableElement(depositButtonHeaderElement);
    }


    @FindBy(css = "a[class='button btn-deposit']")
    protected WebElement myAccountButtonHeaderElement;

    public String getTextMyAccountButtonHeaderElement() {
        return getClickableElement(myAccountButtonHeaderElement).getText();
    }

    public WebElement getMyAccountButtonHeaderElement() {
        return getClickableElement(myAccountButtonHeaderElement);
    }


}

package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public  class MainPage extends BasePage {

	@FindBy(css = "input[data-id='auth_login']")
	protected WebElement loginFieldHeaderElement;

	public WebElement getLoginFieldHeaderElement() {

		return getClickableElement(loginFieldHeaderElement);

	}

	public String getTextLoginFieldHeaderElement(){

		return getClickableElement(loginFieldHeaderElement).getAttribute("placeholder");
	}


	@FindBy(css = "input[data-id='auth_login_password']")
	protected WebElement passwordFieldHeaderElement;

	public WebElement getPasswordFieldHeaderElement() {

		return getClickableElement(passwordFieldHeaderElement);

	}

	public String getTextPasswordFieldHeaderElement(){

		return getClickableElement(passwordFieldHeaderElement).getAttribute("placeholder");
	}



	@FindBy(css = "button[class='button btn-login']")
	protected WebElement loginButtonHeaderElement;

	public WebElement getLoginButtonHeaderElement() {

		return getClickableElement(passwordFieldHeaderElement);

	}

	public String getTextLoginButtonHeaderElement(){

		return getClickableElement(passwordFieldHeaderElement).getText();
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
		clickLoginButtonInHeader();;

	}




	@FindBy(className = "field-search")
	protected WebElement searchFieldElement;

	@FindBy(className = "languageSelectField")
	protected WebElement languageSwitcherElement;

	@FindBy(css = "#languageSelectField .menu-link")
	protected WebElement languageLabelElement;

	@FindBy(id = "headerBalance")
	protected WebElement headerBalance;


	@FindBy(className = "captcha")
	protected WebElement captcha;

	public WebElement getCaptcha() {
		return captcha;
	}



	@FindBy(xpath = "//*[@id=\"auth\"]/div[2]")
	protected WebElement CaptchaProverochnyiCod;

	public boolean isCaptchaProverochnyiCod(){

		return CaptchaProverochnyiCod.isDisplayed();
	}


	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[1]/a[1]")
	protected WebElement SportLabelHeader;

	public  String getSportLabelHeaderText(){
		return SportLabelHeader.getText();
	}

	public  WebElement getSportLabelHeaderElement(){
		return SportLabelHeader;
	}



	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[1]/a[2]/span")
	protected WebElement LiveLabelHeader;

	public String getLiveLabelHeaderText(){
		return LiveLabelHeader.getText();
	}

	public  WebElement getLiveLabelHeaderElement(){
		return LiveLabelHeader;
	}




	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[1]/a[3]/span")
	protected WebElement TotoLabelHeader;

	public String getTotoLabelHeaderText(){
		return TotoLabelHeader.getText();
	}

	public  WebElement getTotoLabelHeaderElement(){

		return TotoLabelHeader;
	}




	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[1]/a[4]/span")
	protected WebElement CasinoLabelHeader;

	public String getCasinoLabelHeaderText(){
		return CasinoLabelHeader.getText();
	}

	public  WebElement getCasinoLabelHeaderElement(){
		return CasinoLabelHeader;
	}




	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[2]/a[1]/span")
	protected WebElement LiveCasinoLabelHeader;

	public String getLiveCasinoLabelHeaderText(){
		return LiveCasinoLabelHeader.getText();
	}

	public  WebElement getLiveCasinoLabelHeaderElement(){
		return LiveCasinoLabelHeader;
	}




	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[2]/a[2]/span")
	protected WebElement ConstructorLabelHeader;

	public String getConstructorLabelHeaderText(){
		return ConstructorLabelHeader.getText();
	}

	public  WebElement getConstructorLabelHeaderElement(){
		return ConstructorLabelHeader;
	}




	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[2]/a[3]/span")
	protected WebElement BingoLabelHeader;

	public String getBingoLabelHeaderText(){
		return BingoLabelHeader.getText();
	}

	public  WebElement getBingoLabelHeaderElement(){
		return BingoLabelHeader;
	}



	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[2]/a[4]/span")
	protected WebElement FinancialsLabelHeader;

	public String getFinancialsLabelHeaderText(){
		return FinancialsLabelHeader.getText();
	}

	public  WebElement getFinancialsLabelHeaderElement(){

		return FinancialsLabelHeader;
	}




	@FindBy(xpath = "//*[@id=\"auth\"]/div[1]/a")
	protected WebElement LostPassword;

	public String getLostPasswordText(){
		return LostPassword.getText();
	}

	public  WebElement getLostPasswordElement(){
		return LostPassword;
	}




	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[2]/div[2]/div")
	protected WebElement Help;

	public String getHelpText(){
		return Help.getText();
	}

	public  WebElement getHelpElement(){
		return Help;
	}




	@FindBy(xpath = "//*[@id=\"languageSelectField\"]/div[1]")
	protected WebElement Language;

	public String getLanguageText(){
		return Language.getText();
	}

	public  WebElement getLanguageElement(){
		return Language;
	}




	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[2]/div[4]/div")
	protected WebElement Results;

	public String getResultsText(){
		return Results.getText();
	}

	public  WebElement getResultsElement(){
		return Results;
	}



	@FindBy(xpath = "//*[@id=\"settingsDropdown\"]/div[1]/span")
	protected WebElement Settings;

	public String getSettingsText(){
		return Settings.getText();
	}

	public  WebElement getSettingsElement(){
		return Settings;
	}





	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div[1]/div[2]/div[6]/a/i")
	protected WebElement MobileIcon;

	public boolean isMobileIconPresent(){
		return MobileIcon.isDisplayed();
	}




	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div[1]/div[1]/div[2]/div[1]/a/img")
	protected WebElement MarathonIcon;

	public boolean isMarathonIconPresent(){
		return MarathonIcon.isDisplayed();
	}



	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/ul/li[1]/span")
	protected WebElement AboutUs;

	public String getAboutUsText(){
		return AboutUs.getText();
	}

	public  WebElement getAboutUsElement(){
		return AboutUs;
	}




	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/ul/li[2]/span")
	protected WebElement PrivacyPolicy ;

	public String getPrivacyPolicyText(){
		return PrivacyPolicy.getText();
	}

	public WebElement getPrivacyPolicyElement(){
		return PrivacyPolicy;
	}



	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/ul/li[3]/span")
	protected WebElement ResponsibleGambling;

	public String getResponsibleGamblingText(){
		return ResponsibleGambling.getText();
	}

	public WebElement getResponsibleGamblingElement(){
		return ResponsibleGambling;
	}




	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/ul/li[4]/span")
	protected WebElement TermsAndConditions;

	public String getTermsAndConditionsText(){
		return TermsAndConditions.getText();
	}

	public WebElement getTermsAndConditionsElement(){
		return TermsAndConditions;
	}



	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/ul/li[5]/span")
	protected WebElement ContactUs;

	public String getContactUsText(){
		return ContactUs.getText();
	}

	public WebElement getContactUsElement(){
		return ContactUs;
	}



	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/ul/li[6]/span")
	protected WebElement Payments;

	public String getPaymentsText(){
		return Payments.getText();
	}

	public  WebElement getPaymentsElement(){
		return Payments;
	}




	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/ul/li[7]/a")
	protected WebElement MobileSite;

	public String getMobileSiteText(){
		return MobileSite.getText();
	}

	public  WebElement getMobileSiteElement(){
		return MobileSite;
	}





	public boolean isPresentBalanceInHeader(){

		return (headerBalance!=null);

	}
	public boolean isPresentCaptcha(){

		return (captcha!=null);

	}

	public void search(String phrase) {
		searchFieldElement.sendKeys(phrase + Keys.ENTER);
	}






}

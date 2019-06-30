package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.net.MalformedURLException;



public  class MainPage extends BasePage {

	public MainPage(String browser) throws MalformedURLException {
		super(browser);
	}


	@FindBy(id = "auth_login")
	protected WebElement loginFieldElement;

	@FindBy(id = "auth_login_password")
	protected WebElement passwordFieldElement;

	@FindBy(xpath="//*[@id=\"auth\"]/div[1]/div[3]/button")
	protected WebElement loginButtonElement;

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

	public  String getSportLabelHeader(){
		return SportLabelHeader.getText();
	}

	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[1]/a[2]/span")
	protected WebElement LiveLabelHeader;

	public String getLive_label_header(){
		return LiveLabelHeader.getText();
	}

	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[1]/a[3]/span")
	protected WebElement TotoLabelHeader;

	public String getTotoLabelHeader(){
		return TotoLabelHeader.getText();
	}

	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[1]/a[4]/span")
	protected WebElement CasinoLabelHeader;

	public String getCasinoLabelHeader(){
		return CasinoLabelHeader.getText();
	}

	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[2]/a[1]/span")
	protected WebElement LiveCasinoLabelHeader;

	public String getLiveCasinoLabelHeader(){
		return LiveCasinoLabelHeader.getText();
	}

	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[2]/a[2]/span")
	protected WebElement ConstructorLabelHeader;

	public String getConstructorLabelHeader(){
		return ConstructorLabelHeader.getText();
	}

	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[2]/a[3]/span")
	protected WebElement BingoLabelHeader;

	public String getBingoLabelHeader(){
		return BingoLabelHeader.getText();
	}

	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[2]/a[4]/span")
	protected WebElement FinancialsLabelHeader;

	public String getFinancialsLabelHeader(){
		return FinancialsLabelHeader.getText();
	}

	@FindBy(xpath = "//*[@id=\"auth\"]/div[1]/a")
	protected WebElement LostPassword;

	public String getLostPassword(){
		return LostPassword.getText();
	}

	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[2]/div[2]/div")
	protected WebElement Help;

	public String getHelp(){
		return Help.getText();
	}

	@FindBy(xpath = "//*[@id=\"languageSelectField\"]/div[1]")
	protected WebElement Language;

	public String getLanguage(){
		return Language.getText();
	}

	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[2]/div[4]/div")
	protected WebElement Results;

	public String getResults(){
		return Results.getText();
	}

	@FindBy(xpath = "//*[@id=\"settingsDropdown\"]/div[1]/span")
	protected WebElement Settings;

	public String getSettings(){
		return Settings.getText();
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

	public String getAboutUs(){
		return AboutUs.getText();
	}


	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/ul/li[2]/span")
	protected WebElement PrivacyPolicy ;

	public String getPrivacyPolicy(){
		return PrivacyPolicy.getText();
	}

	public WebElement getPrivacyPolicyElement(){
		return PrivacyPolicy;
	}

	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/ul/li[3]/span")
	protected WebElement ResponsibleGambling;

	public String getResponsibleGambling(){
		return ResponsibleGambling.getText();
	}

	public WebElement getResponsibleGamblingElement(){
		return ResponsibleGambling;
	}


	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/ul/li[4]/span")
	protected WebElement TermsAndConditions;

	public String getTermsAndConditions(){
		return TermsAndConditions.getText();
	}

	public WebElement getTermsAndConditionsElement(){
		return TermsAndConditions;
	}

	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/ul/li[5]/span")
	protected WebElement ContactUs;

	public String getContactUs(){
		return ContactUs.getText();
	}

	public WebElement getContactUsElement(){
		return ContactUs;
	}

	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/ul/li[6]/span")
	protected WebElement Payments;

	public String getPayments(){
		return Payments.getText();
	}

	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/ul/li[7]/a")
	protected WebElement MobileSite;

	public String getMobileSite(){
		return MobileSite.getText();
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

	public void fillLogin(String login) {
		loginFieldElement.sendKeys(login);
	}

	public void fillPassword(String password) {
		passwordFieldElement.sendKeys(password);
	}

	public void clickLoginButton() {
		loginButtonElement.click();
	}

	public void login(String login, String password) {
		fillLogin(login);
		loginFieldElement.sendKeys(Keys.TAB);
		fillPassword(password);
		passwordFieldElement.sendKeys(Keys.ENTER);


	}




}

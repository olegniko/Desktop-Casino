package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public abstract  class BasePage {

	protected WebDriver driver;

	@FindBy(id = "auth_login")
	protected WebElement login_field_element;

	@FindBy(id = "auth_login_password")
	protected WebElement password_field_element;

	@FindBy(xpath="//*[@id=\"auth\"]/div[1]/div[3]/button")
	protected WebElement login_button_element;

	@FindBy(className = "field-search")
	protected WebElement search_field_element;

	@FindBy(className = "languageSelectField")
	protected WebElement language_switcher_element;

	@FindBy(css = "#languageSelectField .menu-link")
	protected WebElement language_label_element;

	@FindBy(id = "header_balance")
	protected WebElement header_balance;


	@FindBy(className = "captcha")
	protected WebElement captcha;

	public WebElement getCaptcha() {
		return captcha;
	}



	@FindBy(xpath = "//*[@id=\"auth\"]/div[2]")
	protected WebElement Captcha_proverochnyi_cod;

	public boolean isCaptcha_proverochnyi_cod(){

		return Captcha_proverochnyi_cod.isDisplayed();
	}


	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[1]/a[1]/span")
	protected WebElement Sport_label_header;

	public  String getSport_label_header(){
		return Sport_label_header.getText();
	}

	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[1]/a[2]/span")
	protected WebElement Live_label_header;

	public String getLive_label_header(){
		return Live_label_header.getText();
	}

	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[1]/a[3]/span")
	protected WebElement Toto_label_header;

	public String getToto_label_header(){
		return Toto_label_header.getText();
	}

	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[1]/a[4]/span")
	protected WebElement Casino_label_header;

	public String getCasino_label_header(){
		return Casino_label_header.getText();
	}

	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[2]/a[1]/span")
	protected WebElement LiveCasino_label_header;

	public String getLiveCasino_label_header(){
		return LiveCasino_label_header.getText();
	}

	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[2]/a[2]/span")
	protected WebElement Constructor_label_header;

	public String getConstructor_label_header(){
		return Constructor_label_header.getText();
	}

	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[2]/a[3]/span")
	protected WebElement Bingo_label_header;

	public String getBingo_label_header(){
		return Bingo_label_header.getText();
	}

	@FindBy(xpath = "//*[@id=\"header_container\"]/div/div/div[1]/div[2]/div[2]/span[2]/a[4]/span")
	protected WebElement Financials_label_header;

	public String getFinancials_label_header(){
		return Financials_label_header.getText();
	}

	@FindBy(xpath = "//*[@id=\"auth\"]/div[1]/a")
	protected WebElement Lost_password;

	public String getLost_password(){
		return Lost_password.getText();
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

	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/ul/li[3]/span")
	protected WebElement ResponsibleGambling;

	public String getResponsibleGambling(){
		return ResponsibleGambling.getText();
	}


	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/ul/li[4]/span")
	protected WebElement TermsAndConditions;

	public String getTermsAndConditions(){
		return TermsAndConditions.getText();
	}

	@FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/ul/li[5]/span")
	protected WebElement ContactUs;

	public String getContactUs(){
		return ContactUs.getText();
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

		return (header_balance!=null);

	}
	public boolean isPresentCaptcha(){

		return (captcha!=null);

	}

	public void search(String phrase) {
		search_field_element.sendKeys(phrase + Keys.ENTER);
	}

	public void fillLogin(String login) {
		login_field_element.sendKeys(login);
	}

	public void fillPassword(String password) {
		password_field_element.sendKeys(password);
	}
	
	public void clickLoginButton() {
		login_button_element.click();
	}
	
	public void login(String login, String password) {
		fillLogin(login);
		login_field_element.sendKeys(Keys.TAB);
		fillPassword(password);
		password_field_element.sendKeys(Keys.ENTER);
		//clickLoginButton();

	}

}

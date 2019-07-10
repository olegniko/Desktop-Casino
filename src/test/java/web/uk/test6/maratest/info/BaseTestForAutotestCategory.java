package web.uk.test6.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pages.CasinoPage;

import java.net.MalformedURLException;
import java.util.Locale;
import java.util.ResourceBundle;


public class BaseTestForAutotestCategory {

    Locale locale;
    ResourceBundle exampleBundle;
    CasinoPage casinoPage;



    @BeforeClass
    @Parameters({"language","browser"})
    public  void setUp(String language,String browser) throws MalformedURLException, InterruptedException {

        locale = new Locale(language);
        exampleBundle = ResourceBundle.getBundle("ResourceBundle",locale);
        casinoPage = new CasinoPage(browser);
        casinoPage.open(locale);
        casinoPage.waitIfElementIsClickable(casinoPage.getSearchCasino());

        casinoPage.waitIfElementIsClickable(casinoPage.getOtherDropDownElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getOtherDropDownElement());
        casinoPage.waitIfElementIsClickable(casinoPage.getAutotestCategory());
        casinoPage.clickIfElementIsClickable(casinoPage.getAutotestCategory());
        casinoPage.waitIfElementIsClickable(casinoPage.getOtherDropDownElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getOtherDropDownElement());
        casinoPage.waitIfElementIsClickable(casinoPage.getAutotestCategory());
        casinoPage.clickIfElementIsClickable(casinoPage.getAutotestCategory());

    }


    @AfterClass
    public void tearDown()  {
        casinoPage.close();
    }
}

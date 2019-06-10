package web.uk.test6.maratest.info;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import pages.CasinoPage;
import java.net.MalformedURLException;
import java.util.Locale;
import java.util.ResourceBundle;


public class BaseTestForCasinoRegistred {

    Locale locale;
    ResourceBundle exampleBundle;
    CasinoPage casinoPage;


    @BeforeSuite
    @Parameters({"language","browser"})
    public  void setUp(String language,String browser) throws MalformedURLException {

        locale = new Locale(language);
        exampleBundle = ResourceBundle.getBundle("ResourceBundle",locale);
        casinoPage = new CasinoPage(browser);
        casinoPage.open(locale);
        casinoPage.login("olegeng60","Password1");
        casinoPage.clickIfElementIsClickable(casinoPage.getOK_In_successfull_Message());

    }


    @AfterSuite
    public void tearDown()  {
        casinoPage.close();
   }
}

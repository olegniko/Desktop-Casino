package web.uk.test6.maratest.info;


import org.testng.annotations.*;
import pages.CasinoPage;
import java.net.MalformedURLException;
import java.util.Locale;
import java.util.ResourceBundle;


public class BaseTestForCasinoRegistred {

    Locale locale;
    ResourceBundle exampleBundle;
    CasinoPage casinoPage;


    @BeforeClass
    @Parameters({"language","browser"})
    public  void setUp(String language,String browser) throws MalformedURLException {

        locale = new Locale(language);
        exampleBundle = ResourceBundle.getBundle("ResourceBundle",locale);
        casinoPage = new CasinoPage(browser);
        casinoPage.open(locale);
        casinoPage.login("olegeng60","Password2");
        casinoPage.clickIfElementIsClickable(casinoPage.getOkInSuccessfullMessage());

    }


    @AfterClass
    public void tearDown()  {
        casinoPage.close();
   }
}

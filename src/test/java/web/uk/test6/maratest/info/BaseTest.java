package web.uk.test6.maratest.info;

import org.testng.annotations.*;
import pages.CasinoPage;
import java.net.MalformedURLException;
import java.util.Locale;
import java.util.ResourceBundle;


public class BaseTest {

    Locale locale;
    ResourceBundle exampleBundle;
    CasinoPage casinoPage;



    @BeforeSuite
    @Parameters({"language","browser"})
    public  void setUp(String language,String browser) throws MalformedURLException, InterruptedException {

        locale = new Locale(language);
        exampleBundle = ResourceBundle.getBundle("ResourceBundle",locale);
        casinoPage = new CasinoPage(browser);
        casinoPage.open(locale);

    }


    @AfterSuite
    public void tearDown()  {
        casinoPage.close();
    }
}

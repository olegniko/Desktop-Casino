package web.uk.test6.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.CasinoPage;

import java.net.MalformedURLException;
import java.util.Locale;
import java.util.ResourceBundle;

import static org.testng.Assert.assertEquals;


public class GameLaunchMG {
    CasinoPage casinoPage;

    @BeforeClass

    public  void setUp()  {


        casinoPage = new CasinoPage();


    }


    @AfterClass
    public void tearDown()  {
        casinoPage.close();
    }

}


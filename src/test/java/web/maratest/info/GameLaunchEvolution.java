package web.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.CasinoPage;


public class GameLaunchEvolution {


    CasinoPage casinoPage;

    @BeforeClass

    public void setUp() {


        casinoPage = new CasinoPage();


    }


    @AfterClass
    public void tearDown() {
        casinoPage.close();
    }


}


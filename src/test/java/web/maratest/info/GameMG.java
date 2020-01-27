package web.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class GameMG {

    CasinoPage casinoPage;

    @BeforeClass

    public void setUp() throws Exception {

        casinoPage = new CasinoPage();
        casinoPage.search(exampleBundle.getString("mg_game"));
    }


    @AfterClass
    public void tearDown() {
        casinoPage.close();
    }


    @Test
    //
    public void playButtonEnabledTest() {

        assertFalse(casinoPage.getMgGamePlayElement().isDisplayed());
        assertTrue(casinoPage.getMgGamePlayElement().isEnabled());

    }

    @Test
    //
    public void demoButtonEnabledTest() {

        assertFalse(casinoPage.getMgGameDemoElement().isDisplayed());
        assertTrue(casinoPage.getMgGameDemoElement().isEnabled());

    }

    @Test
    //
    public void favouritesEnabledTest() {

        assertTrue(casinoPage.getMgGameFavouriteElement().isDisplayed());
        assertTrue(casinoPage.getMgGameFavouriteElement().isEnabled());

    }
}
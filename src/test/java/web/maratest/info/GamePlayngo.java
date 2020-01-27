package web.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class GamePlayngo {

    CasinoPage casinoPage;

    @BeforeClass

    public void setUp() throws Exception {


        casinoPage = new CasinoPage();
        casinoPage.search(exampleBundle.getString("playngo_game"));


    }


    @AfterClass
    public void tearDown() {
        casinoPage.close();
    }


    @Test
    //
    public void playButtonEnabledTest() {

        assertFalse(casinoPage.getPlayngoGamePlayElement().isDisplayed());
        assertTrue(casinoPage.getPlayngoGamePlayElement().isEnabled());

    }

    @Test
    //
    public void demoButtonEnabledTest() {

        assertFalse(casinoPage.getPlayngoGameDemoElement().isDisplayed());
        assertTrue(casinoPage.getPlayngoGameDemoElement().isEnabled());

    }

    @Test
    //
    public void favouritesEnabledTest() {

        assertTrue(casinoPage.getPlayngoGameFavouriteElement().isDisplayed());
        assertTrue(casinoPage.getPlayngoGameFavouriteElement().isEnabled());

    }
}


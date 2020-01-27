package web.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class GameYggdrasil {

    CasinoPage casinoPage;

    @BeforeClass

    public void setUp() throws Exception {


        casinoPage = new CasinoPage();
        casinoPage.search(exampleBundle.getString("yggdrasil_game"));


    }


    @AfterClass
    public void tearDown() {
        casinoPage.close();
    }


    @Test
    //
    public void playButtonEnabledTest() {

        assertFalse(casinoPage.getYggdrasilGamePlayElement().isDisplayed());
        assertTrue(casinoPage.getYggdrasilGamePlayElement().isEnabled());

    }

    @Test
    //
    public void demoButtonEnabledTest() {

        assertFalse(casinoPage.getYggdrasilGameDemoElement().isDisplayed());
        assertTrue(casinoPage.getYggdrasilGameDemoElement().isEnabled());

    }

    @Test
    //
    public void favouritesEnabledTest() {

        assertTrue(casinoPage.getYggdrasilGameFavouriteElement().isDisplayed());
        assertTrue(casinoPage.getYggdrasilGameFavouriteElement().isEnabled());

    }
}


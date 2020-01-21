package web.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class GameIssoft {

    CasinoPage casinoPage;

    @BeforeClass

    public void setUp() throws Exception {


        casinoPage = new CasinoPage();
        casinoPage.search(exampleBundle.getString("issoft_game"));


    }


    @AfterClass
    public void tearDown() {
        casinoPage.close();
    }




    @Test
    //
    public void playButtonEnabledTest() {

        assertFalse(casinoPage.getIssoftGamePlayElement().isDisplayed());
        assertTrue(casinoPage.getIssoftGamePlayElement().isEnabled());

    }
    @Test
    //
    public void demoButtonEnabledTest() {

        assertFalse(casinoPage.getIssoftGameDemoElement().isDisplayed());
        assertTrue(casinoPage.getIssoftGameDemoElement().isEnabled());

    }
    @Test
    //
    public void favouritesEnabledTest() {

        assertTrue(casinoPage.getIssoftGameFavouriteElement().isDisplayed());
        assertTrue(casinoPage.getIssoftGameFavouriteElement().isEnabled());

    }
}


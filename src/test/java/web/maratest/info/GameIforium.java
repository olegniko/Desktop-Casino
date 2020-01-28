package web.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class GameIforium {

    CasinoPage casinoPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        casinoPage = new CasinoPage();
        casinoPage.search(exampleBundle.getString("iforium_game"));
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        casinoPage.close();
    }


    @Test(groups = {"CUR2"})
    public void playButtonEnabledTest() {
        assertFalse(casinoPage.getIforiumGamePlayElement().isDisplayed());
        assertTrue(casinoPage.getIforiumGamePlayElement().isEnabled());
    }

    @Test(groups = {"CUR2"})
    public void demoButtonEnabledTest() {
        assertFalse(casinoPage.getIforiumGameDemoElement().isDisplayed());
        assertTrue(casinoPage.getIforiumGameDemoElement().isEnabled());
    }

    @Test(groups = {"CUR2"})
    public void favouritesEnabledTest() {
        assertTrue(casinoPage.getIforiumGameFavouriteElement().isDisplayed());
        assertTrue(casinoPage.getIforiumGameFavouriteElement().isEnabled());
    }
}
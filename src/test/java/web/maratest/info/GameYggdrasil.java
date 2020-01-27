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

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        casinoPage = new CasinoPage();
        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        casinoPage.close();
    }



    @Test(groups = {"ALD2"})
    public void playButtonEnabledTest() {
        assertFalse(casinoPage.getYggdrasilGamePlayElement().isDisplayed());
        assertTrue(casinoPage.getYggdrasilGamePlayElement().isEnabled());
    }

    @Test(groups = {"ALD2"})
    public void demoButtonEnabledTest() {
        assertFalse(casinoPage.getYggdrasilGameDemoElement().isDisplayed());
        assertTrue(casinoPage.getYggdrasilGameDemoElement().isEnabled());
    }

    @Test(groups = {"ALD2"})
    public void favouritesEnabledTest() {
        assertTrue(casinoPage.getYggdrasilGameFavouriteElement().isDisplayed());
        assertTrue(casinoPage.getYggdrasilGameFavouriteElement().isEnabled());
    }
}


package web.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class GameEvolution {


    CasinoPage casinoPage;

    @BeforeClass

    public void setUp() throws Exception {


        casinoPage = new CasinoPage();
        casinoPage.search(exampleBundle.getString("evolution_game"));


    }


    @AfterClass
    public void tearDown() {
        casinoPage.close();
    }


    @Test
    //
    public void playButtonEnabledTest() {

        assertFalse(casinoPage.getEvolutionGamePlayElement().isDisplayed());
        assertTrue(casinoPage.getEvolutionGamePlayElement().isEnabled());

    }

    @Test
    //
    public void demoButtonEnabledTest() {

        assertFalse(casinoPage.getEvolutionGameDemoElement().isDisplayed());
        assertTrue(casinoPage.getEvolutionGameDemoElement().isEnabled());

    }

    @Test
    //
    public void favouritesEnabledTest() {

        assertTrue(casinoPage.getEvolutionGameFavouriteElement().isDisplayed());
        assertTrue(casinoPage.getEvolutionGameFavouriteElement().isEnabled());

    }
}


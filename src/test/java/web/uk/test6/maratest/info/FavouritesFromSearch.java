package web.uk.test6.maratest.info;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class FavouritesFromSearch extends BaseTestForCasinoUnregistred {



    @Test(priority=1)
    //
    public void favouritesIsPresent() {

        assertTrue(casinoPage.getFavourites().isDisplayed());

    }

    @Test(priority=2)
    //
    public void favouritesNumberIsPresent() {

        assertTrue(casinoPage.getNumberFavourites().isDisplayed());

    }

    @Test(priority=3)
    // 0 for unregestred user
    public void favouritesNumberIs0() {

        assertEquals(casinoPage.getNumberFavouritesText(),"0");

    }



    @Test (priority=4)
    //
    public void addMgInFavourites() throws InterruptedException {


        casinoPage.enterSymbolsToSearch("olegMGautotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix());

        assertEquals(casinoPage.getNumberFavouritesText(),"1");

        casinoPage.waitIfElementIsClickable(casinoPage.getCrossInSearch());

        casinoPage.clearSearchInCasinoByCross();

    }

    @Test (priority=5)
    //
    public void addEvolutionInFavourites() {


        casinoPage.enterSymbolsToSearch("olegEvolutionAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix());

        assertEquals(casinoPage.getNumberFavouritesText(),"2");

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=6)
    //
    public void addIssoftInFavourites() {


        casinoPage.enterSymbolsToSearch("olegIssoftAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix());

        assertEquals(casinoPage.getNumberFavouritesText(),"3");

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=7)
    //
    public void addRelaxInFavourites() {


        casinoPage.enterSymbolsToSearch("olegRelaxAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix());

        assertEquals(casinoPage.getNumberFavouritesText(),"4");

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=8)
    //
    public void addYggdrasilInFavourites() {


        casinoPage.enterSymbolsToSearch("olegYggdrasilAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix());

        assertEquals(casinoPage.getNumberFavouritesText(),"5");

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=9)
    //
    public void addPlayngoInFavourites() {


        casinoPage.enterSymbolsToSearch("olegPlayngoAutotest");
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix());
        assertEquals(casinoPage.getNumberFavouritesText(),"6");
        casinoPage.clearSearchInCasino();

    }

    @Test (priority=10)
    //
    public void numberFavouritesAfterLogin() {

        casinoPage.login("olegautotest","Password1");
        casinoPage.clickIfElementIsClickable(casinoPage.getOkInSuccessfullMessage());
        assertEquals(casinoPage.getNumberFavouritesText(),"6");

    }

    @Test (priority=11)
    //
    public void eraseFavouritesAfterLogin() {

        casinoPage.clickIfElementIsClickable(casinoPage.getNumberFavourites());


        casinoPage.getFavouriteForSixthElementOfSix().click();
        casinoPage.getFavouriteForFifthElementOfSix().click();
        casinoPage.getFavouriteForForthElementOfSix().click();
        casinoPage.getFavouriteForThirdElementOfSix().click();
        casinoPage.getFavouriteForSecondElementOfSix().click();
        casinoPage.getFavouriteForFirstElementOfSix().click();


        assertEquals(casinoPage.getNumberFavouritesText(),"0");

    }


}



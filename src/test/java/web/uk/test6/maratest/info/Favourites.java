package web.uk.test6.maratest.info;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class Favourites extends BaseTestForCasinoUnregistred {



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

        assertEquals(casinoPage.getNumberFavourites().getText(),"0");

    }



    @Test (priority=4)
    //
    public void add_MG_in_favourites() {


        casinoPage.enter_symbols_to_Search("olegMGautotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForIssoft());

        assertEquals(casinoPage.getNumberFavourites().getText(),"1");

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=5)
    //
    public void add_Evolution_in_favourites() {


        casinoPage.enter_symbols_to_Search("olegEvolutionAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForIssoft());

        assertEquals(casinoPage.getNumberFavourites().getText(),"2");

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=6)
    //
    public void add_Issoft_in_favourites() {


        casinoPage.enter_symbols_to_Search("olegIssoftAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForIssoft());

        assertEquals(casinoPage.getNumberFavourites().getText(),"3");

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=7)
    //
    public void add_Relax_in_favourites() {


        casinoPage.enter_symbols_to_Search("olegRelaxAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForIssoft());

        assertEquals(casinoPage.getNumberFavourites().getText(),"4");

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=8)
    //
    public void add_Yggdrasil_in_favourites() {


        casinoPage.enter_symbols_to_Search("olegYggdrasilAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForIssoft());

        assertEquals(casinoPage.getNumberFavourites().getText(),"5");

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=9)
    //
    public void add_Playngo_in_favourites() {


        casinoPage.enter_symbols_to_Search("olegPlayngoAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForIssoft());

        assertEquals(casinoPage.getNumberFavourites().getText(),"6");

        casinoPage.clearSearchInCasino();

    }


}



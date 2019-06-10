package web.uk.test6.maratest.info;

import org.testng.Assert;
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

    @Test(priority=4)
    // 1 if click on game
    public void favouritesForIssoft() {

        casinoPage.enter_symbols_to_Search("olegIssoftAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForIssoft());

        assertEquals(casinoPage.getNumberFavourites().getText(),"1");

    }


}



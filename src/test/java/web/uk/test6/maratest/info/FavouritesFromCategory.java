package web.uk.test6.maratest.info;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class FavouritesFromCategory extends BaseTestForCasinoUnregistred {



    @Test(priority=1)
    //
    public void favouritesIsPresent() {

        casinoPage.waitIfElementIsClickable(casinoPage.getOtherDropDownElement());

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
    public void addIssoftInFavouritesFromCategory() {

        casinoPage.clickIfElementIsClickable(casinoPage.getOtherDropDownElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getAutotestCategory());

        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForFirstElementInCategory()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementInCategory()) ;

        assertEquals(casinoPage.getNumberFavourites().getText(),"1");

    }

    @Test (priority=5)
    //
    public void addYggdrasilInFavouritesFromCategory() {

        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForSecondElementInCategory()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForSecondElementInCategory()) ;

        assertEquals(casinoPage.getNumberFavourites().getText(),"2");

    }

    @Test (priority=6)
    //
    public void adMgInFavouritesFromCategory() {

        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForThirdElementInCategory()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForThirdElementInCategory()) ;

        assertEquals(casinoPage.getNumberFavourites().getText(),"3");

    }

    @Test (priority=7)
    //
    public void addPlayngoInFavouritesFromCategory() {

        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForForthElementInCategory()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForForthElementInCategory()) ;

        assertEquals(casinoPage.getNumberFavourites().getText(),"4");

    }

    @Test (priority=8)
    //
    public void addRelaxInFavouritesFromCategory() {

        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForFifthElementInCategory()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFifthElementInCategory()) ;

        assertEquals(casinoPage.getNumberFavourites().getText(),"5");

    }

    @Test (priority=9)
    //
    public void addEvolutionInFavouritesFromCategory() {

        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForSixthElementInCategory()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForSixthElementInCategory()) ;

        assertEquals(casinoPage.getNumberFavourites().getText(),"6");

    }


}



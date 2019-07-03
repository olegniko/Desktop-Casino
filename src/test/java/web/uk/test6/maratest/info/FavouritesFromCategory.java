package web.uk.test6.maratest.info;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class FavouritesFromCategory extends BaseTestForAutotestCategory {



    @Test (priority=1)
    //
    public void addIssoftInFavouritesFromCategory() {

        casinoPage.waitIfElementIsClickable(casinoPage.getSearchCasino());
        casinoPage.waitIfElementIsClickable(casinoPage.getOtherDropDownElement());

        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix()) ;

        assertEquals(casinoPage.getNumberFavouritesText(),"1");

    }

    @Test (priority=2)
    //
    public void addYggdrasilInFavouritesFromCategory() {

        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForSecondElementOfSix()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForSecondElementOfSix()) ;

        assertEquals(casinoPage.getNumberFavouritesText(),"2");

    }

    @Test (priority=3)
    //
    public void addMgInFavouritesFromCategory() {


        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForThirdElementOfSix()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForThirdElementOfSix()) ;

        assertEquals(casinoPage.getNumberFavouritesText(),"3");

    }

    @Test (priority=4)
    //
    public void addPlayngoInFavouritesFromCategory() {


        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForForthElementOfSix()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForForthElementOfSix()) ;

        assertEquals(casinoPage.getNumberFavouritesText(),"4");

    }

    @Test (priority=5)
    //
    public void addRelaxInFavouritesFromCategory() {


        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForFifthElementOfSix()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFifthElementOfSix()) ;

        assertEquals(casinoPage.getNumberFavouritesText(),"5");

    }

    @Test (priority=6)
    //
    public void addEvolutionInFavouritesFromCategory() {

        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForSixthElementOfSix()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForSixthElementOfSix()) ;

        assertEquals(casinoPage.getNumberFavouritesText(),"6");

    }

    @Test (priority=7)
    //
    public void numberFavouritesAfterLogin() {

        casinoPage.login("olegautotest","Password1");
        casinoPage.clickIfElementIsClickable(casinoPage.getOkInSuccessfullMessage());
        assertEquals(casinoPage.getNumberFavouritesText(),"6");

    }

    @Test (priority=8)
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



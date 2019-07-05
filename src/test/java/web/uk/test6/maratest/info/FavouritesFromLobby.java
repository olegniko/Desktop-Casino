package web.uk.test6.maratest.info;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FavouritesFromLobby extends BaseTestForCasinoUnregistred {



    @Test(priority=1)
    //
    public void addTopInFavouritesFromLobby() throws InterruptedException {

        casinoPage.waitIfElementIsClickable(casinoPage.getSearchCasino());
        casinoPage.waitIfElementIsClickable(casinoPage.getOtherDropDownElement());


        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForTop()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForTop()) ;

        assertEquals(casinoPage.getNumberFavouritesText(),"1");

    }

    @Test (priority=2)
    //
    public void addNewInFavouritesFromLobby() throws InterruptedException {

        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForNew()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForNew()) ;

        assertEquals(casinoPage.getNumberFavouritesText(),"2");

    }

    @Test (priority=3)
    //
    public void addFeaturedInFavouritesFromLobby() throws InterruptedException {


        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForFeatured()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFeatured()) ;

        assertEquals(casinoPage.getNumberFavouritesText(),"3");

    }


    @Test (priority=4)
    //
    public void numberFavouritesAfterLogin() {

        casinoPage.login("olegautotest","Password1");
        casinoPage.clickIfElementIsClickable(casinoPage.getOkInSuccessfullMessage());
        assertEquals(casinoPage.getNumberFavouritesText(),"3");

    }

    @Test (priority=5)
    //
    public void eraseFavouritesAfterLogin() {

        casinoPage.clickIfElementIsClickable(casinoPage.getNumberFavourites());
        casinoPage.getFavouriteForThirdElementOfSix().click();
        casinoPage.getFavouriteForSecondElementOfSix().click();
        casinoPage.getFavouriteForFirstElementOfSix().click();

        assertEquals(casinoPage.getNumberFavouritesText(),"0");

    }

}


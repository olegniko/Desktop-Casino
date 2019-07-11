package web.uk.test6.maratest.info;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class Favourites extends BaseTestForCasino {



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

        casinoPage.clickIfElementIsClickable(casinoPage.getLogoutElement());
        casinoPage.waitIfElementIsClickable(casinoPage.getOtherDropDownElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getOtherDropDownElement());
        casinoPage.waitIfElementIsClickable(casinoPage.getAutotestCategory());
        casinoPage.clickIfElementIsClickable(casinoPage.getAutotestCategory());

    }

    @Test (priority=12)
    //
    public void addIssoftInFavouritesFromCategory() throws InterruptedException {

        casinoPage.waitIfElementIsClickable(casinoPage.getOtherDropDownElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getOtherDropDownElement());
        casinoPage.waitIfElementIsClickable(casinoPage.getAutotestCategory());
        casinoPage.clickIfElementIsClickable(casinoPage.getAutotestCategory());

        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix()) ;

        assertEquals(casinoPage.getNumberFavouritesText(),"1");

    }

    @Test (priority=13)
    //
    public void addYggdrasilInFavouritesFromCategory() throws InterruptedException {

        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForSecondElementOfSix()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForSecondElementOfSix()) ;

        assertEquals(casinoPage.getNumberFavouritesText(),"2");

    }

    @Test (priority=14)
    //
    public void addMgInFavouritesFromCategory() throws InterruptedException {


        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForThirdElementOfSix()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForThirdElementOfSix()) ;

        assertEquals(casinoPage.getNumberFavouritesText(),"3");

    }

    @Test (priority=15)
    //
    public void addPlayngoInFavouritesFromCategory() throws InterruptedException {


        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForForthElementOfSix()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForForthElementOfSix()) ;

        assertEquals(casinoPage.getNumberFavouritesText(),"4");

    }

    @Test (priority=16)
    //
    public void addRelaxInFavouritesFromCategory() throws InterruptedException {


        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForFifthElementOfSix()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFifthElementOfSix()) ;

        assertEquals(casinoPage.getNumberFavouritesText(),"5");

    }

    @Test (priority=17)
    //
    public void addEvolutionInFavouritesFromCategory() throws InterruptedException {

        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForSixthElementOfSix()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForSixthElementOfSix()) ;

        assertEquals(casinoPage.getNumberFavouritesText(),"6");

    }

    @Test (priority=18)
    //
    public void numberFavouritesAfterLogin2() {

        casinoPage.login("olegautotest","Password1");
        if (casinoPage.getOkInSuccessfullMessage()!=null){
            casinoPage.clickIfElementIsClickable(casinoPage.getOkInSuccessfullMessage());
        }
        assertEquals(casinoPage.getNumberFavouritesText(),"6");

    }

    @Test (priority=19)
    //
    public void eraseFavouritesAfterLogin2() {

        casinoPage.getFavouriteForSixthElementOfSix().click();
        casinoPage.getFavouriteForFifthElementOfSix().click();
        casinoPage.getFavouriteForForthElementOfSix().click();
        casinoPage.getFavouriteForThirdElementOfSix().click();
        casinoPage.getFavouriteForSecondElementOfSix().click();
        casinoPage.getFavouriteForFirstElementOfSix().click();

        assertEquals(casinoPage.getNumberFavouritesText(),"0");
        casinoPage.getLogoutElement().click();
    }


    @Test(priority=20)
    //
    public void addTopInFavouritesFromLobby() throws InterruptedException {


        casinoPage.getLobbyElement().click();
        casinoPage.clickIfElementIsClickable(casinoPage.getLobbyElement());

        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForTop()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForTop()) ;

        assertEquals(casinoPage.getNumberFavouritesText(),"1");

    }

    @Test (priority=21)
    //
    public void addNewInFavouritesFromLobby() throws InterruptedException {

        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForNew()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForNew()) ;

        assertEquals(casinoPage.getNumberFavouritesText(),"2");

    }

    @Test (priority=22)
    //
    public void addFeaturedInFavouritesFromLobby() throws InterruptedException {


        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForFeatured()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFeatured()) ;

        assertEquals(casinoPage.getNumberFavouritesText(),"3");

    }


    @Test (priority=23)
    //
    public void numberFavouritesAfterLogin1() {

        casinoPage.login("olegautotest","Password1");
        if (casinoPage.getOkInSuccessfullMessage()!=null){
            casinoPage.clickIfElementIsClickable(casinoPage.getOkInSuccessfullMessage());
        }
        assertEquals(casinoPage.getNumberFavouritesText(),"3");

    }

    @Test (priority=24)
    //
    public void eraseFavouritesAfterLogin1() {

        casinoPage.clickIfElementIsClickable(casinoPage.getNumberFavourites());
        casinoPage.getFavouriteForThirdElementOfSix().click();
        casinoPage.getFavouriteForSecondElementOfSix().click();
        casinoPage.getFavouriteForFirstElementOfSix().click();

        assertEquals(casinoPage.getNumberFavouritesText(),"0");



    }



}



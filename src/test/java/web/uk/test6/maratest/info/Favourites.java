package web.uk.test6.maratest.info;

import org.testng.annotations.AfterTest;
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
    public void addAndDeleteFromSearchForUnloggedFromFavourites() {

        addMgInFavouritesFromSearch("1");
        addEvolutionInFavouritesFromSearch("2");
        addIssoftInFavouritesFromSearch("3");
        addRelaxInFavouritesFromSearch("4");
        addYggdrasilInFavouritesFromSearch("5");
        addPlayngoInFavouritesFromSearch("6");
        eraseFavouritesFromFavourites("0");

    }

    @Test (priority=5)
    //
    public void addAndDeleteFromsearchForUnlogged()  {

        addMgInFavouritesFromSearch("1");
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix());
        addEvolutionInFavouritesFromSearch("1");
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix());
        addIssoftInFavouritesFromSearch("1");
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix());
        addRelaxInFavouritesFromSearch("1");
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix());
        addYggdrasilInFavouritesFromSearch("1");
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix());
        addPlayngoInFavouritesFromSearch("1");
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix());
        assertEquals(casinoPage.getNumberFavouritesText(),"0");
    }

    @Test (priority=6)
    //
    public void addAndDeleteFromCategoryForUnloggedFromFavourites() {

        openAutotestCategory();
        addMgInFavouritesFromCategory("1");
        addEvolutionInFavouritesFromCategory("2");
        addIssoftInFavouritesFromCategory("3");
        addRelaxInFavouritesFromCategory("4");
        addYggdrasilInFavouritesFromCategory("5");
        addPlayngoInFavouritesFromCategory("6");
        eraseFavouritesFromFavourites("0");

    }

   @Test (priority=7)
    //
    public void addAndDeleteFromCategoryForUnlogged()  {
        openAutotestCategory();
        addMgInFavouritesFromCategory("1");
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForThirdElementOfSix()) ;
        addEvolutionInFavouritesFromCategory("1");
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForSixthElementOfSix()) ;
        addIssoftInFavouritesFromCategory("1");
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix()) ;
        addRelaxInFavouritesFromCategory("1");
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFifthElementOfSix()) ;
        addYggdrasilInFavouritesFromCategory("1");
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForSecondElementOfSix()) ;
        addPlayngoInFavouritesFromCategory("1");
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForForthElementOfSix()) ;
        assertEquals(casinoPage.getNumberFavouritesText(),"0");
    }

    @Test (priority=8)
    //
    public void addAndDeleteFromLobbyForUnloggedFromFavourites() {

        openLobby();
        addTopInFavouritesFromLobby("1");
        addNewInFavouritesFromLobby("2");
        addFeaturedInFavouritesFromLobby("3");
        casinoPage.clickIfElementIsClickable(casinoPage.getNumberFavourites());
        casinoPage.getFavouriteForThirdElementOfSix().click();
        casinoPage.getFavouriteForSecondElementOfSix().click();
        casinoPage.getFavouriteForFirstElementOfSix().click();

    }

    @Test (priority=9)
    //
    public void addAndDeleteFromLobbyForUnlogged()  {

        openLobby();
        addTopInFavouritesFromLobby("1");
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForTop()) ;
        addNewInFavouritesFromLobby("1");
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForNew()) ;
        addFeaturedInFavouritesFromLobby("1");
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFeatured()) ;
        assertEquals(casinoPage.getNumberFavouritesText(),"0");
    }



    @Test (priority=10)
    //
    public void addFavouritesFromSearch() {

        addMgInFavouritesFromSearch("1");
        addEvolutionInFavouritesFromSearch("2");

        addIssoftInFavouritesFromSearch("3");
        addRelaxInFavouritesFromSearch("4");

        addYggdrasilInFavouritesFromSearch("5");
        addPlayngoInFavouritesFromSearch("6");
        numberFavouritesAfterLogin("6");

        eraseFavouritesFromFavourites("0");
        casinoPage.clickIfElementIsClickable(casinoPage.getLogoutElement());
    }




    @Test (priority=11)
    //
    public void addFromCategoryTest()  {


        openAutotestCategory();
        addIssoftInFavouritesFromCategory("1");
        addYggdrasilInFavouritesFromCategory("2");

        addMgInFavouritesFromCategory("3");
        addPlayngoInFavouritesFromCategory("4");

        addRelaxInFavouritesFromCategory("5");
        addEvolutionInFavouritesFromCategory("6");

        numberFavouritesAfterLogin("6");
        eraseFavouritesFromFavourites("0");
        casinoPage.clickIfElementIsClickable(casinoPage.getLogoutElement());
    }




    @Test(priority=12)
    //
    public void addInFavouritesFromLobbyTest() {

        openLobby();
        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForTop());
        addTopInFavouritesFromLobby("1");
        addNewInFavouritesFromLobby("2");
        addFeaturedInFavouritesFromLobby("3");
        numberFavouritesAfterLogin("3");

    }

    @Test (priority=13)
    //
    public void AllFunctionalityTest() {

        addIssoftInFavouritesFromSearch("1");
        addTopInFavouritesFromLobby("2");
        openAutotestCategory();
        addMgInFavouritesFromCategory("3");
        numberFavouritesAfterLogin("3");
        casinoPage.clickIfElementIsClickable(casinoPage.getLogoutElement());

        addMgInFavouritesFromCategory("1");
        addPlayngoInFavouritesFromCategory("2");
        addIssoftInFavouritesFromSearch("3");
        addYggdrasilInFavouritesFromSearch("4");

        openLobby();
        addFeaturedInFavouritesFromLobby("5");
        addTopInFavouritesFromLobby("6");

        openAutotestCategory();


        numberFavouritesAfterLogin("6");
        eraseFavouritesFromFavourites("0");

    }




}



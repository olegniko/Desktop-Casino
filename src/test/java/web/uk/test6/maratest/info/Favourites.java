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

    public void addMgInFavouritesFromSearch()  {

        addMgInFavouritesFromSearch("1");
    }

    @Test (priority=11)

    public void addEvolutionInFavouritesFromSearch()  {

        addEvolutionInFavouritesFromSearch("2");
    }

    @Test (priority=12)

    public void addIssoftInFavouritesFromSearch()  {

        addIssoftInFavouritesFromSearch("3");
    }

    @Test (priority=13)

    public void addRelaxInFavouritesFromSearch()  {

        addRelaxInFavouritesFromSearch("4");
    }

    @Test (priority=14)

    public void addYggdrasilInFavouritesFromSearch()  {

        addYggdrasilInFavouritesFromSearch("5");
    }

    @Test (priority=15)

    public void addPlayngoInFavouritesFromSearch()  {

        addPlayngoInFavouritesFromSearch("6");
    }


    @Test (priority=16)
    //
    public void numberFavouritesAfterLoginTest()  {

        numberFavouritesAfterLogin("6");
    }



    @Test (priority=17)
    //
    public void eraseFavouritesFromFavouritesTest() {

        eraseFavouritesFromFavourites("0");
        openAutotestCategory();
        casinoPage.clickIfElementIsClickable(casinoPage.getLogoutElement());
    }





    @Test (priority=18)
    //
    public void addIssoftInFavouritesFromCategoryTest() {

        assertEquals(casinoPage.getNumberFavouritesText(),"0");
        openAutotestCategory();
        addIssoftInFavouritesFromCategory("1");

    }

    @Test (priority=19)
    //
    public void addYggdrasilInFavouritesFromCategoryTest()  {

        addYggdrasilInFavouritesFromCategory("2");

    }

    @Test (priority=20)
    //
    public void addMgInFavouritesFromCategoryTest()  {

        addMgInFavouritesFromCategory("3");

    }

    @Test (priority=21)
    //
    public void addPlayngoInFavouritesFromCategoryTest() {

        addPlayngoInFavouritesFromCategory("4");

    }

    @Test (priority=22)
    //
    public void addRelaxInFavouritesFromCategoryTest()  {

        addRelaxInFavouritesFromCategory("5");

    }

    @Test (priority=23)
    //
    public void addEvolutionInFavouritesFromCategoryTest()  {

        addEvolutionInFavouritesFromCategory("6");

    }

    @Test (priority=24)
    //
    public void numberFavouritesAfterLoginTest1()  {

        numberFavouritesAfterLogin("6");
    }

    @Test (priority=25)
    //
    public void eraseFavouritesFromFavouritesTest2() {

        eraseFavouritesFromFavourites("0");
        casinoPage.clickIfElementIsClickable(casinoPage.getLogoutElement());
    }





    @Test(priority=26)
    //
    public void addTopInFavouritesFromLobbyTest() {

        openLobby();
        addTopInFavouritesFromLobby("1");

    }

    @Test (priority=27)
    //
    public void addNewInFavouritesFromLobbyTest()  {

        addNewInFavouritesFromLobby("2");

    }

    @Test (priority=28)
    //
    public void addFeaturedInFavouritesFromLobbyTest()  {

        addFeaturedInFavouritesFromLobby("3");

    }


    @Test (priority=29)
    //
    public void numberFavouritesAfterLogin2() {

        numberFavouritesAfterLogin("3");


    }

    @Test (priority=30)
    //
    public void eraseFavouritesAfterLogin2() {

        casinoPage.clickIfElementIsClickable(casinoPage.getNumberFavourites());
        casinoPage.getFavouriteForThirdElementOfSix().click();
        casinoPage.getFavouriteForSecondElementOfSix().click();
        casinoPage.getFavouriteForFirstElementOfSix().click();
        assertEquals(casinoPage.getNumberFavouritesText(),"0");
        casinoPage.clickIfElementIsClickable(casinoPage.getLogoutElement());
    }



}



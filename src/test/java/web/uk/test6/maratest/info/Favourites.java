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
    public void addMgInFavourites() {


        casinoPage.enterSymbolsToSearch("olegMGautotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForIssoftSearchPage());

        assertEquals(casinoPage.getNumberFavourites().getText(),"1");

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=5)
    //
    public void addEvolutionInFavourites() {


        casinoPage.enterSymbolsToSearch("olegEvolutionAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForIssoftSearchPage());

        assertEquals(casinoPage.getNumberFavourites().getText(),"2");

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=6)
    //
    public void addIssoftInFavourites() {


        casinoPage.enterSymbolsToSearch("olegIssoftAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForIssoftSearchPage());

        assertEquals(casinoPage.getNumberFavourites().getText(),"3");

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=7)
    //
    public void addRelaxInFavourites() {


        casinoPage.enterSymbolsToSearch("olegRelaxAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForIssoftSearchPage());

        assertEquals(casinoPage.getNumberFavourites().getText(),"4");

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=8)
    //
    public void addYggdrasilInFavourites() {


        casinoPage.enterSymbolsToSearch("olegYggdrasilAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForIssoftSearchPage());

        assertEquals(casinoPage.getNumberFavourites().getText(),"5");

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=9)
    //
    public void addPlayngoInFavourites() {


        casinoPage.enterSymbolsToSearch("olegPlayngoAutotest");
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForIssoftSearchPage());
        assertEquals(casinoPage.getNumberFavourites().getText(),"6");
        casinoPage.clearSearchInCasino();

    }

    @Test (priority=10)
    //
    public void numberFavouritesAfterLogin() {

        casinoPage.login("olegeng60","Password2");
        casinoPage.clickIfElementIsClickable(casinoPage.getOkInSuccessfullMessage());
        assertEquals(casinoPage.getNumberFavourites().getText(),"6");

    }

    @Test (priority=11)
    //
    public void eraseFavouritesAfterLogin() {

        casinoPage.clickIfElementIsClickable(casinoPage.getNumberFavourites());

        for (int i =1;i<7;i++){
            casinoPage.getFavouriteForIssoft().click();
        }

        assertEquals(casinoPage.getNumberFavourites().getText(),"0");

    }

    @Test (priority=12)
    //
    public void addFavouritesforRegistredUserFromSearch() {

        addMgInFavourites();
        addEvolutionInFavourites();
        addIssoftInFavourites();
        addRelaxInFavourites();
        addYggdrasilInFavourites();
        addPlayngoInFavourites();
        eraseFavouritesAfterLogin();

    }

    @Test (priority=13)
    //
    public void addFavouritesforRegistredUserFromCategory() {

        casinoPage.clickIfElementIsClickable(casinoPage.getOtherDropDown());
        casinoPage.clickIfElementIsClickable(casinoPage.getAutotestCategory());



    }





}



package web.uk.test6.maratest.info;

import org.testng.annotations.*;
import pages.CasinoPage;
import java.net.MalformedURLException;
import java.util.Locale;
import java.util.ResourceBundle;

import static org.testng.Assert.assertEquals;


public class BaseTestForCasino {

    Locale locale;
    ResourceBundle exampleBundle;
    CasinoPage casinoPage;



    @BeforeClass
    @Parameters({"language","browser"})
    public  void setUp(String language,String browser) throws MalformedURLException, InterruptedException {

        locale = new Locale(language);
        exampleBundle = ResourceBundle.getBundle("ResourceBundle",locale);
        casinoPage = new CasinoPage(browser);
        casinoPage.open(locale);
        casinoPage.waitIfElementIsClickable(casinoPage.getOtherDropDownElement());

    }


    @AfterClass
    public void tearDown()  {
        casinoPage.close();
    }


    public void addMgInFavouritesFromSearch(String number)  {


        casinoPage.enterSymbolsToSearch("olegMGautotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix());

        assertEquals(casinoPage.getNumberFavouritesText(),number);

        casinoPage.waitIfElementIsClickable(casinoPage.getCrossInSearch());

        casinoPage.clearSearchInCasinoByCross();

    }


    public void addEvolutionInFavouritesFromSearch(String number) {


        casinoPage.enterSymbolsToSearch("olegEvolutionAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix());

        assertEquals(casinoPage.getNumberFavouritesText(),number);

        casinoPage.clearSearchInCasino();

    }


    public void addIssoftInFavouritesFromSearch(String number) {

        casinoPage.waitIfElementIsClickable(casinoPage.getSearchCasino());
        casinoPage.enterSymbolsToSearch("olegIssoftAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix());

        assertEquals(casinoPage.getNumberFavouritesText(),number);

        casinoPage.clearSearchInCasino();

    }


    public void addRelaxInFavouritesFromSearch(String number) {


        casinoPage.enterSymbolsToSearch("olegRelaxAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix());

        assertEquals(casinoPage.getNumberFavouritesText(),number);

        casinoPage.clearSearchInCasino();

    }


    public void addYggdrasilInFavouritesFromSearch(String number) {


        casinoPage.enterSymbolsToSearch("olegYggdrasilAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix());

        assertEquals(casinoPage.getNumberFavouritesText(),number);

        casinoPage.clearSearchInCasino();

    }


    public void addPlayngoInFavouritesFromSearch(String number) {


        casinoPage.enterSymbolsToSearch("olegPlayngoAutotest");
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix());
        assertEquals(casinoPage.getNumberFavouritesText(),number);
        casinoPage.clearSearchInCasino();

    }

    public void numberFavouritesAfterLogin(String number) {

        casinoPage.login("olegautotest","Password1");
        casinoPage.clickIfElementIsClickable(casinoPage.getOkInSuccessfullMessage());
        assertEquals(casinoPage.getNumberFavouritesText(),number);

    }

    public void eraseFavouritesFromFavourites(String number) {

        casinoPage.clickIfElementIsClickable(casinoPage.getNumberFavourites());

        casinoPage.getFavouriteForSixthElementOfSix().click();
        casinoPage.getFavouriteForFifthElementOfSix().click();
        casinoPage.getFavouriteForForthElementOfSix().click();
        casinoPage.getFavouriteForThirdElementOfSix().click();
        casinoPage.getFavouriteForSecondElementOfSix().click();
        casinoPage.getFavouriteForFirstElementOfSix().click();

        assertEquals(casinoPage.getNumberFavouritesText(),number);

    }

    public void openAutotestCategory(){

        casinoPage.waitIfElementIsClickable(casinoPage.getSearchCasino());

        casinoPage.waitIfElementIsClickable(casinoPage.getOtherDropDownElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getOtherDropDownElement());
        casinoPage.waitIfElementIsClickable(casinoPage.getAutotestCategory());
        casinoPage.clickIfElementIsClickable(casinoPage.getAutotestCategory());
    }

    public void openLobby(){

        casinoPage.clickIfElementIsClickable(casinoPage.getLobbyElement());
    }


    public void addIssoftInFavouritesFromCategory(String number) {

        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFirstElementOfSix()) ;

        assertEquals(casinoPage.getNumberFavouritesText(),number);

    }


    public void addYggdrasilInFavouritesFromCategory(String number)  {

        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForSecondElementOfSix()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForSecondElementOfSix()) ;
        assertEquals(casinoPage.getNumberFavouritesText(),number);

    }


    public void addMgInFavouritesFromCategory(String number)  {

        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForThirdElementOfSix()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForThirdElementOfSix()) ;
        assertEquals(casinoPage.getNumberFavouritesText(),number);

    }


    public void addPlayngoInFavouritesFromCategory(String number) {

        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForForthElementOfSix()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForForthElementOfSix()) ;
        assertEquals(casinoPage.getNumberFavouritesText(),number);

    }


    public void addRelaxInFavouritesFromCategory(String number)  {

        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForFifthElementOfSix()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFifthElementOfSix()) ;
        assertEquals(casinoPage.getNumberFavouritesText(),number);

    }


    public void addEvolutionInFavouritesFromCategory(String number)  {

        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForSixthElementOfSix()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForSixthElementOfSix()) ;
        assertEquals(casinoPage.getNumberFavouritesText(),number);

    }


    public void addTopInFavouritesFromLobby(String number) {

        casinoPage.waitIfElementIsClickable(casinoPage.getSearchCasino());
        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForTop()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForTop()) ;
        assertEquals(casinoPage.getNumberFavouritesText(),number);

    }



    public void addNewInFavouritesFromLobby(String number)  {

        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForNew()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForNew()) ;
        assertEquals(casinoPage.getNumberFavouritesText(),number);

    }


    public void addFeaturedInFavouritesFromLobby(String number)  {


        casinoPage.waitIfElementIsClickable(casinoPage.getFavouriteForFeatured()) ;
        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForFeatured()) ;
        assertEquals(casinoPage.getNumberFavouritesText(),number);

    }
}

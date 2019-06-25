package web.uk.test6.maratest.info;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.CasinoPage;

import java.net.MalformedURLException;
import java.util.Locale;
import java.util.ResourceBundle;

import static org.testng.Assert.assertEquals;


public class AddFavouritesUnregistred  {

    Locale locale;
    ResourceBundle exampleBundle;
    CasinoPage casinoPage;



    @BeforeSuite
    @Parameters({"language","browser"})
    public  void setUp(String language,String browser) throws MalformedURLException {

        locale = new Locale(language);
        exampleBundle = ResourceBundle.getBundle("ResourceBundle",locale);
        casinoPage = new CasinoPage(browser);
        casinoPage.open(locale);
        casinoPage.waitIfElementIsClickable(casinoPage.getSearch_Casino());

    }

    @AfterSuite
    public void tearDown()  {
        casinoPage.close();
    }




    @Test (priority=3)
    //
    public void add_MG_in_favourites() {


        casinoPage.enter_symbols_to_Search("olegMGautotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForIssoft());

        assertEquals(casinoPage.getNumberFavourites().getText(),"1");

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=4)
    //
    public void add_Evolution_in_favourites() {


        casinoPage.enter_symbols_to_Search("olegEvolutionAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForIssoft());

        assertEquals(casinoPage.getNumberFavourites().getText(),"2");

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=5)
    //
    public void add_Issoft_in_favourites() {


        casinoPage.enter_symbols_to_Search("olegIssoftAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForIssoft());

        assertEquals(casinoPage.getNumberFavourites().getText(),"3");

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=6)
    //
    public void add_Relax_in_favourites() {


        casinoPage.enter_symbols_to_Search("olegRelaxAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForIssoft());

        assertEquals(casinoPage.getNumberFavourites().getText(),"4");

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=7)
    //
    public void add_Yggdrasil_in_favourites() {


        casinoPage.enter_symbols_to_Search("olegYggdrasilAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForIssoft());

        assertEquals(casinoPage.getNumberFavourites().getText(),"5");

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=8)
    //
    public void add_Playngo_in_favourites() {


        casinoPage.enter_symbols_to_Search("olegPlayngoAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getFavouriteForIssoft());

        assertEquals(casinoPage.getNumberFavourites().getText(),"6");

        casinoPage.clearSearchInCasino();

    }





}
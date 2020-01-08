package web.uk.test6.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class Favourites  {

    CasinoPage casinoPage;

    @BeforeClass

    public  void setUp() {


        casinoPage = new CasinoPage();


    }


    @AfterClass
    public void tearDown()  {
        casinoPage.close();
    }


    @Test
    //
    public void favouritesIsPresent() {

        assertTrue(casinoPage.getFavourites().isDisplayed());

    }

    @Test
    //
    public void favouritesNumberIsPresent() {

        assertTrue(casinoPage.getNumberFavourites().isDisplayed());

    }

    @Test
    // 0 for unregestred user1
    public void favouritesNumberIs0() {

        assertEquals(casinoPage.getNumberFavouritesText(),"0");

    }



}



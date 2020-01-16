package web.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class Search {


    CasinoPage casinoPage;

    @BeforeClass

    public void setUp() throws Exception {


        casinoPage = new CasinoPage();


    }


    @AfterClass (alwaysRun = true)
    public void tearDown() {
        casinoPage.close();
    }


    @Test
    //
    public void searchFieldEnabledTest() {

        assertTrue(casinoPage.getSearchFieldElement().isDisplayed());
        assertTrue(casinoPage.getSearchFieldElement().isEnabled());
        assertEquals(casinoPage.getTextSearchFieldElement(), exampleBundle.getString("search_field_header"));
    }



}
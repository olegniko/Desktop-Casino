package web.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static org.testng.Assert.*;


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

    @Test
    //
    public void crossEnabledTest() {

        casinoPage.search("e");
        assertTrue(casinoPage.getCrossIconSearchFieldElement().isDisplayed());
        assertTrue(casinoPage.getCrossIconSearchFieldElement().isEnabled());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test
    //
    public void crossPressTest() {

        casinoPage.search("e");
        casinoPage.clickIfElementIsClickable(casinoPage.getCrossIconSearchFieldElement());
        assertEquals(casinoPage.getTextSearchFieldElement(), exampleBundle.getString("search_field_header"));
    }

    @Test
    public void oneSymbolsHeaderMessageTest() {

        casinoPage.search("e");
        assertEquals(casinoPage.getTextSearchResultHeaderElement(), exampleBundle.getString("request_too_short_header"));
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test
    public void oneSymbolsBodyMessageTest() {

        casinoPage.search("e");
        assertEquals(casinoPage.getTextSearchResultBodyElement(), exampleBundle.getString("request_too_short_body"));
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test
    public void twoSymbolsHeaderMessageTest() {

        casinoPage.search("e3");
        assertEquals(casinoPage.getTextSearchResultHeaderElement(), exampleBundle.getString("request_too_short_header"));
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test
    public void twoSymbolsBodyMessageTest() {

        casinoPage.search("e3");
        assertEquals(casinoPage.getTextSearchResultBodyElement(), exampleBundle.getString("request_too_short_body"));
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test
    public void noResultsSearchHeaderMessageTest() {

        casinoPage.search("e32");
        assertEquals(casinoPage.getTextSearchResultHeaderElement(), exampleBundle.getString("no_results_header"));
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test
    public void noResultsSearchBodyMessageTest() {

        casinoPage.search("e35");
        assertEquals(casinoPage.getTextSearchResultBodyElement(), exampleBundle.getString("no_results_body"));
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }





}
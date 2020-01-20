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
    public void searchIconEnabledTest() {

        assertTrue(casinoPage.getSearchIconSearchFieldElement().isDisplayed());
        assertTrue(casinoPage.getSearchIconSearchFieldElement().isEnabled());

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
        assertTrue(casinoPage.getSearchResultHeaderElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultHeaderElement(), exampleBundle.getString("request_too_short_header"));
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test
    public void oneSymbolsBodyMessageTest() {

        casinoPage.search("e");
        assertTrue(casinoPage.getSearchResultBodyElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultBodyElement(), exampleBundle.getString("request_too_short_body"));
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test
    public void twoSymbolsHeaderMessageTest() {

        casinoPage.search("e3");
        assertTrue(casinoPage.getSearchResultHeaderElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultHeaderElement(), exampleBundle.getString("request_too_short_header"));
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test
    public void twoSymbolsBodyMessageTest() {

        casinoPage.search("e3");
        assertTrue(casinoPage.getSearchResultBodyElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultBodyElement(), exampleBundle.getString("request_too_short_body"));
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test
    public void noResultsSearchHeaderMessageTest() {

        casinoPage.search("e32");
        assertTrue(casinoPage.getSearchResultHeaderElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultHeaderElement(), exampleBundle.getString("no_results_header"));
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test
    public void noResultsSearchBodyMessageTest() {

        casinoPage.search("e35");
        assertTrue(casinoPage.getSearchResultBodyElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultBodyElement(), exampleBundle.getString("no_results_body"));
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test
    public void mgSearchBodyMessageTest() {

        casinoPage.search(exampleBundle.getString("mg_game"));
        assertTrue(casinoPage.getMgTitleElement().isDisplayed());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test
    public void relaxSearchBodyMessageTest() {

        casinoPage.search(exampleBundle.getString("relax_game"));
        assertTrue(casinoPage.getRelaxTitleElement().isDisplayed());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }
    @Test
    public void playngoSearchBodyMessageTest() {

        casinoPage.search(exampleBundle.getString("playngo_game"));
        assertTrue(casinoPage.getPlayngoTitleElement().isDisplayed());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test
    public void issoftSearchBodyMessageTest() {

        casinoPage.search(exampleBundle.getString("issoft_game"));
        assertTrue(casinoPage.getIssoftTitleElement().isDisplayed());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }
    @Test
    public void evolutionSearchBodyMessageTest() {

        casinoPage.search(exampleBundle.getString("evolution_game"));
        assertTrue(casinoPage.getEvolutionTitleElement().isDisplayed());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test
    public void yggdrasilSearchBodyMessageTest() {

        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        assertTrue(casinoPage.getYggdrasilTitleElement().isDisplayed());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }





}
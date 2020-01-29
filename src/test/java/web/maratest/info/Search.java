package web.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class Search  {

    CasinoPage casinoPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        casinoPage = new CasinoPage();
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        casinoPage.close();
    }


    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void searchFieldEnabledTest() {
        assertTrue(casinoPage.getSearchFieldElement().isDisplayed());
        assertTrue(casinoPage.getSearchFieldElement().isEnabled());
        assertEquals(casinoPage.getTextSearchFieldElement(), exampleBundle.getString("search_field_header"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void searchIconEnabledTest() {
        assertTrue(casinoPage.getSearchIconSearchFieldElement().isDisplayed());
        assertTrue(casinoPage.getSearchIconSearchFieldElement().isEnabled());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void crossEnabledTest() {
        casinoPage.search("e");
        assertTrue(casinoPage.getCrossIconSearchFieldElement().isDisplayed());
        assertTrue(casinoPage.getCrossIconSearchFieldElement().isEnabled());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void crossPressTest() {
        casinoPage.search("e");
        casinoPage.clickIfElementIsClickable(casinoPage.getCrossIconSearchFieldElement());
        assertEquals(casinoPage.getTextSearchFieldElement(), exampleBundle.getString("search_field_header"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void oneSymbolsHeaderMessageTest() {
        casinoPage.search("e");
        assertTrue(casinoPage.getSearchResultHeaderElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultHeaderElement(), exampleBundle.getString("request_too_short_header"));
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void oneSymbolsBodyMessageTest() {
        casinoPage.search("e");
        assertTrue(casinoPage.getSearchResultBodyElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultBodyElement(), exampleBundle.getString("request_too_short_body"));
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void twoSymbolsHeaderMessageTest() {
        casinoPage.search("e3");
        assertTrue(casinoPage.getSearchResultHeaderElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultHeaderElement(), exampleBundle.getString("request_too_short_header"));
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void twoSymbolsBodyMessageTest() {
        casinoPage.search("e3");
        assertTrue(casinoPage.getSearchResultBodyElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultBodyElement(), exampleBundle.getString("request_too_short_body"));
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void noResultsSearchHeaderMessageTest() {
        casinoPage.search("e32");
        assertTrue(casinoPage.getSearchResultHeaderElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultHeaderElement(), exampleBundle.getString("no_results_header"));
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void noResultsSearchBodyMessageTest() {
        casinoPage.search("e35");
        assertTrue(casinoPage.getSearchResultBodyElement().isDisplayed());
        assertEquals(casinoPage.getTextSearchResultBodyElement(), exampleBundle.getString("no_results_body"));
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void mgSearchBodyMessageTest() {
        casinoPage.search(exampleBundle.getString("mg_game"));
        assertTrue(casinoPage.getMgGameElement().isDisplayed());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test(groups = {"ALD2"})
    public void relaxSearchBodyMessageTest() {
        casinoPage.search(exampleBundle.getString("relax_game"));
        assertTrue(casinoPage.getRelaxGameElement().isDisplayed());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test(groups = {"ALD2"})
    public void playngoSearchBodyMessageTest() {
        casinoPage.search(exampleBundle.getString("playngo_game"));
        assertTrue(casinoPage.getPlayngoGameElement().isDisplayed());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test(groups = {"ALD2"})
    public void issoftSearchBodyMessageTest() {
        casinoPage.search(exampleBundle.getString("issoft_game"));
        assertTrue(casinoPage.getIssoftGameElement().isDisplayed());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test(groups = {"ES1", "CUR2", "ALD2"})
    public void evolutionSearchBodyMessageTest() {
        casinoPage.search(exampleBundle.getString("evolution_game"));
        assertTrue(casinoPage.getEvolutionGameElement().isDisplayed());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test(groups = {"ALD2"})
    public void yggdrasilSearchBodyMessageTest() {
        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        assertTrue(casinoPage.getYggdrasilGameElement().isDisplayed());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test(groups = {"CUR2"})
    public void iforiumSearchBodyMessageTest() {
        casinoPage.search(exampleBundle.getString("iforium_game"));
        assertTrue(casinoPage.getIforiumGameElement().isDisplayed());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }
}
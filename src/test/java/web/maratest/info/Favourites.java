package web.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static org.testng.Assert.assertEquals;


public class Favourites {

    CasinoPage casinoPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        casinoPage = new CasinoPage();
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        casinoPage.close();
    }


    @Test(priority = 1,groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void numberOfFavoritesTest() {
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
    }


    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void mgAddRemoveFavoritesTest() {
        casinoPage.search(exampleBundle.getString("mg_game"));
        casinoPage.addToFavourites(casinoPage.getMgGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("mg_game"));
        casinoPage.removeFromFavourites(casinoPage.getMgGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test(groups = { "ALD2"})
    public void relaxAddRemoveFavoritesTest() {
        casinoPage.search(exampleBundle.getString("relax_game"));
        casinoPage.addToFavourites(casinoPage.getRelaxGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("relax_game"));
        casinoPage.removeFromFavourites(casinoPage.getRelaxGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test(groups = { "ALD2"})
    public void playngoAddRemoveFavoritesTest() {
        casinoPage.search(exampleBundle.getString("playngo_game"));
        casinoPage.addToFavourites(casinoPage.getPlayngoGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("playngo_game"));
        casinoPage.removeFromFavourites(casinoPage.getPlayngoGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test(groups = { "ALD2"})
    public void issoftAddRemoveFavoritesTest() {
        casinoPage.search(exampleBundle.getString("issoft_game"));
        casinoPage.addToFavourites(casinoPage.getIssoftGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("issoft_game"));
        casinoPage.removeFromFavourites(casinoPage.getIssoftGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test(groups = { "ES1", "CUR2", "ALD2"})
    public void evolutionAddRemoveFavoritesTest() {
        casinoPage.search(exampleBundle.getString("evolution_game"));
        casinoPage.addToFavourites(casinoPage.getEvolutionGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("evolution_game"));
        casinoPage.removeFromFavourites(casinoPage.getEvolutionGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test(groups = {"ALD2"})
    public void yggdrasilAddRemoveFavoritesTest() {
        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.addToFavourites(casinoPage.getYggdrasilGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.removeFromFavourites(casinoPage.getYggdrasilGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test(groups = {"CUR2"})
    public void iforiumAddRemoveFavoritesTest() {
        casinoPage.search(exampleBundle.getString("iforium_game"));
        casinoPage.addToFavourites(casinoPage.getIforiumGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("iforium_game"));
        casinoPage.removeFromFavourites(casinoPage.getIforiumGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }
}



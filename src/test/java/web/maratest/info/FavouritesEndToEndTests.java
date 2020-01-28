package web.maratest.info;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static helper.factory.Browser.exampleBundleServer;
import static org.testng.Assert.assertEquals;


public class FavouritesEndToEndTests {

    CasinoPage casinoPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        casinoPage = new CasinoPage();
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        casinoPage.close();
    }


    @Test(priority = 1,groups = {"ALD2"})
    public void addALD2FavoritesTest() {
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.search(exampleBundle.getString("issoft_game"));
        casinoPage.addToFavourites(casinoPage.getIssoftGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("evolution_game"));
        casinoPage.addToFavourites(casinoPage.getEvolutionGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("playngo_game"));
        casinoPage.addToFavourites(casinoPage.getPlayngoGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("relax_game"));
        casinoPage.addToFavourites(casinoPage.getRelaxGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("mg_game"));
        casinoPage.addToFavourites(casinoPage.getMgGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.addToFavourites(casinoPage.getYggdrasilGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "6");
        casinoPage.correctLogin(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "6");
    }

    @Test(priority = 1,groups = {"CUR2"})
    public void addCUR2FavoritesTest() {
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.search(exampleBundle.getString("evolution_game"));
        casinoPage.addToFavourites(casinoPage.getEvolutionGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("mg_game"));
        casinoPage.addToFavourites(casinoPage.getMgGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("iforium_game"));
        casinoPage.addToFavourites(casinoPage.getIforiumGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "3");
        casinoPage.correctLogin(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "3");
    }

    @Test(priority = 2,groups = {"ALD2"})
    public void removeSavedALD2FavoritesTest() {
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.correctLogin(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "6");
        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.removeFromFavourites(casinoPage.getYggdrasilGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("evolution_game"));
        casinoPage.removeFromFavourites(casinoPage.getEvolutionGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("issoft_game"));
        casinoPage.removeFromFavourites(casinoPage.getIssoftGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("playngo_game"));
        casinoPage.removeFromFavourites(casinoPage.getPlayngoGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("relax_game"));
        casinoPage.removeFromFavourites(casinoPage.getRelaxGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("mg_game"));
        casinoPage.removeFromFavourites(casinoPage.getMgGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
    }

    @Test(priority = 2,groups = {"CUR2"})
    public void removeSavedCUR2FavoritesTest() {
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.correctLogin(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "3");
        casinoPage.search(exampleBundle.getString("evolution_game"));
        casinoPage.removeFromFavourites(casinoPage.getEvolutionGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("mg_game"));
        casinoPage.removeFromFavourites(casinoPage.getMgGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("iforium_game"));
        casinoPage.removeFromFavourites(casinoPage.getIforiumGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
    }

    @Test(priority = 3,groups = {"ALD2","CUR2","DK1","ES1"})
    public void addTwiceMGFavoritesTest() {
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.search(exampleBundle.getString("mg_game"));
        casinoPage.addToFavourites(casinoPage.getMgGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.correctLogin(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.logout();
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.search(exampleBundle.getString("mg_game"));
        casinoPage.addToFavourites(casinoPage.getMgGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.correctLogin(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.removeFromFavourites(casinoPage.getMgGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
    }

    @Test(priority = 4,groups = {"ALD2","CUR2","ES1"})
    public void addTwiceEvolutionFavoritesTest() {
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.search(exampleBundle.getString("evolution_game"));
        casinoPage.addToFavourites(casinoPage.getEvolutionGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.correctLogin(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.logout();
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.search(exampleBundle.getString("evolution_game"));
        casinoPage.addToFavourites(casinoPage.getEvolutionGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.correctLogin(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.removeFromFavourites(casinoPage.getEvolutionGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
    }

    @Test(priority = 5,groups = {"CUR2"})
    public void addTwiceIforiumFavoritesTest() {
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.search(exampleBundle.getString("iforium_game"));
        casinoPage.addToFavourites(casinoPage.getIforiumGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.correctLogin(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.logout();
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.search(exampleBundle.getString("iforium_game"));
        casinoPage.addToFavourites(casinoPage.getIforiumGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.correctLogin(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.removeFromFavourites(casinoPage.getIforiumGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
    }

    @Test(priority = 6,groups = {"ALD2"})
    public void addTwiceRelaxFavoritesTest() {
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.search(exampleBundle.getString("relax_game"));
        casinoPage.addToFavourites(casinoPage.getRelaxGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.correctLogin(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.logout();
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.search(exampleBundle.getString("relax_game"));
        casinoPage.addToFavourites(casinoPage.getRelaxGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.correctLogin(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.removeFromFavourites(casinoPage.getRelaxGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
    }

    @Test(priority = 7,groups = {"ALD2"})
    public void addTwicePlayngoFavoritesTest() {
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.search(exampleBundle.getString("playngo_game"));
        casinoPage.addToFavourites(casinoPage.getPlayngoGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.correctLogin(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.logout();
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.search(exampleBundle.getString("playngo_game"));
        casinoPage.addToFavourites(casinoPage.getPlayngoGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.correctLogin(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.removeFromFavourites(casinoPage.getPlayngoGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
    }

    @Test(priority = 8,groups = {"ALD2"})
    public void addTwiceYggdrasilFavoritesTest() {
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.addToFavourites(casinoPage.getYggdrasilGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.correctLogin(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.logout();
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.addToFavourites(casinoPage.getYggdrasilGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.correctLogin(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.removeFromFavourites(casinoPage.getYggdrasilGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
    }

    @Test(priority = 9,groups = {"ALD2"})
    public void addTwiceIssoftFavoritesTest() {
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.search(exampleBundle.getString("issoft_game"));
        casinoPage.addToFavourites(casinoPage.getIssoftGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.correctLogin(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.logout();
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.search(exampleBundle.getString("issoft_game"));
        casinoPage.addToFavourites(casinoPage.getIssoftGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.correctLogin(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "1");
        casinoPage.removeFromFavourites(casinoPage.getIssoftGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
    }
}



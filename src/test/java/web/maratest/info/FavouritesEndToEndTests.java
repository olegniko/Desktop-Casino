package web.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static helper.factory.Browser.exampleBundleServer;
import static org.testng.Assert.assertEquals;


public class FavouritesEndToEndTests {

    CasinoPage casinoPage;

    @BeforeClass

    public void setUp() throws Exception {


        casinoPage = new CasinoPage();

    }



    @AfterClass
    public void tearDown() {
        casinoPage.close();
    }



    @Test
    public void unloggedToLoggedFavoritesTest() {

        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.addToFavourites(casinoPage.getYggdrasilGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("evolution_game"));
        casinoPage.addToFavourites(casinoPage.getEvolutionGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("issoft_game"));
        casinoPage.addToFavourites(casinoPage.getIssoftGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("playngo_game"));
        casinoPage.addToFavourites(casinoPage.getPlayngoGameFavouriteElement());;
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("relax_game"));
        casinoPage.addToFavourites(casinoPage.getRelaxGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("mg_game"));
        casinoPage.addToFavourites(casinoPage.getMgGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "6");
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
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.logout();
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
    }

  /*  @Test
    public void addTwiceUnloggedToLoggedFavoritesTest() {

        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.addToFavourites(casinoPage.getYggdrasilGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("evolution_game"));
        casinoPage.addToFavourites(casinoPage.getEvolutionGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("issoft_game"));
        casinoPage.addToFavourites(casinoPage.getIssoftGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("playngo_game"));
        casinoPage.addToFavourites(casinoPage.getPlayngoGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("relax_game"));
        casinoPage.addToFavourites(casinoPage.getRelaxGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("mg_game"));
        casinoPage.addToFavourites(casinoPage.getMgGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "6");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.correctLogin(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        casinoPage.logout();
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.addToFavourites(casinoPage.getYggdrasilGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("evolution_game"));
        casinoPage.addToFavourites(casinoPage.getEvolutionGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("issoft_game"));
        casinoPage.addToFavourites(casinoPage.getIssoftGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("playngo_game"));
        casinoPage.addToFavourites(casinoPage.getPlayngoGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("relax_game"));
        casinoPage.addToFavourites(casinoPage.getRelaxGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.search(exampleBundle.getString("mg_game"));
        casinoPage.addToFavourites(casinoPage.getMgGameFavouriteElement());
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "6");
        casinoPage.clearField(casinoPage.getSearchFieldElement());
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
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.logout();
        assertEquals(casinoPage.getTextFavoriteNumberElement(), "0");
    }
*/
}



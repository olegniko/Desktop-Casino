package web.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static org.testng.Assert.assertTrue;


public class Favourites {

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
    public void mgAddRemoveFavoritesTest() {

        casinoPage.search(exampleBundle.getString("mg_game"));
        casinoPage.addToFavourites(casinoPage.getMgGameFavouriteElement());
        casinoPage.removeFromFavourites(casinoPage.getMgGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test
    public void relaxAddRemoveFavoritesTest() {

        casinoPage.search(exampleBundle.getString("relax_game"));
        casinoPage.addToFavourites(casinoPage.getRelaxGameFavouriteElement());
        casinoPage.removeFromFavourites(casinoPage.getRelaxGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }
    @Test
    public void playngoAddRemoveFavoritesTest() {

        casinoPage.search(exampleBundle.getString("playngo_game"));
        casinoPage.addToFavourites(casinoPage.getPlayngoGameFavouriteElement());
        casinoPage.removeFromFavourites(casinoPage.getPlayngoGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test
    public void issoftAddRemoveFavoritesTest() {

        casinoPage.search(exampleBundle.getString("issoft_game"));
        casinoPage.addToFavourites(casinoPage.getIssoftGameFavouriteElement());
        casinoPage.removeFromFavourites(casinoPage.getIssoftGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }
    @Test
    public void evolutionAddRemoveFavoritesTest() {

        casinoPage.search(exampleBundle.getString("evolution_game"));
        casinoPage.addToFavourites(casinoPage.getEvolutionGameFavouriteElement());
        casinoPage.removeFromFavourites(casinoPage.getEvolutionGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test
    public void yggdrasilAddRemoveFavoritesTest() {

        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.addToFavourites(casinoPage.getYggdrasilGameFavouriteElement());
        casinoPage.removeFromFavourites(casinoPage.getYggdrasilGameFavouriteElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }



}



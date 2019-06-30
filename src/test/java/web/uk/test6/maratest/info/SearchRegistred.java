package web.uk.test6.maratest.info;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class SearchRegistred extends BaseTestForCasinoRegistred {


    @Test (priority=50)
    //
    public void enter_2_symbols_in_search() {

        casinoPage.waitIfElementIsClickable(casinoPage.getSearchCasino());

        casinoPage.enterSymbolsToSearch("12");

        assertEquals(casinoPage.getSearchResult(),exampleBundle.getString("request_too_short"));

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=51)
    //
    public void enter_3_incorrect_symbols_in_search()  {

        casinoPage.waitIfElementIsClickable(casinoPage.getSearchCasino());


        casinoPage.enterSymbolsToSearch("ddd");

        assertEquals(casinoPage.getSearchResult(),exampleBundle.getString("no_result"));

        casinoPage.clearSearchInCasinoByCross();

    }

    @Test (priority=52)
    //
    public void enter_correct_symbols_for_MG_in_search() {

        casinoPage.waitIfElementIsClickable(casinoPage.getSearchCasino());
        casinoPage.enterSymbolsToSearch("olegMGautotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("mg_game_title"));

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=53)
    //
    public void enter_correct_symbols_for_Evolution_in_search() {

        casinoPage.waitIfElementIsClickable(casinoPage.getSearchCasino());


        casinoPage.enterSymbolsToSearch("olegEvolutionAutotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("evolution_game_title"));

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=54)
    //
    public void enter_correct_symbols_for_Issoft_in_search() {
        casinoPage.waitIfElementIsClickable(casinoPage.getSearchCasino());

        casinoPage.enterSymbolsToSearch("olegIssoftAutotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("issoft_game_title"));

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=55)
    //
    public void enter_correct_symbols_for_Relax_in_search() {

        casinoPage.waitIfElementIsClickable(casinoPage.getSearchCasino());
        casinoPage.enterSymbolsToSearch("olegRelaxAutotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("relax_game_title"));

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=56)
    //
    public void enter_correct_symbols_for_Yggdrasil_in_search() {
        casinoPage.waitIfElementIsClickable(casinoPage.getSearchCasino());

        casinoPage.enterSymbolsToSearch("olegYggdrasilAutotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("yggdrasil_game_title"));

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=57)
    //
    public void enter_correct_symbols_for_Playngo_in_search() {

        casinoPage.waitIfElementIsClickable(casinoPage.getSearchCasino());
        casinoPage.enterSymbolsToSearch("olegPlayngoAutotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("playngo_game_title"));

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=58)
    //
    public void after_refresh_in_search() {
        casinoPage.waitIfElementIsClickable(casinoPage.getSearchCasino());

        casinoPage.enterSymbolsToSearch("olegPlayngoAutotest");

        casinoPage.refreshPage();

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("playngo_game_title"));

        casinoPage.clearSearchInCasino();

    }


}
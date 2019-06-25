package web.uk.test6.maratest.info;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;



public class SearchUnregistred extends BaseTestForCasinoUnregistred {


    @Test (priority=1)
    //
    public void enter_2_symbols_in_search() {

        casinoPage.waitIfElementIsClickable(casinoPage.getSearch_Casino());

        casinoPage.enter_symbols_to_Search("12");

        assertEquals(casinoPage.getSearch_Result(),exampleBundle.getString("request_too_short"));

        casinoPage.waitIfElementIsClickable(casinoPage.getCross_In_Search());

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=2)
    //
    public void enter_3_incorrect_symbols_in_search()  {


        casinoPage.enter_symbols_to_Search("ddd");

        assertEquals(casinoPage.getSearch_Result(),exampleBundle.getString("no_result"));

        casinoPage.waitIfElementIsClickable(casinoPage.getCross_In_Search());

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=3)
    //
    public void enter_correct_symbols_for_MG_in_search() {


        casinoPage.enter_symbols_to_Search("olegMGautotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("mg_game_title"));

        casinoPage.waitIfElementIsClickable(casinoPage.getCross_In_Search());

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=4)
    //
    public void enter_correct_symbols_for_Evolution_in_search() {


        casinoPage.enter_symbols_to_Search("olegEvolutionAutotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("evolution_game_title"));

        casinoPage.waitIfElementIsClickable(casinoPage.getCross_In_Search());

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=5)
    //
    public void enter_correct_symbols_for_Issoft_in_search() {


        casinoPage.enter_symbols_to_Search("olegIssoftAutotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("issoft_game_title"));

        casinoPage.waitIfElementIsClickable(casinoPage.getCross_In_Search());

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=6)
    //
    public void enter_correct_symbols_for_Relax_in_search() {


        casinoPage.enter_symbols_to_Search("olegRelaxAutotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("relax_game_title"));

        casinoPage.waitIfElementIsClickable(casinoPage.getCross_In_Search());

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=7)
    //
    public void enter_correct_symbols_for_Yggdrasil_in_search() {


        casinoPage.enter_symbols_to_Search("olegYggdrasilAutotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("yggdrasil_game_title"));

        casinoPage.waitIfElementIsClickable(casinoPage.getCross_In_Search());

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=8)
    //
    public void enter_correct_symbols_for_Playngo_in_search() {


        casinoPage.enter_symbols_to_Search("olegPlayngoAutotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("playngo_game_title"));

        casinoPage.waitIfElementIsClickable(casinoPage.getCross_In_Search());

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=9)
    //
    public void after_refresh_in_search() {


        casinoPage.enter_symbols_to_Search("olegPlayngoAutotest");

        casinoPage.refreshPage();

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("playngo_game_title"));

        casinoPage.waitIfElementIsClickable(casinoPage.getCross_In_Search());

        casinoPage.clearSearchInCasino();

    }



}
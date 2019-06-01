package web.uk.test6.maratest.info;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class Search extends BaseTestForCasinoUnregistred {


    @Test
    //
    public void enter_2_symbols_in_search() {

        casinoPage.enter_symbols_to_Search("12");

        assertEquals(casinoPage.getSearch_Result(),exampleBundle.getString("request_too_short"));

    }

    @Test
    //
    public void enter_3_incorrect_symbols_in_search()  {

        casinoPage.enter_symbols_to_Search("ddd");

        assertEquals(casinoPage.getSearch_Result(),exampleBundle.getString("no_result"));

    }

    @Test
    //
    public void enter_correct_symbols_for_MG_in_search() {


        casinoPage.enter_symbols_to_Search("olegMGautotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("mg_game_title"));

    }

    @Test
    //
    public void enter_correct_symbols_for_Evolution_in_search() {


        casinoPage.enter_symbols_to_Search("olegEvolutionAutotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("evolution_game_title"));

    }

    @Test
    //
    public void enter_correct_symbols_for_Issoft_in_search() {


        casinoPage.enter_symbols_to_Search("olegIssoftAutotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("issoft_game_title"));

    }

    @Test
    //
    public void enter_correct_symbols_for_Relax_in_search() {


        casinoPage.enter_symbols_to_Search("olegRelaxAutotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("relax_game_title"));

    }

    @Test
    //
    public void enter_correct_symbols_for_Yggdrasil_in_search() {


        casinoPage.enter_symbols_to_Search("olegYggdrasilAutotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("yggdrasil_game_title"));

    }

    @Test
    //
    public void enter_correct_symbols_for_Playngo_in_search() {


        casinoPage.enter_symbols_to_Search("olegPlayngoAutotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("playngo_game_title"));

    }


}
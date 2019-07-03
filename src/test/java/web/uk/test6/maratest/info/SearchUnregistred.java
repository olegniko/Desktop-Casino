package web.uk.test6.maratest.info;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;



public class SearchUnregistred extends BaseTestForCasinoUnregistred {


    @Test (priority=1)
    //
    public void enter2SymbolsInSearch() throws InterruptedException {

        casinoPage.waitIfElementIsClickable(casinoPage.getSearchCasino());

        casinoPage.enterSymbolsToSearch("12");

        assertEquals(casinoPage.getSearchResultText(),exampleBundle.getString("request_too_short"));

        casinoPage.waitIfElementIsClickable(casinoPage.getCrossInSearch());

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=2)
    //
    public void enter3IncorrectSymbolsInSearch() throws InterruptedException {


        casinoPage.enterSymbolsToSearch("ddd");

        assertEquals(casinoPage.getSearchResultText(),exampleBundle.getString("no_result"));

        casinoPage.waitIfElementIsClickable(casinoPage.getCrossInSearch());

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=3)
    //
    public void enterCorrectSymbolsForMgInSearch() throws InterruptedException {


        casinoPage.enterSymbolsToSearch("olegMGautotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("mg_game_title"));

        casinoPage.waitIfElementIsClickable(casinoPage.getCrossInSearch());

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=4)
    //
    public void enterCorrectSymbolsForEvolutionInSearch() throws InterruptedException {


        casinoPage.enterSymbolsToSearch("olegEvolutionAutotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("evolution_game_title"));

        casinoPage.waitIfElementIsClickable(casinoPage.getCrossInSearch());

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=5)
    //
    public void enterCorrectSymbolsForIssoftInSearch() throws InterruptedException {


        casinoPage.enterSymbolsToSearch("olegIssoftAutotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("issoft_game_title"));

        casinoPage.waitIfElementIsClickable(casinoPage.getCrossInSearch());

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=6)
    //
    public void enterCorrectSymbolsForRelaxInSearch() throws InterruptedException {


        casinoPage.enterSymbolsToSearch("olegRelaxAutotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("relax_game_title"));

        casinoPage.waitIfElementIsClickable(casinoPage.getCrossInSearch());

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=7)
    //
    public void enter_correct_symbols_for_Yggdrasil_in_search() throws InterruptedException {


        casinoPage.enterSymbolsToSearch("olegYggdrasilAutotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("yggdrasil_game_title"));

        casinoPage.waitIfElementIsClickable(casinoPage.getCrossInSearch());

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=8)
    //
    public void enter_correct_symbols_for_Playngo_in_search() throws InterruptedException {


        casinoPage.enterSymbolsToSearch("olegPlayngoAutotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("playngo_game_title"));

        casinoPage.waitIfElementIsClickable(casinoPage.getCrossInSearch());

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=9)
    //
    public void after_refresh_in_search() throws InterruptedException {


        casinoPage.enterSymbolsToSearch("olegPlayngoAutotest");

        casinoPage.refreshPage();

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("playngo_game_title"));

        casinoPage.waitIfElementIsClickable(casinoPage.getCrossInSearch());

        casinoPage.clearSearchInCasino();

    }



}
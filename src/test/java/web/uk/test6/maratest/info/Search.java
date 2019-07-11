package web.uk.test6.maratest.info;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;



public class Search extends BaseTestForCasino {


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
    public void enterCorrectSymbolsForYggdrasilInSearch() throws InterruptedException {


        casinoPage.enterSymbolsToSearch("olegYggdrasilAutotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("yggdrasil_game_title"));

        casinoPage.waitIfElementIsClickable(casinoPage.getCrossInSearch());

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=8)
    //
    public void enterCorrectSymbolsForPlayngoInSearch() throws InterruptedException {


        casinoPage.enterSymbolsToSearch("olegPlayngoAutotest");

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("playngo_game_title"));

        casinoPage.waitIfElementIsClickable(casinoPage.getCrossInSearch());

        casinoPage.clearSearchInCasino();

    }

    @Test (priority=9)
    //
    public void afterRefreshInSearch() throws InterruptedException {


        casinoPage.enterSymbolsToSearch("olegPlayngoAutotest");

        casinoPage.refreshPage();

        assertEquals(casinoPage.getGameTitleText(),exampleBundle.getString("playngo_game_title"));

        casinoPage.waitIfElementIsClickable(casinoPage.getCrossInSearch());

        casinoPage.clearSearchInCasino();

    }
    @Test (priority=10)
    //
    public void enter2SymbolsInSearchForLogined() throws InterruptedException {

        casinoPage.login("olegautotest","Password1");
        casinoPage.clickIfElementIsClickable(casinoPage.getOkInSuccessfullMessage());
        enter2SymbolsInSearch();
    }

    @Test (priority=11)
    //
    public void enter3IncorrectSymbolsInSearchforLogined() throws InterruptedException {

        enter3IncorrectSymbolsInSearch();

    }

    @Test (priority=12)
    //
    public void enterCorrectSymbolsForMgInSearchForLogin() throws InterruptedException {

        enterCorrectSymbolsForMgInSearch();


    }

    @Test (priority=13)
    //
    public void enterCorrectSymbolsForEvolutionInSearchForLogin() throws InterruptedException {


        enterCorrectSymbolsForEvolutionInSearch();

    }

    @Test (priority=14)
    //
    public void enterCorrectSymbolsForIssoftInSearchForLogin() throws InterruptedException {


        enterCorrectSymbolsForIssoftInSearch();

    }

    @Test (priority=15)
    //
    public void enterCorrectSymbolsForRelaxInSearchForLogin() throws InterruptedException {


        enterCorrectSymbolsForRelaxInSearch();

    }

    @Test (priority=16)
    //
    public void enterCorrectSymbolsForYggdrasilInSearchForLogin() throws InterruptedException {


        enterCorrectSymbolsForYggdrasilInSearch();

    }

    @Test (priority=17)
    //
    public void enterCorrectSymbolsForPlayngoInSearchForLogin() throws InterruptedException {


        enterCorrectSymbolsForPlayngoInSearch();

    }

    @Test (priority=18)
    //
    public void afterRefreshInSearchForLogin() throws InterruptedException {


        afterRefreshInSearch();

    }



}
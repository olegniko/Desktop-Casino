package web.uk.test6.maratest.info;

import org.testng.annotations.Test;


public class GameLaunchIssoft extends BaseTestForCasino {


    @Test
    //
    public void launch_Issoft_in_search() {


        casinoPage.enterSymbolsToSearch("olegIssoftAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getGameTitleElement());

    }
}


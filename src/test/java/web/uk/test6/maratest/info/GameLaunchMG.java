package web.uk.test6.maratest.info;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class GameLaunchMG extends BaseTestForCasino {


    @Test
    //
    public void launch_MG_in_search() {


        casinoPage.enterSymbolsToSearch("olegMgAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getGameTitleElement());

    }
}


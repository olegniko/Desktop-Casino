package web.uk.test6.maratest.info;

import org.testng.annotations.Test;


public class GameLaunchRelax extends BaseTestForCasinoRegistred {


    @Test
    //
    public void launch_Relax_in_search() {


        casinoPage.enterSymbolsToSearch("olegRelaxAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getGameTitle());

    }
}


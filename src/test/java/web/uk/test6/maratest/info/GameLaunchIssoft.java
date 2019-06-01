package web.uk.test6.maratest.info;

import org.testng.annotations.Test;


public class GameLaunchIssoft extends BaseTestForCasinoRegistred {


    @Test
    //
    public void launch_Issoft_in_search() {


        casinoPage.enter_symbols_to_Search("olegIssoftAutotest");

        casinoPage.getGameTitle().click();

    }
}


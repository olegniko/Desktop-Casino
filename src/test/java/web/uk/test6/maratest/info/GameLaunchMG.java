package web.uk.test6.maratest.info;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class GameLaunchMG extends BaseTestForCasinoRegistred {


    @Test
    //
    public void launch_MG_in_search() {


        casinoPage.enter_symbols_to_Search("olegMgAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getGameTitle());

    }
}


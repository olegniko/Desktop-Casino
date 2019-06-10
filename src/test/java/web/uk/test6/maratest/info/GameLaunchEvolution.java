package web.uk.test6.maratest.info;

import org.testng.annotations.Test;


public class GameLaunchEvolution extends BaseTestForCasinoRegistred {


    @Test
    //
    public void launch_Evolution_in_search() {


        casinoPage.enter_symbols_to_Search("olegEvolutionAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getGameTitle());

    }
}


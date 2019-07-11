package web.uk.test6.maratest.info;

import org.testng.annotations.Test;


public class GameLaunchEvolution extends BaseTestForCasino {


    @Test
    //
    public void launch_Evolution_in_search() {


        casinoPage.enterSymbolsToSearch("olegEvolutionAutotest");

        casinoPage.getFavouriteForFirstElementOfSix().click();

    }
}


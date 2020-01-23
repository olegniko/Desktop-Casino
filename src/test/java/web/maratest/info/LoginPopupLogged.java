package web.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static helper.factory.Browser.exampleBundleServer;
import static org.testng.Assert.assertTrue;


public class LoginPopupLogged {

    CasinoPage casinoPage;

    @BeforeClass

    public void setUp() throws Exception {


        casinoPage = new CasinoPage();


    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        casinoPage.close();
    }

/*
   @Test
    //
    public void loginEvolutionTest() {

        casinoPage.search(exampleBundle.getString("evolution_game"));
        casinoPage.moveToElement(casinoPage.getEvolutionGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getEvolutionGamePlayElement());
        casinoPage.correctLoginByPopup(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        casinoPage.clickIfElementIsClickable(casinoPage.getCrossInGameElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getLogoutButtonHeaderElement());

    }*/

    @Test
    //
    public void loginMgTest() {

        casinoPage.search(exampleBundle.getString("mg_game"));
        casinoPage.moveToElement(casinoPage.getEvolutionGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getEvolutionGamePlayElement());
        casinoPage.correctLoginByPopup(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        casinoPage.clickIfElementIsClickable(casinoPage.getCrossInGameElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getLogoutButtonHeaderElement());

    }

    @Test
    //
    public void loginIssoftTest() {

        casinoPage.search(exampleBundle.getString("issoft_game"));
        casinoPage.moveToElement(casinoPage.getIssoftGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getIssoftGamePlayElement());
        casinoPage.correctLoginByPopup(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        casinoPage.clickIfElementIsClickable(casinoPage.getCrossInGameElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getLogoutButtonHeaderElement());

    }

    @Test
    //
    public void loginRelaxTest() {

        casinoPage.search(exampleBundle.getString("relax_game"));
        casinoPage.moveToElement(casinoPage.getRelaxGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getRelaxGamePlayElement());
        casinoPage.correctLoginByPopup(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        casinoPage.clickIfElementIsClickable(casinoPage.getCrossInGameElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getLogoutButtonHeaderElement());

    }

    @Test
    //
    public void loginPlayngoTest() {

        casinoPage.search(exampleBundle.getString("playngo_game"));
        casinoPage.moveToElement(casinoPage.getPlayngoGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getPlayngoGamePlayElement());
        casinoPage.correctLoginByPopup(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        casinoPage.clickIfElementIsClickable(casinoPage.getCrossInGameElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getLogoutButtonHeaderElement());

    }

    @Test
    //
    public void loginYggdrasilTest() {

        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.moveToElement(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.correctLoginByPopup(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        casinoPage.clickIfElementIsClickable(casinoPage.getCrossInGameElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getLogoutButtonHeaderElement());

    }

}



package web.maratest.info;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static helper.factory.Browser.exampleBundleServer;
import static org.testng.Assert.assertTrue;


public class LoginPopupLogged {

    CasinoPage casinoPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        casinoPage = new CasinoPage();
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        casinoPage.close();
    }


    @Test(groups = {"ES1", "CUR2", "ALD2"})
    public void loginEvolutionTest() {
        casinoPage.search(exampleBundle.getString("evolution_game"));
        casinoPage.moveToElement(casinoPage.getEvolutionGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getEvolutionGamePlayElement());
        casinoPage.correctLoginByPopup(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        casinoPage.moveToElement(casinoPage.getLoginMessageOkButtonElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginMessageOkButtonElement());
        casinoPage.moveToElement(casinoPage.getCrossInGameElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getCrossInGameElement());
        assertTrue(casinoPage.getDepositButtonHeaderElement().isDisplayed());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void loginMgTest() {
        casinoPage.search(exampleBundle.getString("mg_game"));
        casinoPage.moveToElement(casinoPage.getMgGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getMgGamePlayElement());
        casinoPage.correctLoginByPopup(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        casinoPage.moveToElement(casinoPage.getLoginMessageOkButtonElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginMessageOkButtonElement());
        casinoPage.moveToElement(casinoPage.getCrossInGameElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getCrossInGameElement());
        assertTrue(casinoPage.getDepositButtonHeaderElement().isDisplayed());
    }

    @Test(groups = {"ALD2"})
    public void loginIssoftTest() {
        casinoPage.search(exampleBundle.getString("issoft_game"));
        casinoPage.moveToElement(casinoPage.getIssoftGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getIssoftGamePlayElement());
        casinoPage.correctLoginByPopup(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        casinoPage.moveToElement(casinoPage.getLoginMessageOkButtonElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginMessageOkButtonElement());
        casinoPage.moveToElement(casinoPage.getCrossInGameElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getCrossInGameElement());
        assertTrue(casinoPage.getDepositButtonHeaderElement().isDisplayed());
    }

    @Test(groups = {"ALD2"})
    public void loginRelaxTest() {
        casinoPage.search(exampleBundle.getString("relax_game"));
        casinoPage.moveToElement(casinoPage.getRelaxGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getRelaxGamePlayElement());
        casinoPage.correctLoginByPopup(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        casinoPage.moveToElement(casinoPage.getLoginMessageOkButtonElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginMessageOkButtonElement());
        casinoPage.moveToElement(casinoPage.getCrossInGameElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getCrossInGameElement());
        assertTrue(casinoPage.getDepositButtonHeaderElement().isDisplayed());
    }

    @Test(groups = {"ALD2"})
    public void loginPlayngoTest() {
        casinoPage.search(exampleBundle.getString("playngo_game"));
        casinoPage.moveToElement(casinoPage.getPlayngoGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getPlayngoGamePlayElement());
        casinoPage.correctLoginByPopup(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        casinoPage.moveToElement(casinoPage.getLoginMessageOkButtonElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginMessageOkButtonElement());
        casinoPage.moveToElement(casinoPage.getCrossInGameElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getCrossInGameElement());
        assertTrue(casinoPage.getDepositButtonHeaderElement().isDisplayed());
    }

    @Test(groups = {"ALD2"})
    public void loginYggdrasilTest() {
        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.moveToElement(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.correctLoginByPopup(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
        casinoPage.moveToElement(casinoPage.getLoginMessageOkButtonElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginMessageOkButtonElement());
        casinoPage.moveToElement(casinoPage.getCrossInGameElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getCrossInGameElement());
        assertTrue(casinoPage.getDepositButtonHeaderElement().isDisplayed());
    }
}




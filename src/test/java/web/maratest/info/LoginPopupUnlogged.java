package web.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static helper.factory.Browser.exampleBundleServer;
import static org.testng.Assert.assertTrue;


public class LoginPopupUnlogged {

    CasinoPage casinoPage;

    @BeforeClass

    public void setUp() throws Exception {


        casinoPage = new CasinoPage();


    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        casinoPage.close();
    }


    @Test
    //
    public void loginPopupAppearenceEvolutionTest() {

        casinoPage.search(exampleBundle.getString("evolution_game"));
        casinoPage.moveToElement(casinoPage.getEvolutionGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getEvolutionGamePlayElement());
        assertTrue(casinoPage.getLoginPopupElement().isDisplayed());
        assertTrue(casinoPage.getLoginPopupElement().isEnabled());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginPopupCrossElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());

    }

    @Test
    //
    public void loginPopupAppearenceMgTest() {

        casinoPage.search(exampleBundle.getString("mg_game"));
        casinoPage.moveToElement(casinoPage.getMgGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getMgGamePlayElement());
        assertTrue(casinoPage.getLoginPopupElement().isDisplayed());
        assertTrue(casinoPage.getLoginPopupElement().isEnabled());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginPopupCrossElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());

    }

    @Test
    //
    public void loginPopupAppearenceRelaxTest() {

        casinoPage.search(exampleBundle.getString("relax_game"));
        casinoPage.moveToElement(casinoPage.getRelaxGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getRelaxGamePlayElement());
        assertTrue(casinoPage.getLoginPopupElement().isDisplayed());
        assertTrue(casinoPage.getLoginPopupElement().isEnabled());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginPopupCrossElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());

    }

    @Test
    //
    public void loginPopupAppearencePlayngoTest() {

        casinoPage.search(exampleBundle.getString("playngo_game"));
        casinoPage.moveToElement(casinoPage.getPlayngoGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getPlayngoGamePlayElement());
        assertTrue(casinoPage.getLoginPopupElement().isDisplayed());
        assertTrue(casinoPage.getLoginPopupElement().isEnabled());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginPopupCrossElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());

    }

    @Test
    //
    public void loginPopupAppearenceIssoftTest() {

        casinoPage.search(exampleBundle.getString("issoft_game"));
        casinoPage.moveToElement(casinoPage.getIssoftGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getIssoftGamePlayElement());
        assertTrue(casinoPage.getLoginPopupElement().isDisplayed());
        assertTrue(casinoPage.getLoginPopupElement().isEnabled());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginPopupCrossElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());

    }

    @Test
    //
    public void loginPopupAppearenceYggdrasilTest() {

        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.moveToElement(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getYggdrasilGamePlayElement());
        assertTrue(casinoPage.getLoginPopupElement().isDisplayed());
        assertTrue(casinoPage.getLoginPopupElement().isEnabled());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginPopupCrossElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());

    }

    @Test
    public void loginPopupTitleTest() {

        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.moveToElement(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getYggdrasilGamePlayElement());
        assertTrue(casinoPage.getLoginPopupTitleElement().isDisplayed());
        assertTrue(casinoPage.getLoginPopupTitleElement().isEnabled());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginPopupCrossElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());

    }

    @Test
    public void loginFieldPopupLoginTest() {

        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.moveToElement(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getYggdrasilGamePlayElement());
        assertTrue(casinoPage.getLoginFieldLoginPopupElement().isDisplayed());
        assertTrue(casinoPage.getLoginFieldLoginPopupElement().isEnabled());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginPopupCrossElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());

    }

    @Test
    public void passwordFieldPopupLoginTest() {

        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.moveToElement(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getYggdrasilGamePlayElement());
        assertTrue(casinoPage.getPasswordFieldLoginPopupElement().isDisplayed());
        assertTrue(casinoPage.getPasswordFieldLoginPopupElement().isEnabled());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginPopupCrossElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());

    }

    @Test
    public void loginButtonPopupLoginTest() {

        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.moveToElement(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getYggdrasilGamePlayElement());
        assertTrue(casinoPage.getLoginButtonPopupElement().isDisplayed());
        assertTrue(casinoPage.getLoginButtonPopupElement().isEnabled());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginPopupCrossElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());

    }

    @Test
    public void joinNowButtonPopupLoginTest() {

        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.moveToElement(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getYggdrasilGamePlayElement());
        assertTrue(casinoPage.getJoinNowButtonPopupElement().isDisplayed());
        assertTrue(casinoPage.getJoinNowButtonPopupElement().isEnabled());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginPopupCrossElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());

    }

    @Test
    public void lostPasswordPopupLoginTest() {

        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.moveToElement(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getYggdrasilGamePlayElement());
        assertTrue(casinoPage.getLostPasswordLoginPopupElement().isDisplayed());
        assertTrue(casinoPage.getLostPasswordLoginPopupElement().isEnabled());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginPopupCrossElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());

    }

    @Test
    //
    public void incorectLoginTest() {

        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.moveToElement(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.loginByPopup(exampleBundleServer.getString("incorrect_login"), exampleBundleServer.getString("correct_password"));
        assertTrue(casinoPage.getIncorrectLoginMessagePopupElement().isDisplayed());
        casinoPage.clickIfElementIsClickable(casinoPage.getIncorrectLoginMessageOkButtonPopupElement());
        casinoPage.clearField(casinoPage.getLoginFieldLoginPopupElement());
        casinoPage.clearField(casinoPage.getPasswordFieldLoginPopupElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginPopupCrossElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test
    //
    public void incorectPasswordTest() {

        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.moveToElement(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.loginByPopup(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("incorrect_password"));
        assertTrue(casinoPage.getIncorrectLoginMessagePopupElement().isDisplayed());
        casinoPage.clickIfElementIsClickable(casinoPage.getIncorrectLoginMessageOkButtonPopupElement());
        casinoPage.clearField(casinoPage.getLoginFieldLoginPopupElement());
        casinoPage.clearField(casinoPage.getPasswordFieldLoginPopupElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginPopupCrossElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());

    }

    @Test
    //
    public void incorectLoginAndPasswordTest() {

        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.moveToElement(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.loginByPopup(exampleBundleServer.getString("incorrect_login"), exampleBundleServer.getString("incorrect_password"));
        assertTrue(casinoPage.getIncorrectLoginMessagePopupElement().isDisplayed());
        casinoPage.clickIfElementIsClickable(casinoPage.getIncorrectLoginMessageOkButtonPopupElement());
        casinoPage.clearField(casinoPage.getLoginFieldLoginPopupElement());
        casinoPage.clearField(casinoPage.getPasswordFieldLoginPopupElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginPopupCrossElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test
    //
    public void blankLoginAndPasswordTest() {

        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.moveToElement(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.loginByPopup("", "");
        assertTrue(casinoPage.getIncorrectLoginMessagePopupElement().isDisplayed());
        casinoPage.clickIfElementIsClickable(casinoPage.getIncorrectLoginMessageOkButtonPopupElement());
        casinoPage.clearField(casinoPage.getLoginFieldLoginPopupElement());
        casinoPage.clearField(casinoPage.getPasswordFieldLoginPopupElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginPopupCrossElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test
    //
    public void blankLoginTest() {

        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.moveToElement(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.loginByPopup("", exampleBundleServer.getString("correct_password"));
        assertTrue(casinoPage.getIncorrectLoginMessagePopupElement().isDisplayed());
        casinoPage.clickIfElementIsClickable(casinoPage.getIncorrectLoginMessageOkButtonPopupElement());
        casinoPage.clearField(casinoPage.getLoginFieldLoginPopupElement());
        casinoPage.clearField(casinoPage.getPasswordFieldLoginPopupElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginPopupCrossElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }

    @Test
    //
    public void blankPasswordTest() {

        casinoPage.search(exampleBundle.getString("yggdrasil_game"));
        casinoPage.moveToElement(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getYggdrasilGamePlayElement());
        casinoPage.loginByPopup(exampleBundleServer.getString("correct_login"), "");
        assertTrue(casinoPage.getIncorrectLoginMessagePopupElement().isDisplayed());
        casinoPage.clickIfElementIsClickable(casinoPage.getIncorrectLoginMessageOkButtonPopupElement());
        casinoPage.clearField(casinoPage.getLoginFieldLoginPopupElement());
        casinoPage.clearField(casinoPage.getPasswordFieldLoginPopupElement());
        casinoPage.clickIfElementIsClickable(casinoPage.getLoginPopupCrossElement());
        casinoPage.clearField(casinoPage.getSearchFieldElement());
    }


}



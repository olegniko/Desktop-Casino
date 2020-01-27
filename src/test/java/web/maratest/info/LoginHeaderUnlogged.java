package web.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static helper.factory.Browser.exampleBundleServer;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class LoginHeaderUnlogged {

    CasinoPage casinoPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        casinoPage = new CasinoPage();
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        casinoPage.close();
    }


    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void loginFieldEnabledTest() {
        assertTrue(casinoPage.getLoginFieldHeaderElement().isDisplayed());
        assertTrue(casinoPage.getLoginFieldHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextLoginFieldHeaderElement(), exampleBundle.getString("login_field_header"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void passwordFieldEnabledTest() {
        assertTrue(casinoPage.getPasswordFieldHeaderElement().isDisplayed());
        assertTrue(casinoPage.getPasswordFieldHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextPasswordFieldHeaderElement(), exampleBundle.getString("password_field_header"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void lostPasswordEnabledTest() {
        assertTrue(casinoPage.getLostPasswordHeaderElement().isDisplayed());
        assertTrue(casinoPage.getLostPasswordHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextLostPasswordHeaderElement(), exampleBundle.getString("lost_password_header"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void loginButtonEnabledTest() {
        assertTrue(casinoPage.getLoginButtonHeaderElement().isDisplayed());
        assertTrue(casinoPage.getLoginButtonHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextLoginButtonHeaderElement(), exampleBundle.getString("login_button_header"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void joinNowButtonEnabledTest() {
        assertTrue(casinoPage.getJoinNowButtonHeaderElement().isDisplayed());
        assertTrue(casinoPage.getJoinNowButtonHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextJoinNowButtonHeaderElement(), exampleBundle.getString("join_now_button_header"));
    }


    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void incorectLoginTest() {
        casinoPage.login(exampleBundleServer.getString("incorrect_login"), exampleBundleServer.getString("correct_password"));
        assertTrue(casinoPage.getIncorrectLoginMessageElement().isDisplayed());
        casinoPage.clickIfElementIsClickable(casinoPage.getIncorrectLoginMessageOkButtonElement());
        casinoPage.clearField(casinoPage.getLoginFieldHeaderElement());
        casinoPage.clearField(casinoPage.getPasswordFieldHeaderElement());

    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void incorectPasswordTest() {
        casinoPage.login(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("incorrect_password"));
        assertTrue(casinoPage.getIncorrectLoginMessageElement().isDisplayed());
        casinoPage.clickIfElementIsClickable(casinoPage.getIncorrectLoginMessageOkButtonElement());
        casinoPage.clearField(casinoPage.getLoginFieldHeaderElement());
        casinoPage.clearField(casinoPage.getPasswordFieldHeaderElement());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void incorectLoginAndPasswordTest() {
        casinoPage.login(exampleBundleServer.getString("incorrect_login"), exampleBundleServer.getString("incorrect_password"));
        assertTrue(casinoPage.getIncorrectLoginMessageElement().isDisplayed());
        casinoPage.clickIfElementIsClickable(casinoPage.getIncorrectLoginMessageOkButtonElement());
        casinoPage.clearField(casinoPage.getLoginFieldHeaderElement());
        casinoPage.clearField(casinoPage.getPasswordFieldHeaderElement());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void blankLoginAndPasswordTest() {
        casinoPage.login("", "");
        assertTrue(casinoPage.getIncorrectLoginMessageElement().isDisplayed());
        casinoPage.clickIfElementIsClickable(casinoPage.getIncorrectLoginMessageOkButtonElement());
        casinoPage.clearField(casinoPage.getLoginFieldHeaderElement());
        casinoPage.clearField(casinoPage.getPasswordFieldHeaderElement());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void blankLoginTest() {
        casinoPage.login("", exampleBundleServer.getString("correct_password"));
        assertTrue(casinoPage.getIncorrectLoginMessageElement().isDisplayed());
        casinoPage.clickIfElementIsClickable(casinoPage.getIncorrectLoginMessageOkButtonElement());
        casinoPage.clearField(casinoPage.getLoginFieldHeaderElement());
        casinoPage.clearField(casinoPage.getPasswordFieldHeaderElement());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void blankPasswordTest() {
        casinoPage.login(exampleBundleServer.getString("correct_login"), "");
        assertTrue(casinoPage.getIncorrectLoginMessageElement().isDisplayed());
        casinoPage.clickIfElementIsClickable(casinoPage.getIncorrectLoginMessageOkButtonElement());
        casinoPage.clearField(casinoPage.getLoginFieldHeaderElement());
        casinoPage.clearField(casinoPage.getPasswordFieldHeaderElement());
    }
}



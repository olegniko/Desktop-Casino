package web.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class LoginHeaderUnlogged {

    CasinoPage casinoPage;

    @BeforeClass

    public void setUp() {


        casinoPage = new CasinoPage();


    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        casinoPage.close();
    }


    @Test
    //
    public void loginFieldEnabledTest() {

        assertTrue(casinoPage.getLoginFieldHeaderElement().isDisplayed());
        assertTrue(casinoPage.getLoginFieldHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextLoginFieldHeaderElement(), exampleBundle.getString("login_field_header"));
    }

    @Test
    //
    public void passwordFieldEnabledTest() {

        assertTrue(casinoPage.getPasswordFieldHeaderElement().isDisplayed());
        assertTrue(casinoPage.getPasswordFieldHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextPasswordFieldHeaderElement(), exampleBundle.getString("password_field_header"));
    }

    @Test
    //
    public void lostPasswordEnabledTest() {

        assertTrue(casinoPage.getLostPasswordHeaderElement().isDisplayed());
        assertTrue(casinoPage.getLostPasswordHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextLostPasswordHeaderElement(), exampleBundle.getString("lost_password_header"));
    }

    @Test
    //
    public void loginButtonEnabledTest() {

        assertTrue(casinoPage.getLoginButtonHeaderElement().isDisplayed());
        assertTrue(casinoPage.getLoginButtonHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextLoginButtonHeaderElement(), exampleBundle.getString("login_button_header"));
    }

    @Test
    //
    public void joinNowButtonEnabledTest() {

        assertTrue(casinoPage.getJoinNowButtonHeaderElement().isDisplayed());
        assertTrue(casinoPage.getJoinNowButtonHeaderElement().isEnabled());
        assertEquals(casinoPage.getTextJoinNowButtonHeaderElement(), exampleBundle.getString("join_now_button_header"));
    }


    @Test
    //
    public void incorectLoginTest() {

        casinoPage.login(exampleBundle.getString("incorrect_login"), exampleBundle.getString("correct_password"));
        assertTrue(casinoPage.getIncorrectLoginMessageElement().isDisplayed());
        casinoPage.clickIfElementIsClickable(casinoPage.getIncorrectLoginMessageOkButtonElement());
        casinoPage.clearField(casinoPage.getLoginFieldHeaderElement());
        casinoPage.clearField(casinoPage.getPasswordFieldHeaderElement());

    }

    @Test
    //
    public void incorectPasswordTest() {

        casinoPage.login(exampleBundle.getString("correct_login"), exampleBundle.getString("incorrect_password"));
        assertTrue(casinoPage.getIncorrectLoginMessageElement().isDisplayed());
        casinoPage.clickIfElementIsClickable(casinoPage.getIncorrectLoginMessageOkButtonElement());
        casinoPage.clearField(casinoPage.getLoginFieldHeaderElement());
        casinoPage.clearField(casinoPage.getPasswordFieldHeaderElement());
    }

    @Test
    //
    public void incorectLoginAndPasswordTest() {

        casinoPage.login(exampleBundle.getString("incorrect_login"), exampleBundle.getString("incorrect_password"));
        assertTrue(casinoPage.getIncorrectLoginMessageElement().isDisplayed());
        casinoPage.clickIfElementIsClickable(casinoPage.getIncorrectLoginMessageOkButtonElement());
        casinoPage.clearField(casinoPage.getLoginFieldHeaderElement());
        casinoPage.clearField(casinoPage.getPasswordFieldHeaderElement());
    }

    @Test
    //
    public void blankLoginAndPasswordTest() {

        casinoPage.login("", "");
        assertTrue(casinoPage.getIncorrectLoginMessageElement().isDisplayed());
        casinoPage.clickIfElementIsClickable(casinoPage.getIncorrectLoginMessageOkButtonElement());
        casinoPage.clearField(casinoPage.getLoginFieldHeaderElement());
        casinoPage.clearField(casinoPage.getPasswordFieldHeaderElement());
    }

    @Test
    //
    public void blankLoginTest() {

        casinoPage.login("", exampleBundle.getString("correct_password"));
        assertTrue(casinoPage.getIncorrectLoginMessageElement().isDisplayed());
        casinoPage.clickIfElementIsClickable(casinoPage.getIncorrectLoginMessageOkButtonElement());
        casinoPage.clearField(casinoPage.getLoginFieldHeaderElement());
        casinoPage.clearField(casinoPage.getPasswordFieldHeaderElement());
    }

    @Test
    //
    public void blankPasswordTest() {

        casinoPage.login(exampleBundle.getString("correct_login"), "");
        assertTrue(casinoPage.getIncorrectLoginMessageElement().isDisplayed());
        casinoPage.clickIfElementIsClickable(casinoPage.getIncorrectLoginMessageOkButtonElement());
        casinoPage.clearField(casinoPage.getLoginFieldHeaderElement());
        casinoPage.clearField(casinoPage.getPasswordFieldHeaderElement());
    }



}



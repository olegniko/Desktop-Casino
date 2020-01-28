package web.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundleServer;
import static org.testng.Assert.assertTrue;


public class LoginHeaderLogged {

    CasinoPage casinoPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        casinoPage = new CasinoPage();
        casinoPage.correctLogin(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        casinoPage.close();
    }


    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void myAccountButtonEnabledTest() {
        assertTrue(casinoPage.getMyAccountButtonHeaderElement().isDisplayed());
        assertTrue(casinoPage.getMyAccountButtonHeaderElement().isEnabled());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void depositButtonEnabledTest() {
        assertTrue(casinoPage.getDepositButtonHeaderElement().isDisplayed());
        assertTrue(casinoPage.getDepositButtonHeaderElement().isEnabled());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void logoutButtonEnabledTest() {
        assertTrue(casinoPage.getLogoutButtonHeaderElement().isDisplayed());
        assertTrue(casinoPage.getLogoutButtonHeaderElement().isEnabled());
    }
}



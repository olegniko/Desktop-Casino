package web.uk.test6.maratest.info;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;
import pages.CasinoPage;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static pages.BasePage.exampleBundle;

public class HeaderAndFooter {

    CasinoPage casinoPage;
    @BeforeClass

    public  void setUp()  {


        casinoPage = new CasinoPage();


    }


    @AfterClass
    public void tearDown()  {
        casinoPage.close();
    }

    @Test

    public void translationSportInHeader()  {

        casinoPage.waitIfElementIsClickable(casinoPage.getSearchCasino());
        Assert.assertNotNull(casinoPage.getSportLabelHeaderText());
        assertTrue(casinoPage.getSportLabelHeaderElement().isDisplayed());
        assertEquals(casinoPage.getSportLabelHeaderText(),exampleBundle.getString("sport_label_header"));

    }

    @Test

    public void translationLiveInHeader() {

        assertTrue(casinoPage.getLiveLabelHeaderElement().isDisplayed());
        assertEquals(casinoPage.getLiveLabelHeaderText(),exampleBundle.getString("live_label_header"));

    }

    @Test

    public void translationTotoInHeader() {

        assertTrue(casinoPage.getTotoLabelHeaderElement().isDisplayed());
        assertEquals(casinoPage.getTotoLabelHeaderText(),exampleBundle.getString("toto_label_header"));

    }

    @Test

    public void translationCasinoInHeader() {

        assertTrue(casinoPage.getCasinoLabelHeaderElement().isDisplayed());
        assertEquals(casinoPage.getCasinoLabelHeaderText(),exampleBundle.getString("casino_label_header"));

    }

    @Test

    public void translationLiveCasinoInHeader() {

        assertTrue(casinoPage.getLiveCasinoLabelHeaderElement().isDisplayed());
        assertEquals(casinoPage.getLiveCasinoLabelHeaderText(),exampleBundle.getString("live_casino_label_header"));

    }

    @Test

    public void translationConstructorCasinoInHeader() {

        assertTrue(casinoPage.getConstructorLabelHeaderElement().isDisplayed());
        assertEquals(casinoPage.getConstructorLabelHeaderText(),exampleBundle.getString("constructor_label_header"));

    }

    @Test

    public void translationBingoInHeader() {

        assertTrue(casinoPage.getBingoLabelHeaderElement().isDisplayed());
        assertEquals(casinoPage.getBingoLabelHeaderText(),exampleBundle.getString("bingo_label_header"));

    }

    @Test

    public void translationFinancialInHeader() {

        assertTrue(casinoPage.getFinancialsLabelHeaderElement().isDisplayed());
        assertEquals(casinoPage.getFinancialsLabelHeaderText(),exampleBundle.getString("financial_label_header"));

    }

    @Test

    public void translationLostPassword() {

        assertTrue(casinoPage.getLostPasswordElement().isDisplayed());
        assertEquals(casinoPage.getLostPasswordText(),exampleBundle.getString("lost_password"));

    }

    @Test

    public void translationHelp() {

        assertTrue(casinoPage.getHelpElement().isDisplayed());
        assertEquals(casinoPage.getHelpText(),exampleBundle.getString("help"));

    }

    @Test

    public void translationLanguage() {

        assertTrue(casinoPage.getLanguageElement().isDisplayed());
        assertEquals(casinoPage.getLanguageText(),exampleBundle.getString("language"));

    }

    @Test

    public void translationResults() {

        assertTrue(casinoPage.getResultsElement().isDisplayed());
        assertEquals(casinoPage.getResultsText(),exampleBundle.getString("results"));

    }

    @Test

    public void translationSettings() {

        assertTrue(casinoPage.getSettingsElement().isDisplayed());
        assertEquals(casinoPage.getSettingsText(),exampleBundle.getString("settings"));

    }

    @Test

    public void isMobilePresent() {

        assertTrue(casinoPage.isMobileIconPresent());

    }


    @Test

    public void isMarathonPresent() {

        assertTrue(casinoPage.isMarathonIconPresent());

    }

    @Test

    public void translationAboutUs() {

        assertTrue(casinoPage.getAboutUsElement().isDisplayed());
        assertEquals(casinoPage.getAboutUsText(), exampleBundle.getString("about_us"));

    }

    @Test

    public void translationPrivacyPolicy() {

        assertTrue(casinoPage.getPrivacyPolicyElement().isDisplayed());
        assertEquals(casinoPage.getPrivacyPolicyText(), exampleBundle.getString("privacy_policy"));

    }

    @Test

    public void translationResponsibleGambling() {

        assertTrue(casinoPage.getResponsibleGamblingElement().isDisplayed());
        assertEquals(casinoPage.getResponsibleGamblingText(), exampleBundle.getString("responsible_gambling"));

    }

    @Test

    public void translationTermsAndConditions() {

        assertTrue(casinoPage.getTermsAndConditionsElement().isDisplayed());
        assertEquals(casinoPage.getTermsAndConditionsText(), exampleBundle.getString("terms_and_conditions"));

    }

    @Test

    public void translationContactUs() {

        assertTrue(casinoPage.getContactUsElement().isDisplayed());
        assertEquals(casinoPage.getContactUsText(), exampleBundle.getString("contact_us"));

    }

    @Test

    public void translationPayments() {

        assertTrue(casinoPage.getPaymentsElement().isDisplayed());
        assertEquals(casinoPage.getPaymentsText(), exampleBundle.getString("payments"));

    }

    @Test

    public void translationMobileSite() {

        assertTrue(casinoPage.getMobileSiteElement().isDisplayed());
        assertEquals(casinoPage.getMobileSiteText(), exampleBundle.getString("mobile_site"));

    }


}



package web.uk.test6.maratest.info;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class HeaderAndFooterTranslation extends BaseTestForCasinoUnregistred {


    @Test(priority=20)
    //наличие и перевод Sport in Header
    public void translationSportInHeader() {

        casinoPage.waitIfElementIsClickable(casinoPage.getSearchCasino());
        Assert.assertNotNull(casinoPage.getSportLabelHeader());
        assertTrue(casinoPage.getSportLabelHeaderElement().isDisplayed());
        assertEquals(casinoPage.getSportLabelHeader(),exampleBundle.getString("sport_label_header"));

    }

    @Test(priority=21)
    //наличие и перевод Live in Header
    public void translationLiveInHeader() {

        assertTrue(casinoPage.getLiveLabelHeaderElement().isDisplayed());
        assertEquals(casinoPage.getLiveLabelHeader(),exampleBundle.getString("live_label_header"));

    }

    @Test(priority=22)
    //наличие и перевод Toto in Header
    public void translationTotoInHeader() {

        assertTrue(casinoPage.getTotoLabelHeaderElement().isDisplayed());
        assertEquals(casinoPage.getTotoLabelHeader(),exampleBundle.getString("toto_label_header"));

    }

    @Test(priority=23)
    //наличие и перевод Casino in Header
    public void translationCasinoInHeader() {

        assertTrue(casinoPage.getCasinoLabelHeaderElement().isDisplayed());
        assertEquals(casinoPage.getCasinoLabelHeader(),exampleBundle.getString("casino_label_header"));

    }

    @Test(priority=24)
    //наличие и перевод Live Casino in Header
    public void translationLiveCasinoInHeader() {

        assertTrue(casinoPage.getLiveCasinoLabelHeaderElement().isDisplayed());
        assertEquals(casinoPage.getLiveCasinoLabelHeader(),exampleBundle.getString("live_casino_label_header"));

    }

    @Test(priority=25)
    //наличие и перевод Constructor in Header
    public void translationConstructorCasinoInHeader() {

        assertTrue(casinoPage.getConstructorLabelHeaderElement().isDisplayed());
        assertEquals(casinoPage.getConstructorLabelHeader(),exampleBundle.getString("constructor_label_header"));

    }

    @Test(priority=26)
    //наличие и перевод Bingo in Header
    public void translationBingoInHeader() {

        assertTrue(casinoPage.getBingoLabelHeaderElement().isDisplayed());
        assertEquals(casinoPage.getBingoLabelHeader(),exampleBundle.getString("bingo_label_header"));

    }

    @Test(priority=27)
    //наличие и перевод Financials in Header
    public void translationFinancialInHeader() {

        assertTrue(casinoPage.getFinancialsLabelHeaderElement().isDisplayed());
        assertEquals(casinoPage.getFinancialsLabelHeader(),exampleBundle.getString("financial_label_header"));

    }

    @Test(priority=28)
    //наличие и перевод Lost Password in Header
    public void translationLostPassword() {

        assertTrue(casinoPage.getLostPasswordElement().isDisplayed());
        assertEquals(casinoPage.getLostPassword(),exampleBundle.getString("lost_password"));

    }

    @Test(priority=29)
    //наличие и перевод Help in Header
    public void translationHelp() {

        assertTrue(casinoPage.getHelpElement().isDisplayed());
        assertEquals(casinoPage.getHelp(),exampleBundle.getString("help"));

    }

    @Test(priority=30)
    //наличие и перевод Language in Header
    public void translationLanguage() {

        assertTrue(casinoPage.getLanguageElement().isDisplayed());
        assertEquals(casinoPage.getLanguage(),exampleBundle.getString("language"));

    }

    @Test(priority=31)
    //наличие и перевод Results&Statistic in Header
    public void translationResults() {

        assertTrue(casinoPage.getResultsElement().isDisplayed());
        assertEquals(casinoPage.getResults(),exampleBundle.getString("results"));

    }

    @Test(priority=32)
    //наличие и перевод Settings in Header
    public void translationSettings() {

        assertTrue(casinoPage.getSettingsElement().isDisplayed());
        assertEquals(casinoPage.getSettings(),exampleBundle.getString("settings"));

    }

    @Test(priority=33)
    //наличие Mobile in HeaderAndFooterTranslation
    public void isMobilePresent() {

        assertTrue(casinoPage.isMobileIconPresent());

    }


    @Test(priority=34)
    //наличие Marathon in Header
    public void isMarathonPresent() {

        assertTrue(casinoPage.isMarathonIconPresent());

    }

    @Test(priority=35)
    //наличие и перевод AboutUs in Footer
    public void translationAboutUs() {

        assertTrue(casinoPage.getAboutUsElement().isDisplayed());
        assertEquals(casinoPage.getAboutUs(), exampleBundle.getString("about_us"));

    }

    @Test(priority=36)
    //наличие и перевод PrivacyPolicy in Footer
    public void translationPrivacyPolicy() {

        assertTrue(casinoPage.getPrivacyPolicyElement().isDisplayed());
        assertEquals(casinoPage.getPrivacyPolicy(), exampleBundle.getString("privacy_policy"));

    }

    @Test(priority=37)
    //наличие и перевод  Responsible Gaming in Footer
    public void translationResponsibleGambling() {

        assertTrue(casinoPage.getResponsibleGamblingElement().isDisplayed());
        assertEquals(casinoPage.getResponsibleGambling(), exampleBundle.getString("responsible_gambling"));

    }

    @Test(priority=38)
    //наличие  перевод Terms and Conditions in Footer
    public void translationTermsAndConditions() {

        assertTrue(casinoPage.getTermsAndConditionsElement().isDisplayed());
        assertEquals(casinoPage.getTermsAndConditions(), exampleBundle.getString("terms_and_conditions"));

    }

    @Test(priority=39)
    //наличие и перевод Contact Us in Footer
    public void translationContactUs() {

        assertTrue(casinoPage.getContactUsElement().isDisplayed());
        assertEquals(casinoPage.getContactUs(), exampleBundle.getString("contact_us"));

    }

    @Test(priority=40)
    //наличие  и перевод Payments in Footer
    public void translationPayments() {

        assertTrue(casinoPage.getPaymentsElement().isDisplayed());
        assertEquals(casinoPage.getPayments(), exampleBundle.getString("payments"));

    }

    @Test(priority=41)
    //наличие и перевод Mobile Site in Footer
    public void translationMobileSite() {

        assertTrue(casinoPage.getMobileSiteElement().isDisplayed());
        assertEquals(casinoPage.getMobileSite(), exampleBundle.getString("mobile_site"));

    }


}



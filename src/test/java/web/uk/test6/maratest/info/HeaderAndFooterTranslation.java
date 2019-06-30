package web.uk.test6.maratest.info;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class HeaderAndFooterTranslation extends BaseTestForCasinoUnregistred {


    @Test(priority=20)
    //наличие Sport in HeaderAndFooterTranslation
    public void translationSportInHeader() {

        casinoPage.waitIfElementIsClickable(casinoPage.getSearchCasino());
        assertEquals(casinoPage.getSportLabelHeader(),exampleBundle.getString("sport_label_header"));

    }

    @Test(priority=21)
    //наличие Live in HeaderAndFooterTranslation
    public void translationLiveInHeader() {

        assertEquals(casinoPage.getLive_label_header(),exampleBundle.getString("live_label_header"));

    }

    @Test(priority=22)
    //наличие Toto in HeaderAndFooterTranslation
    public void translationTotoInHeader() {

        assertEquals(casinoPage.getTotoLabelHeader(),exampleBundle.getString("toto_label_header"));

    }

    @Test(priority=23)
    //наличие Casino in HeaderAndFooterTranslation
    public void translationCasinoInHeader() {

        assertEquals(casinoPage.getCasinoLabelHeader(),exampleBundle.getString("casino_label_header"));

    }

    @Test(priority=24)
    //наличие Live Casino in HeaderAndFooterTranslation
    public void translationLiveCasinoInHeader() {

        assertEquals(casinoPage.getLiveCasinoLabelHeader(),exampleBundle.getString("live_casino_label_header"));

    }

    @Test(priority=25)
    //наличие Constructor in HeaderAndFooterTranslation
    public void translationConstructorCasinoInHeader() {

        assertEquals(casinoPage.getConstructorLabelHeader(),exampleBundle.getString("constructor_label_header"));

    }

    @Test(priority=26)
    //наличие Bingo in HeaderAndFooterTranslation
    public void translationBingoInHeader() {

        assertEquals(casinoPage.getBingoLabelHeader(),exampleBundle.getString("bingo_label_header"));

    }

    @Test(priority=27)
    //наличие Financials in HeaderAndFooterTranslation
    public void translationFinancialInHeader() {

        assertEquals(casinoPage.getFinancialsLabelHeader(),exampleBundle.getString("financial_label_header"));

    }

    @Test(priority=28)
    //наличие Lost Password in HeaderAndFooterTranslation
    public void translationLostPassword() {

        assertEquals(casinoPage.getLostPassword(),exampleBundle.getString("lost_password"));

    }

    @Test(priority=29)
    //наличие Help in HeaderAndFooterTranslation
    public void translationHelp() {

        assertEquals(casinoPage.getHelp(),exampleBundle.getString("help"));

    }

    @Test(priority=30)
    //наличие Language in HeaderAndFooterTranslation
    public void translationLanguage() {

        assertEquals(casinoPage.getLanguage(),exampleBundle.getString("language"));

    }

    @Test(priority=31)
    //наличие Results&Statistic in HeaderAndFooterTranslation
    public void translationResults() {

        assertEquals(casinoPage.getResults(),exampleBundle.getString("results"));

    }

    @Test(priority=32)
    //наличие Settings in HeaderAndFooterTranslation
    public void translationSettings() {

        assertEquals(casinoPage.getSettings(),exampleBundle.getString("settings"));

    }

    @Test(priority=33)
    //наличие Mobile in HeaderAndFooterTranslation
    public void isMobilePresent() {

        Assert.assertTrue(casinoPage.isMobileIconPresent());

    }


    @Test(priority=34)
    //наличие Maraathon in HeaderAndFooterTranslation
    public void isMarathonPresent() {

        Assert.assertTrue(casinoPage.isMarathonIconPresent());

    }

    @Test(priority=35)
    //наличие AboutUs in Footer
    public void translationAboutUs() {


        assertEquals(casinoPage.getAboutUs(), exampleBundle.getString("about_us"));

    }

    @Test(priority=36)
    //наличие PrivacyPolicy in Footer
    public void translationPrivacyPolicy() {

        casinoPage.waitIfElementIsClickable(casinoPage.getPrivacyPolicyElement());


        assertEquals(casinoPage.getPrivacyPolicy(), exampleBundle.getString("privacy_policy"));

    }

    @Test(priority=37)
    //наличие Responsible Gaming in Footer
    public void translationResponsibleGambling() {

        casinoPage.waitIfElementIsClickable(casinoPage.getResponsibleGamblingElement());

        assertEquals(casinoPage.getResponsibleGambling(), exampleBundle.getString("responsible_gambling"));

    }

    @Test(priority=38)
    //наличие Terms and Conditions in Footer
    public void translationTermsAndConditions() {

        casinoPage.waitIfElementIsClickable(casinoPage.getTermsAndConditionsElement());

        assertEquals(casinoPage.getTermsAndConditions(), exampleBundle.getString("terms_and_conditions"));

    }

    @Test(priority=39)
    //наличие Contact Us in Footer
    public void translationContactUs() {

        casinoPage.waitIfElementIsClickable(casinoPage.getContactUsElement());

        assertEquals(casinoPage.getContactUs(), exampleBundle.getString("contact_us"));

    }

    @Test(priority=40)
    //наличие Payments in Footer
    public void translationPayments() {

        assertEquals(casinoPage.getPayments(), exampleBundle.getString("payments"));

    }

    @Test(priority=41)
    //наличие Mobile Site in Footer
    public void translationMobileSite() {

        assertEquals(casinoPage.getMobileSite(), exampleBundle.getString("mobile_site"));

    }


}



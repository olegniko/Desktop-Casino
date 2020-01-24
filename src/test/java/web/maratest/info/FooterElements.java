package web.maratest.info;


import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class FooterElements {

    CasinoPage casinoPage;

    @BeforeClass

    public void setUp() throws Exception {


        casinoPage = new CasinoPage();


    }

    @AfterClass
    public void tearDown() {
        casinoPage.close();
    }

    @Test
    public void aboutUsEnabledTest() {
        assertTrue(casinoPage.getAboutUsFooterElement().isDisplayed());
        assertTrue(casinoPage.getAboutUsFooterElement().isEnabled());
        assertEquals(casinoPage.getTextAboutUsFooterElement(), exampleBundle.getString("about_us_footer"));
    }

    @Test
    public void privacyPolicyEnabledTest() {
        assertTrue(casinoPage.getPrivacyPolicyFooterElement().isDisplayed());
        assertTrue(casinoPage.getPrivacyPolicyFooterElement().isEnabled());
        assertEquals(casinoPage.getTextPrivacyPolicyFooterElement(), exampleBundle.getString("privacy_policy_footer"));
    }

    @Test
    public void responsibleGamblingEnabledTest() {
        assertTrue(casinoPage.getResponsibleGamingFooterElement().isDisplayed());
        assertTrue(casinoPage.getResponsibleGamingFooterElement().isEnabled());
        assertEquals(casinoPage.getTextResponsibleGamingFooterElement(), exampleBundle.getString("responsible_gambling_footer"));
    }

    @Test
    public void termsAndConditionsEnabledTest() {
        assertTrue(casinoPage.getTermsAndConditionsFooterElement().isDisplayed());
        assertTrue(casinoPage.getTermsAndConditionsFooterElement().isEnabled());
        assertEquals(casinoPage.getTextTermsAndConditionsFooterElement(), exampleBundle.getString("terms_and_conditions_footer"));
    }

    @Test
    public void contactUsEnabledTest() {
        assertTrue(casinoPage.getContactUsFooterElement().isDisplayed());
        assertTrue(casinoPage.getContactUsFooterElement().isEnabled());
        assertEquals(casinoPage.getTextContactUsFooterElement(), exampleBundle.getString("contact_us_footer"));
    }

    @Test
    public void paymentsEnabledTest() {
        assertTrue(casinoPage.getPaymentsFooterElement().isDisplayed());
        assertTrue(casinoPage.getPaymentsFooterElement().isEnabled());
        assertEquals(casinoPage.getTextPaymentsFooterElement(), exampleBundle.getString("payments_footer"));
    }

    @Test
    public void mobileSiteEnabledTest() {
        assertTrue(casinoPage.getMobileSiteFooterElement().isDisplayed());
        assertTrue(casinoPage.getMobileSiteFooterElement().isEnabled());
        assertEquals(casinoPage.getTextMobileSiteFooterElement(), exampleBundle.getString("mobile_site_footer"));
    }

    @Test
    //
    public void blogEnabledTest() {

        assertTrue(casinoPage.getBlogFooterElement().isDisplayed());
        assertTrue(casinoPage.getBlogFooterElement().isEnabled());
        assertEquals(casinoPage.getTextBlogFooterElement(), exampleBundle.getString("blog_footer"));
    }

    @Test
    public void affiliatesEnabledTest() {
        assertTrue(casinoPage.getAffiliatesFooterElement().isDisplayed());
        assertTrue(casinoPage.getAffiliatesFooterElement().isEnabled());
        assertEquals(casinoPage.getTextAffiliatesFooterElement(), exampleBundle.getString("affiliates_footer"));
    }

    @Test
    public void ourParntesEnabledTest() {
        assertTrue(casinoPage.getOurParntersFooterElement().isDisplayed());
        assertTrue(casinoPage.getOurParntersFooterElement().isEnabled());
        assertEquals(casinoPage.getTextOurParntersFooterElement(), exampleBundle.getString("our_partners_footer"));
    }

    @Test
    public void partnershipHistoryEnabledTest() {
        assertTrue(casinoPage.getPartnreshipHistoryFooterElement().isDisplayed());
        assertTrue(casinoPage.getPartnreshipHistoryFooterElement().isEnabled());
        assertEquals(casinoPage.getTextPartnreshipHistoryFooterElement(), exampleBundle.getString("partnership_history_footer"));
    }

    @Test
    public void manCityEnabledTest() {
        assertTrue(casinoPage.getManCityElement().isDisplayed());
        assertTrue(casinoPage.getManCityElement().isEnabled());
    }

    @Test
    public void sevillaEnabledTest() {
        assertTrue(casinoPage.getSevillaElement().isDisplayed());
        assertTrue(casinoPage.getSevillaElement().isEnabled());
    }

    @Test
    public void gironaEnabledTest() {
        assertTrue(casinoPage.getGironaElement().isDisplayed());
        assertTrue(casinoPage.getGironaElement().isEnabled());
    }

    @Test
    public void dinamoEnabledTest() {
        assertTrue(casinoPage.getDinamoElement().isDisplayed());
        assertTrue(casinoPage.getDinamoElement().isEnabled());
    }

    @Test
    public void karpatyEnabledTest() {
        assertTrue(casinoPage.getKarpatyElement().isDisplayed());
        assertTrue(casinoPage.getKarpatyElement().isEnabled());
    }

    @Test
    public void zaragozaEnabledTest() {
        assertTrue(casinoPage.getZaragozaElement().isDisplayed());
        assertTrue(casinoPage.getZaragozaElement().isEnabled());
    }

    @Test
    public void visaIconEnabledTest() {
        assertTrue(casinoPage.getVisaIconElement().isDisplayed());
        assertTrue(casinoPage.getVisaIconElement().isEnabled());
    }

    @Test
    public void mastercardIconEnabledTest() {
        assertTrue(casinoPage.getMastercardIconElement().isDisplayed());
        assertTrue(casinoPage.getMastercardIconElement().isEnabled());
    }

    @Test
    public void maestroIconEnabledTest() {
        assertTrue(casinoPage.getMaestroIconElement().isDisplayed());
        assertTrue(casinoPage.getMaestroIconElement().isEnabled());
    }

    @Test
    public void bankTransferIconEnabledTest() {
        assertTrue(casinoPage.getBankTransferIconElement().isDisplayed());
        assertTrue(casinoPage.getBankTransferIconElement().isEnabled());
    }

    @Test
    public void skrillIconEnabledTest() {
        assertTrue(casinoPage.getSkrillIconElement().isDisplayed());
        assertTrue(casinoPage.getSkrillIconElement().isEnabled());
    }

    @Test
    public void netellerIconEnabledTest() {
        assertTrue(casinoPage.getNetellerIconElement().isDisplayed());
        assertTrue(casinoPage.getNetellerIconElement().isEnabled());
    }

    @Test
    public void paySafeCardIconEnabledTest() {
        assertTrue(casinoPage.getPaySafeCardIconElement().isDisplayed());
        assertTrue(casinoPage.getPaySafeCardIconElement().isEnabled());
    }

    @Test
    public void trustlyIconEnabledTest() {
        assertTrue(casinoPage.getTrustlyIconElement().isDisplayed());
        assertTrue(casinoPage.getTrustlyIconElement().isEnabled());
    }

    @Test
    public void ecoPayzIconEnabledTest() {
        assertTrue(casinoPage.getEcoPayzIconElement().isDisplayed());
        assertTrue(casinoPage.getEcoPayzIconElement().isEnabled());
    }

    @Test
    public void rgtDonorIconEnabledTest() {
        assertTrue(casinoPage.getRgtDonorIconElement().isDisplayed());
        assertTrue(casinoPage.getRgtDonorIconElement().isEnabled());
    }

    @Test
    public void gamstopIconEnabledTest() {
        assertTrue(casinoPage.getGamstopIconElement().isDisplayed());
        assertTrue(casinoPage.getGamstopIconElement().isEnabled());
    }

    @Test
    public void gamecareIconEnabledTest() {
        assertTrue(casinoPage.getGamecareIconElement().isDisplayed());
        assertTrue(casinoPage.getGamecareIconElement().isEnabled());
    }

    @Test
    public void alderneyIconEnabledTest() {
        assertTrue(casinoPage.getAlderneyIconElement().isDisplayed());
        assertTrue(casinoPage.getAlderneyIconElement().isEnabled());
    }

    @Test
    public void gamblingCommissionIconEnabledTest() {
        assertTrue(casinoPage.getGamblingCommissionIconElement().isDisplayed());
        assertTrue(casinoPage.getGamblingCommissionIconElement().isEnabled());
    }

    @Test
    public void ibasIconEnabledTest() {
        assertTrue(casinoPage.getIbasIconElement().isDisplayed());
        assertTrue(casinoPage.getIbasIconElement().isEnabled());
    }

    @Test
    public void facebookIconEnabledTest() {
        assertTrue(casinoPage.getFacebookIconElement().isDisplayed());
        assertTrue(casinoPage.getFacebookIconElement().isEnabled());
    }

    @Test
    public void twitterIconEnabledTest() {
        assertTrue(casinoPage.getTwitterIconElement().isDisplayed());
        assertTrue(casinoPage.getTwitterIconElement().isEnabled());
    }

    @Test
    public void gamblingCommissionLinkEnabledTest() {
        assertTrue(casinoPage.getGamblingCommissionLinkElement().isDisplayed());
        assertTrue(casinoPage.getGamblingCommissionLinkElement().isEnabled());
    }

    @Test
    public void gamblingControlLinkEnabledTest() {
        assertTrue(casinoPage.getGamblingControlLinkElement().isDisplayed());
        assertTrue(casinoPage.getGamblingControlLinkElement().isEnabled());
    }

    @Test
    public void begamblewareLinkEnabledTest() {
        assertTrue(casinoPage.getBegamblewareLinkElement().isDisplayed());
        assertTrue(casinoPage.getBegamblewareLinkElement().isEnabled());
    }

    @Test
    public void shutterstockLinkEnabledTest() {
        assertTrue(casinoPage.getShutterstockLinkElement().isDisplayed());
        assertTrue(casinoPage.getShutterstockLinkElement().isEnabled());
    }

}

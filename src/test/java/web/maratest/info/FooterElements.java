package web.maratest.info;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class FooterElements {

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
    public void aboutUsEnabledTest() {
        assertTrue(casinoPage.getAboutUsFooterElement().isDisplayed());
        assertTrue(casinoPage.getAboutUsFooterElement().isEnabled());
        assertEquals(casinoPage.getTextAboutUsFooterElement(), exampleBundle.getString("about_us_footer"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void privacyPolicyEnabledTest() {
        assertTrue(casinoPage.getPrivacyPolicyFooterElement().isDisplayed());
        assertTrue(casinoPage.getPrivacyPolicyFooterElement().isEnabled());
        assertEquals(casinoPage.getTextPrivacyPolicyFooterElement(), exampleBundle.getString("privacy_policy_footer"));
    }

    @Test(groups = {"DK1",  "ALD2"})
    public void responsibleGamblingEnabledTest() {
        assertTrue(casinoPage.getResponsibleGamingFooterElement().isDisplayed());
        assertTrue(casinoPage.getResponsibleGamingFooterElement().isEnabled());
        assertEquals(casinoPage.getTextResponsibleGamingFooterElement(), exampleBundle.getString("responsible_gambling_footer"));
    }

    @Test(groups = {"DK1", "ES1", "ALD2"})
    public void termsAndConditionsEnabledTest() {
        assertTrue(casinoPage.getTermsAndConditionsFooterElement().isDisplayed());
        assertTrue(casinoPage.getTermsAndConditionsFooterElement().isEnabled());
        assertEquals(casinoPage.getTextTermsAndConditionsFooterElement(), exampleBundle.getString("terms_and_conditions_footer"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void contactUsEnabledTest() {
        assertTrue(casinoPage.getContactUsFooterElement().isDisplayed());
        assertTrue(casinoPage.getContactUsFooterElement().isEnabled());
        assertEquals(casinoPage.getTextContactUsFooterElement(), exampleBundle.getString("contact_us_footer"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void paymentsEnabledTest() {
        assertTrue(casinoPage.getPaymentsFooterElement().isDisplayed());
        assertTrue(casinoPage.getPaymentsFooterElement().isEnabled());
        assertEquals(casinoPage.getTextPaymentsFooterElement(), exampleBundle.getString("payments_footer"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void mobileSiteEnabledTest() {
        assertTrue(casinoPage.getMobileSiteFooterElement().isDisplayed());
        assertTrue(casinoPage.getMobileSiteFooterElement().isEnabled());
        assertEquals(casinoPage.getTextMobileSiteFooterElement(), exampleBundle.getString("mobile_site_footer"));
    }

    @Test(groups = {"DK1", "ES1", "ALD2"})
    public void blogEnabledTest() {
        assertTrue(casinoPage.getBlogFooterElement().isDisplayed());
        assertTrue(casinoPage.getBlogFooterElement().isEnabled());
        assertEquals(casinoPage.getTextBlogFooterElement(), exampleBundle.getString("blog_footer"));
    }

    @Test(groups = {"DK1", "ES1", "ALD2"})
    public void affiliatesEnabledTest() {
        assertTrue(casinoPage.getAffiliatesALDFooterElement().isDisplayed());
        assertTrue(casinoPage.getAffiliatesALDFooterElement().isEnabled());
        assertEquals(casinoPage.getTextAffiliatesALDFooterElement(), exampleBundle.getString("affiliates_ald_footer"));
    }

    @Test(groups = {"CUR2"})
    public void affiliatesCUREnabledTest() {
        assertTrue(casinoPage.getAffiliatesCURFooterElement().isDisplayed());
        assertTrue(casinoPage.getAffiliatesCURFooterElement().isEnabled());
        assertEquals(casinoPage.getTextAffiliatesCURFooterElement(), exampleBundle.getString("affiliates_cur_footer"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void ourParntesEnabledTest() {
        assertTrue(casinoPage.getOurParntersFooterElement().isDisplayed());
        assertTrue(casinoPage.getOurParntersFooterElement().isEnabled());
        assertEquals(casinoPage.getTextOurParntersFooterElement(), exampleBundle.getString("our_partners_footer"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void partnershipHistoryEnabledTest() {
        assertTrue(casinoPage.getPartnreshipHistoryFooterElement().isDisplayed());
        assertTrue(casinoPage.getPartnreshipHistoryFooterElement().isEnabled());
        assertEquals(casinoPage.getTextPartnreshipHistoryFooterElement(), exampleBundle.getString("partnership_history_footer"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void manCityEnabledTest() {
        assertTrue(casinoPage.getManCityElement().isDisplayed());
        assertTrue(casinoPage.getManCityElement().isEnabled());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void sevillaEnabledTest() {
        assertTrue(casinoPage.getSevillaElement().isDisplayed());
        assertTrue(casinoPage.getSevillaElement().isEnabled());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void gironaEnabledTest() {
        assertTrue(casinoPage.getGironaElement().isDisplayed());
        assertTrue(casinoPage.getGironaElement().isEnabled());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void dinamoEnabledTest() {
        assertTrue(casinoPage.getDinamoElement().isDisplayed());
        assertTrue(casinoPage.getDinamoElement().isEnabled());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void karpatyEnabledTest() {
        assertTrue(casinoPage.getKarpatyElement().isDisplayed());
        assertTrue(casinoPage.getKarpatyElement().isEnabled());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void zaragozaEnabledTest() {
        assertTrue(casinoPage.getZaragozaElement().isDisplayed());
        assertTrue(casinoPage.getZaragozaElement().isEnabled());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void visaIconEnabledTest() {
        assertTrue(casinoPage.getVisaIconElement().isDisplayed());
        assertTrue(casinoPage.getVisaIconElement().isEnabled());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void mastercardIconEnabledTest() {
        assertTrue(casinoPage.getMastercardIconElement().isDisplayed());
        assertTrue(casinoPage.getMastercardIconElement().isEnabled());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void maestroIconEnabledTest() {
        assertTrue(casinoPage.getMaestroIconElement().isDisplayed());
        assertTrue(casinoPage.getMaestroIconElement().isEnabled());
    }

    @Test(groups = {"DK1",  "CUR2", "ALD2"})
    public void bankTransferIconEnabledTest() {
        assertTrue(casinoPage.getBankTransferIconElement().isDisplayed());
        assertTrue(casinoPage.getBankTransferIconElement().isEnabled());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void skrillIconEnabledTest() {
        assertTrue(casinoPage.getSkrillIconElement().isDisplayed());
        assertTrue(casinoPage.getSkrillIconElement().isEnabled());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void netellerIconEnabledTest() {
        assertTrue(casinoPage.getNetellerIconElement().isDisplayed());
        assertTrue(casinoPage.getNetellerIconElement().isEnabled());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void paySafeCardIconEnabledTest() {
        assertTrue(casinoPage.getPaySafeCardIconElement().isDisplayed());
        assertTrue(casinoPage.getPaySafeCardIconElement().isEnabled());
    }

    @Test(groups = {"DK1", "ES1",  "ALD2"})
    public void trustlyIconEnabledTest() {
        assertTrue(casinoPage.getTrustlyIconElement().isDisplayed());
        assertTrue(casinoPage.getTrustlyIconElement().isEnabled());
    }

    @Test(groups = {"DK1",  "CUR2", "ALD2"})
    public void ecoPayzIconEnabledTest() {
        assertTrue(casinoPage.getEcoPayzIconElement().isDisplayed());
        assertTrue(casinoPage.getEcoPayzIconElement().isEnabled());
    }

    @Test(groups = {"DK1",  "CUR2", "ALD2"})
    public void rgtDonorIconEnabledTest() {
        assertTrue(casinoPage.getRgtDonorIconElement().isDisplayed());
        assertTrue(casinoPage.getRgtDonorIconElement().isEnabled());
    }

    @Test(groups = {"DK1",  "ALD2"})
    public void gamstopIconEnabledTest() {
        assertTrue(casinoPage.getGamstopIconElement().isDisplayed());
        assertTrue(casinoPage.getGamstopIconElement().isEnabled());
    }

    @Test(groups = {"DK1", "ALD2"})
    public void gamecareIconEnabledTest() {
        assertTrue(casinoPage.getGamecareIconElement().isDisplayed());
        assertTrue(casinoPage.getGamecareIconElement().isEnabled());
    }

    @Test(groups = {"DK1",  "ALD2"})
    public void alderneyIconEnabledTest() {
        assertTrue(casinoPage.getAlderneyIconElement().isDisplayed());
        assertTrue(casinoPage.getAlderneyIconElement().isEnabled());
    }

    @Test(groups = {"DK1",  "ALD2"})
    public void gamblingCommissionIconEnabledTest() {
        assertTrue(casinoPage.getGamblingCommissionIconElement().isDisplayed());
        assertTrue(casinoPage.getGamblingCommissionIconElement().isEnabled());
    }

    @Test(groups = {"DK1", "ALD2"})
    public void ibasIconEnabledTest() {
        assertTrue(casinoPage.getIbasIconElement().isDisplayed());
        assertTrue(casinoPage.getIbasIconElement().isEnabled());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void facebookIconEnabledTest() {
        assertTrue(casinoPage.getFacebookIconElement().isDisplayed());
        assertTrue(casinoPage.getFacebookIconElement().isEnabled());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void twitterIconEnabledTest() {
        assertTrue(casinoPage.getTwitterIconElement().isDisplayed());
        assertTrue(casinoPage.getTwitterIconElement().isEnabled());
    }

    @Test(groups = {"DK1",  "ALD2"})
    public void gamblingCommissionLinkEnabledTest() {
        assertTrue(casinoPage.getGamblingCommissionLinkElement().isDisplayed());
        assertTrue(casinoPage.getGamblingCommissionLinkElement().isEnabled());
    }

    @Test(groups = {"DK1", "ALD2"})
    public void gamblingControlLinkEnabledTest() {
        assertTrue(casinoPage.getGamblingControlLinkElement().isDisplayed());
        assertTrue(casinoPage.getGamblingControlLinkElement().isEnabled());
    }

    @Test(groups = {"DK1","ALD2"})
    public void begamblewareLinkEnabledTest() {
        assertTrue(casinoPage.getBegamblewareLinkElement().isDisplayed());
        assertTrue(casinoPage.getBegamblewareLinkElement().isEnabled());
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void shutterstockLinkEnabledTest() {
        assertTrue(casinoPage.getShutterstockLinkElement().isDisplayed());
        assertTrue(casinoPage.getShutterstockLinkElement().isEnabled());
    }

}

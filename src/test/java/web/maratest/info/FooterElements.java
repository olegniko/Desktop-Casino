package web.maratest.info;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

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
    //
    public void aboutUsEnabledTest() {

        assertTrue(casinoPage.getAboutUsFooterElement().isDisplayed());
        assertTrue(casinoPage.getAboutUsFooterElement().isEnabled());

    }

    @Test
    //
    public void privacyPolicyEnabledTest() {

        assertTrue(casinoPage.getPrivacyPolicyFooterElement().isDisplayed());
        assertTrue(casinoPage.getPrivacyPolicyFooterElement().isEnabled());

    }

    @Test
    //
    public void responsibleGamblingEnabledTest() {

        assertTrue(casinoPage.getResponsibleGamingFooterElement().isDisplayed());
        assertTrue(casinoPage.getResponsibleGamingFooterElement().isEnabled());

    }
    @Test
    //
    public void termsAndConditionsEnabledTest() {

        assertTrue(casinoPage.getTermsAndConditionsFooterElement().isDisplayed());
        assertTrue(casinoPage.getTermsAndConditionsFooterElement().isEnabled());

    }
    @Test
    //
    public void contactUsEnabledTest() {

        assertTrue(casinoPage.getContactUsFooterElement().isDisplayed());
        assertTrue(casinoPage.getContactUsFooterElement().isEnabled());

    }
    @Test
    //
    public void paymentsEnabledTest() {

        assertTrue(casinoPage.getPaymentsFooterElement().isDisplayed());
        assertTrue(casinoPage.getPaymentsFooterElement().isEnabled());

    }
    @Test
    //
    public void mobileSiteEnabledTest() {

        assertTrue(casinoPage.getMobileSiteFooterElement().isDisplayed());
        assertTrue(casinoPage.getMobileSiteFooterElement().isEnabled());

    }
    @Test
    //
    public void blogEnabledTest() {

        assertTrue(casinoPage.getBlogFooterElement().isDisplayed());
        assertTrue(casinoPage.getBlogFooterElement().isEnabled());

    }

    @Test
    //
    public void affiliatesEnabledTest() {

        assertTrue(casinoPage.getAffiliatesFooterElement().isDisplayed());
        assertTrue(casinoPage.getAffiliatesFooterElement().isEnabled());

    }
    @Test
    //
    public void ourParntesEnabledTest() {

        assertTrue(casinoPage.getOurParntersFooterElement().isDisplayed());
        assertTrue(casinoPage.getOurParntersFooterElement().isEnabled());

    }

    @Test
    //
    public void partnershipHistoryEnabledTest() {

        assertTrue(casinoPage.getPartnreshipHistoryFooterElement().isDisplayed());
        assertTrue(casinoPage.getPartnreshipHistoryFooterElement().isEnabled());

    }
    @Test
    //
    public void manCityEnabledTest() {

        assertTrue(casinoPage.getManCityElement().isDisplayed());
        assertTrue(casinoPage.getManCityElement().isEnabled());

    }
    @Test
    //
    public void sevillaEnabledTest() {

        assertTrue(casinoPage.getSevillaElement().isDisplayed());
        assertTrue(casinoPage.getSevillaElement().isEnabled());

    }
    @Test
    //
    public void gironaEnabledTest() {

        assertTrue(casinoPage.getGironaElement().isDisplayed());
        assertTrue(casinoPage.getGironaElement().isEnabled());

    }
    @Test
    //
    public void dinamoEnabledTest() {

        assertTrue(casinoPage.getDinamoElement().isDisplayed());
        assertTrue(casinoPage.getDinamoElement().isEnabled());

    }

    @Test
    //
    public void karpatyEnabledTest() {

        assertTrue(casinoPage.getKarpatyElement().isDisplayed());
        assertTrue(casinoPage.getKarpatyElement().isEnabled());

    }
    @Test
    //
    public void zaragozaEnabledTest() {

        assertTrue(casinoPage.getZaragozaElement().isDisplayed());
        assertTrue(casinoPage.getZaragozaElement().isEnabled());

    }


}



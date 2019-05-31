package web.uk.test6.maratest.info;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class Footer extends BaseTest {


    @Test(groups = {"footerTestChrome", "footerTestOpera", "footerTestFirefox"})
    //наличие AboutUs in Footer
    public void translationAboutUs() {

        assertEquals(casinoPage.getAboutUs(), exampleBundle.getString("about_us"));

    }

    @Test(groups = {"footerTestChrome", "footerTestOpera", "footerTestFirefox"})
    //наличие PrivacyPolicy in Footer
    public void translationPrivacyPolicy() {

        assertEquals(casinoPage.getPrivacyPolicy(), exampleBundle.getString("privacy_policy"));

    }

    @Test(groups = {"footerTestChrome", "footerTestOpera", "footerTestFirefox"})
    //наличие Responsible Gaming in Footer
    public void translationResponsibleGambling() {

        assertEquals(casinoPage.getResponsibleGambling(), exampleBundle.getString("responsible_gambling"));

    }

    @Test(groups = {"footerTestChrome", "footerTestOpera", "footerTestFirefox"})
    //наличие Terms and Conditions in Footer
    public void translationTermsAndConditions() {

        assertEquals(casinoPage.getTermsAndConditions(), exampleBundle.getString("terms_and_conditions"));

    }

    @Test(groups = {"footerTestChrome", "footerTestOpera", "footerTestFirefox"})
    //наличие Contact Us in Footer
    public void translationContactUs() {

        assertEquals(casinoPage.getContactUs(), exampleBundle.getString("contact_us"));

    }

    @Test(groups = {"footerTestChrome", "footerTestOpera", "footerTestFirefox"})
    //наличие Payments in Footer
    public void translationPayments() {

        assertEquals(casinoPage.getPayments(), exampleBundle.getString("payments"));

    }

    @Test(groups = {"footerTestChrome", "footerTestOpera", "footerTestFirefox"})
    //наличие Mobile Site in Footer
    public void translationMobileSite() {

        assertEquals(casinoPage.getMobileSite(), exampleBundle.getString("mobile_site"));

    }



}
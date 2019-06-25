package web.uk.test6.maratest.info;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class Footer  extends BaseTestForCasinoUnregistred {


    @Test(priority=20)
    //наличие AboutUs in Footer
    public void translationAboutUs() {


        assertEquals(casinoPage.getAboutUs(), exampleBundle.getString("about_us"));

    }

    @Test(priority=21)
    //наличие PrivacyPolicy in Footer
    public void translationPrivacyPolicy() {

        casinoPage.waitIfElementIsClickable(casinoPage.getPrivacyPolicyElement());


        assertEquals(casinoPage.getPrivacyPolicy(), exampleBundle.getString("privacy_policy"));

    }

    @Test(priority=22)
    //наличие Responsible Gaming in Footer
    public void translationResponsibleGambling() {

        casinoPage.waitIfElementIsClickable(casinoPage.getResponsibleGamblingElement());

        assertEquals(casinoPage.getResponsibleGambling(), exampleBundle.getString("responsible_gambling"));

    }

    @Test(priority=23)
    //наличие Terms and Conditions in Footer
    public void translationTermsAndConditions() {

        casinoPage.waitIfElementIsClickable(casinoPage.getTermsAndConditionsElement());

        assertEquals(casinoPage.getTermsAndConditions(), exampleBundle.getString("terms_and_conditions"));

    }

    @Test(priority=24)
    //наличие Contact Us in Footer
    public void translationContactUs() {

        casinoPage.waitIfElementIsClickable(casinoPage.getContactUsElement());

        assertEquals(casinoPage.getContactUs(), exampleBundle.getString("contact_us"));

    }

    @Test(priority=25)
    //наличие Payments in Footer
    public void translationPayments() {

        assertEquals(casinoPage.getPayments(), exampleBundle.getString("payments"));

    }

    @Test(priority=26)
    //наличие Mobile Site in Footer
    public void translationMobileSite() {

        assertEquals(casinoPage.getMobileSite(), exampleBundle.getString("mobile_site"));

    }



}
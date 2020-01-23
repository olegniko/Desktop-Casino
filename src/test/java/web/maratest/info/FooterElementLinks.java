package web.maratest.info;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CasinoPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static helper.factory.Browser.exampleBundle;
import static helper.factory.Browser.exampleBundleServer;


public class FooterElementLinks {

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

    public void manCityLinkTest() throws InterruptedException {

        casinoPage.clickIfElementIsClickable(casinoPage.getManCityElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("man_city_url"));

    }

    @Test
    public void sevilyaLinkTest() throws InterruptedException {

        casinoPage.clickIfElementIsClickable(casinoPage.getSevillaElement());
        String url =casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("sevilya_url"));

    }

    @Test

    public void gironaLinkTest() throws InterruptedException {

        casinoPage.clickIfElementIsClickable(casinoPage.getGironaElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("girona_url"));

    }
    @Test

    public void dinamoLinkTest() throws InterruptedException {

        casinoPage.clickIfElementIsClickable(casinoPage.getDinamoElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url,exampleBundle.getString("dinamo_url"));

    }

    @Test

    public void karpatyLinkTest() throws InterruptedException {

        casinoPage.clickIfElementIsClickable(casinoPage.getKarpatyElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("karpaty_url"));

    }

    @Test

    public void zaragozaLinkTest() throws InterruptedException {

        casinoPage.clickIfElementIsClickable(casinoPage.getZaragozaElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("zaragoza_url"));

    }



}



package web.maratest.info;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static org.testng.Assert.assertEquals;


public class FooterElementLinks {

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
    public void manCityLinkTest() throws InterruptedException {
        casinoPage.clickIfElementIsClickable(casinoPage.getManCityElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("man_city_url"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void sevilyaLinkTest() throws InterruptedException {
        casinoPage.clickIfElementIsClickable(casinoPage.getSevillaElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("sevilya_url"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void gironaLinkTest() throws InterruptedException {
        casinoPage.clickIfElementIsClickable(casinoPage.getGironaElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("girona_url"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void dinamoLinkTest() throws InterruptedException {
        casinoPage.clickIfElementIsClickable(casinoPage.getDinamoElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("dinamo_url"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void karpatyLinkTest() throws InterruptedException {
        casinoPage.clickIfElementIsClickable(casinoPage.getKarpatyElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("karpaty_url"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void zaragozaLinkTest() throws InterruptedException {
        casinoPage.clickIfElementIsClickable(casinoPage.getZaragozaElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("zaragoza_url"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void gamstopLinkTest() throws InterruptedException {
        casinoPage.clickIfElementIsClickable(casinoPage.getGamstopIconElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("gamstop_url"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void gamecareLinkTest() throws InterruptedException {
        casinoPage.clickIfElementIsClickable(casinoPage.getGamecareIconElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("gamecare_url"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void alderneyLinkTest() throws InterruptedException {
        casinoPage.clickIfElementIsClickable(casinoPage.getAlderneyIconElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("alderney_url"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void gamblingComissionLinkTest() throws InterruptedException {
        casinoPage.clickIfElementIsClickable(casinoPage.getGamblingCommissionIconElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("gambling_commission_url"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void ibasLinkTest() throws InterruptedException {
        casinoPage.clickIfElementIsClickable(casinoPage.getIbasIconElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("ibas_url"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void facebookLinkTest() throws InterruptedException {
        casinoPage.clickIfElementIsClickable(casinoPage.getFacebookIconElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("facebook_url"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void twitterLinkTest() throws InterruptedException {
        casinoPage.clickIfElementIsClickable(casinoPage.getTwitterIconElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("twitter_url"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void gamblingComissionLinkLinkTest() throws InterruptedException {
        casinoPage.clickIfElementIsClickable(casinoPage.getGamblingCommissionLinkElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("gambling_commission_url"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void gamblingControlLinkLinkTest() throws InterruptedException {
        casinoPage.clickIfElementIsClickable(casinoPage.getGamblingControlLinkElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("alderney_url"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void begamblewareLinkLinkTest() throws InterruptedException {
        casinoPage.clickIfElementIsClickable(casinoPage.getBegamblewareLinkElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("begambleware_url"));
    }

    @Test(groups = {"DK1", "ES1", "CUR2", "ALD2"})
    public void shutterstockLinkLinkLinkTest() throws InterruptedException {
        casinoPage.clickIfElementIsClickable(casinoPage.getShutterstockLinkElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("shutterstockLink_url"));
    }
}


package web.uk.test6.maratest.info;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class Header extends BaseTestForCasinoUnregistred {


    @Test
    //наличие Sport in Header
    public void translationSportInHeader() {

        assertEquals(casinoPage.getSport_label_header(),exampleBundle.getString("sport_label_header"));

    }

    @Test
    //наличие Live in Header
    public void translationLiveInHeader() {

        assertEquals(casinoPage.getLive_label_header(),exampleBundle.getString("live_label_header"));

    }

    @Test
    //наличие Toto in Header
    public void translationTotoInHeader() {

        assertEquals(casinoPage.getToto_label_header(),exampleBundle.getString("toto_label_header"));

    }

    @Test
    //наличие Casino in Header
    public void translationCasinoInHeader() {

        assertEquals(casinoPage.getCasino_label_header(),exampleBundle.getString("casino_label_header"));

    }

    @Test
    //наличие Live Casino in Header
    public void translationLiveCasinoInHeader() {

        assertEquals(casinoPage.getLiveCasino_label_header(),exampleBundle.getString("live_casino_label_header"));

    }

    @Test
    //наличие Constructor in Header
    public void translationConstructorCasinoInHeader() {

        assertEquals(casinoPage.getConstructor_label_header(),exampleBundle.getString("constructor_label_header"));

    }

    @Test
    //наличие Bingo in Header
    public void translationBingoInHeader() {

        assertEquals(casinoPage.getBingo_label_header(),exampleBundle.getString("bingo_label_header"));

    }

    @Test
    //наличие Financials in Header
    public void translationFinancialInHeader() {

        assertEquals(casinoPage.getFinancials_label_header(),exampleBundle.getString("financial_label_header"));

    }

    @Test
    //наличие Lost Password in Header
    public void translationLostPassword() {

        assertEquals(casinoPage.getLost_password(),exampleBundle.getString("lost_password"));

    }

    @Test
    //наличие Help in Header
    public void translationHelp() {

        assertEquals(casinoPage.getHelp(),exampleBundle.getString("help"));

    }

    @Test
    //наличие Language in Header
    public void translationLanguage() {

        assertEquals(casinoPage.getLanguage(),exampleBundle.getString("language"));

    }

    @Test
    //наличие Results&Statistic in Header
    public void translationResults() {

        assertEquals(casinoPage.getResults(),exampleBundle.getString("results"));

    }

    @Test
    //наличие Settings in Header
    public void translationSettings() {

        assertEquals(casinoPage.getSettings(),exampleBundle.getString("settings"));

    }

    @Test
    //наличие Mobile in Header
    public void isMobilePresent() {

        Assert.assertTrue(casinoPage.isMobileIconPresent());

    }


    @Test
    //наличие Maraathon in Header
    public void isMarathonPresent() {

        Assert.assertTrue(casinoPage.isMarathonIconPresent());

    }
}



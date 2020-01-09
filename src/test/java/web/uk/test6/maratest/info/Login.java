package web.uk.test6.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class Login {

    CasinoPage casinoPage;

    @BeforeClass

    public  void setUp() {


        casinoPage = new CasinoPage();


    }


    @AfterClass
    public void tearDown()  {
        casinoPage.close();
    }


    @Test
    //
    public void login() {

        casinoPage.login("olegtest102","Password1");

    }




}



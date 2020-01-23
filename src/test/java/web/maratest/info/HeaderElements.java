package web.maratest.info;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class HeaderElements {

    CasinoPage casinoPage;

    @BeforeClass

    public void setUp() throws Exception {


        casinoPage = new CasinoPage();


    }


    @AfterClass
    public void tearDown() {
        casinoPage.close();
    }




}



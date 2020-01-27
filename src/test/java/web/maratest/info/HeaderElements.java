package web.maratest.info;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.CasinoPage;


public class HeaderElements {

    CasinoPage casinoPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        casinoPage = new CasinoPage();
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        casinoPage.close();
    }
}



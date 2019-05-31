package web.uk.test6.maratest.info;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;


public class Search extends BaseTest {


    @Test
    //наличие Search
    public void isSearchPresent() {

        assertTrue(casinoPage.isSearch());

    }


}
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >

<suite name="Full Regression" verbose="1" preserve-order="true">
    <test name="Footer and Header">
        <classes>
            <class name="web.uk.test6.maratest.info.Header"/>
            <class name="web.uk.test6.maratest.info.Footer"/>
        </classes>
    </test>
    <test name="Favourites">
        <classes>
            <class name="web.uk.test6.maratest.info.Favourites"/>
            <class name="web.uk.test6.maratest.info.AddFavouritesUnregistred"/>
        </classes>
    </test>
</suite>
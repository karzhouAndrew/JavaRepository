package jd02.lab01;

import junit.framework.TestCase;

import java.util.Locale;

public class Lab01Test extends TestCase {
    public void testConvertMoneyUtility() throws Exception {
        assertEquals(Lab01.convertMoneyUtil(Locale.US, "12345.78"), "$12,345.78");
        assertEquals(Lab01.convertMoneyUtil(new Locale("ru", "RU"), "12345.78"), "12 345,78 руб.");
        assertEquals(Lab01.convertMoneyUtil(new Locale("uk", "UA"), "153.5"), "153,5 грн.");
    }
}
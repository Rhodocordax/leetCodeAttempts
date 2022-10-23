import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {

    IntegerToRoman objectUnderTest = new IntegerToRoman();

    @Test
    void intToRoman() {
        assertEquals("III", objectUnderTest.intToRoman(3));
        assertEquals("LVIII", objectUnderTest.intToRoman(58));
        assertEquals("MCMXCIV", objectUnderTest.intToRoman(1994));
        assertEquals("I", objectUnderTest.intToRoman(1));
        assertEquals("X", objectUnderTest.intToRoman(10));
        assertEquals("CI", objectUnderTest.intToRoman(101));
    }
}
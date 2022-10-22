import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingTest {

    RegularExpressionMatching objectUnderTest = new RegularExpressionMatching();

    @Test
    void isMatch() {
        assertFalse(objectUnderTest.isMatch("aa", "a"));
        assertTrue(objectUnderTest.isMatch("aa", "a*"));
        assertTrue(objectUnderTest.isMatch("ab", ".*"));
        assertFalse(objectUnderTest.isMatch("abcdefghijklmnopqrst", "."));
        assertTrue(objectUnderTest.isMatch("abcdefghijklmnopqrst", ".*"));
        assertFalse(objectUnderTest.isMatch("apple", "ab*cd*ef*gh*ij*kl*mn*op*qr*st*"));
        assertTrue(objectUnderTest.isMatch("abcdefghijklmnopqrst", "ab*cd*ef*gh*ij*kl*mn*op*qr*st*"));
    }
}
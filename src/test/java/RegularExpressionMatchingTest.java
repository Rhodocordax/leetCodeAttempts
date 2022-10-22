import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingTest {

    RegularExpressionMatching objectUnderTest = new RegularExpressionMatching();

    @Test
    void isMatch() {
        assertFalse(objectUnderTest.isMatch("aa", "a"));
        assertTrue(objectUnderTest.isMatch("aa", "a*"));
        assertTrue(objectUnderTest.isMatch("ab", ".*"));
    }
}
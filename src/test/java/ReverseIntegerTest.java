import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    ReverseInteger objectUnderTest = new ReverseInteger();

    @Test
    void reverse() {
        assertEquals(321, objectUnderTest.reverse(123));
        assertEquals(-321, objectUnderTest.reverse(-123));
        assertEquals(21, objectUnderTest.reverse(120));
        assertEquals(0, objectUnderTest.reverse(0));
        assertEquals(0, objectUnderTest.reverse(Integer.MAX_VALUE)); // 2147483647
        assertEquals(0, objectUnderTest.reverse(Integer.MIN_VALUE)); // -2147483648
        assertEquals(2122222212, objectUnderTest.reverse(2122222212));
        assertEquals(0, objectUnderTest.reverse(2122222222));
        assertEquals(-2122222212, objectUnderTest.reverse(-2122222212));
        assertEquals(0, objectUnderTest.reverse(-2122222222));
        assertEquals(0, objectUnderTest.reverse(-2122222222));
    }
}
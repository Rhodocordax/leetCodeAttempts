import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    ReverseInteger objectUnderTest = new ReverseInteger();

    @Test
    void reverse() {
        assertEquals(321, objectUnderTest.reverse(123));
        assertEquals(-321, objectUnderTest.reverse(-123));
        assertEquals(21, objectUnderTest.reverse(120));
    }
}
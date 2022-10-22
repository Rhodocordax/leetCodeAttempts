import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    ContainerWithMostWater objectUnderTest = new ContainerWithMostWater();

    @Test
    void maxArea() {
        assertEquals(49, objectUnderTest.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        assertEquals(1, objectUnderTest.maxArea(new int[]{1,1}));
    }
}
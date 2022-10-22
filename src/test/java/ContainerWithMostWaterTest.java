import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    ContainerWithMostWater objectUnderTest = new ContainerWithMostWater();

    @Test
    void maxArea() {
        assertEquals(49, objectUnderTest.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        assertEquals(1, objectUnderTest.maxArea(new int[]{1,1}));
        int[] heights = new int[100000];
        Arrays.fill(heights, 1);
        assertEquals(99999, objectUnderTest.maxArea(heights));
        Arrays.fill(heights, 10000);
        assertEquals(999990000, objectUnderTest.maxArea(heights));
    }
}
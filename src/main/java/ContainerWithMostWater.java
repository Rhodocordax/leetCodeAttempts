import java.util.Arrays;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int[] best = new int[2];
        int max = Arrays.stream(height).max().getAsInt();

        for (int i = 0; i < height.length; i++) {
            for (int j = height.length - 1; j > i; j--) {
                int containerHeight = Math.min(height[i], height[j]);
                int area = containerHeight * (j - i);

                if (area > best[0]) {
                    best[0] = area;
                    best[1] = containerHeight;
                    continue;
                }

                if (best[0] / max > j - i) {
                    break;
                }
            }
        }

        return best[0];
    }
}

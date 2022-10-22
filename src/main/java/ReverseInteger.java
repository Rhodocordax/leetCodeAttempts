public class ReverseInteger {
    public int reverse(int x) {
        boolean bool = x < 0;
        int xToUse = (bool) ? -x : x;
        if (bool && x == xToUse) {
            return 0;
        }

        int len = (int) Math.log10(xToUse) + 1;
        int reverse = 0;

        for (int i = 0; i < len; i++) {
            int divPow = (int) Math.pow(10, i);
            int multPow = (int) Math.pow(10, len - i - 1);
            reverse += ((xToUse / divPow) % 10) * multPow;
        }

        return (bool) ? -reverse : reverse;
    }
}

public class IntegerToRoman {
    public String intToRoman(int num) {
        String numToUse = String.valueOf(num);
        StringBuilder sb = new StringBuilder();

        int len = numToUse.length() - 1;
        for (int i = len; i >= 0; i--) {
            sb.insert(0, determineRomanRep(numToUse.charAt(i), len - i));
        }

        return sb.toString();
    }

    char getOnes(int place) {
        return switch (place) {
            case 0 -> 'I';
            case 1 -> 'X';
            case 2 -> 'C';
            case 3 -> 'M';
            default -> '.';
        };
    }

    char getFives(int place) {
        return switch (place) {
            case 0 -> 'V';
            case 1 -> 'L';
            case 2 -> 'D';
            default -> '.';
        };
    }

    String determineRomanRep(char digit, int place) {

        char ones = getOnes(place);
        char fives = getFives(place);
        char tens = getOnes(place + 1);

        StringBuilder sb = new StringBuilder();
        switch (digit) {
            case '0':
                break;
            case '1':
                sb.append(ones);
                break;
            case '2':
                sb.append(ones).append(ones);
                break;
            case '3':
                sb.append(ones).append(ones).append(ones);
                break;
            case '4':
                sb.append(ones).append(fives);
                break;
            case '5':
                sb.append(fives);
                break;
            case '6':
                sb.append(fives).append(ones);
                break;
            case '7':
                sb.append(fives).append(ones).append(ones);
                break;
            case '8':
                sb.append(fives).append(ones).append(ones).append(ones);
                break;
            case '9':
                sb.append(ones).append(tens);
                break;
        }
        return sb.toString();
    }
}

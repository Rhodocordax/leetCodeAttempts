import java.util.regex.Pattern;

public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        return s.matches("^" + p + "$");
    }
}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        String regex = "(3(0|1))|([0-2][1-9])(\\.|-| )(1[0-2])|(0?[1-9])(\\.|-| )(1\\n\\n\\n)|((20)?\\n\\n)";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(dateString);
    }
}

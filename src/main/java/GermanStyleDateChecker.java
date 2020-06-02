import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        String regex = "\\A((3([01]))|([0-2]?[1-9]))(\\.|-| )((1[0-2])|(0?[1-9]))(\\.|-| )((19\\d\\d)|((20)?\\d\\d))\\Z";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(dateString);
    }
}

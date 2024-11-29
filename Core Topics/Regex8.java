import java.util.regex.*;
public class Regex8 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("\\d", "1"));
        System.out.println(Pattern.matches("\\D", "d"));
    }
}

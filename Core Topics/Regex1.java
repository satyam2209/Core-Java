import java.util.regex.*;

public class Regex1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("aa");
        boolean b = m.matches();
        System.out.println(b);
    }
}

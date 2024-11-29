import java.util.regex.*;

public class Regex7 {
    public static void main(String[] args) {
       Pattern p = Pattern.compile("w++");
       Matcher m = p.matcher("weswesw");
       while(m.find())
       {
        System.out.println("Pattern found from" +m.start()+ " to " + (m.end() - 1));
       }
    }
}

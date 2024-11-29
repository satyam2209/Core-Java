import java.util.regex.*;

public class Regex4 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("Ws*",Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("Wscube tech");
        while(m.find())
        {
            System.out.println("Pattern found " +m.start()+ " to " + (m.end() - 1));
        }
    }
}

import java.util.regex.*;

public class Regex3 
{
    public static void main(String[] args) {
        Pattern p = Pattern.compile("Wscubes");
        Matcher m = p.matcher("Wscubes tech team");
        while(m.find())
        {
            System.out.println("Pattern found " + m.start() + " to " + (m.end() - 1));
        }
    }
}

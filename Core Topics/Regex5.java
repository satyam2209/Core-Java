import java.util.regex.*;

public class Regex5 {
    public static void main(String[] args) {
        String s = "Wscube tech team";
        String de = "\\t";
        Pattern p = Pattern.compile(de, Pattern.CASE_INSENSITIVE);
        String t[] = p.split(s);
        for(String temp:t)
        {
            System.out.println(temp);
        }
    }
}

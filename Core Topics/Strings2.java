// String Length

public class Strings2 {
    public static void main(String[] args)
    {
        String str = "WSCUBE TECH";
        System.out.println("The length of the string is"+ str.length());

        // or

        int i=0;
        for(char c: str.toCharArray())
        {
            i++;
        }
        System.out.println("The length of the string is" +i);
    }
}

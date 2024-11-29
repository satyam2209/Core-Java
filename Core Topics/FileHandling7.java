import java.io.*;

public class FileHandling7 {
    public static void main(String[] args) {
        try {
            FileReader f1 = new FileReader("textFile/one.txt");
            FileWriter f2 = new FileWriter("textFile/two.txt");
            String s = "";
            int i;
            while((i=f1.read()) != -1)
            {
                s+=(char)i;
            }
            System.out.println(s);
            f2.write(s);
            f1.close();
            f2.close();
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}

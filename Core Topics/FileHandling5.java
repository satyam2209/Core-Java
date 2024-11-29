import java.io.*;

public class FileHandling5 {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("textFile/one.txt");
            int i;
            while((i=f.read()) != -1)
            {
                System.out.print((char)i);
            }
            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

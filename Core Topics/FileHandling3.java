import java.io.*;

public class FileHandling3 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("textFile/one.txt");
            // This class provides methods to read bytes from the buffer.
            BufferedInputStream b = new BufferedInputStream(fin);
            int i;
            while((i=b.read()) != -1)
            {
                System.out.print((char)i);
            }
            fin.close();
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}

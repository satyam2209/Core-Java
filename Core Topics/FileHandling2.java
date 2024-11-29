
import java.io.*;

public class FileHandling2 {
    public static void main(String[] args) {
        try{
            // This class provides methods to read bytes from a file.
            FileInputStream fin = new FileInputStream("textFile/one.txt");

            int i = 0;
            // this print the all characters of file
            while((i=fin.read()) != -1)   // run until the file ends
            {
                System.out.print((char)i);
            }
            fin.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

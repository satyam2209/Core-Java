import java.io.*;

public class FileHandling4 {
    public static void main(String[] args) {
        try {
            FileOutputStream fin = new FileOutputStream("textFile/one.txt");
            String s = "This is the content added to the file";
            byte b[] = s.getBytes();
            fin.write(b);
            fin.flush();
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

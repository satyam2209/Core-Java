import java.io.*;

public class FileHandling6 {
    public static void main(String[] args) {
        try {
            // FileWriter f = new FileWriter("textFile/one.txt");
            
            // if file not exist then it can also create a file
            FileWriter f = new FileWriter("textFile/two.txt");
            f.write("java is a class type");
            f.close();
        } catch (Exception e) {
           System.out.println(e);
        }    
    }
}

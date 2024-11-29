// imports all the classes and interfaces from the java.io package

import java.io.*;        
public class FileHandling1 {
    public static void main(String[] args)
    {
        try{
            // This class provides methods to read bytes from a file.
            FileInputStream fin = new FileInputStream("textFile/one.txt");
            int i = fin.read();
            // this print only first character of file
            System.out.println("The first character is: " +(char)i);
            fin.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
    }
}

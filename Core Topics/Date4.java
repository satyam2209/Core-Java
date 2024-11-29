import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date4 {
   public static void main(String[] args) {
    LocalDateTime my = LocalDateTime.now();
    System.out.println("Before formatting " + my);
    DateTimeFormatter myf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formatdate = myf.format(my);
    System.out.println("After formatting " +formatdate);
   }    
}

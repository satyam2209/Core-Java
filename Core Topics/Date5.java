import java.util.*;

public class Date5 {
   public static void main(String[] args) {
      String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
      int year;
      GregorianCalendar gcal = new GregorianCalendar();
      System.out.println("Date ");
      System.out.println(months[gcal.get(Calendar.MONTH)]);
   }    
}
